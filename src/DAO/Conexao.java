package DAO;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
  
   public static void main ( String args[] ){

      Connection conexao = null;

      try{
         Class.forName("org.sqlite.JDBC");
         conexao = DriverManager.getConnection( "jdbc:sqlite:A:\\Programação\\ProjetoPoo\\src\\sabor.db" );
         if ( conexao != null ){
            System.out.println("CONEXÃO BEM SUCEDIDA!");
         }
      }
      catch ( Exception ex ) {
         System.err.println( ex.getClass().getName() + ": " + ex.getMessage() );
         System.out.println("ERRO NA CONEXÃO!");
      }

   }
 
}
