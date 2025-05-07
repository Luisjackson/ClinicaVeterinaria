import java.util.ArrayList;

public class Tutor{
    private String nome, cpf, email, endereco;
    private int telefone;
    private ArrayList<Animal> animais;

    public Tutor(String nome, String cpf, String email, String endereco, int telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.animais = new ArrayList<Animal>();
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

    public void setEndereco(String endereco){
        this.endereco = endereco;
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

    public String getEndereco(){
        return this.endereco;
    }

    public int getTelefone(){
        return this.telefone;
    }

}