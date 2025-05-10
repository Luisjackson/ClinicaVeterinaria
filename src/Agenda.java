public class Agenda{
    private String data, horario;

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