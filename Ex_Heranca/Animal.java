public class Animal {
    private String Nome;
    private int Idade;

    public Animal(String Nome, int Idade) {
        this.Nome = Nome;
        this.Idade = Idade;
    }

    public void listarAnimal() {
        System.out.println("Nome: " + this.Nome);
        System.out.println("Idade: " + this.Idade);
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
}