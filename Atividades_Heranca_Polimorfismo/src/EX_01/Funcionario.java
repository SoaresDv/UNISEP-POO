package EX_01;

public class Funcionario {

	 String nome ;
	 double salarioBase = 0 ;
	 double salarioFinal = 0;
	
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
}
    public void calcularSalario() {
    	System.out.println("Calcular salario base");
    			
    }
}