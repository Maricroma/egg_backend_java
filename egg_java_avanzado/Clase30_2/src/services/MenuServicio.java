package services;

import java.util.Scanner;

public class MenuServicio {
    private PedidoServicio pedidoServicio;
    private Scanner sc = new Scanner(System.in);

    public MenuServicio() {
        this.pedidoServicio = new PedidoServicio();
    }

    public void mostrarMenuPrincipal() {
        int opcion;
        do {
            System.out.println("""
            -------  MENÚ PRINCIPAL  -------
            1) Crear nuevo pedido
            2) Actualizar estado del pedido
            3) Buscar pedidos por estado
            4) Mostrar lista de pedidos
            0) Salir
            """);
            opcion = pedirOpcion("Elija una opción: ");
            sc.nextLine();
        } while (opcion != 0);
    }

    public void gestionarMenuPrincipal(int opcion) {
        switch (opcion) {
            case 1:
                if (pedidoServicio.crearPedido() != null) {
                    System.out.println("Pedido creado con éxito.");
                } else {
                    System.out.println("No se pudo crear el pedido.");
                }
                break;
            
            case 2:
                    
                break;    
        
            default:
                break;
        }
    }

    public int pedirOpcion(String mensaje) {
        System.out.print(mensaje);
        return sc.nextInt();
    }
}
