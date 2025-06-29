package ClinicaVeterinaria;


public class Funcionario extends Pessoa{
    private String turno;

    public Funcionario(String nome, String cpf, String email, String telefone, String endereco, String turno){
        super(nome, cpf, email, telefone, endereco);
        this.turno = turno;
    }

    public void setTurno(String turno){
        this.turno = turno;
    }

    public String getTurno(){
        return this.turno;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", turno='" + turno + '\'' +
                '}';
    }

}

