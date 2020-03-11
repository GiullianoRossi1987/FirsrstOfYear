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
public class Funcionario extends Pessoa {
    
    private int matricula;
    private String senha;
    private double vlrHora;

    public double getVlrHora() {
        return vlrHora;
    }

    public void setVlrHora(double vlrHora) {
        this.vlrHora = vlrHora;
    }
    
    
    public void setMatricula(int matricula){
        
            this.matricula = matricula;
        }
        
        public void setSenha(String senha){
        
            if (senha != ""){
            
                this.senha = senha;
            }
        }
        
        public int getMatricula(){
        
            return this.matricula;
        }
        
        public String getSenha(){
        
            return this.senha;
        }
        
        public double calculaSalario(){
        
            return vlrHora*30;
        }
        
        public double calculaSalario(double descontos){
        
            return (vlrHora*30)- descontos;
        
        }
        
        public double gerarBonus(){
            return calculaSalario()*0.10;
        }
    
}
