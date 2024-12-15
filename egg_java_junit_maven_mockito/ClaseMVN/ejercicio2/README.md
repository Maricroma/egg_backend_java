## Maven

### Ejercicio 2: Nuevo Proyecto Maven

Crea un proyecto Maven basado en el ejercicio de calificaciones, pasando su lógica y test dentro de las carpetas correspondientes. Recuerda configurar el pom.xml correctamente y luego ejecuta el siguiente comando:

“mvn test”: Después de ejecutar este comando, debes notar que se han generado informes de prueba en el directorio target/surefire-reports (si estás utilizando el plugin Surefire, que es el predeterminado para las pruebas).


✏️  Ejercicio de Referencia: Calificación
Tu programa solicita al usuario una puntuación entre 0 y 100. Luego, muestra en pantalla la calificación correspondiente según la siguiente escala:

Si la puntuación está entre 90 y 100, muestra "A".

Si la puntuación está entre 80 y 89, muestra "B".

Si la puntuación está entre 70 y 79, muestra "C".

Si la puntuación está entre 60 y 69, muestra "D".

Si la puntuación es menor a 60, muestra "F".

Crea un método "obtenerNota()" que reciba por parámetro un "int" y devuelva un "String". El método debe utilizar la estructura de control "switch expression".

Crea una clase para testear esa actividad, incluyendo cada uno de los métodos. 