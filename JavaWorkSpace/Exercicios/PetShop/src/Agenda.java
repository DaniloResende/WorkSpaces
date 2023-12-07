import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {
    // private Animal animal; 
    // MELHORIA A FAZER! E DUVIDA sobre como conectar o que o usuario digitou a classe 
    // private Servico servico;
    private String animal;
    private String servico;
    private LocalDate data;
    private LocalTime horario;

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public void agendar(String servico, String animal, LocalDate data, LocalTime horario){
        setAnimal(animal);
        setServico(servico);
        setData(data);
        setHorario(horario);
        System.out.printf("Serviço de: %s agendado com sucesso para o animal: %s, no dia: %s e no horario: %s ",
         getServico(), getAnimal(), getData(), getHorario());
    }

    // public void agendar(Animal animal, Servico servico, LocalDate data, LocalDate horario)
    
    //TESTE
    // public static void main(String[] args) {
    //     Agenda agenda = new Agenda();
    //     agenda.agendar("Banho", "rex",  LocalDate.of(2022, 05, 06) , LocalTime.of(14, 30));
    // }
}
