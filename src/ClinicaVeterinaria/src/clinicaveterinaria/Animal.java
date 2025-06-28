import java.time.LocalDate;
import java.util.ArrayList;

public class Animal{
    private String nome, raca, dataNascimento;
    private Tutor tutor;
    private ArrayList<Vacina> cartaoVacina;
    private ArrayList<Consulta> consultasAnimal;

    public Animal(String nome, String raca, String dataNascimento, Tutor tutor){
        this.nome = nome;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.tutor = tutor;
        this.cartaoVacina = new ArrayList<Vacina>();
        this.consultasAnimal = new ArrayList<Consulta>();
    }


    public void adicionarVacina(Vacina vacina){
        cartaoVacina.add(vacina);
    }

    public void adicionarConsulta(Consulta consulta){
        consultasAnimal.add(consulta);
    }

    public void imprimirCartao(){
        for(Vacina vac:cartaoVacina){
            System.out.println(vac);
        }
    }

    public void vacinasQueVencem() {
        LocalDate agora = LocalDate.now();
        int mesAtual = agora.getMonthValue();
        int anoAtual = agora.getYear();

        boolean encontrou = false;

        for (Vacina vac : cartaoVacina) {
            if (vac.getDataValidade().getMonthValue() == mesAtual &&
                    vac.getDataValidade().getYear() == anoAtual) {
                System.out.println("Vacina: " + vac.getNomeVacina() +
                        " | Data de Vencimento: " + vac.getDataValidade());
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhuma vacina vence neste mês.");
        }
    }

    //Caso eu queria dizer o mes
    public void vacinasQueVencem(int mes, int ano) {
        boolean encontrou = false;
        for (Vacina vac : cartaoVacina) {
            if (vac.getDataValidade().getMonthValue() == mes && vac.getDataValidade().getYear() == ano) {
                System.out.println("Vacina: " + vac.getNomeVacina() + " Data de Vencimento: " + vac.getDataValidade());
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhuma vacina vence em " + mes + "/" + ano + ".");
        }
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

    public ArrayList<Vacina> getCartaoVacina() {
        return cartaoVacina;
    }

    public void setCartaoVacina(ArrayList<Vacina> cartaoVacina) {
        this.cartaoVacina = cartaoVacina;
    }

    public ArrayList<Consulta> getConsultasAnimal() {
        return consultasAnimal;
    }

    public void setConsultasAnimal(ArrayList<Consulta> consultasAnimal) {
        this.consultasAnimal = consultasAnimal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", tutor=" + tutor +
                ", cartaoVacina=" + cartaoVacina +
                ", consultasAnimal=" + consultasAnimal +
                '}';
    }
}
