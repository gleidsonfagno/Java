# 📘 Módulo: Classes, Herança e Polimorfismo em Java

Este módulo aborda conceitos fundamentais da **Programação Orientada a Objetos (POO)** em Java:
- Criação de classes
- Uso de `extends` para herança
- Modificadores de acesso (`public`, `protected`, `private`, *default*)
- Uso do `this` e do `super`
- Sobrescrita de métodos com `@Override`
- Classes `sealed`, `non-sealed`, `abstract` e `final`
- Polimorfismo com `switch` e `instanceof`

---

## Modificadores de acesso

- **public** → acessível em qualquer lugar.
- **private** → acessível apenas dentro da própria classe.
- **protected** → acessível dentro da classe, no mesmo pacote e em subclasses.
- **default** (sem nada escrito) → acessível apenas dentro do mesmo pacote.

---

## 🛑 Modificador `final`

- **Em variáveis/atributos** → torna o valor imutável (constante).
- **Em métodos** → impede sobrescrita em subclasses.
- **Em classes** → impede herança.

---

## 🟢 Uso do `this` e `super`

- **`this`** → referencia atributos/métodos da própria classe.
  ```java
  this.name = name;

## super → chama construtores ou métodos da superclasse.

```java
   super(code, name, address, age, salary);
   ```

## Sobrescrita de métodos (@Override)

```java
@Override
public String toString() {
    return "Manager: " + this.name;
}

```

## Classes especiais
abstract → não pode ser instanciada, serve como modelo.

sealed → restringe quais classes podem herdar.

non-sealed → permite herança livre, mesmo vindo de uma sealed.

final → não pode ser herdada

```Java
public sealed abstract class Employee permits Manager, Salesman { ... }
public non-sealed class Manager extends Employee { ... }
public final class Salesman extends Employee { ... }
```

## Polimorfismo
Capacidade de tratar objetos de diferentes classes como se fossem da mesma superclasse.

Exemplo com switch:

```java
public static void printEmployee(Employee employee) {
    switch (employee) {
        case Manager manager -> {
            manager.setCode("123");
            manager.setName("Fagno");
            manager.setSalary(5000);
            manager.setLogin("joao");
            manager.setPassword("joao123");
            manager.setCommission(1200);

            System.out.println(manager.getName());
            System.out.println(manager.getSalary());
        }
        case Salesman salesman -> {
            salesman.setCode("456");
            salesman.setName("Fagno");
            salesman.setSalary(2800);
            salesman.setPercentPerSold(10);

            System.out.println(salesman.getName());
            System.out.println(salesman.getSalary());
        }
    }
}

```