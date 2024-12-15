## Asociación de objetos

### Actividad: Liga de fútbol I

El objetivo de esta actividad es crear un proyecto para  gestionar los jugadores de una liga de fútbol. Deberás manejar equipos y jugadores con una relación de agregación, permitiendo al usuario interactuar con ellos a través de un menú en consola.

Para esto deberás generar una clase “Jugador” y una “Equipo”. Para relacionar ambas clases vamos a utilizar una agregación, recomendamos que el jugador tenga un atributo del tipo “Equipo” para facilitar la resolución. Con esto, el menú deberá permitir realizar las siguientes acciones: 

- Crear jugador: Esta opción te permitirá crear un nuevo jugador. Deberás pedir al usuario el nombre del jugador y mostrar la lista de equipos disponibles para que elija uno, si no hay equipos creados entonces debería mostrar un mensaje que diga que no hay equipos disponibles y setear null.

- Crear equipo: Esta opción te permitirá crear un nuevo equipo. Deberás pedir al usuario el nombre del equipo.

- Asignar jugador a equipo: Con esta opción, podrás asignar un jugador existente a un equipo existente. Deberás permitir al usuario seleccionar de la lista de jugadores y equipos existentes.

- Mostrar lista de jugadores: Esta opción mostrará una lista de todos los jugadores creados, junto con el nombre del equipo al que están asignados, si corresponde.

- Mostrar lista de equipos: Esta opción mostrará una lista de todos los equipos creados.

- Salir: Esta opción termina la ejecución del programa.

### Actividad - Liga de fútbol II

Para continuar con el sistema de gestión de la liga de fútbol es necesario agregar las siguientes funcionalidades al menú: 

- Eliminar jugador:  Debe permitir seleccionar un jugador para ser eliminado de una lista (tipo array) total de jugadores.

- Eliminar Equipo:  Debe permitir eliminar un equipo de una lista total de equipos.

- Seleccionar jugador: Con esta opción, podrás seleccionar un jugador específico para ver o modificar sus detalles. Esto debería llevar a un submenú con las siguientes opciones:

- Ver detalles: Muestra el nombre del jugador y el equipo al que está asignado.

- Cambiar nombre: Permite al usuario cambiar el nombre del jugador.

- Cambiar equipo: Permite al usuario cambiar el equipo al que está asignado el jugador.

- Regresar al menú principal.

- Seleccionar equipo: Al elegir esta opción, se debe mostrar la lista de equipos, seleccionar uno y luego mostrar el siguiente submenú con las siguientes opciones:

- Ver detalles.

- Cambiar nombre: Debes asegurarte que cambie el nombre de la instancia de equipo que pertenece a cada jugador también.

- Agregar jugador al equipo: se debe mostrar la lista de jugadores para que el usuario elija a cual asignarle el equipo.

- Mostrar jugadores del equipo.

- Regresar al menú principal.