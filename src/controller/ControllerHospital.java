/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Hospital;
import model.HospitalDAO;


public class ControllerHospital {
    
    public void CadastrarHospital(Hospital hospital){
        HospitalDAO hDAO = new HospitalDAO();
        hDAO.cadastrar(hospital);
    }
    
    public ArrayList<Hospital> listarHospital(){
        HospitalDAO hDAO = new HospitalDAO();
        return hDAO.buscar();
    }
}
