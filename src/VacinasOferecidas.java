
public class VacinasOferecidas {
    
  private String nome;
  private float preco;
  private int validade;
    
    public VacinasOferecidas(String nome, float preco, int validade) {
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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }
    
}
