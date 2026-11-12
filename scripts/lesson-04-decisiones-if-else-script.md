# Guion — Lección 4: Decisiones con if y else

**Duración objetivo:** 7 minutos  
**Objetivo:** utilizar estructuras condicionales para ejecutar instrucciones según una condición.

### Guion

**[00:00–00:40 | Introducción]**

**Narración:**

Imagina una aplicación que te indica si puedes ingresar a una actividad según tu edad. La aplicación necesita evaluar una condición y elegir qué mensaje mostrar. En Java podemos hacer esto con `if` y `else`.

**[00:40–01:50 | La estructura if]**

**En pantalla:** mostrar un diagrama simple: condición → verdadero → acción.

**Narración:**

`if` significa “si”. Le indica al programa que ejecute un bloque de instrucciones solamente cuando una condición sea verdadera.

Observemos:

```java
int edad = 16;

if (edad >= 13) {
    System.out.println("Puedes participar.");
}
```

Java evalúa `edad >= 13`. Como la condición es verdadera, muestra el mensaje.

**[01:50–03:10 | La estructura if-else]**

**En pantalla:** ampliar el diagrama con una segunda ruta para falso.

**Narración:**

¿Y si la condición es falsa? Podemos agregar `else`, que significa “si no”.

```java
int edad = 12;

if (edad >= 13) {
    System.out.println("Puedes participar.");
} else {
    System.out.println("Todavía no cumples la edad.");
}
```

Ahora el programa tiene dos caminos. Si la condición se cumple, ejecuta el primer bloque. Si no se cumple, ejecuta el bloque de `else`.

**[03:10–04:35 | Varias alternativas con else if]**

**En pantalla:** escribir un ejemplo de clasificación de notas.

```java
int nota = 16;

if (nota >= 18) {
    System.out.println("Excelente");
} else if (nota >= 14) {
    System.out.println("Buen trabajo");
} else if (nota >= 11) {
    System.out.println("Aprobado");
} else {
    System.out.println("Sigue practicando");
}
```

**Narración:**

Cuando tenemos más de dos posibilidades, podemos utilizar `else if`.

Java evalúa las condiciones en orden. Ejecuta el primer bloque cuya condición sea verdadera y luego continúa después de toda la estructura.

El orden importa. Si colocáramos primero `nota >= 11`, una nota de 18 también cumpliría esa condición y nunca llegaría a la alternativa de “Excelente”.

**[04:35–05:35 | Combinar condiciones]**

**En pantalla:** mostrar `&&` y `||`.

**Narración:**

También podemos combinar condiciones. `&&` significa que ambas condiciones deben ser verdaderas. `||` significa que basta con que una sea verdadera.

```java
int edad = 16;
boolean tienePermiso = true;

if (edad >= 15 && tienePermiso) {
    System.out.println("Acceso permitido.");
} else {
    System.out.println("Acceso no permitido.");
}
```

**[05:35–06:35 | Reto]**

Crea un programa que guarde una nota entre 0 y 20 y muestre si el estudiante aprobó. Utiliza `if` y `else`, considerando que la nota mínima aprobatoria del ejemplo será 11.

Prueba con una nota de 8 y luego con una nota de 15.

**[06:35–07:00 | Cierre]**

¡Excelente! Ya podemos hacer que un programa tome decisiones. En la siguiente lección aprenderemos a repetir instrucciones sin escribirlas muchas veces.

### Práctica y archivos

- **Actividad:** clasificador de notas o verificador de acceso.
- **Archivo inicial:** [`starter-files/lesson-04/Main.java`](../starter-files/lesson-04/Main.java)
- **Solución:** [`completed-examples/lesson-04/Main.java`](../completed-examples/lesson-04/Main.java)
- **Editor en línea:** [OnlineGDB](https://onlinegdb.com/0gNApYej8F)
- **Pregunta de comprobación:** ¿Cuándo se ejecuta el bloque `else`?
