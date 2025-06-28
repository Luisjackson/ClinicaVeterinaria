import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;

public class Clinica {
    private String nome;
    private ArrayList<Animal> pacientes;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Agendamento> agendamentos;
    private ArrayList<Consulta> consultas;

    // Acrescentei Veterinario aqui pq tava muito complexo utilizar funcionario
    private ArrayList<Veterinario> veterinarios;

    public Clinica(String nome) {
        this.nome = nome;
        this.pacientes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.veterinarios = new ArrayList<>();
        this.agendamentos = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    public boolean marcarAgendamento(Animal animal, Especialidade esp, Agenda agenda) {

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

    public void realizarConsulta(Agendamento agendamento, String motivo, String diagnostico, String medicamentos) {
        Animal animal = agendamento.getAnimal();
        Especialidade especialidade = agendamento.getEspecialidade();

        //Para guardar o veterinario disponivel
        Veterinario veterinario = null;

        for (int i = 0; i < veterinarios.size(); i++) {
            Veterinario v = veterinarios.get(i);

            if (v.getEspecialiade().getNome().equals(especialidade.getNome())) {
                veterinario = v;
                break;
            }
        }

        if (veterinario == null) {
            System.out.println("Nenhum veterinário disponível com essa especialidade.");
            return;
        }

        String data = agendamento.getAgenda().getData().toString();
        Consulta consulta = new Consulta(medicamentos, diagnostico, data, motivo, animal, veterinario);

        consultas.add(consulta);
        animal.adicionarConsulta(consulta);
        agendamentos.remove(agendamento);

        System.out.println("Consulta realizada com sucesso!");
    }

    public void realizarConsultaDireta(Animal animal, Especialidade especialidade, String motivo, String diagnostico, String medicamentos) {
        Veterinario veterinario = null;

        for (int i = 0; i < veterinarios.size(); i++) {
            Veterinario v = veterinarios.get(i);

            if (v.getEspecialiade().getNome().equals(especialidade.getNome())) {
                veterinario = v;
                break;
            }
        }

        if (veterinario == null) {
            System.out.println("Nenhum veterinário disponível com essa especialidade.");
            return;
        }

        // Usa a data atual como referência
        String data = java.time.LocalDate.now().toString();

        Consulta consulta = new Consulta(medicamentos, diagnostico, data, motivo, animal, veterinario);
        consultas.add(consulta);
        animal.adicionarConsulta(consulta);

        System.out.println("Consulta feita sem agendamento realizada com sucesso para " + animal.getNome());
    }

    public void verConsultas(Animal animal) {
        System.out.println("Consultas do animal " + animal.getNome() + ":");

        if (animal.getConsultasAnimal().isEmpty()) {
            System.out.println("Nenhuma consulta registrada para este animal.");
            return;
        }

        for (Consulta c : animal.getConsultasAnimal()) {
            System.out.println("Data: " + c.getData());
            System.out.println("Motivo: " + c.getMotivo());
            System.out.println("Diagnóstico: " + c.getDiagnostico());
            System.out.println("Medicamentos: " + c.getMedicamentos());
            System.out.println("Veterinário: " + c.getVeterinario().getNome());
            System.out.println("-----------------------------");
        }
    }

    //CANCELAR AGENDAMENTO
    public boolean cancelarAgendamento(Agendamento agendamento){
        if(agendamentos.contains(agendamento)){
            agendamentos.remove(agendamento);
            System.out.println("Agendamento cancelado: " + agendamento.getAnimal().getNome() + ' ' + agendamento.getAgenda().getData() + ' ' + agendamento.getAgenda().getHorario());
            return true;
        }else{
            System.out.println("Agendamento não encontrado.");
            return false;
        }
    }

    // DECIDIR
    // CANCELAR AGENDAMENTO POR ANIMAL, DATA E HORA,
    // ACHO QUE ASSIM É MELHOR PARA UTILIZAR NA INTERFACE GRAFICA DPS
    // SELECIONA QUAL O ANIMAL, DEPOIS VE QUAL A DATA E HORA.
    public boolean cancelarAgendamentoAnimal(Animal animal, LocalDate data, LocalTime horario) {
        for (int i = 0; i < agendamentos.size(); i++) {
            Agendamento ag = agendamentos.get(i);
            if (ag.getAnimal().equals(animal) &&
                    ag.getAgenda().getData().equals(data) &&
                    ag.getAgenda().getHorario().equals(horario)) {
                agendamentos.remove(i);
                System.out.println("Agendamento cancelado: " + ag.getAnimal().getNome() + ' ' + ag.getAgenda().getData() + ' ' + ag.getAgenda().getHorario());
                return true;
            }
        }
        System.out.println("Agendamento não encontrado para cancelamento.");
        return false;
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

    public void addVeterinario(Veterinario veterinario) {
        veterinarios.add(veterinario);

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

    public ArrayList<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(ArrayList<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }

    @Override
    public String toString() {
        return "Clinica{" +
                "nome='" + nome + '\'' +
                ", pacientes=" + pacientes +
                ", funcionarios=" + funcionarios +
                ", agendamentos=" + agendamentos +
                ", consultas=" + consultas +
                ", veterinarios=" + veterinarios +
                '}';
    }
}
