## Crear una clase CuentaBancaria con métodos de depósito y retiro

Creamos una clase CuentaBancaria con atributos para el saldo y métodos para depositar y retirar dinero.

```java
public class CuentaBancaria {
    double saldo;

    // Constructor
    public CuentaBancaria(double saldoInicial) {
        saldo = saldoInicial;
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // Método para obtener el saldo
    public double obtenerSaldo() {
        return saldo;
    }
}
```

La clase CuentaBancaria tiene un atributo de saldo y métodos para depositar, retirar y obtener el saldo.

Ahora podemos crear una cuenta, realizar transacciones y consultar el saldo:

```java
CuentaBancaria cuenta1 = new CuentaBancaria(1000.0);

cuenta1.depositar(500.0);
cuenta1.retirar(200.0);
double saldoActual = cuenta1.obtenerSaldo();

System.out.println("Saldo actual: " + saldoActual);
```
