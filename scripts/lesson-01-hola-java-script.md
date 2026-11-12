# Guion — Lección 1: ¡Hola, Java! Introducción a la programación

**Duración objetivo:** 6 minutos  
**Objetivo:** comprender qué es programar, reconocer para qué se utiliza Java y ejecutar un primer programa.

### Preparación de pantalla

- Abrir el editor Java en línea elegido por el equipo.
- Tener preparado un proyecto vacío o el archivo `Main.java`.
- Mostrar el título del video y, si es posible, una diapositiva con la idea de algoritmo: instrucciones ordenadas para lograr algo.

### Guion

**[00:00–00:40 | Presentación]**

**Narración:**

¡Hola! Bienvenidos a este curso de Fundamentos de Java. En estas lecciones aprenderemos a darle instrucciones a una computadora para resolver problemas, crear pequeños programas y conocer las bases de la programación orientada a objetos.

No necesitas experiencia previa ni instalar programas. Solo necesitarás un navegador y muchas ganas de experimentar. ¡Empecemos!

**[00:40–01:40 | ¿Qué es programar?]**

**En pantalla:** mostrar una receta sencilla o una secuencia de pasos para preparar un sándwich.

**Narración:**

Imagina que quieres preparar un sándwich. Primero colocas el pan, después agregas el queso, luego el tomate y finalmente cierras el sándwich. Si cambias el orden o te saltas un paso, el resultado puede ser diferente.

Programar se parece a eso: consiste en escribir instrucciones claras y ordenadas para que una computadora realice una tarea. La computadora sigue las instrucciones que le damos; por eso debemos indicar exactamente qué debe hacer.

Un conjunto ordenado de pasos para resolver un problema se llama algoritmo. Un programa es una forma de expresar esas instrucciones en un lenguaje que la computadora pueda ejecutar.

**[01:40–02:40 | ¿Qué es Java?]**

**En pantalla:** mostrar el nombre Java y ejemplos de categorías de aplicaciones: sistemas, aplicaciones empresariales, herramientas y servicios.

**Narración:**

Java es un lenguaje de programación. Se utiliza para construir distintos tipos de aplicaciones y sistemas. Es popular porque permite organizar programas en partes, reutilizar código y trabajar en diferentes plataformas que cuentan con un entorno compatible con Java.

Durante el curso empezaremos con instrucciones sencillas y luego aprenderemos a organizar nuestro código mediante clases y objetos.

**[02:40–04:30 | Primer programa: Hola, mundo]**

**En pantalla:** escribir el código lentamente y resaltar cada línea.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");
    }
}
```

**Narración:**

Este será nuestro primer programa. Observemos sus partes.

`public class Main` declara una clase llamada `Main`. Por ahora, piensa en una clase como una estructura que contiene código.

Dentro encontramos `main`. Este método es el punto de entrada de nuestro programa: Java comienza a ejecutar las instrucciones desde aquí.

Finalmente, `System.out.println` muestra un mensaje en la consola. El texto que queremos mostrar se escribe entre comillas.

Ahora ejecutemos el programa.

**[Acción en pantalla]:** pulsar Run/Ejecutar y mostrar la salida `¡Hola, mundo!`.

¡Funcionó! La computadora recibió nuestras instrucciones y mostró el mensaje.

**[04:30–05:30 | Reto]**

**Narración:**

Ahora es tu turno. Cambia el mensaje para que aparezca tu nombre y una actividad que te guste. Por ejemplo:

```java
System.out.println("Hola, soy Alex y me gusta dibujar.");
```

Pausa el video e inténtalo. Si aparece un error, revisa que el texto esté entre comillas y que la instrucción termine con punto y coma.

**[05:30–06:00 | Cierre]**

Hoy aprendimos qué significa programar, qué es Java y cómo mostrar nuestro primer mensaje. En la siguiente lección veremos cómo guardar información usando variables.

### Práctica y archivos

- **Actividad:** personalizar el mensaje de bienvenida.
- **Archivo inicial:** [`starter-files/lesson-01/Main.java`](../starter-files/lesson-01/Main.java)
- **Solución:** [`completed-examples/lesson-01/Main.java`](../completed-examples/lesson-01/Main.java)
- **Editor en línea:** [OnlineGDB](https://onlinegdb.com/ZGGDhjODF)
- **Pregunta de comprobación:** ¿Qué instrucción utilizamos para mostrar un mensaje en la consola?
