/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrama;

/**
 *
 * @author Gerardo
 */
public class Nivel {
    public int numeroVidas = 7;
    private int numeroNivel = 0;
    public int cantidadPalabras = 0;
    private String[] pistas = new String[cantidadPalabras];
    public Boolean nivelCompletado = false;

    public int getNumeroVidas() {
        return numeroVidas;
    }

    public int getNumeroNivel() {
        return numeroNivel;
    }

    public int getCantidadPalabras() {
        return cantidadPalabras;
    }

    public String[] getPistas() {
        return pistas;
    }

    public Boolean getNivelCompletado() {
        return nivelCompletado;
    }

    public void setNumeroVidas(int numeroVidas) {
        this.numeroVidas = numeroVidas;
    }

    public void setNumeroNivel(int numeroNivel) {
        this.numeroNivel = numeroNivel;
    }

    public void setCantidadPalabras(int cantidadPalabras) {
        this.cantidadPalabras = cantidadPalabras;
    }

    public void setPistas(String[] pistas) {
        this.pistas = pistas;
    }

    public void setNivelCompletado(Boolean nivelCompletado) {
        this.nivelCompletado = nivelCompletado;
    }
    
    public Nivel(){
    }
}
