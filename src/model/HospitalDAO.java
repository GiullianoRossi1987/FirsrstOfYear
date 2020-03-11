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
        

public class HospitalDAO {
    private Connection con = new ConnectionFactory().getConnection();
    
    public void cadastrar(Hospital hospital){
        try{
            String query = "insert into hospital (nome,endereco) values (?,?) ";
            
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, hospital.getNomeHospital());
            preparedStmt.setString(2, hospital.getEndereco());
            
            preparedStmt.execute();
            
            con.close();
        }catch(Exception e){}
    }
    
    public ArrayList<Hospital> buscar(){
        ArrayList<Hospital> ah = new ArrayList(); 
        try{
            String query = "select * from hospital;";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            ResultSet rs = preparedStmt.executeQuery(query);
            
            while(rs.next()){
                Hospital h = new Hospital(rs.getString("nome"));
                h.setIdHospital(rs.getInt("id"));
                
                ah.add(h);
            }
            
        }catch(Exception e){}
        
        return ah;
    }
}
