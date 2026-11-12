# Fundamentos de Java para Principiantes

## Resumen del Curso

Este curso de **1 hora** introduce a estudiantes de secundaria a los fundamentos de la programación con Java, incluyendo programación orientada a objetos (POO). Empezamos con un primer programa que muestra un mensaje y terminamos con un pequeño registro de estudiantes hecho con clases y objetos. **¡No requiere descargas!** Solo abre tu navegador web.

| Información | Detalle |
|-------------|---------|
| **Duración total** | ~60 minutos (8 lecciones en video) |
| **Público objetivo** | Estudiantes de 12 a 17 años sin experiencia en programación |
| **Prerrequisitos** | Ninguno |
| **Herramientas necesarias** | ¡Solo tu navegador web! (Chrome, Firefox, Safari, Edge) |
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

<!-- seccion: leccion-02 -->

<!-- seccion: leccion-03 -->

<!-- seccion: leccion-04 -->

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

<!-- seccion: videos -->

<!-- seccion: buenas-practicas -->

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

<!-- seccion: como-usar -->

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
