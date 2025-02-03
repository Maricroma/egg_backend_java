## JDBC Recuperar información de la BBDD

### Actividad: Búsqueda de clientes

* Crea un método llamado buscarClientes() dentro de tu clase App. Este método debe conectarse a la base de datos y recuperar la información de los clientes almacenados en la base de datos vivero. La consulta SQL debe recuperar el nombre, apellido y teléfono de todos los clientes. Los resultados deben imprimirse en consola.

* Realiza un método llamado buscarClientePorCodigo(codigo) que reciba como parámetro el código del cliente y muestre por pantalla los datos que tiene el cliente guardado en la base de datos. 

* Realiza un método llamado  buscarClientesPorEmpleado(codigo) que reciba el código del empleado como parámetro y muestre todos los clientes asociados a un empleado en particular. Puedes elegir qué campos mostrar en tu método.

### Actividad: Consultas en la tabla “Producto”

* Realiza una función getProductosParaReponer(puntoReposicion) que dado un número de punto de reposición que se pasa como parámetro, liste todos los productos que están por debajo de su punto de reposición, esto quiere decir, que tienen menos stock que el punto establecido.

* Realiza un método llamado getProductosGama() que dado como parámetro el nombre de la gama, retorne una lista con la siguiente información:  códigos del producto, nombre del producto,  código y nombre de la gama.

### Actividad: Consultas en la tabla “Pedido”

* Realizar el método getPedidosPorCliente(idCliente)  en el cual se listen todos los pedidos de un cliente específico pasado por parámetro. No es necesario mostrar todos los campos de cada pedido. 

* Realizar un método getPedidosPorEstado(estado) que liste todos los pedidos que han quedado en un estado que se recibe por parámetro.

### Ejercicios Complementarios

* Crea un método que liste la cantidad de productos y la gama a la que pertenecen. Esta información se recuperará llamando al método correspondiente, getProductosPorGamaList(). El listado debe mostrar, por ejemplo:

    - Cantidad 3 - Gama Herbacea

    - Cantidad 2 - Gama Frutales

* Realiza un método llamado getProductosNoComprados(); que liste los productos que nunca han sido comprados.

* Realizar una función getPedidosPorProducto(idProducto); que liste todos los pedidos que tengan un producto que se le pasa como parámetro.

* Realizar un método getPedidosPorFechas(desde, hasta) que busque todos los pedidos realizados entre dos fechas que se pasan como parámetro.

* Realiza un método llamado  getProductosPorProveedor(codigo); que liste todos los productos de un proveedor específico, recibimiento como parámetro el código del proveedor.

* Re-Versionando una actividad anterior, realizar el método getPedidosPorClienteCompleto(idCliente); en el cual se listen todos los pedidos con su detalle de un cliente específico que es pasado como parámetro.


