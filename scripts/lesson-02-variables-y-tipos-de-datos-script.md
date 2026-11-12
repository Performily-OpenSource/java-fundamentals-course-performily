# Guion — Lección 2: Variables y tipos de datos

**Duración objetivo:** 7 minutos  
**Objetivo:** declarar variables, reconocer tipos de datos básicos y mostrar sus valores.

### Preparación de pantalla

- Abrir el proyecto de la lección 2.
- Mostrar una analogía visual de cajas etiquetadas para representar variables.

### Guion

**[00:00–00:35 | Repaso e introducción]**

**Narración:**

¡Bienvenidos de nuevo! En la lección anterior mostramos un mensaje en pantalla. Pero ¿qué pasa si queremos guardar el nombre de una persona, su edad o su promedio? Para eso utilizamos variables.

**[00:35–01:40 | ¿Qué es una variable?]**

**En pantalla:** mostrar cajas con etiquetas `nombre`, `edad` y `promedio`.

**Narración:**

Una variable es un espacio identificado por un nombre donde guardamos un dato que nuestro programa puede utilizar.

Imagina varias cajas: cada caja tiene una etiqueta y guarda algo. En Java, la etiqueta es el nombre de la variable y el tipo de dato indica qué clase de valor podemos almacenar.

**[01:40–03:30 | Tipos de datos básicos]**

**En pantalla:** escribir y explicar cada ejemplo.

```java
int edad = 15;
double estatura = 1.65;
String nombre = "Lucía";
boolean tieneMascota = true;
```

**Narración:**

Veamos cuatro tipos comunes.

- `int` guarda números enteros, como 15 o 20.
- `double` permite guardar números con decimales, como 1.65.
- `String` guarda texto. Por ejemplo, un nombre. Observa que el texto va entre comillas.
- `boolean` guarda uno de dos valores: `true` o `false`, es decir, verdadero o falso.

El nombre de una variable debe ser claro. `edad` es más fácil de entender que `x` cuando estamos guardando la edad de alguien.

**[03:30–04:50 | Declarar, asignar y utilizar]**

**En pantalla:** escribir el programa completo.

```java
public class Main {
    public static void main(String[] args) {
        String nombre = "Lucía";
        int edad = 15;
        double promedio = 16.5;
        boolean estaMatriculada = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("¿Está matriculada? " + estaMatriculada);
    }
}
```

**Narración:**

Primero declaramos las variables indicando su tipo y nombre. Después les asignamos un valor con el signo igual.

Podemos utilizar el signo más para unir texto y valores al mostrar un resultado. En este caso, Java convierte los valores para mostrarlos junto con el texto.

Ejecutemos el programa y observemos la información que aparece.

**[Acción en pantalla]:** ejecutar el código y señalar cada línea de salida.

**[04:50–05:50 | Cambiar el valor de una variable]**

**En pantalla:** añadir después de la declaración `edad = 16;` y volver a imprimir la edad.

**Narración:**

Una variable puede cambiar de valor durante la ejecución. Como ya declaramos `edad`, podemos asignarle otro valor sin repetir el tipo:

```java
edad = 16;
System.out.println("Nueva edad: " + edad);
```

No escribimos `int` otra vez porque la variable ya existe.

**[05:50–06:35 | Reto]**

Crea tres variables: tu nombre, tu edad y tu comida favorita. Elige el tipo adecuado para cada una y muestra los tres datos en la consola.

**[06:35–07:00 | Cierre]**

¡Muy bien! Ya sabemos guardar y mostrar información. En la siguiente lección aprenderemos a realizar operaciones con esos datos usando operadores.

### Práctica y archivos

- **Actividad:** ficha personal con nombre, edad, estatura y una preferencia.
- **Archivo inicial:** [`starter-files/lesson-02/Main.java`](../starter-files/lesson-02/Main.java)
- **Solución:** [`completed-examples/lesson-02/Main.java`](../completed-examples/lesson-02/Main.java)
- **Editor en línea:** [OnlineGDB](https://onlinegdb.com/Vh4IaGZrh)
- **Pregunta de comprobación:** ¿Qué diferencia existe entre `int`, `double`, `String` y `boolean`?
