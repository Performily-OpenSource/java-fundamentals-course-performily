# Guion — Lección 3: Operadores y expresiones

**Duración objetivo:** 6 minutos  
**Objetivo:** utilizar operadores aritméticos y de comparación para construir expresiones sencillas.

### Guion

**[00:00–00:35 | Introducción]**

**Narración:**

Ya sabemos guardar datos. Ahora aprenderemos a trabajar con ellos. Los operadores permiten realizar cálculos y comparar valores, igual que cuando hacemos operaciones en matemáticas.

**[00:35–02:20 | Operadores aritméticos]**

**En pantalla:** mostrar una tabla pequeña con `+`, `-`, `*`, `/` y `%`.

**Narración:**

Los operadores aritméticos principales son:

- `+` para sumar.
- `-` para restar.
- `*` para multiplicar.
- `/` para dividir.
- `%` para obtener el residuo de una división.

Veamos un ejemplo con dos números:

```java
int numeroA = 10;
int numeroB = 3;

System.out.println(numeroA + numeroB);
System.out.println(numeroA - numeroB);
System.out.println(numeroA * numeroB);
System.out.println(numeroA / numeroB);
System.out.println(numeroA % numeroB);
```

Como ambos números son enteros, la división entera `10 / 3` muestra `3`, no `3.333...`. El operador `%` muestra el residuo, que en este caso es `1`.

Si necesitamos un resultado decimal, podemos utilizar valores `double`:

```java
double resultado = 10.0 / 3.0;
System.out.println(resultado);
```

**[02:20–03:40 | Operadores de comparación]**

**En pantalla:** mostrar los símbolos `==`, `!=`, `>`, `<`, `>=` y `<=`.

**Narración:**

También podemos comparar valores. Una comparación produce un resultado verdadero o falso.

Por ejemplo:

```java
int edad = 15;

System.out.println(edad >= 18);
System.out.println(edad == 15);
System.out.println(edad != 12);
```

La primera comparación será falsa porque 15 no es mayor o igual que 18. La segunda será verdadera porque la edad sí es 15.

Atención: `=` asigna un valor a una variable; `==` compara si dos valores son iguales. No son lo mismo.

**[03:40–04:50 | Construir una expresión]**

**En pantalla:** escribir:

```java
int precio = 20;
int cantidad = 3;
int total = precio * cantidad;

System.out.println("Total: " + total);
```

**Narración:**

Imaginemos que compramos tres cuadernos que cuestan veinte unidades monetarias cada uno. Multiplicamos el precio por la cantidad y guardamos el resultado en `total`.

Podemos combinar variables y operadores para resolver situaciones reales.

**[04:50–05:35 | Reto]**

Crea dos variables que representen las notas de dos evaluaciones. Calcula el promedio usando `double` y muestra si el promedio es mayor o igual a 11.

Pista: puedes calcular el promedio sumando ambas notas y dividiendo entre `2.0`.

**[05:35–06:00 | Cierre]**

Hoy aprendimos a calcular y comparar valores. En la siguiente lección utilizaremos las comparaciones para hacer que nuestros programas tomen decisiones.

### Práctica y archivos

- **Actividad:** calculadora de compra o promedio de dos notas.
- **Archivo inicial:** [`starter-files/lesson-03/Main.java`](../starter-files/lesson-03/Main.java)
- **Solución:** [`completed-examples/lesson-03/Main.java`](../completed-examples/lesson-03/Main.java)
- **Editor en línea:** [OnlineGDB](https://onlinegdb.com/3qrh82s67R)
- **Pregunta de comprobación:** ¿Qué diferencia existe entre `=` y `==`?
