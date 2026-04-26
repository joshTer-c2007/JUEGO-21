package com.krakedev.juegos.test;
import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {
    public static void main(String[] args) {
        Juego21 juego = new Juego21();
        juego.agregarJugador(new Jugador("Jhosep"));
        juego.agregarJugador(new Jugador("Padre"));
        juego.agregarJugador(new Jugador("Amigo"));

        juego.repartirRonda();
        juego.repartirRonda(); // Dos cartas para empezar

        System.out.println("--- RESULTADOS ---");
        if (juego.validarGanador().isEmpty()) {
            System.out.println("No hubo ganadores directos en esta ronda.");
        } else {
            System.out.println("¡Tenemos un ganador!");
        }
    }
}