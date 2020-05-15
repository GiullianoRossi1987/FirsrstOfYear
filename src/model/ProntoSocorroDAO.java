/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.lang.Exception;
/**
 *
 * @author fefem
 */
public class ProntoSocorroDAO {
    
    public void cadastrar(Funcionario funcionario) {
        try{
            String query = "insert into prontosocorro (nome,endereco) values (?,?) ";
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, ProntoSocorro.getNome());
            preparedStmt.setString(2, ProntoSocorro.getCpf());
            
            preparedStmt.executeUpdate();
            
            con.close();
        }catch(Exception e){throw new RuntimeException(e.getMessage());}
    }
    
    public ArrayList<Funcionario> buscar(){
        ArrayList<Funcionario> ah = new ArrayList<Funcionario>(); 
        try{
            Connection con = new ConnectionFactory().getConnection();
            String query = "select * from funcionario;";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            ResultSet rs = preparedStmt.executeQuery();  // <Giulliano> Nao precisa de parametro no executeQuery
            
            while(rs.next()){
                f.setMatricula(rs.getInt("id"));
                ah.add(f);
            }
            
        }catch(Exception e){throw new RuntimeException(e.getMessage());}
        
        return ah;
    }
    
}
