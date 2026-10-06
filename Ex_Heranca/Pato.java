public class Pato extends Animal {
    private String Raca;

    public Pato(String Nome, int Idade, String Raca) {
        super(Nome, Idade);
        this.Raca = Raca;
    }

    public void listarPato() {
        super.listarAnimal();
        System.out.println("Raça: " + this.Raca);
    }

    public void grasnar() {
        System.out.println(this.getNome() + " o pato esta gritando: Qua Qua!");
    }
}