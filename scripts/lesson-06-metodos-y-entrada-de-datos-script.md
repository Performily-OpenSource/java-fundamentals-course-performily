# Guion — Lección 6: Métodos y entrada de datos

**Duración objetivo:** 8 minutos  
**Objetivo:** crear métodos sencillos, utilizar parámetros y recibir datos desde la consola con `Scanner`.

### Guion

**[00:00–00:40 | Introducción]**

**Narración:**

Hasta ahora hemos escrito nuestras instrucciones dentro de `main`. Pero cuando un programa crece, conviene dividirlo en partes pequeñas que podamos reutilizar. Para eso utilizamos métodos.

**[00:40–02:20 | ¿Qué es un método?]**

**En pantalla:** mostrar una función como una máquina que recibe información y realiza una tarea.

**Narración:**

Un método es un bloque de código con un nombre que realiza una tarea. Podemos llamarlo cuando necesitemos ejecutar esa tarea.

Por ejemplo:

```java
public class Main {

    public static void saludar() {
        System.out.println("¡Hola! Bienvenido al programa.");
    }

    public static void main(String[] args) {
        saludar();
        saludar();
    }
}
```

Creamos el método `saludar` y luego lo llamamos dos veces desde `main`. Así reutilizamos el mismo código sin copiar la instrucción.

**[02:20–03:50 | Métodos con parámetros]**

**En pantalla:** mostrar:

```java
public class Main {

    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    public static void main(String[] args) {
        saludar("Ana");
        saludar("Luis");
    }
}
```

**Narración:**

Un parámetro permite que un método reciba información. En este ejemplo, el método recibe un `String` llamado `nombre`.

Cuando lo llamamos, le enviamos un valor. Primero enviamos Ana y después Luis. El método realiza la misma tarea con datos diferentes.

**[03:50–04:50 | Métodos que devuelven valores]**

**En pantalla:** escribir:

```java
public static int sumar(int a, int b) {
    return a + b;
}
```

**Narración:**

Un método también puede devolver un resultado. Para eso indicamos el tipo de dato que devolverá y utilizamos `return`.

Aquí el método `sumar` recibe dos números enteros y devuelve su suma.

Podemos utilizarlo así:

```java
int resultado = sumar(4, 6);
System.out.println(resultado);
```

**[04:50–06:30 | Entrada de datos con Scanner]**

**En pantalla:** escribir el programa completo.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cómo te llamas? ");
        String nombre = teclado.nextLine();

        System.out.print("¿Cuántos años tienes? ");
        int edad = teclado.nextInt();

        System.out.println("Hola, " + nombre);
        System.out.println("Tienes " + edad + " años.");

        teclado.close();
    }
}
```

**Narración:**

Hasta ahora los datos estaban escritos directamente en el código. Con `Scanner` podemos pedirle información a la persona que utiliza el programa.

Primero importamos `Scanner`. Luego creamos un objeto llamado `teclado` que leerá lo que se escriba en la consola.

`nextLine()` lee una línea de texto y `nextInt()` lee un número entero.

Finalmente mostramos los datos recibidos y cerramos el lector.

**[Acción en pantalla]:** ejecutar el programa, escribir un nombre y una edad y mostrar el resultado.

**[06:30–07:30 | Reto]**

Crea un programa que solicite dos números enteros, los envíe a un método llamado `sumar` y muestre el resultado.

Pista: el método puede recibir dos parámetros `int` y devolver un `int`.

**[07:30–08:00 | Cierre]**

¡Muy bien! Ya sabemos organizar tareas con métodos, pasarles datos y recibir información desde la consola. En la siguiente lección conoceremos uno de los conceptos centrales de Java: las clases y los objetos.

### Práctica y archivos

- **Actividad:** saludo personalizado o calculadora de suma con método.
- **Archivo inicial:** [`starter-files/lesson-06/Main.java`](../starter-files/lesson-06/Main.java)
- **Solución:** [`completed-examples/lesson-06/Main.java`](../completed-examples/lesson-06/Main.java)
- **Editor en línea:** [OnlineGDB](https://onlinegdb.com/gR_LUEPit6)
- **Pregunta de comprobación:** ¿Para qué sirven los parámetros y qué hace `return`?
