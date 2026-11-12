# Guion — Lección 8: Encapsulación y mini proyecto

**Duración objetivo:** 9 minutos  
**Objetivo:** aplicar encapsulación con atributos privados y métodos de acceso, y construir un pequeño registro de estudiantes.

### Guion

**[00:00–00:45 | Introducción]**

**Narración:**

En la lección anterior creamos clases y objetos. Pero ¿deberíamos permitir que cualquier parte del programa cambie directamente todos los datos de un objeto? No siempre. Para controlar el acceso a la información utilizamos un principio llamado encapsulación.

Hoy aplicaremos este concepto en un pequeño registro de estudiantes.

**[00:45–02:20 | ¿Qué es la encapsulación?]**

**En pantalla:** mostrar una caja que guarda información y una puerta de acceso controlada.

**Narración:**

La encapsulación consiste en proteger los datos de un objeto y controlar cómo otras partes del programa pueden consultarlos o modificarlos.

En Java podemos declarar atributos como `private`. Esto significa que no podremos acceder directamente a ellos desde cualquier otra clase.

En su lugar, utilizaremos métodos para consultar o actualizar sus valores.

**[02:20–03:40 | Getters y setters]**

**En pantalla:** escribir:

```java
class Estudiante {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }
}
```

**Narración:**

Los métodos que comienzan con `get` permiten consultar un atributo. Por ejemplo, `getNombre` devuelve el nombre del estudiante.

Los métodos que comienzan con `set` permiten modificar un atributo. En `setEdad` agregamos una condición para aceptar solamente edades mayores que cero.

Esto nos permite controlar los datos en lugar de modificarlos sin ninguna validación.

**[03:40–04:30 | Utilizar la clase]**

**En pantalla:** escribir:

```java
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();

        estudiante.setNombre("Sofía");
        estudiante.setEdad(16);

        System.out.println(estudiante.getNombre());
        System.out.println(estudiante.getEdad());
    }
}
```

**Narración:**

Creamos un estudiante y modificamos sus datos mediante los setters. Después consultamos la información utilizando los getters.

Observa que no escribimos `estudiante.nombre` ni `estudiante.edad`, porque los atributos son privados.

**[04:30–05:20 | Introducción a arrays]**

**En pantalla:** mostrar una fila de espacios numerados del cero al dos.

**Narración:**

Cuando queremos almacenar varios valores del mismo tipo, podemos utilizar un array.

Un array guarda varios elementos y cada uno tiene una posición, llamada índice. En Java los índices comienzan en cero.

Por ejemplo:

```java
String[] nombres = {"Sofía", "Mateo", "Valeria"};

System.out.println(nombres[0]);
System.out.println(nombres[1]);
```

La primera posición es cero, por eso `nombres[0]` muestra Sofía.

**[05:20–07:50 | Mini proyecto: registro sencillo de estudiantes]**

**En pantalla:** construir el código completo por partes.

```java
class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe ser mayor que cero.");
        }
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
            new Estudiante("Sofía", 16),
            new Estudiante("Mateo", 15),
            new Estudiante("Valeria", 17)
        };

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("--- Estudiante " + (i + 1) + " ---");
            estudiantes[i].mostrarDatos();
        }
    }
}
```

**Narración:**

Vamos a reunir varios conceptos en un solo proyecto.

Primero definimos la clase `Estudiante`, con dos atributos privados: nombre y edad.

El constructor recibe los valores iniciales. Para la edad utilizamos `setEdad`, que valida que sea mayor que cero.

Después creamos un array de estudiantes. Cada posición contiene un objeto diferente, construido con `new Estudiante`.

Finalmente utilizamos un bucle `for` para recorrer el array y mostrar los datos de cada estudiante.

Ejecutemos el programa. Deberíamos ver la información de los tres estudiantes, uno después del otro.

**[Acción en pantalla]:** ejecutar y mostrar la salida completa.

**[07:50–08:35 | Reto final]**

Ahora modifica el programa:

1. Agrega un cuarto estudiante.
2. Cambia el nombre o la edad de uno de los estudiantes.
3. Intenta asignar una edad de cero y observa qué sucede.
4. Explica por qué los atributos están declarados como `private`.

**[08:35–09:00 | Cierre del curso]**

¡Lo lograste! A lo largo de este curso aprendiste a mostrar mensajes, guardar datos, realizar operaciones, tomar decisiones, repetir instrucciones, crear métodos y organizar programas con clases y objetos.

También conociste la encapsulación y los arrays, y construiste un pequeño registro de estudiantes.

Recuerda: programar se aprende practicando. No te preocupes si al principio aparecen errores; leerlos, buscar su causa y corregirlos forma parte del aprendizaje.

¡Gracias por acompañarnos y sigue creando con Java!

### Práctica y archivos

- **Actividad:** completar y ampliar el registro de estudiantes.
- **Archivo inicial:** [`starter-files/lesson-08/Main.java`](../starter-files/lesson-08/Main.java)
- **Solución:** [`completed-examples/lesson-08/Main.java`](../completed-examples/lesson-08/Main.java)
- **Editor en línea:** [OnlineGDB](https://onlinegdb.com/X0dl2dqWt)
- **Pregunta de comprobación:** ¿Qué ventajas ofrece declarar atributos como `private` y utilizar getters/setters?
