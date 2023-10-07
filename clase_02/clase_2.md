## Objetos

En Java, un objeto es una instancia de una clase. Un objeto representa una entidad o concepto del mundo real y puede contener datos (atributos/propiedades) y comportamiento (métodos/funciones).

Para crear un objeto, primero debes definir una clase que actúe como "plantilla" o "molde". Las clases se definen con la palabra clave ``class``.

## Clases

Una clase es una plantilla que describe los atributos y métodos que tendrán los objetos creados a partir de ella.

Los atributos son variables que almacenan datos específicos del objeto, mientras que los métodos son funciones que definen su comportamiento.

Ejemplo de cómo se define una clase sencilla en Java:

```java
public class Persona {
    // Atributos
    String nombre;
    int edad;

        // Constructor
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        // Método
        public void saludar() {
            System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
        }
}
```

## Instancias

Una vez que tenemos una clase, podemos crear instancias u objetos de esa clase. 

Cada instancia tiene sus propios valores de atributos y puede llamar a los métodos definidos en la clase.

Para crear una instancia, usas la palabra clave ``new`` seguida del constructor de la clase.

```java
Persona persona1 = new Persona("Juan", 30);
Persona persona2 = new Persona("María", 25);
```

## Mensajes

En la programación orientada a objetos (POO), los objetos interactúan entre sí enviándose mensajes. Los mensajes son llamadas a métodos en otros objetos.

Por ejemplo, podes llamar al método ``saludar()`` del objeto ``Persona`` para que simule que se presenta a sí mismo.

```java
persona1.saludar(); // Imprime "Hola, soy Juan y tengo 30 años."
persona2.saludar(); // Imprime "Hola, soy María y tengo 25 años."
```

