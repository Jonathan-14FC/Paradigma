/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.molcajete.ui;
import mx.itson.molcajete.entities.Answer;
import mx.itson.molcajete.entities.Comments;
import mx.itson.molcajete.entities.Publication;
import mx.itson.molcajete.entities.User;
import mx.itson.molcajete.entities.Votes;
import mx.itson.molcajete.enums.Category;
/**
 *
 * @author Jonathan Felix.
 */
public class Main {

    public static void main(String[] args) {
        //Lee la información del usuario que realizara la publicación.
        User user = new User();
        user.setUserName("Jose Campa");
       user.setEmail("Jose980@gmail.com");
       user.setPassword("Ejotes");
      
       //Lee la información de la publicación realizada.
       Publication publication = new Publication ();
       publication.setUser(user);
       publication.setPublicationName("Mi mañana");
       publication.setDate(171023);
       publication.setDescription("Mi mañana del día de hoy estuvo muy agradable y divertida, saludos :D");
       publication.setCategory(Category.Daily);
       
       //Lee comentario.
       Comments comments = new Comments();
       comments.setOtheruser("Empalmeisgod");
       comments.setText("Agradable, tenga lindo día y espero nos visite en Empalme.");
       
       //Total de votos correspondientes.
       Votes votes = new Votes();
       votes.setPositive(31);
       votes.setNegative(33);
       
       //Indica la respuesta al comentario. 
       Answer answer = new Answer();
       answer.setUser(user);
       answer.setOtherText("Si, mañana. Saludos.");
       answer.setDate(171023);
       answer.setPositive(3);
       answer.setNegative(1);
       
       //Despliega la información en la consola.
       System.out.println("User: "+user.getUserName());//Refleja el nombre de usuario de la persona de la publicación.
       System.out.println("Email: "+user.getEmail());//Refleja el Email de la persona que refleja de la publicación.
       System.out.println("Password: "+user.getPassword());//Refleja la contraseña del usuario.
       System.out.println("                         ");
       System.out.println("-------------------------");
       System.out.println("New: "+publication.getPublicationName());//Refleja el nombre de la publicación.
       System.out.println("Made by: "+user.getUserName());//Refleja al usuario que realizó la publicación.
       System.out.println("Dt: "+publication.getDate());//Refleja la fecha de la publicación.
       System.out.println("                         ");
       System.out.println("-------------------------");
       System.out.println("Description: "+publication.getDescription());//Refleja lo que dice la publicación.
       System.out.println("In Category: "+publication.getCategory());//Informa la categoria donde fue realizada la publicación.
       System.out.println("                         ");
       System.out.println("-------------------------");
       System.out.println("COMMENTS AND OPINIONS");
       System.out.println("Comment: "+comments.getOtheruser());//Refleja el nombre de usuario de la persona que comentó.
       System.out.println("Text: "+comments.getText());//Refleja el comentario.
       System.out.println("Like: "+votes.getPositive());//Votos positivos.
       System.out.println("Dislike: "+votes.getNegative());//Votos negativos.
       System.out.println("Answers: " +answer.getUser());
       System.out.println(" "+answer.getOtherText());
       System.out.println("Uploaded at: "+answer.getDate());
       System.out.println("Likes: " +answer.getPositive());
       System.out.println("Dislike: "+answer.getNegative());
    }
    
}
