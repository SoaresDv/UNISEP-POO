public class Main {
    public static void main(String[] args) {
        Pato Pato = new Pato("Donalt",  3, "Marreco");

        Pato.listarPato();
        Pato.grasnar();

        Pato.setNome("Marreco");
        System.out.println("Novo nome: " + Pato.getNome());
    }
}