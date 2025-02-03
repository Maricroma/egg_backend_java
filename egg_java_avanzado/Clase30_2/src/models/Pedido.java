package models;

import java.util.ArrayList;
import java.util.List;

import enums.EstadoPedido;

public class Pedido {
    private int numeroDePedido = 0;
    private String cliente;
    private EstadoPedido estadoDelPedido;
    List<String> listaDeProductos;


    public Pedido(String cliente) {
        this.numeroDePedido = numeroDePedido++;
        this.cliente = cliente;
        estadoDelPedido = EstadoPedido.PENDIENTE;
        listaDeProductos = new ArrayList<>();
    }


    public int getNumeroDePedido() {
        return numeroDePedido;
    }


    public void setNumeroDePedido(int numeroDePedido) {
        this.numeroDePedido = numeroDePedido;
    }


    public String getCliente() {
        return cliente;
    }


    public void setCliente(String cliente) {
        this.cliente = cliente;
    }


    public EstadoPedido getEstadoDelPedido() {
        return estadoDelPedido;
    }


    public void setEstadoDelPedido(EstadoPedido estadoDelPedido) {
        this.estadoDelPedido = estadoDelPedido;
    }


    public List<String> getListaDeProductos() {
        return listaDeProductos;
    }


    public void setListaDeProductos(List<String> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    

    
}
