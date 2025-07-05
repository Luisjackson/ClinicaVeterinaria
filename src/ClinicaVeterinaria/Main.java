
package ClinicaVeterinaria;

import java.util.ArrayList;

/**
 *
 * @author luis
 */
public class Main {
    public static void main(String[] args) {
        
    Clinica novaClinica = new Clinica("clinica");
    
    
    ArrayList<Animal> animais = new ArrayList<>();
    animais.add(new Animal("Nina", "Poodle", "01/01/2020", null));
    animais.add(new Animal("Max", "Labrador", "02/02/2019", null));
   
    Sistema.listaAnimais.add(new Animal("Nina", "Poodle", "01/01/2020", null));
    Sistema.listaAnimais.add(new Animal("Max", "Labrador", "02/02/2019", null));

        
        
    }
  
}
