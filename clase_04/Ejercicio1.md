## Crear una jerarquía de figuras geométricas

Queremos modelar figuras geométricas como círculos y rectángulos. Vamos a crear una jerarquía de clases para representar estas figuras, con una clase abstracta Figura como superclase.

```java
// Clase abstracta Figura
abstract class Figura {
    // método de la clase abstracta
    abstract double calcularArea();
}

// Clase Círculo que hereda de Figura
class Circulo extends Figura {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }
}

// Clase Rectángulo que hereda de Figura
class Rectangulo extends Figura {
    double largo;
    double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    double calcularArea() {
        return largo * ancho;
    }
}
```

Ejemplo de uso:

```java
Figura circulo = new Circulo(5.0);
Figura rectangulo = new Rectangulo(4.0, 3.0);

System.out.println("Área del círculo: " + circulo.calcularArea());
System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
```
