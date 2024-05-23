# JDBC, JPA, Hibernate e Spring Data JPA

> 📝 **TL;DR** 
**JDBC**: API de baixo nível para conexão e interação direta com bancos de dados relacionais, requerendo escrita manual de SQL.
**JPA**: Especificação que define uma forma padrão de mapeamento objeto-relacional (ORM) e persistência de dados em Java, usando anotações para simplificar o desenvolvimento.
**Hibernate**: Implementação de JPA e framework de ORM popular que oferece funcionalidades adicionais e aprimoramentos.
**Spring Data JPA**: Abstração sobre JPA e Hibernate que simplifica ainda mais a persistência de dados, integrando-se com o Spring Framework e eliminando a necessidade de muito código boilerplate.

## Java Database Connectivity - JDBC
- Lançado como parte do JDK em 1997 pela Sun Microsystems
- API padrão Java para conexão com bancos de dados relacionais
- Atua como uma ponte entre o mundo Java e os bancos de dados
- É de nível mais baixo e requer que os desenvolvedores escrevam consultas SQL e manipulem conjuntos de resultados manualmente
- Frequentemente usado quando é necessário um controle detalhado sobre as interações com o banco de dados ou quando se trabalha com bancos de dados não cobertos por frameworks de nível superior.

## Java Persistence API - JPA
- JPA é uma especificação da plataforma Java que define um conjunto de conceitos e APIs para o mapeamento e gerenciamento de dados relacionais em aplicações Java. 
- A principal finalidade é simplificar a interação entre aplicações Java e bancos de dados relacionais, oferecendo uma maneira padrão e eficiente de realizar operações de persistência (CRUD - Create, Read, Update, Delete)
- Mapeamento objeto-relacional usando anotações ou XML.
- Consultas usando JPQL (Java Persistence Query Language), que é orientada a objetos.
- Suporte à gestão de transações e callbacks do ciclo de vida da entidade.

Como JPA é apenas uma especificação, ela não fornece uma implementação por si só. Para usar JPA, você precisa de uma implementação concreta. As mais populares incluem: **Hibernate**, EclipseLink e Apache OpenJPA

## Hibernate
- Hibernate é uma implementação popular do JPA e um framework de ORM que oferece muitas funcionalidades adicionais além do que é especificado pelo JPA. 
- Ele simplifica ainda mais o desenvolvimento, fornecendo recursos avançados como caching, lazy loading, e suporte para herança.
- Implementação do JPA, mas também pode ser usado diretamente.
- Recursos avançados de caching e performance tuning.
- Suporte a herança e associações complexas entre entidades.
- Ferramentas de geração de esquema de banco de dados a partir das entidades.

## Spring Data JPA
- Spring Data JPA é uma abstração sobre o JPA (e, geralmente, Hibernate) fornecida pelo Spring Framework. 
- Simplifica ainda mais a persistência de dados, reduzindo a quantidade de código boilerplate necessário e integrando-se perfeitamente com outros componentes do Spring.
- Abstração sobre JPA que facilita o uso e a configuração.
- Repositórios prontos para uso com métodos de consulta baseados em convenção.
- Integração com o Spring Framework para suporte completo a transações, segurança, e outras funcionalidades.
- Suporte a métodos de consulta personalizados e derivados de nomes de métodos.

### Tabelão

| Tecnologia           | Descrição                                                                                                                                                         | Vantagens                                                   | Desvantagens                                             |
|----------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------|----------------------------------------------------------|
| **JDBC**             | API padrão do Java para conectar-se a bancos de dados relacionais, exigindo escrita manual de SQL e manipulação de resultados.                                      | Controle fino sobre as operações de banco de dados          | Código repetitivo e verboso                              |
| **JPA**              | Especificação que facilita o mapeamento de objetos Java para tabelas de banco de dados.                                                                             | Reduz a quantidade de código repetitivo e verboso           | Requer uma implementação concreta                        |
| **Hibernate**        | Implementação popular do JPA que gerencia a persistência de dados e fornece abstração sobre JDBC.                                                                   | Automação do mapeamento, funcionalidades adicionais         | Pode ser complexo para configurações avançadas           |
| **Spring Data JPA**  | Extensão do Spring para JPA, oferecendo repositórios e abstrações adicionais para simplificar as operações de banco de dados.                                       | Simplificação extrema das operações de banco de dados       | Dependência do ecossistema Spring                        |





---

> Em tecnologia da informação, `boilerplate code` é um trecho de código que pode ser reutilizado várias vezes sem nenhuma ou com poucas alteração. É aquele código que você precisa escrever toda vez - porque a sintaxe da linguagem exige - mas que também não acrescenta muita coisa, já que é igual em todo programa.

#### Links

[Entenda de uma vez por todas JPA e Hibernate](https://medium.com/@duduxss3/entenda-de-uma-vez-por-todas-jpa-e-hibernate-e2a1237161a9)
