import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda{
    private LocalDate data, horario;

    public Agenda(LocalDate data, LocalDate horario) {
        this.data = data;
        this.horario = horario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getHorario() {
        return horario;
    }

    public void setHorario(LocalDate horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "data=" + data +
                ", horario=" + horario +
                '}';
    }
}
