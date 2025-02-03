package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import enums.EstadoPedido;
import models.Pedido;

public class PedidoServicio {
    private Scanner sc = new Scanner(System.in);
    private List<Pedido> pedidos = new ArrayList<>();

    public Pedido crearPedido() {
        System.out.print("Ingrese nombre del cliente: ");
        String nombre = sc.nextLine();
        Pedido pedido = new Pedido(nombre);
        almacenarPedido(pedido);
        return pedido;
    }

    public void almacenarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void actualizarEstado(Pedido pedido) {
        String estadoActual = pedido.getEstadoDelPedido().name();
        if (estadoActual.equals("PENDIENTE")) {
            pedido.setEstadoDelPedido(EstadoPedido.ENVIADO);
        } else if (estadoActual.equals("ENVIADO")) {
            pedido.setEstadoDelPedido(EstadoPedido.ENTREGADO);
        } 
    }

    public List<Pedido> buscarPedidosPorEstado(EstadoPedido estado) {
        List<Pedido> filtrados = new ArrayList<>();
        for (Pedido pedido : pedidos) {
            if (pedido.getEstadoDelPedido().equals(estado)) {
                filtrados.add(pedido);
            }
        }
        return filtrados;
    }

    public Pedido buscarPedidosPorNumeroDePedido(int numeroDePedido) {
        for (Pedido pedido : pedidos) {
            if (pedido.getNumeroDePedido() == numeroDePedido) {
                return pedido;
            }
        }
        return null;
    }

    public List<Pedido> obtenerPedidos() {
        return pedidos;
    }
}
