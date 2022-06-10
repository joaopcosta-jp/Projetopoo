package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.x.protobuf.MysqlxSql.StmtExecute;
import com.mysql.cj.xdevapi.Result;

import gui.Interface;
import pizzaria.Sabor;


public class SaborDAO extends Interface{
   
      static Connection conn = null;
      static PreparedStatement pst = null;
      static Resultset rs = null;

      public SaborDAO(){
         
         conn = Conexao2.ConnectaDB();
         atualizaCombo();

      }


      public void insere(Sabor s){

      String sql = "insert into sabor " +
         "(Id, Nome, Tipo, Valor)" +
         "values (?, ?, ?, ?)";

         try{

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, s.getid());
            stmt.setString(2, s.getnome());
            stmt.setString(3, s.gettipo());
            stmt.setFloat(3, s.getvalor());

            stmt.execute();
            stmt.close();

         } 
         catch (SQLException e){

            throw new RuntimeException(e);

         }

   }

      public static void atualizaCombo(){
        
         String sql = "select * from sabor";

         try{
            pst = conn.prepareStatement(sql);
            rs = (Resultset) pst.executeQuery();

            while(((ResultSet) rs).next()){
               cbbSaboresA.addItem(((ResultSet) rs).getString("nome"));
               cbbSaboresB.addItem(((ResultSet) rs).getString("nome"));
               cbbSaboresC.addItem(((ResultSet) rs).getString("nome"));
               cbbSaboresD.addItem(((ResultSet) rs).getString("nome"));
            }


         } catch (Exception e){

         }

      }
}