

public class Consulta
{
   private Animal animal;
   private Veterinario  veterinario;
   private String motivo;
   private String data;
   private String diagnostico;
   private String medicamentos;
   
    public Consulta(String medicamentos, String diagnostico,String data, String motivo, Animal animal, Veterinario veterinario){
       this.animal = animal;
       this.veterinario = veterinario;
       this.motivo = motivo;
       this.data = data;
       this.diagnostico = diagnostico;
       this.medicamentos = medicamentos;
    }
    public Animal getAnimal() {
    return animal;
}

public void setAnimal(Animal animal) {
    this.animal = animal;
}

public Veterinario getVeterinario() {
    return veterinario;
}

public void setVeterinario(Veterinario veterinario) {
    this.veterinario = veterinario;
}

public String getMotivo() {
    return motivo;
}

public void setMotivo(String motivo) {
    this.motivo = motivo;
}

public String getData() {
    return data;
}

public void setData(String data) {
    this.data = data;
}

public String getDiagnostico() {
    return diagnostico;
}

public void setDiagnostico(String diagnostico) {
    this.diagnostico = diagnostico;
}

public String getMedicamentos() {
    return medicamentos;
}

public void setMedicamentos(String medicamentos) {
    this.medicamentos = medicamentos;
}

    
}
