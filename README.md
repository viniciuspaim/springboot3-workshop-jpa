# SpringBoot3 Workshop JPA

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://github.com/vinaoc/springboot3-workshop-jpa/blob/main/LICENSE)

Este projeto é uma aplicação de exemplo para um workshop sobre Spring Boot 3 e JPA ministrado pelo professor Nélio Alves. 
O objetivo é demonstrar a criação e manipulação de entidades, configuração de banco de dados, repositórios JPA, injeção de dependências e tratamento de exceções.

## Tecnologias Utilizadas
- Spring Boot
- Apache Tomcat
- Maven
- H2 Database
- Postman
- Azure App Service

## Encontraremos no Projeto

### Entidade User e seu resource
Definição da entidade `User` e criação de seu recurso REST.

### Banco de dados H2, test profile, JPA
Configuração do banco de dados H2, criação de um perfil de teste e integração com JPA.

### JPA repository, injeção de dependência, database seeding
Criação de repositórios JPA, injeção de dependências e inicialização do banco de dados com dados de exemplo.

### Camada de serviço, registro de componentes
Implementação da camada de serviço e registro de componentes.

### Entidade Pedido. Datas com Instant e padrão ISO 8601
Definição da entidade `Pedido`, utilizando `Instant` para datas e seguindo o padrão ISO 8601.

### Enum OrderStatus
Criação do enum `OrderStatus` para representar os status de um pedido.

### Entidade Category
Definição da entidade `Category`.

### Entidade Product
Definição da entidade `Product`.

### Associação muitos-para-muitos com JoinTable
Implementação de associações muitos-para-muitos utilizando a anotação `@JoinTable`.

### Entidade OrderItem. Associação muitos-para-muitos com dados extras
Criação da entidade `OrderItem` e implementação de associações muitos-para-muitos com dados extras.

### Entidade Payment, associação um para um
Definição da entidade `Payment` e criação de uma associação um-para-um.

### Métodos subtotal e total
Implementação dos métodos `subtotal` e `total`.

### Inserção de User
Operação de inserção de novos usuários.

### Deleção de User
Operação de deleção de usuários existentes.

### Atualização de User
Operação de atualização de dados de usuários.

### Tratamento de exceção - findById
Tratamento de exceções para a operação `findById`.

### Tratamento de exceção - delete
Tratamento de exceções para a operação `delete`.

### Tratamento de exceção - update
Tratamento de exceções para a operação `update`.

## Como Executar
Para executar este projeto, siga os seguintes passos:

1. Clone o repositório: `git clone https://github.com/vinaoc/springboot3-workshop-jpa.git`
2. Navegue até o diretório do projeto: `cd springboot3-workshop-jpa`
3. Execute o projeto: `./mvnw spring-boot:run`

## Modelagem do Projeto
![image](https://github.com/vinaoc/springboot3-workshop-jpa/assets/86624417/e831081c-296b-48bb-b2d1-d3ed996ef9c7)

![image](https://github.com/vinaoc/springboot3-workshop-jpa/assets/86624417/3a060c2a-ac96-4aa8-9a83-39cef4186cad)


## Licença
Este projeto está licenciado sob a Licença MIT.
