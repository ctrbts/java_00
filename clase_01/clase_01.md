## Lectura y Generación Aleatoria

En esta parte, vamos a aprender cómo trabajar con números aleatorios en Java. Java proporciona una clase llamada Random que facilita la generación de números aleatorios. Acá tenes un resumen de los conceptos clave:

### Clase Random

Para utilizarla, primero necesitas importar la clase _Random_ en tu programa. Podés hacerlo de la siguiente manera:

```java
import java.util.Random;
```

### Generar Números Aleatorios

Podes crear una instancia de Random y usar sus métodos para generar números aleatorios. Por ejemplo, para obtener un número entero aleatorio entre 1 y 100:

```java
Random rand = new Random();
int numeroAleatorio = rand.nextInt(100) + 1; // Genera un número entre 1 y 100
```

### Lectura de Datos Aleatorios

También podes usar números aleatorios para seleccionar elementos aleatorios de una lista o realizar otras tareas que requieran datos aleatorios.

## Estructuras de Control

Las estructuras de control permiten controlar el flujo de ejecución de un programa. Estructuras de control clave en Java:

**if y else** Permiten tomar decisiones en tu programa basadas en condiciones.
Por ejemplo:

```java
int edad = 18;

if (edad >= 18) {
    System.out.println("Eres mayor de edad.");
} else {
    System.out.println("Eres menor de edad.");
}
```

**for, while, do-while**: Te permiten repetir un bloque de código X cantidad de veces.
Por ejemplo:

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iteración " + i);
}

int i = 0;
while (i < 10) {
    System.out.println(i);
    i++;
}

int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 10);
```

**switch**: Se utiliza para realizar múltiples casos de decisión. Podes elegir una acción basada en el valor de una expresión. Por ejemplo:

```java
int opcion = 2;

switch (opcion) {
    case 1:
        System.out.println("Opción no válida.");
        break;
    case 2:
        System.out.println("Opción 2 seleccionada.");
        break;
    default:
        System.out.println("Opción no válida.");
}
```

## Vectores y Matrices:

En Java, los vectores (arreglos unidimensionales) y las matrices (arreglos multidimensionales) son estructuras de datos fundamentales:

> nota: el primer elemento de un vector o matriz es 0

_Vectores_: Son colecciones ordenadas de elementos del mismo tipo:

```java
// Declarar un vector de enteros con capacidad para 5 elementos
int[] numeros = new int[5];

// Asignar un valor al primer elemento
numeros[0] = 10;

// Acceder al tercer elemento
int valor = numeros[2];
```

_Matrices_: Son arreglos multidimensionales. Podemos imaginarlos como una tabla con filas y columnas:

```java
// Declarar una matriz 3x3 de enteros
int[][] matriz = new int[3][3];

// Asignar un valor a la primera fila y primera columna
matriz[0][0] = 1;

// Acceder a la segunda fila y tercera columna
int valor = matriz[1][2];
```
