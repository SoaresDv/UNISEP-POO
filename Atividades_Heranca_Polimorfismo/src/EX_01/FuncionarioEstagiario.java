package EX_01;

public class FuncionarioEstagiario extends Funcionario {
	
	public FuncionarioEstagiario(String nome, double salarioBase) {
		super(nome, salarioBase);
		
	}
	
	@Override
	public void calcularSalario() {
    	salarioFinal = salarioBase - (salarioBase * 0.05);
    	System.out.println("\n========== FUNCIONÁRIO Estagiario ==========");
    	System.out.println("Nome: " + nome);
    	System.out.printf("Salário Base: R$ %.2f%n", salarioBase);
    	System.out.printf("Salário Final: R$ %.2f%n", salarioFinal);
    	System.out.println("=====================================");
	}

}