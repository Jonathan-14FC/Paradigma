/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.molcajete.entities;

import mx.itson.molcajete.enums.Category;

/**
 *
 * @author Jonathan Felix
 */
public class Publication {

    private String publicationName;//Variable que permite definir el nombre de la publicacion
    private String description;//Variable que permite definir la descripción de la publicación.
    private int date;//Variable que refleja la fecha de la publicación.
    private User user;//Variable que lee la información de la clase user.
    private Category category;//Variable que lee la información de la clase category.
    
    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    
    /**
     * @return the publicationName
     */
    public String getPublicationName() {
        return publicationName;
    }

    /**
     * @param publicationName the publicationName to set
     */
    public void setPublicationName(String publicationName) {
        this.publicationName = publicationName;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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

   
    
}
