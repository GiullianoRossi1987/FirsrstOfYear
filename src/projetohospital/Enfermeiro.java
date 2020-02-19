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
public class Enfermeiro extends Funcionario {
 
    private String corem;
    
    public void setCorem(String corem){
        
        if (corem != ""){
            
            this.corem = corem;
        }
    }
    
    public String getCorem(){
    
        return this.corem;
    } 
    
    @Override
    
     public double gerarBonus(){
            return calculaSalario()*0.20;
        }
            
          
        
    
}
