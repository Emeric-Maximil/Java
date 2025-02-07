package com.adresse.model;

import java.sql.*;
import java.util.ArrayList;

public class ManagerUtilisateur {
    private static final Connection connexion = Database.getConnexion();
    public static Utilisateur create(Utilisateur user) throws SQLException {
        //créer un objet Utilisateur
        Utilisateur userAdd = new Utilisateur();
        //try la requête
        try {
            //connecter à la bdd
            Statement smt = connexion.createStatement();
            //préparation de la requête
            String req = "INSERT INTO users(name,firstname,email,password) VALUE(?,?,?,?)";
            PreparedStatement preparedStatement = connexion.prepareStatement(req);
            //binder les paramètres
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getFirstname());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getPassword());
            //exécuter la requête
            int row = preparedStatement.executeUpdate();
            //tester si la requête à réussi
            if(row > 0) {
                userAdd.setName(user.getName());
                userAdd.setFirstname(user.getFirstname());
                userAdd.setEmail(user.getEmail());
                userAdd.setPassword(user.getPassword());
            }
            //recupérer l'enregistrement
        }
        //lever l'erreur SQL
        catch (SQLException e){
            e.printStackTrace();
        }
        //retourne un objet utilisateur complet
        return userAdd;
    }

    public static Utilisateur updateNomPrenom(Utilisateur user){
        //créer un objet Utilisateur
        Utilisateur userUpdate = new Utilisateur();
        //try la requête
        try {
            //connecter à la bdd
            Statement smt = connexion.createStatement();

            //préparation de la requête
            String req = "UPDATE users SET name = ?, firstname = ? WHERE email = ?";
            PreparedStatement preparedStatement = connexion.prepareStatement(req);
            //binder les paramètres
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getFirstname());
            preparedStatement.setString(3, user.getEmail());

            //exécuter la requête
            int row = preparedStatement.executeUpdate();
            //tester si la requête à réussi
            if(row > 0) {
                userUpdate.setName(user.getName());
                userUpdate.setFirstname(user.getFirstname());

            }
            //recupérer l'enregistrement
        }
        //lever l'erreur SQL
        catch (SQLException e){
            e.printStackTrace();
        }
        //retourne un objet utilisateur complet
        return userUpdate;
    }
    public static Utilisateur findByMail(Utilisateur user) throws SQLException{
        Utilisateur userRecup = new Utilisateur();

        try {
            //connexion à la bdd
            Statement smt = connexion.createStatement();
            //requête
            String req = "SELECT id, name, firstname, email, password FROM users WHERE email = ?";
            //préparer la requête
            PreparedStatement preparedStatement = connexion.prepareStatement(req);
            //binder le paramètre
            preparedStatement.setString(1, user.getEmail());
            //exécuter la requête
            ResultSet reponse = preparedStatement.executeQuery();

            //boucle pour parcourir le résultat
            while (reponse.next()) {
                if(reponse.getString(1) !=null){
                    //setter les nouvelles valeurs

                    userRecup.setId(reponse.getInt(1));
                    userRecup.setName(reponse.getString("name"));
                    userRecup.setFirstname(reponse.getString("firstname"));
                    userRecup.setEmail(reponse.getString("email"));
                    userRecup.setPassword(reponse.getString("password"));

                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //retourne l'objet Utilisateur
        return userRecup;
    }
    public static ArrayList<Utilisateur> findAll() throws SQLException{
        ArrayList <Utilisateur> allUsers = new ArrayList<>();

        try {
            //connexion à la bdd
            Statement smt = connexion.createStatement();

            //requête
            String req = "SELECT id, name, firstname, email, password FROM users ";

            //préparer la requête
            PreparedStatement preparedStatement = connexion.prepareStatement(req);

            //binder le paramètre

            //exécuter la requête
            ResultSet reponse = preparedStatement.executeQuery();

            //boucle pour parcourir le résultat
            while (reponse.next()) {
                if(reponse.getString(1) !=null){
                    Utilisateur userTmp = new Utilisateur();
                    //setter les nouvelles valeurs
                    userTmp.setId(reponse.getInt(1));
                    userTmp.setName(reponse.getString("name"));
                    userTmp.setFirstname(reponse.getString("firstname"));
                    userTmp.setEmail(reponse.getString("email"));
                    userTmp.setPassword(reponse.getString("password"));
                    allUsers.add(userTmp);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //retourne l'objet Utilisateur
        return allUsers;
    }
    public static void delete(Utilisateur user) throws SQLException{

        try {
            //connexion à la bdd
            Statement smt = connexion.createStatement();
            //requête
            String req = "DELETE FROM users WHERE email = ?";
            //préparer la requête
            PreparedStatement preparedStatement = connexion.prepareStatement(req);
            //binder le paramètre
            preparedStatement.setString(1, user.getEmail());
            //exécuter la requête
            ResultSet reponse = preparedStatement.executeQuery();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}