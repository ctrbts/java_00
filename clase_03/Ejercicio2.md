## Interacción entre objetos

Creamos una clase Persona con un método para agregar amigos y otro para mostrar la lista de amigos.

```java
// esta clase que importamos nos permite trabajar con arreglos
import java.util.ArrayList;

public class Persona {
    String nombre;
    ArrayList<Persona> amigos;

    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
        this.amigos = new ArrayList<>();
    }

    // Método para agregar un amigo
    public void agregarAmigo(Persona amigo) {
        amigos.add(amigo);
    }

    // Método para mostrar la lista de amigos
    public void mostrarAmigos() {
        System.out.println("Amigos de " + this.nombre + ":");
        for (Persona amigo : amigos) {
            System.out.println("- " + amigo.nombre);
        }
    }
}
```

Hemos creado la clase ``Persona`` con un atributo amigos, que es una lista de personas que son amigos de la persona actual. Los métodos ``agregarAmigo`` y ``mostrarAmigos`` permiten agregar amigos y mostrar la lista de amigos de una persona.

Podemos ahora crear instancias de la clase ``Persona`` y utilizar los métodos para gestionar las amistades:

```java
Persona persona1 = new Persona("Juan");
Persona persona2 = new Persona("María");
Persona persona3 = new Persona("Pedro");

persona1.agregarAmigo(persona2);
persona1.agregarAmigo(persona3);

persona1.mostrarAmigos();
```
