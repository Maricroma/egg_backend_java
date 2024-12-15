## Maven

### Actividad: Instalación y configuración

Para comenzar, asegúrate de preparar tu entorno de trabajo de manera adecuada. Sigue estos pasos:

Descargar Maven, desde el siguiente link Apache-Maven-Proyect.

Si usas Windows, selecciona la opción "Binary zip archive"  (o la última versión disponible) 

Si usas Linux o Mac, selecciona la opción "Binary tar.gz archive"  Binary tar.gz archive (o la última versión disponible) 

La carpeta se descarga de manera comprimida en tu carpeta predeterminada para descargas, cortala y pegala en la misma carpeta donde se encuentra JAVA (Una posible ubicación por defecto, es Disco C/ Archivos de Programa / Java)

Descomprime la carpeta y elimina el archivo comprimido.

Ahora, necesitas configurar una variable de entorno. Crea una nueva variable llamada MAVEN_HOME y asigna la ruta donde se encuentra la carpeta previamente descargada y descomprimida.

Para verificar la correcta instalación de Maven, abre una terminal en tu PC y ejecuta el comando mvn -v. Si todo ha ido bien, verás en tu consola la versión instalada en tu ordenador.

### Ejercicio 1: Primer Proyecto Maven

Crea tu primer proyecto Maven donde simplemente imprimas un saludo con tu nombre y edad a través de un método.

### Actividad: Implementación de Comandos

Utiliza el proyecto Maven anterior y ejecuta los siguientes comandos:

* “mvn clean”: Después de ejecutar este comando, debes notar que la carpeta target ha sido eliminada.

* “mvn compile”: Después de ejecutar este comando, debes notar que la carpeta target/classes ha sido creada y contiene los archivos .class compilados a partir de tu código fuente.

* “mvn package”: Después de ejecutar este comando, debes notar que el archivo JAR (o WAR, dependiendo de tu configuración) ha sido creado en la carpeta target.

* “mvn install” : Después de ejecutar este comando, debes notar que el archivo JAR ha sido copiado en tu repositorio local de Maven, que generalmente se encuentra en tu directorio de inicio, en la carpeta C:/Users/TuUsuario/documents/.m2/repository.