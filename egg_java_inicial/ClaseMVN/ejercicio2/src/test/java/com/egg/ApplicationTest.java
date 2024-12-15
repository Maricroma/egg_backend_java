package com.egg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;;

class ApplicationTest {

    @Test
    void testObtenerNota() {
        // Pruebas para cada rango de Applicationes
        assertEquals("A", Application.obtenerNota(95), "Debe devolver A para puntuaciones entre 90 y 100");
        assertEquals("B", Application.obtenerNota(85), "Debe devolver B para puntuaciones entre 80 y 89");
        assertEquals("C", Application.obtenerNota(75), "Debe devolver C para puntuaciones entre 70 y 79");
        assertEquals("D", Application.obtenerNota(65), "Debe devolver D para puntuaciones entre 60 y 69");
        assertEquals("F", Application.obtenerNota(55), "Debe devolver F para puntuaciones menores a 60");
        
        // Casos límite
        assertEquals("A", Application.obtenerNota(100), "Debe devolver A para 100");
        assertEquals("F", Application.obtenerNota(0), "Debe devolver F para 0");
    }

    @Test
    void testObtenerNotaValoresBorde() {
        // Casos en los límites superiores e inferiores de cada rango
        assertEquals("A", Application.obtenerNota(90), "Debe devolver A para 90");
        assertEquals("B", Application.obtenerNota(89), "Debe devolver B para 89");
        assertEquals("B", Application.obtenerNota(80), "Debe devolver B para 80");
        assertEquals("C", Application.obtenerNota(79), "Debe devolver C para 79");
        assertEquals("C", Application.obtenerNota(70), "Debe devolver C para 70");
        assertEquals("D", Application.obtenerNota(69), "Debe devolver D para 69");
        assertEquals("D", Application.obtenerNota(60), "Debe devolver D para 60");
        assertEquals("F", Application.obtenerNota(59), "Debe devolver F para 59");
    }
}