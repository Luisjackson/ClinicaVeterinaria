public class Veterinario extends Funcionario{
    private String especialidade, cfmv;

    public Veterinario(String nome, String cpf, String email, String telefone, String turno, String especialidade, String cfmv){
        super(nome, cpf, email, telefone, turno);
        this.especialidade = especialidade;
        this.cfmv = cfmv;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public void setCfmv(String cfmv){
        this.cfmv = cfmv;
    }

    public String getEspecialiade(){
        return this.especialidade;
    }

    public String getCfmv(){
        return this.cfmv;
    }

}