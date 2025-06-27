import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {
    private LocalDate data;
    private LocalTime horario;

    public Agenda(LocalDate data, LocalTime horario) {
        this.data = data;
        this.horario = horario;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public boolean isHorarioPermitido() {
        int hora = horario.getHour();
        int minuto = horario.getMinute();

        //Se estiver dentro do horario permitido retorna true, se não retorna falso
        return ((hora >= 8 && hora < 12) || (hora >= 14 && hora < 18)) &&
                (minuto == 0 || minuto == 20 || minuto == 40);
    }

    @Override
    public String toString() {
        return data.toString() + " às " + horario.toString();
    }
}
