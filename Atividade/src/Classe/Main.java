package Classe;

public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro(
                "Civic",
                "Preto",
                "Honda",
                2020,
                150,
                "Dianteira",
                "ABC1234",
                50000,
                "Automatico",
                1300
        );

        carro1.listarCarro();
        carro1.ligar();
        carro1.acelerar();
        carro1.frear();
        carro1.desligar();
    }
}