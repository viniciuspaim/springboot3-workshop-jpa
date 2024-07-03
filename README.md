# SpringBoot3 Workshop JPA

## Visão Geral
Este projeto é uma aplicação de exemplo para um workshop sobre Spring Boot 3 e JPA ministrado pelo professor Nélio Alves. O objetivo é demonstrar a criação e manipulação de entidades, configuração de banco de dados, repositórios JPA, injeção de dependências e tratamento de exceções.

## Índice de Conteúdos
1. [Visão geral do capítulo](#visão-geral-do-capítulo)
2. [Criação do projeto](#criação-do-projeto)
3. [Entidade User e seu resource](#entidade-user-e-seu-resource)
4. [Banco de dados H2, test profile, JPA](#banco-de-dados-h2-test-profile-jpa)
5. [JPA repository, injeção de dependência, database seeding](#jpa-repository-injeção-de-dependência-database-seeding)
6. [Camada de serviço, registro de componentes](#camada-de-serviço-registro-de-componentes)
7. [Entidade Pedido. Datas com Instant e padrão ISO 8601](#entidade-pedido-datas-com-instant-e-padrão-iso-8601)
8. [Enum OrderStatus](#enum-orderstatus)
9. [Entidade Category](#entidade-category)
10. [Entidade Product](#entidade-product)
11. [Associação muitos-para-muitos com JoinTable](#associação-muitos-para-muitos-com-jointable)
12. [Entidade OrderItem. Associação muitos-para-muitos com dados extras](#entidade-orderitem-associação-muitos-para-muitos-com-dados-extras)
13. [Entidade Payment, associação um para um](#entidade-payment-associação-um-para-um)
14. [Métodos subtotal e total](#métodos-subtotal-e-total)
15. [Inserção de User](#inserção-de-user)
16. [Deleção de User](#deleção-de-user)
17. [Atualização de User](#atualização-de-user)
18. [Tratamento de exceção - findById](#tratamento-de-exceção---findbyid)
19. [Tratamento de exceção - delete](#tratamento-de-exceção---delete)
20. [Tratamento de exceção - update](#tratamento-de-exceção---update)

## Detalhamento

### Visão geral do capítulo
Uma visão geral do que será abordado no capítulo, incluindo a criação e configuração do projeto.

### Criação do projeto
Criação inicial do projeto Spring Boot.

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

## Licença
Este projeto está licenciado sob a Licença MIT.
