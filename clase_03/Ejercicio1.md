## Crear una clase Libro con constructores

Creamos una clase Libro que represente libros con atributos como título, autor y año de publicación.

```java
public class Libro {
    String titulo;
    String autor;
    int añoPublicacion;

    // Constructor sin parámetros
    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Anónimo";
        this.añoPublicacion = 0;
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    // Método para mostrar información del libro
    public void mostrarInformacion() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Año de publicación: " + this.añoPublicacion);
    }
}
```

Hemos creado la clase ``Libro`` con dos constructores: uno sin parámetros y otro con parámetros para inicializar los atributos. También hemos agregado un método ``mostrarInformacion`` para mostrar la información del libro.

Podemos ahora crear instancias de esta clase y utilizar los constructores para definir los atributos:

```java
Libro libro1 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1954);
Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);

libro1.mostrarInformacion();
libro2.mostrarInformacion();
```
