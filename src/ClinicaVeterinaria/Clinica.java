package ClinicaVeterinaria;

import ClinicaVeterinaria.Agenda;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clinica {
    private String nome;
    
    private ArrayList<Tutor> listaTutores = new ArrayList<>();
    private ArrayList<Animal> listaAnimais = new ArrayList <>();
    private ArrayList<Animal> listaPacientes = new ArrayList <>();
    private ArrayList<Veterinario> listaVeterinarios = new ArrayList<>();
    private ArrayList<Especialidade> listaEspecialidades = new ArrayList<>();
    private ArrayList<VacinaOferecidas> listaVacinas = new ArrayList<>();
    private ArrayList<Agendamento> agendamentos = new ArrayList<>();
    private ArrayList<Consulta> consultas = new ArrayList<>();
    private ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
    


    public Clinica(String nome) {
        this.nome = nome;
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

    // 
        public Consulta realizarConsulta(Agendamento agendamento, String motivo, String diagnostico, String medicamentos) {
           Animal animal = agendamento.getAnimal();
           Especialidade especialidade = agendamento.getEspecialidade();
           Veterinario veterinario = null;

           for (Veterinario v : this.listaVeterinarios) {
               if (v.getEspecialidade().equals(especialidade)) {
                   veterinario = v;
                   break;
               }
           }

           if (veterinario == null) {
               System.out.println("Nenhum veterinário disponível com essa especialidade.");
               return null;
           }

           LocalDate data = agendamento.getAgenda().getData();
           Consulta consulta = new Consulta(medicamentos, diagnostico, data, motivo, animal, veterinario);

           this.consultas.add(consulta);
           animal.adicionarConsulta(consulta);
           this.agendamentos.remove(agendamento);

           System.out.println("Consulta (agendada) realizada com sucesso!");
           return consulta;
       }

    public Consulta realizarConsultaDireta(Animal animal, Especialidade especialidade, String motivo, String diagnostico, String medicamentos) {
        Veterinario veterinario = null;

        for (Veterinario v : this.listaVeterinarios) {
            if (v.getEspecialidade().equals(especialidade)) {
                veterinario = v;
                break;
            }
        }

        if (veterinario == null) {
            System.out.println("Nenhum veterinário disponível com essa especialidade.");
            return null;
        }

        LocalDate data = LocalDate.now();
        Consulta consulta = new Consulta(medicamentos, diagnostico, data, motivo, animal, veterinario);

        this.consultas.add(consulta);
        animal.adicionarConsulta(consulta);

        System.out.println("Consulta (direta) realizada com sucesso!");
        return consulta;
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

    // VERIFICAR SE FAZ MAIS SENTIDO APLICAR VACINA EM ANIMAL OU CLINICA
    public void aplicarVacina(Animal animal, Vacina vacina) {
        animal.adicionarVacina(vacina);
        System.out.println("Vacina " + vacina.getNomeVacina() + " aplicada no animal: " + animal.getNome());
    }
    
    
       public void cobrar(Consulta consulta){
        float valor = consulta.cobrar(); 
        
        System.out.println("O valor a ser pago pela consulta é : "+ valor);
   }
    
       
   public void cobrar(Vacina vacina){
       float valor = vacina.cobrar();
       
       System.out.println("O valor a ser pago pela vacinação é : "+ valor);
   }
    
        
    public String emitirTotalGasto(Animal animal) {
        float totalVacinas = 0;
        float totalConsultas = 0;


        String relatorio = "";

        relatorio += " Cobrança para: " + animal.getNome() + "\n\n";
        relatorio += " Detalhamento de Vacinas \n";

        for (Vacina vacina : animal.getCartaoVacina()) {
            relatorio += vacina.getNomeVacina() + ": R$ " + String.format("%.2f", vacina.getPreco()) + "\n";
            totalVacinas += vacina.getPreco();
        }
        
        relatorio += "Subtotal de Vacinas: R$ " + String.format("%.2f", totalVacinas) + "\n\n";

        relatorio += "--- Detalhamento de Consultas ---\n";
        for (Consulta consulta : animal.getConsultasAnimal()) {
            float precoConsulta = consulta.getVeterinario().getEspecialidade().getPreco();
            relatorio += "Consulta (" + consulta.getVeterinario().getEspecialidade().getNome() + ")" +
                         ": R$ " + String.format("%.2f", precoConsulta) + "\n";
            totalConsultas += precoConsulta;
        }
        relatorio += "Subtotal de Consultas: R$ " + String.format("%.2f", totalConsultas) + "\n\n";

        float totalGeral = totalVacinas + totalConsultas;

        relatorio += "----------------------------------------\n";
        relatorio += "TOTAL GERAL A PAGAR: R$ " + String.format("%.2f", totalGeral) + "\n";
        relatorio += "----------------------------------------\n";

        return relatorio;
    }

public ArrayList<Vacina> vacinasQueVencemEsteMes(Animal animal) {
    // Cria uma nova lista para guardar apenas as vacinas que vencem no mês
    ArrayList<Vacina> vacinasVencendo = new ArrayList<>();

    LocalDate hoje = LocalDate.now();
    int mesAtual = hoje.getMonthValue();
    int anoAtual = hoje.getYear();

    for (Vacina vacina : animal.getCartaoVacina()) {
        LocalDate validade = vacina.getDataValidade();
        // A lógica de verificação está correta
        if (validade.getMonthValue() == mesAtual && validade.getYear() == anoAtual) {
            // Adiciona a vacina encontrada na nossa lista de retorno
            vacinasVencendo.add(vacina);
        }
    }

    // Retorna a lista (pode estar vazia se nenhuma vacina vencer no mês)
    return vacinasVencendo;
}



public String emitirProntuario(Animal animal) {
    ArrayList<Consulta> consultas = animal.getConsultasAnimal();
    String relatorio = "";

    if (consultas.isEmpty()) {
        relatorio = "Nenhuma consulta registrada para " + animal.getNome();
        return relatorio;
    }

    relatorio += "------ Prontuário do Animal: " + animal.getNome() + " ------\n\n";

    DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    for (int i = consultas.size() - 1; i >= 0; i--) {
        Consulta c = consultas.get(i);
        relatorio += "Data: " + c.getData().format(formatadorData) + "\n";
        relatorio += "Veterinário: " + c.getVeterinario().getNome() + "\n";
        relatorio += "Especialidade: " + c.getVeterinario().getEspecialidade().getNome() + "\n";
        relatorio += "Motivo/Problema: " + c.getMotivo() + "\n";
        relatorio += "Diagnóstico: " + c.getDiagnostico() + "\n";
        relatorio += "Medicamentos: " + c.getMedicamentos() + "\n";
        relatorio += "----------------------------------------\n\n";
    }

    return relatorio;
}





    public void addPaciente(Animal animal){
        listaPacientes.add(animal);
    }

    public void addFuncionario(Funcionario funcionario){
        listaFuncionarios.add(funcionario);
    }

    public void addAgenda(Agendamento agendamento){
        this.agendamentos.add(agendamento);
    }

    public void addConsulta(Consulta consulta){
        this.consultas.add(consulta);
    }

    public void addVeterinario(Veterinario veterinario) {
        listaVeterinarios.add(veterinario);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Tutor> getListaTutores() {
        return listaTutores;
    }

    public void setListaTutores(ArrayList<Tutor> listaTutores) {
        this.listaTutores = listaTutores;
    }

    public ArrayList<Animal> getListaAnimais() {
        return listaAnimais;
    }

    public void setListaAnimais(ArrayList<Animal> listaAnimais) {
        this.listaAnimais = listaAnimais;
    }

    public ArrayList<Veterinario> getListaVeterinarios() {
        return listaVeterinarios;
    }

    public void setListaVeterinarios(ArrayList<Veterinario> listaVeterinarios) {
        this.listaVeterinarios = listaVeterinarios;
    }

    public ArrayList<Especialidade> getListaEspecialidades() {
        return listaEspecialidades;
    }

    public void setListaEspecialidades(ArrayList<Especialidade> listaEspecialidades) {
        this.listaEspecialidades = listaEspecialidades;
    }

    public ArrayList<VacinaOferecidas> getListaVacinas() {
        return listaVacinas;
    }

    public void setListaVacinas(ArrayList<VacinaOferecidas> listaVacinas) {
        this.listaVacinas = listaVacinas;
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

    public ArrayList<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    @Override
    public String toString() {
        return "Clinica{" + "nome=" + nome + ", listaTutores=" + listaTutores + ", listaAnimais=" + listaAnimais + ", listaVeterinarios=" + listaVeterinarios + ", listaEspecialidades=" + listaEspecialidades + ", listaVacinas=" + listaVacinas + ", agendamentos=" + agendamentos + ", consultas=" + consultas + ", listaFuncionarios=" + listaFuncionarios + '}';
    }

    
    
    
}
