public class Funcionario extends Pessoa{
    private String turno;

    public Funcionario(String nome, String cpf, String email, int telefone, String turno){
        super(nome, cpf, email, telefone);
        this.turno = turno;
    }

    public void setTurno(String turno){
        this.turno = turno;
    }

    public void setTelefone(int telefone){
        this.telefone = telefone;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getEmail(){
        return this.email;
    }

    public String getTurno(){
        return this.turno;
    }

    public int getTelefone(){
        return this.telefone;
    }
}