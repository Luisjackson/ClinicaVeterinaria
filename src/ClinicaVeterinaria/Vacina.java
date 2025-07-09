package ClinicaVeterinaria;


import java.time.LocalDate;

public class Vacina{

    private VacinaOferecidas vacina;
    private String nomeVacina;
    private LocalDate dataAplicacao;
    private LocalDate dataValidade;
    private float preco;

    public Vacina(LocalDate dataAplicacao, VacinaOferecidas vacina){
        this.nomeVacina = vacina.getNome();
        this.dataValidade = vacina.getValidade();
        this.dataAplicacao = dataAplicacao;
        this.preco = vacina.getPreco();
    }
    
    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Vacina{" +
                "nomeVacina='" + nomeVacina + '\'' +
                ", dataAplicacao=" + dataAplicacao +
                ", dataValidade=" + dataValidade +
                ", preco=" + preco +
                '}';
    }
    
        public float cobrar(){
        return this.getPreco();
    }
}