package pessoa;

public class Pessoa {

	private String nome;
	private String classe;

	public Pessoa(String nome, String classe) {
		super();
		this.nome = nome;
		this.classe = classe;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	
	public void escolherJogador(String nome) {
		if (nome == "Cesar") {
			System.out.println("Você escolheu o: " + nome);
		} else
			System.out.println("Digite um personagem válido");
	}

	public void escolherApresentador(String nome) {
		if (nome == "Anderson") {
			System.out.println("Você escolheu o: " + nome);
		}
		else
			System.out.println("Digite um apresentador válido");

	}

}
