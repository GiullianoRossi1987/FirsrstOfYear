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
public class ProntoSocorro {
    
    private Hospital matriz;
    private int idFilial;
    private String endereco;

    public Hospital getMatriz() {
        return matriz;
    }

    public void setMatriz(Hospital matriz) {
        this.matriz = matriz;
    }

    public int getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(int idFilial) {
        this.idFilial = idFilial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ProntoSocorro(Hospital matriz, int idFilial) {
        this.matriz = matriz;
        this.idFilial = idFilial;
    }
    
    
    
}
