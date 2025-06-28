import java.time.LocalDate;

/**
 *
 * @author Weliton
 */
public interface Util {
 
   //metodo que converte um valor inteiro, que seria uma data nesse caso, em um localDate, que é utilizado em data de Aplicação. 
    //Ele é static devido a necessitar ser expresso que é independente de atributos e pode ser usado sem o construtor existir antes   
    public static LocalDate conversor(int valor){
      
      int ano = valor / 10000;
      int mes = ((valor /100) % 100);
      int dia = valor % 100;
      LocalDate data = LocalDate.of(ano, mes, dia);
      return data;
  }   
    
   float cobrar();
    
}
