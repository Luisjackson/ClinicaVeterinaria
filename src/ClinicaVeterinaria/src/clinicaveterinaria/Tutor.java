import java.util.ArrayList;

public class Tutor extends Pessoa{
    private ArrayList<Animal> animais;

    public Tutor(String nome, String cpf, String email, String telefone, String endereco){
        super(nome, cpf, email, telefone, endereco);
        this.animais = new ArrayList<Animal>();
    }

    public void adicionarAnimal(Animal animal){
        animais.add(animal);
    }

    public void removerAnimal(Animal animal){
        animais.remove(animal);
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }


    public void setAnimais(Animal animal) {
        this.animais.add(animal);
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "animais=" + animais +
                '}';
    }
}