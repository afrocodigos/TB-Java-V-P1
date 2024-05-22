# Spring Boot


### O que é
Spring Boot é uma extensão do framework Spring que visa simplificar significativamente o processo de configuração e desenvolvimento de aplicativos Java baseados em Spring. Ele facilita a criação de aplicativos autônomos e prontos para produção, oferecendo configurações padrão inteligentes, automação de tarefas e um modelo de programação baseado em convenções.
O Spring Boot é uma abordagem mais rápida e eficiente para iniciar e criar aplicativos Spring.

**Principais módulos:**
- ``Spring Boot Starter:`` Fornece dependências Maven ou Gradle pré-configuradas para diferentes tipos de aplicativos, como web, segurança, dados e muito mais.

- ``Spring Boot Autoconfigure:`` Oferece configurações automáticas com base nas dependências presentes no classpath, simplificando a configuração de aplicativos Spring.

- ``Spring Boot Actuator:`` Fornece recursos para monitoramento, gerenciamento e interação com aplicativos Spring em tempo de execução, incluindo endpoints RESTful para métricas, saúde, informações sobre o ambiente e muito mais.

- ``Spring Boot CLI (Command Line Interface):`` Permite a criação rápida de aplicativos Spring usando a linha de comando, proporcionando um ambiente de desenvolvimento mais ágil.

- ``Spring Boot Test:`` Oferece suporte para escrever e executar testes de unidade e integração em aplicativos Spring Boot, facilitando a implementação de testes automatizados.

- ``Spring Boot DevTools:`` Fornece ferramentas de desenvolvimento para agilizar o ciclo de desenvolvimento, incluindo suporte para reinicialização automática, live reloading e outras funcionalidades úteis para desenvolvedores.

### Spring X Spring Boot

>  📝 **TL;DR** 
o ``Spring Framework é o núcleo do ecossistema Spring`` e oferece uma ampla gama de funcionalidades, 
o ``Spring Boot`` é uma ``ferramenta`` que simplifica significativamente o processo de desenvolvimento, configuração e implantação de aplicativos baseados em Spring.

</br>
</br>

**Diferenças entre Spring Framework e Spring Boot**

| **Aspecto**                                | **Spring Framework**                                                                                                                                                        | **Spring Boot**                                                                                                                             |
|--------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------|
| **Configuração**                           | Requer configuração manual extensa. Pode usar arquivos XML ou anotações Java para configurar beans e definir o comportamento do aplicativo.                                   | Oferece configuração automática baseada em convenções e opiniões padrão. Utiliza anotações e convenções inteligentes para inicializar o aplicativo. |
| **Flexibilidade**                          | Modular e altamente flexível. Oferece grande flexibilidade para personalização.                                                                                              | Simplifica o gerenciamento de dependências e a configuração externa, reduzindo a quantidade de código de configuração necessário.              |
| **Complexidade**                           | Configuração pode ser complexa e exigir mais trabalho do desenvolvedor.                                                                                                      | Reduz a quantidade de código de configuração necessário. Foca no desenvolvimento rápido e eficiente de aplicativos.                           |
| **Servidor Web**                           | Requer configuração manual e integração do servidor web.                                                                                                                     | Possui recursos de incorporação de servidor web (como Tomcat ou Jetty) embutidos.                                                            |
| **Dependências**                           | Requer configuração manual das dependências.                                                                                                                                 | Simplifica o gerenciamento de dependências com starters, facilitando a inclusão de funcionalidades específicas.                              |
| **Início Rápido**                          | Configuração inicial pode ser demorada devido à necessidade de definir manualmente várias configurações.                                                                      | Permite que os desenvolvedores iniciem rapidamente novos projetos com configurações mínimas.                                                 |
| **Desenvolvimento**                        | Pode exigir mais trabalho do desenvolvedor para configurar e personalizar.                                                                                                   | Facilita o desenvolvimento rápido e eficiente de aplicativos com convenções padrão e configurações automáticas.                               |
| **Foco**                                   | Oferece grande flexibilidade para aplicativos complexos e personalizados.                                                                                                   | Foca no desenvolvimento rápido, eficiente e padronizado de aplicativos.                                                                      |

## Iniciando um projeto 
O Spring Initializr é uma ferramenta web que simplifica a configuração inicial de novos projetos Spring Boot. Ele fornece uma interface gráfica para selecionar as dependências, configurações e metadados do projeto, como nome, grupo, artefato e versão do Java. Com base nas escolhas feitas, o Spring Initializr gera um projeto Spring Boot pré-configurado que pode ser baixado como um arquivo ZIP e importado em uma IDE de desenvolvimento.
> [Spring Initializr](https://start.spring.io/)


---

## Dependencias
dependências são bibliotecas externas ou módulos de código que uma aplicação precisa para funcionar corretamente. 

## Maven
Maven é uma ferramenta de automação de compilação e gerenciamento de dependências para projetos Java. Ele simplifica o processo de construção de um projeto, gestão de dependências, execução de testes, e geração de documentação.

Maven usa um arquivo chamado `pom.xml `(Project Object Model) para gerenciar as configurações do projeto. Este arquivo especifica:

- Dependências: Bibliotecas externas que o projeto precisa.
- Plugins: Ferramentas que adicionam funcionalidades ao processo de build, como geração de relatórios, execução de testes, etc.
- Repositórios: Locais onde Maven busca as dependências, como o repositório central do Maven


## Links
- [Documentação Oficial Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [Building an Application with Spring Boot](https://spring.io/guides/gs/spring-boot)