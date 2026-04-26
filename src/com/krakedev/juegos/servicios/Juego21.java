package com.krakedev.juegos.servicios;
import java.util.ArrayList;
import com.krakedev.juegos.entidades.*;

public class Juego21 {
    private ArrayList<Jugador> jugadores;
    private Dealer dealer;

    public Juego21() {
        jugadores = new ArrayList<>();
        dealer = new Dealer();
        cargarValores();
    }

    private void cargarValores() {
        for (Carta c : dealer.getNaipe()) {
            if (c.getValor().equals("A")) {
                c.setValorJuego(11);
            } else if (c.getValor().equals("J") || c.getValor().equals("Q") || c.getValor().equals("K")) {
                c.setValorJuego(10);
            } else {
                c.setValorJuego(Integer.parseInt(c.getValor()));
            }
        }
    }

    public void agregarJugador(Jugador j) {
        jugadores.add(j);
    }

    public void repartirRonda() {
        for (Jugador j : jugadores) {
            j.recibirCarta(dealer.entregarCarta());
        }
        calcularTotal();
    }

    private void calcularTotal() {
        for (Jugador j : jugadores) {
            int total = 0;
            for (Carta c : j.getCartas()) {
                total += c.getValorJuego();
            }
            j.setPuntajeCartas(total);
        }
    }

    public ArrayList<Jugador> validarGanador() {
        ArrayList<Jugador> ganadores = new ArrayList<>();
        for (Jugador j : jugadores) {
            if (j.getPuntajeCartas() == 21) {
                ganadores.add(j);
            }
        }
        return ganadores;
    }
}