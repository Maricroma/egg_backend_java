import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        Connection conexion = getConnection();
        // buscarClientes(conexion);
        // buscarClientePorCodigo(conexion, 3);
        // buscarClientesPorEmpleado(conexion, 11);
        // getProductosParaReponer(conexion, 100);
        // getProductosGama(conexion, "Herramientas");
        // getPedidosPorCliente(conexion, 5);
        // getPedidosPorEstado(conexion, "entregado");
        // getProductosPorGamaList(conexion);
        // getProductosNoComprados(conexion);
        // getPedidosPorProducto(conexion, 5);
        // getPedidosPorFechas(conexion, "2009-01-01", "2009-12-31");
        // getProductosPorProveedor(conexion, "Murcia Seasons");
        getPedidosPorClienteCompleto(conexion, 7);
        cerrarConexion(conexion);
    }

    public static Connection getConnection() {
        String host = "127.0.0.1"; // localhost
        String port = "3306"; // por defecto es el puerto que utiliza
        String name = "root"; // usuario de la base de datos
        String password = "Pilar*49"; // password de la base de datos
        String database = "vivero"; // nombre de la base de datos recien creada, en este caso vivero.
        // Esto especifica una zona horaria, no es obligatorio de utilizar, pero en
        // algunas zonas genera conflictos de conexión si no existiera
        String zona = "?useUnicode=true&characterEncoding=UTF-8&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        String url = "jdbc:mysql://" + host + ":" + port + "/" + database + zona;
        // esto indica la ruta de conexion, que es la combinacion de
        // host,usuario,puerto, nombre de la base de datos a la cual queremos
        // conectarnos y la zona horaria (si se precisara).

        Connection conexion = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexion = DriverManager.getConnection(url, name, password);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el conector JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
        return conexion;
    }

    public static void cerrarConexion(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("La conexión a la base de datos fue cerrada de manera exitosa");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión:" + e.getMessage());
            }
        }
    }

    // Actividad: Búsqueda de clientes

    public static void buscarClientes(Connection conexion) {
        String sql = "SELECT nombre_contacto, apellido_contacto, telefono FROM cliente ";
        try {
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            int count = 0;
            while (rs.next()) {
                String nombre = rs.getString("nombre_contacto");
                String apellido = rs.getString("apellido_contacto");
                String telefono = rs.getString("telefono");
                count++;
                System.out.println(count + " - " + nombre + " " + apellido + " -  " + telefono);
            }
            // Cerrar ResultSet y Statement dentro del bloque try-catch-finally
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }

    public static void buscarClientePorCodigo(Connection conexion, int codigoCliente) {
        String sql = "SELECT id_cliente, nombre_contacto, apellido_contacto, telefono FROM cliente WHERE codigo_cliente = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setInt(1, codigoCliente);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int idCliente = rs.getInt("id_cliente");
                    String nombre = rs.getString("nombre_contacto");
                    String apellido = rs.getString("apellido_contacto");
                    String telefono = rs.getString("telefono");
                    System.out.println(idCliente + " - " + nombre + " " + apellido + " - " + telefono);
                } else {
                    System.out.println("No se encontró el cliente con código " + codigoCliente);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }

    public static void buscarClientesPorEmpleado(Connection conexion, int codigoEmpleado) {
        String sql = "SELECT nombre_contacto, apellido_contacto, telefono FROM cliente WHERE id_empleado = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setInt(1, codigoEmpleado);
            try (ResultSet rs = pstmt.executeQuery()) {
                int count = 0;
                while (rs.next()) {
                    String nombre = rs.getString("nombre_contacto");
                    String apellido = rs.getString("apellido_contacto");
                    String telefono = rs.getString("telefono");
                    count++;
                    System.out.println(count + " - " + nombre + " " + apellido + " - " + telefono);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }

    }

    // Actividad: Consultas en la tabla “Producto”

    public static void getProductosParaReponer(Connection conexion, int puntoReposicion) {
        String sql = "SELECT codigo_producto, nombre, proveedor, cantidad_en_stock FROM producto WHERE cantidad_en_stock < ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setInt(1, puntoReposicion);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    String codigoProducto = rs.getString("codigo_producto");
                    String nombre = rs.getString("nombre");
                    String proveedor = rs.getString("proveedor");
                    int stock = rs.getInt("cantidad_en_stock");
                    System.out.println(codigoProducto + " - " + nombre + " - Proveedor: " + proveedor + " - Stock: " + stock);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }

    public static void getProductosGama(Connection conexion, String gama) {
        String sql = "SELECT p.codigo_producto, p.nombre, p.id_gama, g.gama FROM producto p INNER JOIN gama_producto g ON p.id_gama = g.id_gama WHERE g.gama = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, gama);
            try (ResultSet rs = pstmt.executeQuery()) {
                int count = 0;
                while (rs.next()) {
                    String codigoProducto = rs.getString("codigo_producto");
                    String nombre = rs.getString("nombre");
                    int idGama = rs.getInt("id_gama");
                    String nombreGama = rs.getString("gama");
                    count ++;
                    System.out.println(count + " - " + codigoProducto + " - " + nombre + " - Gama ID: " + idGama + " - Gama: " + nombreGama);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }

    // Actividad: Consultas en la tabla “Pedido”

    public static void getPedidosPorCliente(Connection conexion, int idCliente) {
        String sql = "SELECT codigo_pedido, fecha_pedido, estado FROM pedido WHERE id_cliente = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setInt(1, idCliente);
            try (ResultSet rs = pstmt.executeQuery()) {
                int count = 0;
                while (rs.next()) {
                    int codigoPedido = rs.getInt("codigo_pedido");
                    String fechaPedido = rs.getString("fecha_pedido");
                    String estado = rs.getString("estado");
                    count ++;
                    System.out.println(count + " - " + codigoPedido + " - " + fechaPedido + " - Estado: " + estado);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }

    public static void getPedidosPorEstado(Connection conexion, String estado) {
        String sql = "SELECT codigo_pedido, fecha_pedido, fecha_esperada, fecha_entrega FROM pedido WHERE estado = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, estado);
            try (ResultSet rs = pstmt.executeQuery()) {
                int count = 0;
                while (rs.next()) {
                    int codigoPedido = rs.getInt("codigo_pedido");
                    String fechaPedido = rs.getString("fecha_pedido");
                    String fechaEsperada = rs.getString("fecha_esperada");
                    String fechaEntrega = rs.getString("fecha_entrega");
                    count ++;
                    System.out.println(count + " - Código: " + codigoPedido + " - Fecha de pedido: " + fechaPedido + " - Fecha esperada: " + fechaEsperada + " - Fecha de entrega: " + fechaEntrega);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }

    // Ejercicios Complementarios

    public static void getProductosPorGamaList(Connection conexion) {
        String sql = "SELECT SUM(p.cantidad_en_stock) AS total_productos, g.gama FROM producto p INNER JOIN gama_producto g ON p.id_gama = g.id_gama GROUP BY g.gama";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    int totalProductos = rs.getInt("total_productos");
                    String gama = rs.getString("gama");
                    System.out.println("Cantidad " + totalProductos + " - Gama " + gama);
                }
            }  
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }

    public static void getProductosNoComprados(Connection conexion) {
        String sql = "SELECT p.codigo_producto, p.nombre, p.cantidad_en_stock FROM producto p LEFT JOIN detalle_pedido d ON p.id_producto = d.id_pedido WHERE id_pedido IS NULL";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            try (ResultSet rs = pstmt.executeQuery()) {
                int count = 0;
                while (rs.next()) {
                    String codigoProducto = rs.getString("codigo_producto");
                    String nombreProducto = rs.getString("nombre");
                    int cantidad = rs.getInt("cantidad_en_stock");
                    count ++;
                    System.out.println(count + " - Código: " + codigoProducto + " - Nombre: " + nombreProducto + " - Stock: " + cantidad);
                }
            }  
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }

    public static void getPedidosPorProducto(Connection conexion, int idProducto) {
        String sql = "SELECT pe.codigo_pedido, pe.fecha_pedido, pe.estado FROM producto pr INNER JOIN detalle_pedido dp ON pr.id_producto = dp.id_producto INNER JOIN pedido pe ON dp.id_pedido = pe.id_pedido WHERE pr.id_producto = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setInt(1, idProducto);
            try (ResultSet rs = pstmt.executeQuery()) {
                int count = 0;
                while (rs.next()) {
                    String codigoPedido = rs.getString("codigo_pedido");
                    String fechaPedido = rs.getString("fecha_pedido");
                    String estado = rs.getString("estado");
                    count ++;
                    System.out.println(count + " - Código: " + codigoPedido + " - Fecha del pedido: " + fechaPedido + " - Estado: " + estado);
                }
            }  
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }

    public static void getPedidosPorFechas(Connection conexion, String fechaDesde, String fechaHasta) {
        String sql = "SELECT codigo_pedido, fecha_pedido, estado, comentarios FROM pedido WHERE fecha_pedido BETWEEN ? AND ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, fechaDesde);
            pstmt.setString(2, fechaHasta);
            try (ResultSet rs = pstmt.executeQuery()) {
                int count = 0;
                while (rs.next()) {
                    String codigoPedido = rs.getString("codigo_pedido");
                    String fechaPedido = rs.getString("fecha_pedido");
                    String estado = rs.getString("estado");
                    count ++;
                    System.out.println(count + " - Código: " + codigoPedido + " - Fecha del pedido: " + fechaPedido + " - Estado: " + estado);
                }
            }  
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }

    public static void getProductosPorProveedor(Connection conexion, String proveedor) {
        String sql = "SELECT codigo_producto, nombre, cantidad_en_stock, precio_venta FROM producto WHERE proveedor = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, proveedor);
            try (ResultSet rs = pstmt.executeQuery()) {
                int count = 0;
                while (rs.next()) {
                    String codigoProducto = rs.getString("codigo_producto");
                    String nombre = rs.getString("nombre");
                    int stock = rs.getInt("cantidad_en_stock");
                    double precioVenta = rs.getDouble("precio_venta");
                    count ++;
                    System.out.println(count + " - Código: " + codigoProducto + " - Nombre: " + nombre + " - Stock: " + stock + " - Precio de venta: " + precioVenta);
                }
            }  
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }

    public static void getPedidosPorClienteCompleto(Connection conexion, int idCliente) {
        String sql = "SELECT p.codigo_pedido, p.fecha_pedido, p.estado, dp.cantidad, dp.precio_unidad, dp.numero_linea FROM pedido p INNER JOIN detalle_pedido dp ON p.id_pedido = dp.id_pedido WHERE p.id_cliente = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setInt(1, idCliente);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    String codigoPedido = rs.getString("codigo_pedido");
                    String fechaPedido = rs.getString("fecha_pedido");
                    String estado = rs.getString("estado");
                    int cantidad = rs.getInt("cantidad");
                    double precioUnitario = rs.getDouble("precio_unidad");
                    int numeroLinea = rs.getInt("numero_linea");
                    System.out.println("Código: " + codigoPedido + " - Fecha del pedido: " + fechaPedido + " - Estado: " + estado + " - Cantidad: " + cantidad + " - Precio unitario: " + precioUnitario + " - Número de línea: " + numeroLinea);
                }
            }  
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }
}
