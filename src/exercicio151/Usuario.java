/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio151;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ROBERTOVA
 */
public class Usuario {
    int id;
    String login;
    String password;
    
    public static int Existe(String login, String pass, Connection con) {
        int user = 0;
        try {
            PreparedStatement statement = con.prepareStatement("SELECT id FROM usuarios WHERE login=? AND pass=?");
            statement.setString(1, login);
            statement.setString(2, pass);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                user = rs.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;        
    }
    
    public Usuario(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }
    
}
