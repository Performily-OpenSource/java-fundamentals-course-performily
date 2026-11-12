# Guion — Lección 7: Clases, objetos y constructores

**Duración objetivo:** 9 minutos  
**Objetivo:** comprender la relación entre clases y objetos, definir atributos y métodos y crear objetos con constructores.

### Preparación de pantalla

- Mostrar el ejemplo de una ficha de mascota: nombre, especie y edad.
- Tener preparado un proyecto con `Main.java`.

### Guion

**[00:00–00:50 | Introducción]**

**Narración:**

¡Llegamos a una parte muy importante! En Java podemos organizar nuestro programa utilizando programación orientada a objetos.

Imagina que queremos crear un programa para registrar mascotas. Cada mascota tiene información, como su nombre, especie y edad, y también puede realizar acciones, como mostrar sus datos.

Para representar estos elementos utilizaremos clases y objetos.

**[00:50–02:20 | ¿Qué es una clase?]**

**En pantalla:** mostrar el dibujo de un molde para crear galletas y varias galletas creadas con ese molde.

**Narración:**

Una clase funciona como un molde o una plantilla. Describe qué información y comportamientos tendrán los objetos que creemos a partir de ella.

En nuestro ejemplo, la clase será `Mascota`. Definirá qué datos tendrá una mascota y qué acciones podrá realizar.

**[02:20–04:20 | Crear una clase con atributos]**

**En pantalla:** escribir:

```java
class Mascota {
    String nombre;
    String especie;
    int edad;
}
```

**Narración:**

Creamos la clase `Mascota`. Dentro declaramos tres atributos: `nombre`, `especie` y `edad`.

Los atributos representan la información que guarda cada objeto. Por ejemplo, una mascota puede llamarse Luna, ser un gato y tener dos años.

**[04:20–05:40 | Crear objetos]**

**En pantalla:** mostrar el programa completo:

```java
class Mascota {
    String nombre;
    String especie;
    int edad;
}

public class Main {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota();

        mascota1.nombre = "Luna";
        mascota1.especie = "Gato";
        mascota1.edad = 2;

        System.out.println(mascota1.nombre);
        System.out.println(mascota1.especie);
        System.out.println(mascota1.edad);
    }
}
```

**Narración:**

Para crear un objeto utilizamos `new`. En este caso, creamos un objeto de la clase `Mascota` y lo guardamos en la variable `mascota1`.

Después asignamos sus atributos utilizando el punto: `mascota1.nombre`, `mascota1.especie` y `mascota1.edad`.

Podríamos crear otro objeto, por ejemplo `mascota2`, y tendría sus propios valores.

**[05:40–07:10 | Métodos dentro de una clase]**

**En pantalla:** agregar un método a la clase:

```java
class Mascota {
    String nombre;
    String especie;
    int edad;

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
}
```

**Narración:**

Además de atributos, una clase puede tener métodos. Los métodos representan comportamientos.

Nuestro método `mostrarInformacion` muestra los datos de la mascota. Para utilizarlo, llamamos al método desde el objeto:

```java
mascota1.mostrarInformacion();
```

Así reunimos los datos y las acciones relacionadas dentro de una misma clase.

**[07:10–08:20 | Constructores]**

**En pantalla:** mostrar la clase con constructor:

```java
class Mascota {
    String nombre;
    String especie;
    int edad;

    Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    void mostrarInformacion() {
        System.out.println(nombre + " es un " + especie
                + " de " + edad + " años.");
    }
}
```

**Narración:**

Un constructor es una parte especial de la clase que se ejecuta cuando creamos un objeto. Nos permite darle sus valores iniciales.

En este ejemplo, el constructor recibe el nombre, la especie y la edad.

La palabra `this` hace referencia al objeto actual. Por eso `this.nombre` representa el atributo del objeto y `nombre` representa el parámetro recibido.

Ahora podemos crear una mascota de forma más directa:

```java
Mascota mascota1 = new Mascota("Luna", "Gato", 2);
mascota1.mostrarInformacion();
```

**[08:20–08:45 | Reto]**

Crea una clase `Estudiante` con los atributos `nombre` y `grado`. Agrega un constructor para inicializarlos y un método que muestre sus datos.

**[08:45–09:00 | Cierre]**

¡Felicitaciones! Ya conoces clases, objetos, atributos, métodos y constructores. En la última lección aprenderemos a proteger los datos y construiremos un pequeño programa que reúna lo aprendido.

### Práctica y archivos

- **Actividad:** crear una clase `Estudiante` o `Mascota`.
- **Archivo inicial:** [`starter-files/lesson-07/Main.java`](../starter-files/lesson-07/Main.java)
- **Solución:** [`completed-examples/lesson-07/Main.java`](../completed-examples/lesson-07/Main.java)
- **Editor en línea:** [OnlineGDB](https://onlinegdb.com/zpYY4Lefti)
- **Pregunta de comprobación:** ¿Cuál es la diferencia entre una clase y un objeto?
