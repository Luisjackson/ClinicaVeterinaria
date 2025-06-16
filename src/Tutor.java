import java.util.ArrayList;

public class Tutor extends Pessoa{
    private ArrayList<Animal> animais;

    public Tutor(String nome, String cpf, String email, String endereco, int telefone){
        super(nome, cpf, email, endereco, telefone);
        this.animais = new ArrayList<Animal>();
    }
    



}