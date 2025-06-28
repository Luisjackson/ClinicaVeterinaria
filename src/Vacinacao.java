import java.time.LocalDate;


public class Vacinacao implements Util{
    private VacinasOferecidas vacina;
    private LocalDate dataAplicacao;
    private float preco;

 
    
    public Vacinacao(VacinasOferecidas vacina, int data){
       
        this.vacina = vacina;
        this.dataAplicacao = Util.conversor(data);
        this.preco = vacina.getPreco();
    }
    
 /*   public void setNomeVacina(String nomeVacina){
        this.nomeVacina = nomeVacina;
    }*/

 /*   public void setValidade(int validade){
        this.validade = validade;
    }*/

    public void setDataAplicacao(int dataAplicacao){
        this.dataAplicacao = Util.conversor(dataAplicacao);
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public String getNomeVacina(){
        return this.vacina.getNome();
    }

    public int getValidade(){
        return this.vacina.getValidade();
    }

    public LocalDate getDataAplicacao(){
        return this.dataAplicacao;
    }
    
    public float getPrecoBruto(){
        return this.preco;
    }
    
    public float getPrecoVolatil(){
        return this.vacina.getPreco();
    }
    
    @Override
    public float cobrar(){
        return this.getPrecoBruto();
    }
    
    public void emissaoInfo(){
        
        System.out.println("Nome da Vacina: "+ getNomeVacina() );
        System.out.println("Validade da Vacina: "+ getValidade() + " dias" );
        System.out.println("Data de Aplicação: "+ getDataAplicacao() );
        System.out.println("Valor pago: "+getPrecoBruto());
    }
    
    public LocalDate prazoVacina(){
        return this.dataAplicacao.plusDays(getValidade());
    }
    
}


