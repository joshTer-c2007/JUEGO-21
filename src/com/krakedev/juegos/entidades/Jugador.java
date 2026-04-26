package com.krakedev.juegos.entidades;
import java.util.ArrayList;

public class Jugador {
    private String nickname;
    private ArrayList<Carta> cartas = new ArrayList<>();
    private int puntajeCartas;

    public Jugador(String nickname) {
        this.nickname = nickname;
    }

    public void recibirCarta(Carta carta) {
        cartas.add(carta);
    }

    public void imprimir() {
        System.out.println("Jugador: " + nickname + " | Puntaje: " + puntajeCartas);
        for (Carta c : cartas) {
            c.imprimir();
        }
    }

    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }
    public ArrayList<Carta> getCartas() { return cartas; }
    public int getPuntajeCartas() { return puntajeCartas; }
    public void setPuntajeCartas(int puntajeCartas) { this.puntajeCartas = puntajeCartas; }
}
