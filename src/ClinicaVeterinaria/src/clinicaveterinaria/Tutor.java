import java.util.ArrayList;

public class Tutor extends Pessoa{
    private ArrayList<Animal> animais;
    private String endereco;

    public Tutor(String nome, String cpf, String email, String endereco, String telefone){
        super(nome, cpf, email, telefone);
        this.endereco = endereco;
        this.animais = new ArrayList<Animal>();
    }

    
    public ArrayList<Animal> getAnimais() {
        return animais;
    }

 
    public void setAnimais(Animal animal) {
        this.animais.add(animal);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}