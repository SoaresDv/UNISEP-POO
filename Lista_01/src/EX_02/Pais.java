package EX_02;

public class Carro {

    private String Modelo;
    private String Cor;
    private String Marca;
    private int Ano;
    private float Potencia;
    private String Tracao;
    private String Placa;
    private int quilometragem;
    private String Tipo_Cambio;
    private int Peso;

    public Carro(String Modelo, String Cor, String Marca, int Ano,
                 float Potencia, String Tracao, String Placa,
                 int quilometragem, String Tipo_Cambio, int Peso) {

        this.Modelo = Modelo;
        this.Cor = Cor;
        this.Marca = Marca;
        this.Ano = Ano;
        this.Potencia = Potencia;
        this.Tracao = Tracao;
        this.Placa = Placa;
        this.quilometragem = quilometragem;
        this.Tipo_Cambio = Tipo_Cambio;
        this.Peso = Peso;
    }

    public void listarCarro() {
        System.out.println("Modelo: " + this.Modelo);
        System.out.println("Cor: " + this.Cor);
        System.out.println("Marca: " + this.Marca);
        System.out.println("Ano: " + this.Ano);
        System.out.println("Potencia: " + this.Potencia);
        System.out.println("Tracao: " + this.Tracao);
        System.out.println("Placa: " + this.Placa);
        System.out.println("Quilometragem: " + this.quilometragem);
        System.out.println("Tipo Cambio: " + this.Tipo_Cambio);
        System.out.println("Peso: " + this.Peso);
    }

    public void ligar() {
        System.out.println("O carro foi ligado.");
    }

    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    public void frear() {
        System.out.println("O carro está freando.");
    }

    public void desligar() {
        System.out.println("O carro foi desligado.");
    }

    public String getModelo() {
        return this.Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getCor() {
        return this.Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }
}