
public class Agenda{
    private int horario;
    private String data;

    public Agenda(String data){
        this.data = data;
	this.horario = -1;
    }

    public void setData(String data){
        this.data = data;
    }

    public boolean setHorario(int horario){
  if ((horario  >=  800 &&  horario <= 1200) || (horario >=1400 && horario <= 1800)) {

int total = somarMinutos(horario, 20);

	if( (total < 1200) || (total < 1800)) {
	this.horario = horario;
	return true;
	}
	
	System.out.println("horário excede o expediente!");
	return false;
	

    }

	System.out.println("horário incompatível com o expediente!");
	return false;
    }

    public String getData(){
        return this.data;
    }

    public int getHorario(){
        return this.horario;
    }
    
    private int somarMinutos(int hhmm, int minutos) {
        int horas = hhmm / 100;
        int mins = hhmm % 100;

        mins += minutos;
        horas += mins / 60;
        mins = mins % 60;

        return horas * 100 + mins;
    }
    
   public String getStringHorario(){
      
       String horas = String.format("%02d", horario / 100);
       String minutos = String.format("%02d", horario % 100);
       
       String resultado = horas + "h " + minutos + "m";
       
       return resultado;
   }

} 
