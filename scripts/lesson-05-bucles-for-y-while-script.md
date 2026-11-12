# Guion — Lección 5: Bucles for y while

**Duración objetivo:** 8 minutos  
**Objetivo:** repetir instrucciones con `for` y `while`, identificando la condición de finalización.

### Guion

**[00:00–00:40 | Introducción]**

**Narración:**

¿Y si necesitamos mostrar los números del uno al cien? Podríamos escribir cien instrucciones, pero sería poco práctico. Para repetir tareas utilizamos bucles.

**[00:40–02:30 | Bucle for]**

**En pantalla:** mostrar una secuencia del 1 al 5.

**Narración:**

El bucle `for` es útil cuando conocemos la cantidad de repeticiones que queremos realizar.

Veamos:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Número: " + i);
}
```

Analicemos sus partes:

- `int i = 1` crea una variable que comienza en uno.
- `i <= 5` indica que el bucle continúa mientras esta condición sea verdadera.
- `i++` aumenta el valor de `i` en uno al terminar cada repetición.

El resultado será una lista de números desde el uno hasta el cinco.

**[02:30–03:30 | Cambiar el bucle]**

**En pantalla:** cambiar el límite de cinco a diez y luego cambiar `i++` por `i += 2`.

**Narración:**

Podemos modificar el límite para mostrar del uno al diez. También podemos aumentar el contador de dos en dos utilizando `i += 2`.

Prueba estos cambios y observa cómo cambia la salida.

**[03:30–05:20 | Bucle while]**

**En pantalla:** escribir:

```java
int energia = 3;

while (energia > 0) {
    System.out.println("Energía restante: " + energia);
    energia--;
}

System.out.println("Sin energía.");
```

**Narración:**

Ahora conozcamos `while`. Este bucle repite instrucciones mientras una condición sea verdadera.

En nuestro ejemplo, la energía comienza en tres. Después de mostrar el valor, reducimos la energía en uno con `energia--`.

Cuando llega a cero, la condición `energia > 0` deja de cumplirse y el bucle termina.

**[05:20–06:15 | Evitar bucles infinitos]**

**Narración:**

Hay algo importante: debemos asegurarnos de que la condición pueda dejar de cumplirse.

Si olvidamos modificar la variable que controla el bucle, podríamos crear un bucle infinito, es decir, uno que nunca termina.

Por eso debemos revisar el contador, la condición y la actualización de la variable.

**[06:15–07:30 | Reto]**

Crea un programa que muestre la tabla de multiplicar del número cinco utilizando `for`.

Pista: comienza con un contador en uno, repite hasta diez y muestra el resultado de multiplicar cinco por el contador.

**Código de referencia para la solución:**

```java
for (int i = 1; i <= 10; i++) {
    System.out.println("5 x " + i + " = " + (5 * i));
}
```

**[07:30–08:00 | Cierre]**

Hoy aprendimos a repetir instrucciones con `for` y `while`. En la siguiente lección organizaremos nuestro código con métodos y aprenderemos a recibir datos del usuario.

### Práctica y archivos

- **Actividad:** tabla de multiplicar del 5.
- **Archivo inicial:** [`starter-files/lesson-05/Main.java`](../starter-files/lesson-05/Main.java)
- **Solución:** [`completed-examples/lesson-05/Main.java`](../completed-examples/lesson-05/Main.java)
- **Editor en línea:** [OnlineGDB](https://onlinegdb.com/VmNCLPUob)
- **Pregunta de comprobación:** ¿Qué debemos revisar para evitar un bucle infinito?
