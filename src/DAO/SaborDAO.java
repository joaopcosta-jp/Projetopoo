package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.x.protobuf.MysqlxSql.StmtExecute;
import com.mysql.cj.xdevapi.Result;

import pizzaria.Sabor;


public class SaborDAO {

      private Connection conexao;
      
      public SaborDAO(){

         Conexao conexao = new Conexao();

      }
   

      public void insere(Sabor s){

      String sql = "insert into sabor " +
         "(Id, Nome, Tipo, Valor)" +
         "values (?, ?, ?, ?)";

         try{

            PreparedStatement stmt = conexao.prepareStatement(sql);
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

      /*public Sabor busca(String n){

         Sabor s = new Sabor();

         try{
            String sql = "select * from sabor where nome like ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, "%" + n + "%");

            Resultset rs = stmt.executeQuery();

            s.setnome("Não encontrado");

            while(rs.next()){
               if(rs.getString("nome").equals(n)){
                  s.setnome(rs.getString("Nome"));
                  s.settipo(rs.getString("Tipo");
                  s.setvalor(rs.getFloat());
               }
            }

            rs.close();
            stmt.close();
            return s;

         } catch(SQLException e){
            throw new RuntimeException(e);
         }

      }*/
}