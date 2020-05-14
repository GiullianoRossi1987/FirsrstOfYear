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

public class PacienteDAO {
     // protected Connection con = new ConnectionFactory().getConnection();/*Iginora o erro, não afeta em nada*/
    
  
    
    public void cadastrar(Paciente paciente){
        try{
            String query = "insert into pacientes (hospital,nome,cpf,rg,idade,senha) values (?,?) ";
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, paciente.getNome());
            preparedStmt.setString(2, paciente.getCpf());
            preparedStmt.setString(3, paciente.getRg());
            preparedStmt.setInt(4, paciente.getIdade());
            preparedStmt.setString(5, paciente.getSenha());
            
            
            preparedStmt.executeUpdate();
            
            con.close();
        }catch(Exception e){throw new RuntimeException(e.getMessage());}
    }
    
    public ArrayList<Paciente> buscar(){
        ArrayList<Paciente> ph = new ArrayList<Paciente>(); 
        try{
            String query = "select * from pacientes;";
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement preparedStmt = con.prepareStatement(query);
            ResultSet rs = preparedStmt.executeQuery();  // <Giulliano> Nao precisa de parametro no executeQuery
            
            while(rs.next()){
                Paciente p = new Paciente();
                p.setCodPaciente(rs.getInt("id"));
                ph.add(p);
            }
            
        }catch(Exception e){throw new RuntimeException(e.getMessage());}
        
        return ph;
    }
}
