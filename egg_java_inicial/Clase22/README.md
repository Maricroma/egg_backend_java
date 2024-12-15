## Debugger

### Ejercicio 1

Actividad: Depurando un programa con un Bucle
Crea un programa que use un bucle fori para iterar a través de un array de
números y calcular la suma de todos los números en el array.

Coloca un punto de interrupción dentro del bucle.

Ejecuta el programa en modo debug y observa cómo cambian los valores de
"suma" y "número" en cada iteración usando el “step over”.

Luego vuelve a ejecutar el programa pero utiliza un “breakpoint condicional”
para que el programa se detenga en el anteúltimo índice del array

### Ejercicio 2

Actividad:  Depurando un programa con un Bucle
Partiendo con la base del ejercicio de la calculadora: cambia el código de la división para que permita realizar una división por cero pero utiliza un bloque try catch para atrapar la excepción.

Ejecuta el programa en modo debug y marca la opción “Caught Exceptions” en el panel de breakpoints del debugger.

Ingresa los números para que se produzca la división por cero y observa dónde se detiene debido a la excepción. También lee el “call stack” (la pila de llamadas) y úsalo para moverte a las líneas de código donde fueron invocados los métodos para saber cómo fue el flujo del programa hasta llegar a la excepción
