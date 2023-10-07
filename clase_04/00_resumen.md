## Conceptos de Jerarquía y Herencia:

La herencia es un concepto fundamental en la programación orientada a objetos (POO).
Permite que una clase (llamada clase hija o subclase) herede atributos y métodos de otra clase (llamada clase padre o superclase).

La jerarquía de clases se organiza en una estructura de árbol.

## Clases Abstractas y Métodos Abstractos

Una clase abstracta es una clase que no se puede instanciar directamente, pero puede ser una superclase para otras clases concretas.

Un método abstracto es un método que se declara en una clase abstracta pero no se implementa en esa clase.

Las clases que heredan de una clase abstracta deben proporcionar implementaciones para los métodos abstractos.

## Referencia ``super``, Polimorfismo y Binding Dinámico:

La palabra clave ``super`` se usa para acceder a los miembros de la clase padre desde una subclase.

El polimorfismo permite tratar objetos de diferentes clases de manera uniforme si son subclases de una misma superclase.

El binding dinámico (también se llama enlace tardío) determina qué método se ejecutará en tiempo de ejecución en lugar de tiempo de compilación.

Ejemplo que combina estos conceptos:

```java
// Clase abstracta
abstract class Vehiculo {
    String marca;

    // Constructor
    public Vehiculo(String marca) {
        this.marca = marca;
    }

    // Método abstracto
    abstract void acelerar();
}

// Clase concreta que hereda de Vehiculo
class Coche extends Vehiculo {
    int velocidad;

    // Constructor
    public Coche(String marca) {
        super(marca);
        this.velocidad = 0;
    }

    // Implementación del método abstracto
    void acelerar() {
        velocidad += 10;
        System.out.println("El coche de marca " + marca + " acelera a " + velocidad + " km/h.");
    }
}
```

Hemos creado una clase abstracta ``Vehiculo`` con un atributo ``marca`` y un método abstracto ``acelerar``. Después creamos una clase ``Coche`` que hereda de ``Vehiculo``. Esta clase implementa el método ``acelerar``.

Ejemplo de uso:

```java
Vehiculo miCoche = new Coche("Toyota");
miCoche.acelerar(); // Llama al método de la subclase Coche
```
