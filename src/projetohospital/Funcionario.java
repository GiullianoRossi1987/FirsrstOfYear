/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetohospital;

/**
 *
 * @author Aluno02
 */
public class Funcionario extends Pessoa {
    
    private int matricula;
    private String senha;
    
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
    
}
