import java.time.LocalDate;

public class Vacina{
    private String nomeVacina;
    private LocalDate dataAplicacao;
    private LocalDate dataValidade;
    private float preco;

    public Vacina(String nomeVacina, LocalDate dataValidade, LocalDate dataAplicacao, float preco){
        this.nomeVacina = nomeVacina;
        this.dataValidade = dataValidade;
        this.dataAplicacao = dataAplicacao;
        this.preco = preco;
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
}