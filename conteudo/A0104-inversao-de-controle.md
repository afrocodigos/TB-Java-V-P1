# Inversão de Controle

## Índice
- [O que é?](#o-que-é)
- [Aplicando o DIP](#aplicando-o-dip)

### O que é?

Inversão de Controle (IoC) é um princípio de design usado na programação de software utilizada para aumentar a modularidade dos sistemas, criar extensibilidade e usufruir melhor da OOP (Programação Orientada a Objetos).

O termo inicial foi utilizado por Michael Mattson mas ficou popular em 2004 após citado por Robert C. Martin (Uncle Bob), quando apresentou os  cinco princípios **`SOLID`**:

- **S**ingle Responsibility Principle (Princípio da responsabilidade única)
- **O**pen-Closed Principle (Princípio aberto/fechado)
- **L**iskov Substitution Principle (Princípio da substituição de Liskov)
- **I**nterface Segregation Principle (Princípio da segregação da interface)
- **D**ependency Inversion Principle - **DIP** (Princípio da inversão da dependência)

No principio ele afirma que:

- Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações.
- Abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.

> classes ou módulos de alto nível são aquelas que encapsulam comportamentos complexos e interagem com abstrações, enquanto classes de baixo nível são responsáveis por implementações detalhadas e específicas.


**Código acoplado(sem DIP):**
```java
// Classe de baixo nível
class EmailNotificationService {
    public void sendEmail(String message) {
        System.out.println("Sending email with message: " + message);
    }
}

// Classe de alto nível
class GradeService {
    private EmailNotificationService emailService = new EmailNotificationService();

    public void addGrade(String studentName, String grade) {
        emailService.sendEmail("Grade added for " + studentName + ": " + grade);
        System.out.println("Added grade " + grade + " for " + studentName);
    }
}

```

### Aplicando o DIP
Uma das formas de se aplicar DIP é cirando uma interface ou classe abstrata

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

**1. Interface (Abstração)**
A interface `NotificationService` define o contrato que qualquer serviço de notificação deve seguir.

**2. Classe de Baixo Nível**
A classe `EmailNotificationService` implementa a interface `NotificationService`, fornecendo uma implementação concreta para o método sendNotification.

**3. Classe de Alto Nível**
A classe `GradeService` depende da abstração `NotificationService`. A dependência é injetada através do construtor, seguindo o princípio da inversão de dependência.

**4. Uso**
No método `main`, criamos uma instância de `EmailNotificationService` e a injetamos na `GradeService`. Este é um exemplo clássico de injeção de dependência por construtor.

> Essa é uma das formas de aplicação do Princípio da inversão da dependência.
 Existem várias formas de aplicar o DIP, com abordagens como Service Locator e Factory Pattern. Mesmo assim, a **`Injeção de Dependência`** é geralmente a mais recomendada devido à sua simplicidade, clareza e suporte robusto em muitos frameworks modernos como Spring.

---

### Links

- [Os princípios SOLID da Programação Orientada a Objetos explicados em bom português](https://www.freecodecamp.org/portuguese/news/os-principios-solid-da-programacao-orientada-a-objetos-explicados-em-bom-portugues/)
- [Video: Principio da inversão de dependência - principios do SOLID](https://www.youtube.com/watch?v=iUzfr4CWEYA&ab_channel=VamosCodar)