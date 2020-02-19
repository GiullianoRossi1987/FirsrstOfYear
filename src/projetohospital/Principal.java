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
public class Principal {

 
    public static void main(String[] args) {
        Paciente p = new Paciente();
        Funcionario f = new Funcionario();
        Enfermeiro e = new Enfermeiro();
        Medico m = new Medico();
        Hospital h = new Hospital(543, "mama");
        ProntoSocorro ps = new ProntoSocorro(h,1);
        
        p.setNome("Douglas");
        p.setCodPaciente(12344124);
        p.setCpf("2222-2222-2222-22-XX");
        p.setIdade(37);
        p.setRg("341-124-646-S");
        p.setSenha("3101j");
        
        f.setVlrHora(31.02);
        f.setCpf("1234-0987-4756-KK");
        f.setIdade(25);
        f.setMatricula(765);
        f.setNome("Piton");
        f.setRg("583-094-673-I");
        f.setSenha("25081995");
        
        e.setVlrHora(50);
        e.setCorem("342");
        e.setCpf("3432-5739-9873-IU");
        e.setIdade(47);
        e.setMatricula(234);
        e.setNome("E man");
        e.setRg("321-321-312-P");
        e.setSenha("65ty78u");
        
        m.setVlrHora(75);
        m.setCrm("2a");
        m.setEspecialidade("Examinador profissional de próstata (com 4 dedos)");
        m.setCpf("3432-5739-9873-IU");
        m.setIdade(35);
        m.setMatricula(654);
        m.setNome("B man");
        m.setRg("435-657-567-P");
        m.setSenha("696969696969696969696969696");
        
        h.setNomeHospital("Lugar onde pessoas morrem");
        h.setEndereco("Rua São gonçalvves, 452");
        h.setIdHospital(1);
        h.addFuncionario(f);
        h.addFuncionario(m);
        h.addFuncionario(e);
        
        ps.setMatriz(h);
        ps.setIdFilial(2);
        ps.setEndereco("aaaaaaaaaaaaaaaaaaaa, 347");
        
        System.out.println("Informações do paciente:\nNome: " + p.getNome()+
                           "\nIdade: "+p.getIdade()+
                           "\nCpf: "+p.getCpf()+
                           "\nRg: "+p.getRg()+
                           "\nSenha: "+p.getSenha()+
                           "\nCodigo do paciente: "+p.getCodPaciente()+"\n\n\n");
        
        System.out.println("Informações do funcionario:\nNome: " + f.getNome()+
                           "\nIdade: "+f.getIdade()+
                           "\nCpf: "+f.getCpf()+
                           "\nRg: "+f.getRg()+
                           "\nSenha: "+f.getSenha()+
                           "\nSalario: "+f.gerarBonus()+
                           "\nMatricula: "+f.getMatricula()+"\n\n\n");
        
        System.out.println("Informações do enfermeiro:\nNome: " + e.getNome()+
                           "\nIdade: "+e.getIdade()+
                           "\nCpf: "+e.getCpf()+
                           "\nRg: "+e.getRg()+
                           "\nSenha: "+e.getSenha()+
                           "\nCorem: "+e.getCorem()+
                           "\nSalario: "+e.gerarBonus()+
                           "\nMatricula: "+e.getMatricula()+"\n\n\n");
        
        System.out.println("Informações do médico:\nNome: " + m.getNome()+
                           "\nIdade: "+m.getIdade()+
                           "\nCpf: "+m.getCpf()+
                           "\nRg: "+m.getRg()+
                           "\nSenha: "+m.getSenha()+
                           "\nMatricula: "+m.getMatricula()+
                           "\nCrm: "+m.getCrm()+
                           "\nSalario: "+e.gerarBonus()+
                           "\nEspecialidade: "+m.getEspecialidade()+"\n\n\n");
        
        System.out.println("Informações do hospital:\nNome: "+h.getNomeHospital()+
                           "\nEndereço: "+h.getEndereco()+
                           "\nId: "+h.getIdHospital()+"\nLista dos funcionários: ");
        
                          h.listarTodosFuncionarios();
                          h.listarTodosEnfermeiros();
                          h.listarTodosMedicos();
                    
        System.out.println("\n\n\nInformações da filial:\nMatriz: "+ps.getMatriz().getNomeHospital()+
                           "\nEndereço: "+ps.getEndereco()+
                           "\nid da filial: "+ps.getIdFilial());
    }
   
    
}
