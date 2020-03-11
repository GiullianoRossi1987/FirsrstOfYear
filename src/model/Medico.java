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
public class Medico extends Funcionario {
    
    private String crm;
    private String especialidade;
    
        public void setCrm(String crm){
        
        if (crm != ""){
            
            this.crm = crm;
        }
    }
    
    public String getCrm(){
    
        return this.crm;
    }
    
        public void setEspecialidade(String especialidade){
        
        if (especialidade != ""){
            
            this.especialidade = especialidade;
        }
    }
    
    public String getEspecialidade(){
    
        return this.especialidade;
    }
    
    @Override
    
     public double gerarBonus(){
            return calculaSalario()*0.30;
        }
    
            
}
