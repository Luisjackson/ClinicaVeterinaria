    public class Pessoa{
    private String nome, cpf, email, telefone;

    public Pessoa(String nome, String cpf, String email, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
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
    
    public void setTelefone(String telefone){
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

    public String getTelefone(){
        return this.telefone;
    }
}