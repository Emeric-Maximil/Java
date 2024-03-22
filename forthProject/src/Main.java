import com.adresse.model.ManagerUtilisateur;
import com.adresse.model.Utilisateur;

import java.sql.SQLException;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws SQLException {
        Utilisateur user = new Utilisateur("test", "test", "test@test.com", "1234");
        System.out.println(user);
        //test si le compte exist
        if(Objects.equals(user.getEmail(), ManagerUtilisateur.findByMail(user).getEmail())){
            System.out.println("Le compte existe déja");
        }
        else{
            //ajouter le compte en BDD
            System.out.println(ManagerUtilisateur.create(user));
        }
        Utilisateur test = new Utilisateur("maximil", "emeric", "emeric@maximil", "1234");
        System.out.println(test);
        //test si le compte exist
        if(Objects.equals(test.getEmail(), ManagerUtilisateur.findByMail(test).getEmail())){
            System.out.println("Le compte existe déja");
        }
        else{
            //ajouter le compte en BDD
            System.out.println(ManagerUtilisateur.create(test));
        }


        user.setFirstname("Sebastian");
        user.setName("Castel");

        if(Objects.equals(user.getEmail(), ManagerUtilisateur.findByMail(user).getEmail())){
            System.out.println("Le compte existe");
            System.out.println(ManagerUtilisateur.updateNomPrenom(user));
        }else{
            System.out.println("L'utilisateur n'existe pas");
        }

        System.out.println("je lance le find all");
        System.out.println(ManagerUtilisateur.findAll());
    }
}