# Injeção de dependencia

## Índice
- [O que é?](#o-que-é)
- [Tipos de Injeção de Dependência](#tipos-de-injeção-de-dependência)
    - [Via Interface](#via-interface)
    - [Via Construtor](#via-construtor)
    - [Via Setter](#via-setter)
    - [Injeção de Dependência com Spring](#injeção-de-dependência-com-spring)

### O que é?

Injeção de Dependência (DI) é um padrão de projeto usado para implementar o Princípio da Inversão de Dependência (DIP), um dos princípios SOLID de design de software. A DI é uma técnica que permite a separação das preocupações ao injetar dependências de um objeto a partir do exterior em vez de o próprio objeto criar suas dependências. Isso promove um design mais flexível, testável e de fácil manutenção.


### Tipos de Injeção de Dependência
Em um sistema onde a DI é aplicada, uma classe não cria suas próprias dependências, mas recebe essas dependências de um provedor externo (como um framework ou container). As dependências podem ser fornecidas de várias maneiras, incluindo via construtor, métodos setters ou interfaces.

A dependência é abstraída via uma interface, permitindo a flexibilidade de usar diferentes implementações.

#### Via Construtor
Sendo injetada pelo construtor
Neste exemplo, a dependência NotificationService é passada para o GradeService através do construtor.


```java
// Interface (abstração)
interface NotificationService {
    void sendNotification(String message);
}

// Classe de baixo nível
class EmailNotificationService implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("Sending email with message: " + message);
    }
}

// Classe de alto nível
class GradeService {
    private NotificationService notificationService;

    public GradeService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void addGrade(String studentName, String grade) {
        notificationService.sendNotification("Grade added for " + studentName + ": " + grade);
        System.out.println("Added grade " + grade + " for " + studentName);
    }
}

// Uso
public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new EmailNotificationService();
        GradeService gradeService = new GradeService(notificationService);
        gradeService.addGrade("John Doe", "A+");
    }
}

```


#### Via Setter
A dependência é injetada através de métodos setter após a criação do objeto

```java

// Interface (abstração)
interface NotificationService {
    void sendNotification(String message);
}

// Classe de baixo nível
class EmailNotificationService implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("Sending email with message: " + message);
    }
}

// Classe de alto nível
class GradeService {
    private NotificationService notificationService;

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void addGrade(String studentName, String grade) {
        notificationService.sendNotification("Grade added for " + studentName + ": " + grade);
        System.out.println("Added grade " + grade + " for " + studentName);
    }
}

// Uso
public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new EmailNotificationService();
        GradeService gradeService = new GradeService();
        gradeService.setNotificationService(notificationService);
        gradeService.addGrade("John Doe", "A+");
    }
}

```

#### Injeção de Dependência com Spring
Configuração com Anotações: Usando anotações como @Autowired e @Component para configurar a DI no Spring.

```java
@Component
class EmailNotificationService implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("Sending email with message: " + message);
    }
}

@Component
class GradeService {
    private NotificationService notificationService;

    @Autowired
    public GradeService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void addGrade(String studentName, String grade) {
        notificationService.sendNotification("Grade added for " + studentName + ": " + grade);
        System.out.println("Added grade " + grade + " for " + studentName);
    }
}

@SpringBootApplication
public class ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunner.class, args);
    }
}

```