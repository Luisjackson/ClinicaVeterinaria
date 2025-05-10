public class Funcionario{
    private String nome, cpf, email, telefone, turno;

    public Funcionario(String nome, String cpf, String email, String telefone, String turno){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.turno = turno;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setEmail(String email){
        this.email = email;
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