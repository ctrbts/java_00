Supongamos que deseamos modelar una jerarquía de empleados en una empresa. Crearemos una clase abstracta ``Empleado`` con subclases ``Gerente`` y ``Desarrollador``.

```java
// Clase abstracta Empleado
abstract class Empleado {
    String nombre;
    double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    abstract double calcularSalario();
}

// Clase Gerente que hereda de Empleado
class Gerente extends Empleado {
    double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    @Override
    double calcularSalario() {
        return salarioBase + bono;
    }
}

// Clase Desarrollador que hereda de Empleado
class Desarrollador extends Empleado {
    double bonoPorProyecto;

    public Desarrollador(String nombre, double salarioBase, double bonoPorProyecto) {
        super(nombre, salarioBase);
        this.bonoPorProyecto = bonoPorProyecto;
    }

    @Override
    double calcularSalario() {
        return salarioBase + bonoPorProyecto;
    }
}
```

Hemos creado una clase abstracta ``Empleado`` con un atributo ``salarioBase`` y un método abstracto ``calcularSalario``. Luego, hemos creado las clases ``Gerente`` y ``Desarrollador`` que heredan de ``Empleado`` y proporcionan implementaciones concretas del método ``calcularSalario``.

Ahora podemos crear instancias de estas clases y calcular los salarios de los empleados:

```java
Empleado gerente = new Gerente("Juan", 5000.0, 1000.0);
Empleado desarrollador = new Desarrollador("María", 4000.0, 500.0);

System.out.println("Salario del gerente: " + gerente.calcularSalario());
System.out.println("Salario del desarrollador: " + desarrollador.calcularSalario());
```
