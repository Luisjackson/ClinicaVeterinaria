
package com.mycompany.clinicaveterinaria;

import java.time.LocalDate;
import java.util.ArrayList;

public class Animal{
    private String nome, raca, dataNascimento;
    private Tutor tutor;
    private ArrayList<Vacinacao> vacinas;
    private ArrayList<Consulta> consultas;
    
    public Animal(String nome, String raca, String dataNascimento, Tutor tutor){
        this.nome = nome;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.tutor = tutor;
        this.vacinas = new ArrayList<Vacinacao>();
        this.consultas = new ArrayList<Consulta>();
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public void setTutor(Tutor tutor){
        this.tutor = tutor;
    }

    public String getNome(){
        return this.nome;
    }

    public String getRaca(){
        return this.raca;
    }

    public String getDataNascimento(){
        return this.dataNascimento;
    }

    public Tutor getTutor(){
        return this.tutor;
    }

    public ArrayList<Vacinacao> getVacinas() {
        return vacinas;
    }

    public void setVacinas(Vacinacao vacina) {
        this.vacinas.add(vacina);
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(Consulta consulta) {
        this.consultas.add(consulta);
    }
    
    public void consultarVacina(Vacinacao val){ 
    val.emissaoInfo(); 
}
    
 
    public void emitirDados(){
            System.out.println("Nome: "+ this.nome);
            System.out.println("Raça: "+ this.raca);
            System.out.println("Data de Nascimento: "+ this.dataNascimento);
            System.out.println("Tutor; "+ this.tutor);
        }
 
    
    public void emitirCartaoVacina(){
        
        System.out.println("Cartão de Vacina");
        for(Vacinacao va : vacinas){
            va.emissaoInfo();
            
        }
        
    }
// sem data informada ele vai pegar a data do dia atual
    public void ConsultaVencimento(){
           LocalDate atual = LocalDate.now();
       
        LocalDate estimado;
        
         System.out.println("Vacinas que estão para vencer a validade este mês: ");
         System.out.println(" ");
        for(Vacinacao val : vacinas){
            estimado = val.prazoVacina();
            if((estimado.getYear() == atual.getYear()) && (estimado.getMonth() == atual.getMonth() )) { 
                
                System.out.println("Nome: "+ val.getNomeVacina());
                System.out.println("Data de Vencimento: "+ estimado);
                
            }
            
        }
        
    }
    
// com data ele informa baseado naquela determinada data
    public void consultarVencimento(int data){
        LocalDate atual = Util.conversor(data);
       
        LocalDate estimado;
        
         System.out.println("Vacinas que estão para vencer a validade este mês: ");
         System.out.println(" ");
        for(Vacinacao val : vacinas){
            estimado = val.prazoVacina();
            if((estimado.getYear() == atual.getYear()) && (estimado.getMonth() == atual.getMonth() )) { 
                
                System.out.println("Nome: "+ val.getNomeVacina());
                System.out.println("Data de Vencimento: "+ estimado);
                
            }
            
        }
        
    }
    
}
