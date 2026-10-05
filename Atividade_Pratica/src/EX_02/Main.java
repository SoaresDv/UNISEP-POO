package EX_02;

public class Main {

	public static void main(String[] args) {

		Pais brasil = new Pais("BRA", "Brasil", 8515767.049, 0);
		Pais mexico = new Pais("MEX", "Mexico", 8515767.049, 0);
		Pais paraguai = new Pais("PY", "Paraguai", 8515767.049, 0);
		
		brasil.getNome();
		brasil.setNome("Brasil Brasileiro");
		brasil.setPopulacao(999);
		
		
		brasil.listarPais();
		mexico.listarPais();
		paraguai.listarPais();



	}

}
