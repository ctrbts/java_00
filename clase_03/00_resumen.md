## Constructores 

Como vimos antes las clases son una forma de encapsular datos y comportamiento relacionados en un solo objeto. Podemos agregar atributos y métodos para modelar las características y acciones de la entidad que estamos representando.

Los **constructores** son métodos especiales que se utilizan para inicializar objetos cuando se crean a partir de una clase. Son útiles para asignar valores iniciales a los atributos de un objeto.

El constructor tiene el mismo nombre que la clase y no tiene un tipo de retorno explícito. Podemos tener múltiples constructores en una clase, esto se conoce como "sobrecarga de constructores".

## Referencia "this":

A medida que creamos objetos basados en clases, es común que interactúen entre sí.
Los objetos pueden enviarse mensajes llamando a métodos de otros objetos.

La palabra clave ``this`` se utiliza en para hacer referencia al objeto actual en el que se encuentra el código. Podemos usar ``this`` para diferenciar entre los atributos y parámetros de un método si tienen el mismo nombre.

También es útil para pasar el propio objeto como argumento a otros métodos o constructores.

Ejemplo que combina estos conceptos:

```java
/**
 * Definimos la clase ``Persona`` con dos constructores: uno sin parámetros 
 * y otro con parámetros para inicializar nombre y edad.
 * El método ``mostrarInformacion`` muestra la información de una persona.
 * El método ``saludarA`` permite que una persona salude a otra, 
 * usando la referencia ``this`` para acceder a la propiedad ``nombre`` del propio objeto. 
 * */    
    
public class Persona {
    String nombre;
    int edad;

    // Constructor sin parámetros
    public Persona() {
        this.nombre = "Desconocido";
        this.edad = 0;
    }

    // Constructor con parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }

    // Método para hacer que una persona salude a otra
    public void saludarA(Persona otraPersona) {
        System.out.println("Hola " + otraPersona.nombre + ". Soy " + this.nombre + ".");
    }
}
```


Ejemplo de uso:

```java
/**
 * Aca creamos dos objetos de tipo Persona, 
 * los inicializamos pasandole parámetros como nombre y edad. 
 * Después llamamos al metodo saludarA.
 * 
 * Esto imprime en pantalla: "Hola Maria. Soy Juan."
 * */

Persona persona1 = new Persona("Juan", 30);
Persona persona2 = new Persona("María", 25);

persona1.saludarA(persona2);
```
