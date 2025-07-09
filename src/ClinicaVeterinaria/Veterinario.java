package ClinicaVeterinaria;


public class Veterinario extends Funcionario{
    private String cfmv;
    private Especialidade especialidade;

    public Veterinario(String nome, String cpf, String email, String endereco, String telefone, String turno, Especialidade especialidade, String cfmv){
        super(nome, cpf, email, endereco, telefone, turno);
        this.especialidade = especialidade;
        this.cfmv = cfmv;
    }

    public void setEspecialidade(Especialidade especialidade){
        this.especialidade = especialidade;
    }

    public void setCfmv(String cfmv){
        this.cfmv = cfmv;
    }

    public Especialidade getEspecialidade(){
        return this.especialidade;
    }

    public String getCfmv(){
        return this.cfmv;
    }

    @Override
        public String toString(){
        return ("Nome:"+getNome() +
                "\nCpf:"+getCpf()+
                "\nEmail:"+getEmail()+
                "\nEndereco:"+getEndereco()+
                "\nTelefone:"+getTelefone()+
                "\nTurno:"+getTurno()+
                "\nEspecialidade:"+getEspecialidade());
    }

}