public class Vacina{
    private String nomeVacina, validade, dataAplicacao;
    private float preco;

    public Vacina(String nomeVacina, String validade, String dataAplicacao, float preco){
        this.nomeVacina = nomeVacina;
        this.validade = validade;
        this.dataAplicacao = dataAplicacao;
        this.preco = preco;
    }

    public void setNomeVacina(String nomeVacina){
        this.nomeVacina = nomeVacina;
    }

    public void setValidade(String validade){
        this.validade = validade;
    }

    public void setDataAplicacao(String dataAplicacao){
        this.dataAplicacao = dataAplicacao;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public String getNomeVacina(){
        return this.nomeVacina;
    }

    public String getValidade(){
        return this.validade;
    }

    public String getDataAplicacao(){
        return this.dataAplicacao;
    }
    
    public float getPreco(){
        return this.preco;
    }
}