## Crear una clase Rectangulo y calcular su área

Creamos una clase Rectangulo con atributos para el largo y el ancho. Luego, agregamos un método para calcular el área del rectángulo.

```java
public class Rectangulo {
    double largo;
    double ancho;

    // Constructor
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    // Método para calcular el área del rectángulo
    public double calcularArea() {
        return largo * ancho;
    }
}
```

La clase Rectangulo tiene atributos para el largo y el ancho, y un método ``calcularArea()`` para calcular el área. 

Ahora podemos calcular el área de los rectángulos:

```java
Rectangulo rectangulo1 = new Rectangulo(5.0, 3.0);
double area = rectangulo1.calcularArea();
System.out.println("El área del rectángulo es: " + area);
```
