import java.util.ArrayList;

public class Agenda{
    private String data, horario;
    private ArrayList<Consulta> consultas;

    public Agenda(String data, String horario){
        this.data = data;
        this.horario = horario;
    }

    public void setData(String data){
        this.data = data;
    }

    public void setHorario(String horario){
        this.horario = horario;
    }

    public String getData(){
        return this.data;
    }

    public String getHorario(){
        return this.horario;
    }

}
///Para ser atendido o animal pode ou não marcar uma consulta. Em caso de marcação a clínica
/// tem uma agenda que atende um animal a cada 20 minutos (de 8:00 as 12:00 e de 14:00 as
/// 18:00). A marcação é feita para o animal em uma especialidade e em uma data e hora
/// específica. Não é indicado o médico, qualquer médico disponível faz o atendimento.
