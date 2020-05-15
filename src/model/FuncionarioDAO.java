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
import java.sql.SQLException;
        

public class FuncionarioDAO {
    // MUDA: protected Connection con = new ConnectionFactory().getConnection();
    // Se continuasse com esse atributo ele ia fazer so uma 
   
    Funcionario f = new Funcionario();
    public void cadastrar(Funcionario funcionario) {
        try{
            String query = "insert into funcionario (nome,cpf,rg,idade,senha,vlHora) values (?,?) ";
            try (Connection con = new ConnectionFactory().getConnection()) {
                PreparedStatement preparedStmt = con.prepareStatement(query);
                preparedStmt.setString(1, f.getNome());
                preparedStmt.setString(2, f.getCpf());
                preparedStmt.setString(3, f.getRg());
                preparedStmt.setInt(4, f.getIdade());
                preparedStmt.setString(5, f.getSenha());
                preparedStmt.setDouble(6, f.getVlrHora());
                
                
                preparedStmt.executeUpdate();
            }
        }catch(RuntimeException | ClassNotFoundException | SQLException e){throw new RuntimeException(e.getMessage());}
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
            
        }catch(RuntimeException | ClassNotFoundException | SQLException e){throw new RuntimeException(e.getMessage());}
        
        return ah;
    }
}
