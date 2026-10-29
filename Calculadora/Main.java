package Calculadora;

public class Main {
    public static void main(String[] args) {

        Soma soma = new Soma(64, 2);
        Subtracao subtracao = new Subtracao(10, 8);
        Multiplicacao multiplicacao = new Multiplicacao(7, 2);
        Divisao divisao = new Divisao(8, 4);

        System.out.println("Soma: " + soma.Calcular());
        System.out.println("Subtracao: " + subtracao.Calcular());
        System.out.println("Multiplicacao: " + multiplicacao.Calcular());
        System.out.println("Divisao: " + divisao.Calcular());
    }
}
