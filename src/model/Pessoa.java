package model;

public abstract class Pessoa {
    
    private String nome;
    private String rg;
    private String cpf;
    private int idade;

    public void setNome(String nome){
        if (nome.length() != 0){
            this.nome = nome;
        }
    }
    
    public void setRg(String rg){
        if (rg.length() != 0) this.rg = rg;
    }
      
    public void setCpf(String cpf){
        if (cpf.length() != 0 || cpf.indexOf(".") != -1){  // <Giulliano> Esse indexOf vai verificar se tem o '.' no CPF, se nao tiver ele vai retornar o valor -1. Ai e so checkar e pronto
            this.cpf = cpf;
        }
    }
      
    public void setIdade(int idade){
        if(idade > 0) this.idade = idade;
    }
      
     public String getNome(){
        return this.nome;
    } 
      public String getCpf(){ return this.cpf; }
      
      public String getRg(){ return this.rg; }
   
      public int getIdade(){ return this.idade; }
      
}
