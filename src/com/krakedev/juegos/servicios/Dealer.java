package com.krakedev.juegos.servicios;
import java.util.ArrayList;
import com.krakedev.juegos.entidades.Carta;

public class Dealer {
    private ArrayList<Carta> naipe;

    public Dealer() {
        this.naipe = new ArrayList<>();
        generarNaipe();
    }

    private void generarNaipe() {
        String[] palos = {"T", "CN", "CR", "D"};
        String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (String p : palos) {
            for (String v : valores) {
                naipe.add(new Carta(v, p));
            }
        }
    }

    public int generarAleatorio(int maximo) {
        return (int) (Math.random() * (maximo + 1));
    }

    public Carta entregarCarta() {
        if (!naipe.isEmpty()) {
            int indice = generarAleatorio(naipe.size() - 1);
            return naipe.remove(indice);
        }
        return null;
    }

    public void imprimirNaipe() {
        for (Carta c : naipe) {
            c.imprimir();
        }
    }

    public ArrayList<Carta> getNaipe() { return naipe; }
}