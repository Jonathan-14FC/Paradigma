/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.molcajete.entities;

/**
 *
 * @author Jonathan Felix.
 */
public class Comments {

    
    private String text;//Permite ingresar la información del texto.
    private Votes votes;//Permite definir la información de votos.
    private String otheruser;//Permite definir el nombre del usuario del comentario.
    /**
     * @return the otheruser
     */
    public String getOtheruser() {
        return otheruser;
    }

    /**
     * @param otheruser the otheruser to set
     */
    public void setOtheruser(String otheruser) {
        this.otheruser = otheruser;
    }

  
    /**
     * @return the answer
     */
    

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the votes
     */
    public Votes getVotes() {
        return votes;
    }

    /**
     * @param votes the votes to set
     */
    public void setVotes(Votes votes) {
        this.votes = votes;
    }
    
}
