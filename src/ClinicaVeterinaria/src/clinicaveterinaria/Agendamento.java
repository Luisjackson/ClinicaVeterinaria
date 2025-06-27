import java.time.LocalDate;
import java.time.LocalTime;

public class Agendamento {
    private Animal animal;
    private Especialidade especialidade;
    private Agenda agenda; // em vez de LocalDate e LocalTime separados

    public Agendamento(Animal animal, Especialidade especialidade, Agenda agenda) {
        this.animal = animal;
        this.especialidade = especialidade;
        this.agenda = agenda;
    }

    // Getters
    public Animal getAnimal() {
        return animal;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    // Setters
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    @Override
    public String toString() {
        return "Agendamento{" +
                "animal=" + animal +
                ", especialidade=" + especialidade +
                ", agenda=" + agenda +
                '}';
    }
}
