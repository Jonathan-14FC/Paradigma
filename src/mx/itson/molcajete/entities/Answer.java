/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.molcajete.entities;

/**
 *
 * @author Jonathan Felix.
 */
public class Answer {
    
    private String otherText;//Variable que define la respuesta al comentario.
    private int positive;//Variable que indica los votos positivos.
    private int negative;//Variable que indica los votos negativos.
    private User user;//Variable que define al usuario que respondió al comentario.
    private int date;//Variable que define la fecha.
    
    
    /**
     * @return the otherText
     */
    public String getOtherText() {
        return otherText;
    }

    /**
     * @param otherText the otherText to set
     */
    public void setOtherText(String otherText) {
        this.otherText = otherText;
    }

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

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the date
     */
    public int getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(int date) {
        this.date = date;
    }
    
}
