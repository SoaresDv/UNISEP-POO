package EX_01;

public class Contador {
	private int cont = 0;

	public void Zerar() {
		this.cont = 0;
	}

	public void Incrementar() {
		// this.cont = this.cont + 1;
		this.cont++;
	}

	public int Retornar() {
		return this.cont;
	}

}