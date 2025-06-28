/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria;

import java.util.ArrayList;

public class Clinica
{
private String nome;
private ArrayList<Animal> pacientes;
private ArrayList<Funcionario> funcionarios;
private ArrayList<Agenda> agendas;
private ArrayList<Consulta> consultas;
private ArrayList<VacinasOferecidas> vacinas;

    public Clinica(String nome) {
        this.nome = nome;
        this.pacientes = new ArrayList();
        this.funcionarios = new ArrayList();
        this.agendas = new ArrayList();
        this.consultas = new ArrayList();
        this.vacinas = new ArrayList();
    }
    



public void removerAgenda(Agenda agenda){
    this.agendas.remove(agenda);
}

public void consultarConsulta(Consulta consulta){ 
    consulta.getDados(); 
}

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the pacientes
     */
    public ArrayList<Animal> getPacientes() {
        return pacientes;
    }

    /**
     * @param pacientes the pacientes to set
     */
    public void setPacientes(Animal pacientes) {
        this.pacientes.add(pacientes);
    }

    /**
     * @return the funcionarios
     */
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    /**
     * @param funcionarios the funcionarios to set
     */
    public void setFuncionarios(Funcionario funcionarios) {
        this.funcionarios.add(funcionarios);
    }

    /**
     * @return the agendas
     */
    public ArrayList<Agenda> getAgendas() {
        return agendas;
    }

    /**
     * @param agendas the agendas to set
     */
    public void setAgendas(Agenda agendas) {
        this.agendas.add(agendas);
    }

    /**
     * @return the consultas
     */
    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    /**
     * @param consultas the consultas to set
     */
    public void setConsultas(Consulta consultas) {
        this.consultas.add(consultas);
    }

    /**
     * @return the vacinas
     */
    public ArrayList<VacinasOferecidas> getVacinas() {
        return vacinas;
    }

    /**
     * @param vacinas the vacinas to set
     */
    public void setVacinas(VacinasOferecidas vacinas) {
        this.vacinas.add(vacinas);
    }
    
    
   public float cobrar(Consulta consulta){
        float valor = consulta.cobrar(); 
        
        System.out.println("O valor a ser pago pela consulta é : "+ valor);
        
        return valor;
   }
    
   public float cobrar(Vacinacao vacina){
       float valor = vacina.cobrar();
       
       System.out.println("O valor a ser pago pela vacinação é : "+ valor);
       
       return valor;
   }
   
   
   //metodo do mais antigo ao mais novo
   public void prontPacienteDecrescente(Animal animal){   
       System.out.println("Prontuário Animal");
       System.out.println("");
       animal.emitirDados();
       System.out.println("");
       
       for(Consulta consulta : consultas){
           
           if(consulta.getAnimal().equals(animal)){
               consulta.getDados();
           }
           
       }
   }
   
   //metodo do mais novo ao mais antigo
      public void prontuarioPaciente(Animal animal){
       System.out.println("Prontuário Animal");
       System.out.println("");
       animal.emitirDados();
       System.out.println("");
       
       for(int i = consultas.size(); i >=0; i--){
           
           if(consultas.get(i).getAnimal().equals(animal)){
               consultas.get(i).getDados();
           }
           
       }
   }
  
// com data ele informa baseado naquela determinada data
   public void   verificarVacina(Animal animal, int data){
       
       animal.consultarVencimento(data);
       
   } 
   
// sem data informada ele vai pegar a data do dia atual
      public void  verificarVacina(Animal animal){
       
       animal.ConsultaVencimento();     
   }   
}
