package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Conexao2 {
    public static Connection ConnectaDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:A:\\Programação\\ProjetoPoo\\src\\sabor.db");
            System.out.println("Conexão bem sucedida!");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            System.out.println("Falha na conexão");
            return null;
        }
    }
}
