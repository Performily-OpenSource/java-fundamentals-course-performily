# Fundamentos de Java para Principiantes

## Resumen del Curso

Este curso de **1 hora** introduce a estudiantes de secundaria a los fundamentos de la programación con Java, incluyendo programación orientada a objetos (POO). Empezamos con un primer programa que muestra un mensaje y terminamos con un pequeño registro de estudiantes hecho con clases y objetos. **¡No requiere descargas!** Solo abre tu navegador web.

| Información | Detalle |
|-------------|---------|
| **Duración total** | ~60 minutos (8 lecciones en video) |
| **Público objetivo** | Estudiantes de 12 a 17 años sin experiencia en programación |
| **Prerrequisitos** | Ninguno |
| **Herramientas necesarias** | Navegador web (Chrome, Firefox, Safari, Edge) |
| **Editor en línea** | [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) (gratis, no necesitas registrarte) |
| **Enfoque** | Bases de Java y POO con ejemplos cotidianos: notas, mascotas y estudiantes |

### Repositorio de Código Fuente

[https://github.com/Performily-OpenSource/java-fundamentals-course-performily](https://github.com/Performily-OpenSource/java-fundamentals-course-performily)

---

## Secuencia de Lecciones

### Lección 1: ¡Hola, Java! Introducción a la programación (5:08 min)

- **Descripción**: Aprende qué es programar, qué es un algoritmo y para qué se usa Java. Escribe y ejecuta tu primer programa.
- **Conclusiones clave**: Un programa es una lista de instrucciones ordenadas; `main` es el punto de entrada; `System.out.println("...");` muestra un mensaje.
- **Reto**: Cambia el mensaje para que aparezca tu nombre y algo que te guste.

| Recurso | Enlace |
|---------|--------|
| **Video en YouTube** | [Ver lección](https://youtu.be/E3bf6fJWpX4) |
| **Práctica en línea** | [Abrir OnlineGDB](https://onlinegdb.com/ZGGDhjODF) |
| **Solución en línea** | [Abrir OnlineGDB](https://onlinegdb.com/E30x4A_3M) |
| **Código inicial** | [starter-files/lesson-01/Main.java](starter-files/lesson-01/Main.java) |
| **Código completo** | [completed-examples/lesson-01/Main.java](completed-examples/lesson-01/Main.java) |
| **Guion** | [scripts/lesson-01-hola-java-script.md](scripts/lesson-01-hola-java-script.md) |

---

### Lección 2: Variables y tipos de datos (4:56 min)

- **Descripción**: Aprende a guardar información en variables, como si fueran cajas con etiqueta.
- **Conclusiones clave**: `int` para enteros, `double` para decimales, `String` para texto y `boolean` para verdadero o falso; una variable puede cambiar de valor sin volver a escribir su tipo.
- **Reto**: Crea variables con tu nombre, tu edad y tu comida favorita y muéstralas en la consola.

| Recurso | Enlace |
|---------|--------|
| **Video en YouTube** | [Ver lección](https://youtu.be/ajFHGKrNFPg) |
| **Práctica en línea** | [Abrir OnlineGDB](https://onlinegdb.com/Vh4IaGZrh) |
| **Solución en línea** | [Abrir OnlineGDB](https://onlinegdb.com/60Xv2K1tW) |
| **Código inicial** | [starter-files/lesson-02/Main.java](starter-files/lesson-02/Main.java) |
| **Código completo** | [completed-examples/lesson-02/Main.java](completed-examples/lesson-02/Main.java) |
| **Guion** | [scripts/lesson-02-variables-y-tipos-de-datos-script.md](scripts/lesson-02-variables-y-tipos-de-datos-script.md) |

---

### Lección 3: Operadores y expresiones (5:28 min)

- **Descripción**: Haz cálculos y compara valores, igual que en matemáticas.
- **Conclusiones clave**: `+ - * / %` para operar; `10 / 3` con enteros da `3`; `== != > < >= <=` devuelven `true` o `false`; `=` asigna y `==` compara.
- **Reto**: Calcula el promedio de dos notas y muestra si es mayor o igual a 11.

| Recurso | Enlace |
|---------|--------|
| **Video en YouTube** | [Ver lección](https://youtu.be/e2TSnWRQ8V4) |
| **Práctica en línea** | [Abrir OnlineGDB](https://onlinegdb.com/3qrh82s67R) |
| **Solución en línea** | [Abrir OnlineGDB](https://onlinegdb.com/bWDUCl63V) |
| **Código inicial** | [starter-files/lesson-03/Main.java](starter-files/lesson-03/Main.java) |
| **Código completo** | [completed-examples/lesson-03/Main.java](completed-examples/lesson-03/Main.java) |
| **Guion** | [scripts/lesson-03-operadores-y-expresiones-script.md](scripts/lesson-03-operadores-y-expresiones-script.md) |

---

### Lección 4: Decisiones con `if` y `else` (7:20 min)

- **Descripción**: Haz que tu programa elija qué hacer según una condición.
- **Conclusiones clave**: `if (condición) { }` se ejecuta solo si la condición es verdadera; `else` es el otro camino; `else if` sirve para varias opciones y el orden importa; `&&` (y) y `||` (o) combinan condiciones.
- **Reto**: Guarda una nota de 0 a 20 y muestra si el estudiante aprobó o desaprobó.

| Recurso | Enlace |
|---------|--------|
| **Video en YouTube** | [Ver lección](https://youtu.be/54TGvpos7Wc) |
| **Práctica en línea** | [Abrir OnlineGDB](https://onlinegdb.com/0gNApYej8F) |
| **Solución en línea** | [Abrir OnlineGDB](https://onlinegdb.com/Eu8njJfEZ) |
| **Código inicial** | [starter-files/lesson-04/Main.java](starter-files/lesson-04/Main.java) |
| **Código completo** | [completed-examples/lesson-04/Main.java](completed-examples/lesson-04/Main.java) |
| **Guion** | [scripts/lesson-04-decisiones-if-else-script.md](scripts/lesson-04-decisiones-if-else-script.md) |

---

### Lección 5: Bucles `for` y `while` (3:52 min)

- **Descripción**: Repite instrucciones sin tener que escribirlas muchas veces.
- **Conclusiones clave**: `for (int i = 1; i <= 5; i++)` cuando sabes cuántas veces repetir; `while (condición)` mientras algo se cumpla; si la variable de control nunca cambia, el bucle no termina (bucle infinito).
- **Reto**: Muestra la tabla de multiplicar del 5 con un `for`.

| Recurso | Enlace |
|---------|--------|
| **Video en YouTube** | [Ver lección](https://youtu.be/8AwKwvSLH70) |
| **Práctica en línea** | [Abrir OnlineGDB](https://onlinegdb.com/VmNCLPUob) |
| **Solución en línea** | [Abrir OnlineGDB](https://onlinegdb.com/tWs4nzuCf) |
| **Código inicial** | [starter-files/lesson-05/Main.java](starter-files/lesson-05/Main.java) |
| **Código completo** | [completed-examples/lesson-05/Main.java](completed-examples/lesson-05/Main.java) |
| **Guion** | [scripts/lesson-05-bucles-for-y-while-script.md](scripts/lesson-05-bucles-for-y-while-script.md) |

---

### Lección 6: Métodos y entrada de datos (7:43 min)

- **Descripción**: Organiza tu código en métodos reutilizables y pídele datos a quien usa el programa.
- **Conclusiones clave**: `public static void saludar(String nombre) { }`; un parámetro es un dato que recibe el método y `return` devuelve un resultado; `Scanner` lee lo que se escribe en la consola con `nextLine()` y `nextInt()`.
- **Reto**: Pide dos números, envíalos a un método `sumar` y muestra el resultado.

| Recurso | Enlace |
|---------|--------|
| **Video en YouTube** | [Ver lección](https://youtu.be/ZlrL8QVgtUo) |
| **Práctica en línea** | [Abrir OnlineGDB](https://onlinegdb.com/gR_LUEPit6) |
| **Solución en línea** | [Abrir OnlineGDB](https://onlinegdb.com/Et7H8vD_t) |
| **Código inicial** | [starter-files/lesson-06/Main.java](starter-files/lesson-06/Main.java) |
| **Código completo** | [completed-examples/lesson-06/Main.java](completed-examples/lesson-06/Main.java) |
| **Guion** | [scripts/lesson-06-metodos-y-entrada-de-datos-script.md](scripts/lesson-06-metodos-y-entrada-de-datos-script.md) |

---

### Lección 7: Clases, objetos y constructores (9:37 min)

- **Descripción**: Conoce la programación orientada a objetos creando una clase `Mascota`.
- **Conclusiones clave**: Una clase es un molde y un objeto es lo que se crea con ese molde usando `new`; los atributos guardan datos y los métodos son acciones; el constructor da los valores iniciales y `this` se refiere al objeto actual.
- **Reto**: Crea una clase `Estudiante` con `nombre` y `grado`, un constructor y un método que muestre sus datos.

| Recurso | Enlace |
|---------|--------|
| **Video en YouTube** | [Ver lección](https://youtu.be/Z7qTRU2TtOk) |
| **Práctica en línea** | [Abrir OnlineGDB](https://onlinegdb.com/zpYY4Lefti) |
| **Solución en línea** | [Abrir OnlineGDB](https://onlinegdb.com/qMbkhVNQ2) |
| **Código inicial** | [starter-files/lesson-07/Main.java](starter-files/lesson-07/Main.java) |
| **Código completo** | [completed-examples/lesson-07/Main.java](completed-examples/lesson-07/Main.java) |
| **Guion** | [scripts/lesson-07-clases-objetos-y-constructores-script.md](scripts/lesson-07-clases-objetos-y-constructores-script.md) |

---

### Lección 8: Encapsulación y mini proyecto (14:47 min)

- **Descripción**: Protege los datos de tus objetos con `private`, getters y setters, y arma un registro de estudiantes con un array.
- **Conclusiones clave**: Los atributos `private` solo se cambian mediante métodos; un setter puede validar datos (por ejemplo, edad mayor que cero); un array guarda varios elementos y su primera posición es `0`.
- **Proyecto final**: Registro de estudiantes que recorre un array de objetos `Estudiante` con un `for`.

| Recurso | Enlace |
|---------|--------|
| **Video en YouTube** | [Ver lección](https://youtu.be/h3a1JAa1Rm4) |
| **Práctica en línea** | [Abrir OnlineGDB](https://onlinegdb.com/X0dl2dqWt) |
| **Solución en línea** | [Abrir OnlineGDB](https://onlinegdb.com/W3ZHrHJ_R) |
| **Código inicial** | [starter-files/lesson-08/Main.java](starter-files/lesson-08/Main.java) |
| **Código completo** | [completed-examples/lesson-08/Main.java](completed-examples/lesson-08/Main.java) |
| **Guion** | [scripts/lesson-08-encapsulacion-y-mini-proyecto-script.md](scripts/lesson-08-encapsulacion-y-mini-proyecto-script.md) |

---

## Videos del curso

Los 8 videos están publicados en YouTube como **no listados**, es decir, solo se pueden ver con el enlace.

| Lección | Video | Duración |
|---------|-------|----------|
| 1 | [¡Hola, Java!](https://youtu.be/E3bf6fJWpX4) | 5:08 |
| 2 | [Variables y tipos de datos](https://youtu.be/ajFHGKrNFPg) | 4:56 |
| 3 | [Operadores y expresiones](https://youtu.be/e2TSnWRQ8V4) | 5:28 |
| 4 | [Decisiones con if y else](https://youtu.be/54TGvpos7Wc) | 7:20 |
| 5 | [Bucles for y while](https://youtu.be/8AwKwvSLH70) | 3:52 |
| 6 | [Métodos y entrada de datos](https://youtu.be/ZlrL8QVgtUo) | 7:43 |
| 7 | [Clases, objetos y constructores](https://youtu.be/Z7qTRU2TtOk) | 9:37 |
| 8 | [Encapsulación y mini proyecto](https://youtu.be/h3a1JAa1Rm4) | 14:47 |
| **Total** | | **58:51** |

---

## Buenas prácticas y errores comunes

Estos son los errores que más aparecen al empezar y que se explican a lo largo de las lecciones:

| Error o práctica | Qué pasa | Lección |
|------------------|----------|---------|
| Olvidar el `;` o las comillas `" "` | El programa no compila y muestra un error | 1 |
| Usar nombres poco claros como `x` | El código se entiende mejor con nombres como `edad` o `promedio` | 2 |
| Confundir `=` con `==` | `=` guarda un valor, `==` compara dos valores | 3 |
| Dividir enteros esperando decimales | `10 / 3` da `3`; para decimales se usa `10.0 / 3.0` | 3 |
| Poner las condiciones de `else if` en mal orden | Una condición más general puede "tapar" a las demás | 4 |
| No actualizar la variable de un `while` | Se produce un bucle infinito | 5 |
| Copiar y pegar el mismo código muchas veces | Es mejor crear un método y llamarlo | 6 |
| Dejar los atributos públicos sin control | Con `private` y setters se pueden validar los datos | 8 |
| Usar la posición `1` como la primera del array | En Java los índices empiezan en `0` | 8 |

---

## Recursos adicionales

- **Código fuente completo**: [Repositorio de GitHub](https://github.com/Performily-OpenSource/java-fundamentals-course-performily)
- **Todas las actividades prácticas**:

| Lección | Actividad | Empezar a programar | Ver la solución |
|---------|-----------|---------------------|-----------------|
| 1 | Mensaje de presentación | [OnlineGDB](https://onlinegdb.com/ZGGDhjODF) | [OnlineGDB](https://onlinegdb.com/E30x4A_3M) |
| 2 | Ficha personal con variables | [OnlineGDB](https://onlinegdb.com/Vh4IaGZrh) | [OnlineGDB](https://onlinegdb.com/60Xv2K1tW) |
| 3 | Promedio de dos notas | [OnlineGDB](https://onlinegdb.com/3qrh82s67R) | [OnlineGDB](https://onlinegdb.com/bWDUCl63V) |
| 4 | ¿Aprobó o desaprobó? | [OnlineGDB](https://onlinegdb.com/0gNApYej8F) | [OnlineGDB](https://onlinegdb.com/Eu8njJfEZ) |
| 5 | Tabla de multiplicar del 5 | [OnlineGDB](https://onlinegdb.com/VmNCLPUob) | [OnlineGDB](https://onlinegdb.com/tWs4nzuCf) |
| 6 | Suma con método y `Scanner` | [OnlineGDB](https://onlinegdb.com/gR_LUEPit6) | [OnlineGDB](https://onlinegdb.com/Et7H8vD_t) |
| 7 | Clase `Estudiante` con constructor | [OnlineGDB](https://onlinegdb.com/zpYY4Lefti) | [OnlineGDB](https://onlinegdb.com/qMbkhVNQ2) |
| 8 | Registro de estudiantes | [OnlineGDB](https://onlinegdb.com/X0dl2dqWt) | [OnlineGDB](https://onlinegdb.com/W3ZHrHJ_R) |

---

## Cómo usar este curso

1. **Mira el video** de la lección en YouTube.
2. **Abre la práctica en línea**: el enlace de OnlineGDB ya trae el código inicial cargado. Presiona **Run** para ejecutarlo.
3. **Escribe junto con el video**: pausa cuando lo necesites y prueba los ejemplos.
4. **Resuelve el reto** del final de la lección. Si te trabas, compara con el código completo en `completed-examples/`.

Si prefieres copiar el código desde este repositorio: abre el archivo `Main.java` de la lección, copia todo su contenido, ve a [OnlineGDB](https://www.onlinegdb.com/online_java_compiler), pega el código reemplazando el que aparece y presiona **Run**. No necesitas instalar nada.

---

## Estructura del repositorio

```
java-fundamentals-course-performily/
├── starter-files/          # Código inicial de cada lección
│   ├── lesson-01/Main.java
│   ├── ...
│   └── lesson-08/Main.java
├── completed-examples/     # Código completo trabajado en cada video
│   ├── lesson-01/Main.java
│   ├── ...
│   └── lesson-08/Main.java
├── scripts/                # Guiones de narración de los videos
├── participant-performance-report.md
└── README.md               # Plan de curso (este archivo)
```

| Carpeta | Enlace |
|---------|--------|
| **starter-files/** | [starter-files/](starter-files/) |
| **completed-examples/** | [completed-examples/](completed-examples/) |
| **scripts/** | [scripts/](scripts/) |

---

## Resumen de la elaboración en equipo

El curso fue diseñado y producido por el equipo **Performily**. Primero se definió el público objetivo y el temario a partir del enunciado. Luego se repartieron las lecciones entre los integrantes y cada uno preparó el guion, el código inicial y el código completo de sus lecciones. Después cada responsable grabó su video en OnlineGDB siguiendo el guion, y finalmente se editaron los videos, se subieron a YouTube como no listados y se ordenó todo en este repositorio.

| Integrante | Rol principal | Lecciones |
|------------|---------------|-----------|
| Galvez Meza, Salym Pool | Lección 1, resumen del curso y datos generales del plan de curso | 1 |
| Vasquez Llave, Oscar Lizandro | Lección 2, edición de los videos y publicación en YouTube | 2 |
| Ávila De La Cruz, Darío Fabián | Lecciones 3 y 4, buenas prácticas y errores comunes | 3, 4 |
| Li Gayoso, Diana Carolina | Lecciones 5 y 6 y tabla de prácticas en línea | 5, 6 |
| Diaz Villalba, Diego Alonso | Líder del equipo: coordinación, lecciones 7 y 8, enlaces de OnlineGDB, estructura del repositorio y reporte de participación | 7, 8 |

**¡Gracias por completar el curso!**

---

## Elaboración

Universidad Peruana de Ciencias Aplicadas  
Carrera de Ingeniería de Software  
Período 202620  
1ASI0729 Desarrollo de Aplicaciones Open Source  
NRC 7729  

**Nombre del equipo**: Performily  
**Líder del equipo**: Diaz Villalba, Diego Alonso  
**Integrantes del equipo**:  
- Ávila De La Cruz, Darío Fabián  
- Diaz Villalba, Diego Alonso  
- Galvez Meza, Salym Pool  
- Li Gayoso, Diana Carolina  
- Vasquez Llave, Oscar Lizandro  

**Fecha de entrega**: Noviembre, 2026
