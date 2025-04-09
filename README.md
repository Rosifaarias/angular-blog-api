# 📝 API BLOG

Este projeto é uma **API RESTful** desenvolvida com **Spring Boot** em Java para gerenciamento de postagens e categorias de um blog. Ideal para aplicações que precisam organizar conteúdos de forma estruturada.

## 🚀 Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Banco de dados (MySQL, PostgreSQL ou H2)
- Lombok
- Swagger (opcional)
- Maven

## 📌 Funcionalidades

- ✅ CRUD de Postagens
- ✅ CRUD de Categorias
- ✅ Relacionamento entre Postagens e Categorias
- ✅ Validação de dados
- ✅ Organização em camadas (Controller, Service, Repository, Model)
- ✅ Documentação com Swagger (opcional)

## 🔗 Endpoints principais

### 📚 Categorias

- `GET /categorias` – listar todas
- `GET /categorias/{id}` – buscar por ID
- `POST /categorias` – criar nova categoria
- `PUT /categorias/{id}` – atualizar categoria
- `DELETE /categorias/{id}` – remover categoria

### 📝 Postagens

- `GET /postagens` – listar todas
- `GET /postagens/{id}` – buscar por ID
- `POST /postagens` – criar nova postagem
- `PUT /postagens/{id}` – atualizar postagem
- `DELETE /postagens/{id}` – remover postagem

## 🛠️ Como executar o projeto

1. **Clone o repositório**
```bash
git clone https://github.com/seu-usuario/api-blog.git


Rode a aplicação

bash
Copiar
Editar
./mvnw spring-boot:run
Acesse no navegador

arduino
Copiar
Editar
http://localhost:8080
Se estiver usando Swagger:

bash
Copiar
Editar
http://localhost:8080/swagger-ui.html
