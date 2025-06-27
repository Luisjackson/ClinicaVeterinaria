
import java.util.ArrayList;

public class Animal{
    private String nome, raca, dataNascimento;
    private Tutor tutor;
    private ArrayList<Vacinacao> vacinas;
    private ArrayList<Consulta> consultas;

    public Animal(String nome, String raca, String dataNascimento, Tutor tutor){
        this.nome = nome;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.tutor = tutor;
        this.vacinas = new ArrayList<Vacinacao>();
        this.consultas = new ArrayList<Consulta>();
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public void setTutor(Tutor tutor){
        this.tutor = tutor;
    }

    public String getNome(){
        return this.nome;
    }

    public String getRaca(){
        return this.raca;
    }

    public String getDataNascimento(){
        return this.dataNascimento;
    }

    public Tutor getTutor(){
        return this.tutor;
    }

    public ArrayList<Vacinacao> getVacinas() {
        return vacinas;
    }

    public void setVacinas(Vacinacao vacina) {
        this.vacinas.add(vacina);
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(Consulta consulta) {
        this.consultas.add(consulta);
    }
    
    
    
    public void emitirCartaoVacina(){
        
        System.out.println("Cartão de Vacina");
        for(Vacinacao va : this.getVacinas()){
            va.emissaoInfo();
            
        }
        
    }
    
}
