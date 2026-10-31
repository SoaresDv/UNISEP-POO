package EX_01;

public class Main {
    public static void main(String[] args) {

        FuncionarioCLT FuncionarioCLT = new FuncionarioCLT("Paulo", 2000);
        FuncionarioCLT.calcularSalario();
        FuncionarioPJ FuncionarioPJ = new FuncionarioPJ("Chaylon", 8000);
        FuncionarioPJ.calcularSalario();
        FuncionarioEstagiario FuncionarioEstagiario = new FuncionarioEstagiario("Camila", 800);
        FuncionarioEstagiario.calcularSalario();
    }
}

