import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Clinica {
    private String nome;
    private ArrayList<Animal> pacientes;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Agendamento> agendamentos;
    private ArrayList<Consulta> consultas;

    public Clinica(String nome) {
        this.nome = nome;
        this.pacientes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.agendamentos = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    public boolean marcarConsulta(Animal animal, Especialidade esp, Agenda agenda) {

        // Verifica se esta dentro do horario permitido, se não retorna falso e não marca a consulta
        if (!agenda.isHorarioPermitido()) {
            System.out.println("Horário inválido!");
            return false;
        }

        //Verificar na lista de agendamentos se já existe algum agendamento na do dia, na data, e na especialidade.
        for (Agendamento ag : agendamentos) {
            if (ag.getAgenda().getData().equals(agenda.getData()) &&
                    ag.getAgenda().getHorario().equals(agenda.getHorario()) &&
                    ag.getEspecialidade().getNome().equalsIgnoreCase(esp.getNome())) {
                System.out.println("Já existe agendamento neste horário.");
                return false;
            }
        }
        //Caso não retorne falso quer dizer que o horario é permitido e não tem agendamento naquela data

        //Adiciona o novo agendamento a lista de agendamentos
        agendamentos.add(new Agendamento(animal, esp, agenda));
        System.out.println("Consulta marcada para " + agenda);
        return true;
    }


    //CANCELAR AGENDAMENTO
    public void cancelarAgendamento(){

    }

    public void addPaciente(Animal animal){
        this.pacientes.add(animal);
    }

    public void addFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public void addAgenda(Agendamento agendamento){
        this.agendamentos.add(agendamento);
    }

    public void addConsulta(Consulta consulta){
        this.consultas.add(consulta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Animal> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Animal> pacientes) {
        this.pacientes = pacientes;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ArrayList<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(ArrayList<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Clinica{" +
                ", Total de Funcionarios=" + funcionarios.size() +
                ", Total de Consultas=" + consultas.size();
    }

}
