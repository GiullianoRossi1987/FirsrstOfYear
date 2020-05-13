/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Paciente;
import model.PacienteDAO;

/**
 *
 * @author fefem
 */
public class ControllerPaciente {
    
    public void CadastrarPaciente(Paciente paciente){
        PacienteDAO pDAO = new PacienteDAO();
        pDAO.cadastrar(paciente);
    }
    
    public ArrayList<Paciente> listarPaciente(){
        PacienteDAO pDAO = new PacienteDAO();
        return pDAO.buscar();
    }
}

