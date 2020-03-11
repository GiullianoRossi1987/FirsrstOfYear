/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno02
 */
public class Hospital {
    private String nomeHospital;
    private int idHospital;
    private String endereco;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    public int getIdHospital() {
        return idHospital;
    }

    public String getNomeHospital() {
        return nomeHospital;
    }

    public void setNomeHospital(String nomeHospital) {
        this.nomeHospital = nomeHospital;
    }
    
    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void addFuncionario(Funcionario funcionario){
    
        funcionarios.add(funcionario);
    
    }
    
    public void listarTodosFuncionarios(){
    
        for(Funcionario f : funcionarios){
            System.out.println("Nome: " + f.getNome());
        }
        
    }
    
    public void listarTodosMedicos(){ 
        for(Funcionario f : funcionarios){
            if(f instanceof Medico){
                System.out.println("Nome do médico: " + f.getNome());
            }   
        }
    }
    
    
    
    public void listarTodosEnfermeiros(){ 
        for(Funcionario f : funcionarios){
            if(f instanceof Enfermeiro){
                System.out.println("Nome do enfermeiro: " + f.getNome());
            }   
        }
    }

    public Hospital(String nome) {
        this.nomeHospital = nome;
    }
    
    @Override
    public String toString(){
        return this.getNomeHospital();
    }
    
    
    
    
    
    
}   
