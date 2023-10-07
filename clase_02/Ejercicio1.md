## Crear y usar la clase Estudiante

La clase Estudiante representa los atributos como nombre, edad y calificación de los estudiantes.

```java
public class Estudiante {
    String nombre;
    int edad;
    double calificacion;

    // Constructor
    public Estudiante(String nombre, int edad, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    // Método para mostrar información del estudiante
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificación: " + calificacion);
    }

    // Método para verificar si el estudiante aprobó
    public boolean aprobo() {
        return calificacion >= 4.0;
    }
}
```

Creamos la clase Estudiante con atributos como nombre, edad y calificación. También definimos métodos para mostrar información y verificar si el estudiante aprobó.

Ahora, podemos crear instancias de esta clase para representar estudiantes y usar sus métodos:

```java
Estudiante estudiante1 = new Estudiante("Juan", 20, 6.5);

estudiante1.mostrarInformacion();

if (estudiante1.aprobo()) {
    System.out.println("El estudiante aprobó.");
} else {
    System.out.println("El estudiante no aprobó.");
}
```
