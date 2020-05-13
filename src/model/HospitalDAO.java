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
        

public class HospitalDAO {
    protected Connection con = new ConnectionFactory().getConnection();
    
   
    
    public void cadastrar(Hospital hospital) {
        try{
            String query = "insert into hospital (nome,endereco) values (?,?) ";
            
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, hospital.getNomeHospital());
            preparedStmt.setString(2, hospital.getEndereco());
            
            preparedStmt.executeUpdate();
            
            con.close();
        }catch(Exception e){throw new RuntimeException(e.getMessage());}
    }
    
    public ArrayList<Hospital> buscar(){
        ArrayList<Hospital> ah = new ArrayList<Hospital>(); 
        try{
            String query = "select * from hospital;";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            ResultSet rs = preparedStmt.executeQuery();  // <Giulliano> Nao precisa de parametro no executeQuery
            
            while(rs.next()){
                Hospital h = new Hospital(rs.getString("nome"));
                h.setIdHospital(rs.getInt("id"));
                ah.add(h);
            }
            
        }catch(Exception e){throw new RuntimeException(e.getMessage());}
        
        return ah;
    }
}
