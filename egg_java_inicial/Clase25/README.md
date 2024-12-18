## Actividad Integradora

### Actividad: Maquetando el sistema de gestión 

Crear un proyecto JAVA llamado “sistema-de-gestion” con su clase  “Application” y su carpeta “modelos”.

Dentro de la carpeta “modelos” crea la clase “Empleado” con los atributos nombre, edad, salario y departamento. Todos sus atributos deben ser declarados como privados y deben contar con sus métodos getter y setter. 

### Actividad: Diseñando los métodos

Para la realización de esta actividad, consideraremos los siguientes métodos y sus respectivas funcionalidades:

- Mostrar todos los empleados: Este método se encarga de recibir un arreglo de objetos empleados e imprimir en consola la lista de empleados creados. La información se presentará en formato de tabla, donde la primera columna mostrará el número de fila y la primera fila contendrá los encabezados de cada columna.

- Filtrar empleados: Al recibir un arreglo de empleados, este método devolverá un nuevo arreglo filtrado según criterios específicos. Los filtros pueden aplicarse por nombre, edad, salario o departamento. El método recibirá la información del atributo por el cual se desea filtrar, y en caso de nombre y departamento, se proporcionará un String para el filtrado, mientras que para salario y edad se especificarán valores numéricos máximo y mínimo.

- Ordenar empleados: Este método recibirá el arreglo de empleados y el atributo por el cual se desea ordenar. Utilizará el algoritmo de ordenamiento de burbuja para realizar el ordenamiento y devolverá el arreglo de empleados ordenado según el criterio especificado.

- Buscar por nombre: Recibirá un arreglo de empleados y un nombre, devolviendo el primer objeto empleado que coincida con dicho nombre.

- Incrementar salario: Este método recibirá un objeto empleado y un porcentaje de aumento salarial. Devolverá el mismo objeto con su salario incrementado según el porcentaje proporcionado.

Con estos métodos definidos, podrás manipular eficientemente los objetos de la clase Empleado según las diferentes necesidades de tu programa.