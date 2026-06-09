# 🚀 Backend API — ItMax

### Desenvolvido por developer Italo Rodri.

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green?style=for-the-badge&logo=springboot)
![Firebase](https://img.shields.io/badge/Firebase-Admin%20SDK-orange?style=for-the-badge&logo=firebase)
![Maven](https://img.shields.io/badge/Maven-Build%20Tool-red?style=for-the-badge&logo=apachemaven)

---

# ✨ Sobre o Projeto

Backend desenvolvido com **Java Spring Boot** para gerenciamento de filmes, upload de imagens e integração com serviços Firebase.

A API foi construída seguindo uma arquitetura baseada em **Features**, onde cada módulo possui sua própria organização interna, facilitando manutenção, escalabilidade e evolução do sistema.

### Principais características

- ⚡ Alta performance
- 🧱 Arquitetura Feature-Based
- 🔥 Integração com Firebase
- ✅ Validação de dados com Bean Validation
- 🧪 Testes automatizados
- 🚀 Escalabilidade
- 📦 Organização por domínio de negócio

---

# 📋 Pré-requisitos

Antes de iniciar o projeto, certifique-se de possuir:

- Java 21+
- Maven 3.9+
- Conta Firebase configurada
- Arquivo `serviceAccountKey.json`

---

# ⚙️ Como Rodar o Projeto

## 1️⃣ Clonar o repositório

```bash
git clone <URL_DO_REPOSITORIO>
```

---

## 2️⃣ Instalar dependências

```bash
mvn clean install
```

---

## 3️⃣ Configurar Firebase

Adicione o arquivo de credenciais do Firebase na raiz do projeto:

```plaintext
serviceAccountKey.json
```

---

## 4️⃣ Configurar variáveis da aplicação

Configure o arquivo:

```plaintext
src/main/resources/application.properties
```

Exemplo:

```properties
firebase.bucket-name=seu-bucket
```

---

## 5️⃣ Iniciar servidor

Modo desenvolvimento:

```bash
mvn spring-boot:run
```

Ou executar o JAR gerado:

```bash
java -jar target/itmax-api.jar
```

---

# 📚 Documentação da API

Caso o projeto possua Swagger configurado:

```txt
http://localhost:8080/swagger-ui.html
```

---

# 🌐 Endpoints Principais

| Método | Endpoint | Descrição |
|----------|----------|----------|
| POST | `/api/v1/movies` | Criação de filme |
| GET | `/api/v1/movies` | Listagem de filmes |
| GET | `/api/v1/movies/{id}` | Busca por ID |
| PUT | `/api/v1/movies/{id}` | Atualização de filme |
| DELETE | `/api/v1/movies/{id}` | Remoção de filme |
| GET | `/` | Health Check da API |

---

# 🧱 Estrutura do Projeto

```plaintext
backend-java/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── config/
│   │   │   ├── core/
│   │   │   │
│   │   │   ├── features/
│   │   │   │   ├── auth/
│   │   │   │   │   ├── controller/
│   │   │   │   │   ├── dto/
│   │   │   │   │   ├── service/
│   │   │   │   │   └── validator/
│   │   │   │   │
│   │   │   │   ├── movies/
│   │   │   │   │   ├── controller/
│   │   │   │   │   ├── dto/
│   │   │   │   │   ├── service/
│   │   │   │   │   └── validator/
│   │   │   │
│   │   │   └── Application.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│
├── src/test/
│
├── serviceAccountKey.json
├── pom.xml
└── README.md
```

---

# 🛠️ Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring MVC
- Bean Validation
- Firebase Admin SDK
- Firebase Authentication
- Firebase Cloud Messaging (FCM)
- Lombok
- Maven
- JUnit
- MockMvc

---

# 🧪 Testes Unitários

## Executar testes

```bash
mvn test
```

---

# 📄 Logs da Aplicação

A aplicação utiliza o sistema padrão de logs do Spring Boot.

---

# ⚙️ Build para Produção

Gerar artefato:

```bash
mvn clean package
```

Arquivo gerado:

```plaintext
target/itmax-api.jar
```

Executar:

```bash
java -jar target/itmax-api.jar
```

---

# 🔄 CI/CD — GitHub Actions

Estrutura recomendada:

```plaintext
.github/workflows/main.yml
```

---

# 👨‍💻 Autor

## DEV Italo Rodri

Desenvolvedor Full Stack especializado em:

- Flutter
- Java Spring Boot
- Firebase
- Riverpod
- APIs REST
- Clean Architecture
- Arquitetura Feature-Based

---

# 📄 Licença

Projeto desenvolvido para fins de estudo e portfólio.