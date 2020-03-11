
package model;

public abstract class Pessoa {
    
    private String nome;
    private String rg;
    private String cpf;
    private int idade;

    public void setNome(String nome){
    
        if (nome!=""){
            this.nome = nome;
        }
        else{}
    }
    
      public void setRg(String rg){
    
        if (rg!=""){
            this.rg = rg;
        }
        else{}
    }
      
      public void setCpf(String cpf){
          
    
        if (cpf!=""){
            this.cpf = cpf;
        }
        else{}
    }
      
      public void setIdade(int idade){
          
          this.idade = idade;
      }
      
      public String getNome(){
        
        return this.nome;
    } 
      public String getCpf(){
          
          return this.cpf;
      }
      
      public String getRg(){
      
          return this.rg;
      }
   
      public int getIdade(){
      
          return this.idade;
      }
      
}
