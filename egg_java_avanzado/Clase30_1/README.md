## ENUMS

### Ejercicio 1: Días de la semana

Crea el enum "DiaSemana" que represente los días de la semana, definiendo las constantes correspondientes a los días: LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO y DOMINGO.

En la clase "DiaSemana", agrega un método llamado "esDiaLaboral()" que devuelva un valor booleano indicando si el día es laboral o no. Para esto, los días SÁBADO y DOMINGO no serán considerados días laborales.

En la clase "Application", crea un arreglo de objetos "DiaSemana" con 10 días de la semana generados al azar, esto es para evitar la entrada manual de datos.

Implementa un método llamado "imprimirDiaLaboral()" en la clase "Application" que tome como parámetro un objeto de tipo "DiaSemana" y utilice el método "esDiaLaboral()" para determinar si el día es laboral o no. Este método devolverá un mensaje indicando si es "Día laboral" o "No es día laboral", según corresponda al día proporcionado.

### Ejercicio 2: Colores

Define el enum 'Color' para representar los colores primarios: ROJO, AMARILLO y AZUL. Cada constante del enum debe incluir una propiedad adicional llamada 'valorHexadecimal', que represente el valor hexadecimal del color. Los valores hexadecimales correspondientes son: ROJO = "#FF0000", AMARILLO = "#FFFF00" y AZUL = "#0000FF". Posteriormente, crea la clase 'ConvertidorColor', que contenga un método denominado 'convertirHexadecimal', el cual tome como parámetro un valor hexadecimal. Este método deberá retornar el color correspondiente del enum si existe. En caso contrario, retornará null.


En tu clase 'Application', realiza pruebas con 5 colores ingresados, verificando si son o no colores primarios. Si el color es válido, imprime el nombre del color; de lo contrario, imprime "No es un color primario".