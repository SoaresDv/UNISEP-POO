package EX_01;

public class FuncionarioPJ extends Funcionario {
	
	public FuncionarioPJ(String nome, double salarioBase) {
		super(nome, salarioBase);
		
	}
	
	@Override
	public void calcularSalario() {
    	salarioFinal = salarioBase + (salarioBase * 0.15);
    	System.out.println("\n========== FUNCIONÁRIO PJ ==========");
    	System.out.println("Nome: " + nome);
    	System.out.printf("Salário Base: R$ %.2f%n", salarioBase);
    	System.out.printf("Salário Final: R$ %.2f%n", salarioFinal);
    	System.out.println("=====================================");
	}

}