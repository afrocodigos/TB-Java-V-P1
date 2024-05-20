# Annotations

## Índice
- [O que é?](#o-que-é)
- [Exemplos](#exemplos)

### O que é?
Annotations no Java são metadados que fornecem informações adicionais sobre classes, métodos, campos e outros elementos do código. 
Elas são usadas para fornecer instruções ao compilador, ao tempo de execução ou a ferramentas de terceiros sobre como processar e tratar esses elementos. 

As annotations são representadas pelo símbolo **'@'** seguido pelo nome da annotation e, opcionalmente, por valores de parâmetros.

### Exemplos

**@Override:** Indica que um método está substituindo um método da superclasse.

```java
class Parent {
    public void print() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    @Override
    public void print() {
        System.out.println("Child class");
    }
}

```

**@Deprecated:** Marca um método, classe ou campo como obsoleto, indicando que não deve ser mais utilizado.

```java

@Deprecated
public void oldMethod() {
    // Código obsoleto aqui
}
```

#### No spring boot

**@Component:** Indica que uma classe é um componente gerenciado pelo Spring e deve ser automaticamente registrado no contexto da aplicação.

**@Autowired:** Indica ao contêiner Spring para injetar uma dependência automaticamente em um campo, método ou construtor de uma classe.

**@SpringBootApplication:** Indica que uma classe é uma classe de configuração Spring Boot e ativa automaticamente o mecanismo de varredura de componentes, a configuração automática e outros recursos do Spring Boot.

**@RestController:** Indica que uma classe é um controlador Spring que lida com solicitações HTTP e retorna objetos JSON ou XML diretamente no corpo da resposta HTTP.

**@GetMapping:** Indica que um método de um controlador Spring trata solicitações HTTP GET para um determinado URI.

[Video: Curso de Java 65: Annotations (anotações)](https://www.youtube.com/watch?v=6M8EE_oRwtM&ab_channel=LoianeGroner)