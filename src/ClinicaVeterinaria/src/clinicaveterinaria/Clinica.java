import java.util.ArrayList;

public class Clinica
{
private String nome;
private ArrayList<Animal> pacientes;
private ArrayList<Funcionario> funcionarios;
private ArrayList<Agenda> agendas;
private ArrayList<Consulta> consultas;
    
    public Clinica (String nome){
    this.nome = nome;
    this.pacientes = new ArrayList<Animal>();
    this.funcionarios = new ArrayList<Funcionario>();
    this.agendas = new ArrayList<Agenda>();
    this.consultas = new ArrayList<Consulta>();
    }

// set    
    
public void setNome(String nome){
    this.nome = nome;
}
    
public void addPaciente(Animal animal){
    this.pacientes.add(animal);
}
    
public void addFuncionario(Funcionario funcionario){
    this.funcionarios.add(funcionario);
}

public void addAgenda(Agenda agenda){
    this.agendas.add(agenda);
}

public void addConsulta(Consulta consulta){
    this.consultas.add(consulta);
}

// gets

public String getNome(){
    return this.nome;
}

public ArrayList<Animal> getPacientes() {
    return this.pacientes;
}

public ArrayList<Funcionario> getFuncionarios(){
    return this.funcionarios;
}

public ArrayList<Agenda> getAgendas(){
    return this.agendas;
}

public ArrayList<Consulta> getConsultas(){
    return this.consultas;
}

}
