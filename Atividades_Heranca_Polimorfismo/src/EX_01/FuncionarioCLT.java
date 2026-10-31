package EX_01;

public class FuncionarioCLT extends Funcionario {
	
	public FuncionarioCLT(String nome, double salarioBase) {
		super(nome, salarioBase);
		
	}
	
	@Override
	public void calcularSalario() {
    	salarioFinal = salarioBase - (salarioBase * 0.08);
    	System.out.println("\n========== FUNCIONÁRIO CLT ==========");
    	System.out.println("Nome: " + nome);
    	System.out.printf("Salário Base: R$ %.2f%n", salarioBase);
    	System.out.printf("Salário Final: R$ %.2f%n", salarioFinal);
    	System.out.println("=====================================");
	}
}