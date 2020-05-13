/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Aluno02
 */
public class Paciente extends Pessoa{

        private int codPaciente;
        private String senha;


        
        public void setCodPaciente(int codPaciente){
        
            this.codPaciente = codPaciente;
        }
        
        public void setSenha(String senha){
        
            if (senha != ""){
            
                this.senha = senha;
            }
        }
        
        public int getCodPaciente(){
        
            return this.codPaciente;
        }
        
        public String getSenha(){
        
            return this.senha;
        }
    
}
