/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.molcajete.entities;

/**
 *
 * @author Jonathan Felix.
 */
public class Votes {

    private int positive;//Variable que define los votos positivos.
    private int negative;//Variable que define los votos negativos.
    
    /**
     * @return the positive
     */
    public int getPositive() {
        return positive;
    }

    /**
     * @param positive the positive to set
     */
    public void setPositive(int positive) {
        this.positive = positive;
    }

    /**
     * @return the negative
     */
    public int getNegative() {
        return negative;
    }

    /**
     * @param negative the negative to set
     */
    public void setNegative(int negative) {
        this.negative = negative;
    }
    
}
