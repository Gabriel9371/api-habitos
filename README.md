> API REST feita com Spring Boot para gerenciamento de hábitos pessoais.
O projeto foi criado com foco em boas práticas de backend, separação de camadas e uso correto de HTTP.

> Permite criar, listar, ativar e desativar hábitos, utilizando PostgreSQL como banco de dados.

# Tecnologias
- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL 
- Maven

## Arquitetura

O projeto foi estruturado seguindo o padrão de camadas para garantir separação de responsabilidades:
```azure
    Controller -> service -> repository -> database
    
    - controller: recebe e responde requisições
    - Service: regras de negocio
    - Repository: acesso ao banco via JPA
    - Entity: Mapeamento das tabelas
  
```

# Modelo de Dados

### entidade `Habito`


| Campo      | Tipo          | Descrição                                |
|:-----------|:--------------|:-----------------------------------------|
| id         | Long          | Id                                       |
| nome       | String        | Nome ou descrição do habito              |
| frequencia | String        | Frequência (ex: Diária, Semanal)         |
| ativo      | boolean       | mostra se o hábito está ativo ou pausado |
| criadoEm   | LocalDateTime | Data e hora de criação do registro       |


# Endpoints

## Criar habito


POST /habitos

### ex `body: `

```azure
    {
        "nome": "Beber água",
        "frequencia": "Diária"
    }
```

---



## Listar Habitos


### GET /habitos

---


## Listar Habito Por ID



### GET /habitos/{id}


---

## Ativar Hábito



### GET /habitos/{id}/ativar


---

# Configuração do banco de dados
### crie um banco no postgreSQL:

``CREATE DATABASE api_habitos;``

### configure a variaveis de abiente:

```databricks
    SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/api_habitos
    SPRING_DATASOURCE_USERNAME=seu_usuario
    SPRING_DATASOURCE_PASSWORD=sua_senha
```

# Como Executar

``./mvnw spring-boot:run``

## aplicação ficara disponivel em:

### http://localhost:8080


# 👤 Autor
D. Gabriel <br>
Estudante de backend Java

