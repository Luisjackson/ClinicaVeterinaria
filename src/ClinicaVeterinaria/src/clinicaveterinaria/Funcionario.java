public class Funcionario extends Pessoa{
    private String turno;

    public Funcionario(String nome, String cpf, String email, String telefone, String turno){
        super(nome, cpf, email, telefone);
        this.turno = turno;
    }

    public void setTurno(String turno){
        this.turno = turno;
    }

    public String getTurno(){
        return this.turno;
    }
}

