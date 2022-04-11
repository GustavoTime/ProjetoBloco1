package pessoa;

public class Jogador extends Pessoa {

	public Jogador(String nome, String classe) {
		super(nome, classe);

	}
	
	@Override
	public void fala() {
		System.out.println("Oii!");
	}
	
}
