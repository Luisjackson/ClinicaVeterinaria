
package ClinicaVeterinaria;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VacinaOferecidas {
    
  private String nome;
  private float preco;
  private LocalDate validade;
    
    public VacinaOferecidas(String nome, float preco, LocalDate validade) {
     this.nome = nome;
     this.preco = preco;
     this.validade = validade;
}
    
    public String getNome() {
        return nome;
    }

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
    public LocalDate getValidade() {
        return validade;
    }
    
    public String getValidadeFormatada(LocalDate data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formatter);
    }

    /**
     * @param validade the validade to set
     */
    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }
    
    
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.nome + " (Val: " + this.validade.format(formatter) + ")";
    }
}
