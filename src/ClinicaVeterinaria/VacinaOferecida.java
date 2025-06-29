/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClinicaVeterinaria;

/**
 *
 * @author Weliton
 */
public class VacinaOferecida {
    
  private String nome;
  private float preco;
  private int validade;
    
    public VacinaOferecida(String nome, float preco, int validade) {
     this.nome = nome;
     this.preco = preco;
     this.validade = validade;
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
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * @return the validade
     */
    public int getValidade() {
        return validade;
    }

    /**
     * @param validade the validade to set
     */
    public void setValidade(int validade) {
        this.validade = validade;
    }
   
}
