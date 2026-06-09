package com.itmax.streaming.features.profile.repository;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.cloud.FirestoreClient;
import com.itmax.streaming.features.profile.model.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Repository
public class ProfileRepository {

    private CollectionReference getCollection() {
        return FirestoreClient.getFirestore().collection("profiles");
    }

    public Profile save(Profile profile) throws ExecutionException, InterruptedException {
        DocumentReference docRef = getCollection().document();
        profile.setId(docRef.getId());
        docRef.set(profile).get();
        return profile;
    }

    public List<Profile> findByAccountId(String accountId) throws ExecutionException, InterruptedException {
        List<Profile> profiles = new ArrayList<>();
        ApiFuture<QuerySnapshot> future = getCollection().whereEqualTo("accountId", accountId).get();
        List<QueryDocumentSnapshot> documents = future.get().getDocuments();

        for (QueryDocumentSnapshot document : documents) {
            profiles.add(document.toObject(Profile.class));
        }
        return profiles;
    }
}