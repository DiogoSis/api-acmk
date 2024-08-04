# Sistema de Registro ACMK

Este é um projeto de backend desenvolvido em Java utilizando Spring Boot, com o objetivo de gerenciar registros de alunos, eventos e pagamentos para uma academia de karatê. O frontend será desenvolvido em React com Vite.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**
- **Jakarta Persistence API (JPA)**

## Configuração do Ambiente

### Pré-requisitos

- Java 17 ou superior
- Maven
- PostgreSQL
- IDE (IntelliJ, Eclipse, etc.)

### Configuração do Banco de Dados

1. Crie um banco de dados PostgreSQL com o nome `karate_academy`.
2. Atualize o arquivo `application.properties` com suas credenciais do banco de dados.

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/karate_academy
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Executando o Projeto
1. Clone o Repositorio
```bash
git clone https://github.com/seu_usuario/sistema-registro-acmk.git
cd sistema-registro-acmk/api-sistema-acmk

```
2. Compile e execute o projeto:
```bash
mvn clean install
mvn spring-boot:run

```


## Endpoints da API

### Aluno

#### Criar Aluno

- **URL:** `/aluno`
- **Método:** `POST`
- **Corpo da Requisição:**

```json
{
    "primeiroNome": "John",
    "sobrenome": "Doe",
    "dataNascimento": "2000-01-01",
    "genero": "M",
    "telefone": "1234567890",
    "email": "john.doe@example.com",
    "endereco": "123 Main St",
    "dataEntrada": "2024-08-03",
    "corFaixa": "Branca"
}
```

#### Consultar aluno

- **URL:** `/aluno/{id}`
- **Método:** `GET`

#### Consultar Todos os alunos

- **URL:** `/alunos`
- **Método:** `GET`

---

### Pagamento

#### Registrar Pagamento

- **URL:** `/pagamento`
- **Método:** `POST`
- **Corpo da Requisição:**

```json
{
  "alunoId": 1,
  "valor": 100.00,
  "dataPagamento": "2024-08-03"
}
```

#### Consultar pagamento

- **URL:** `/pagamento/{id}`
- **Método:** `GET`

---

### Evento

#### Criar Evento

- **URL:** `/evento`
- **Método:** `POST`
- **Corpo da Requisição:**

```json
{
    "nome": "Campeonato Estadual",
    "data": "2024-09-10",
    "local": "Ginásio Municipal"
}
```
#### Consultar Evento

- **URL:** `/evento/{id}`
- **Método:** `GET`

#### Consultar todos os Eventos

- **URL:** `/eventos`
- **Método:** `GET`

---

