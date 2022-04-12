package pessoa;

public class Pessoa implements PessoaInterface {

	private String nome;
	private String classe;

	public Pessoa(String nome, String classe) {
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

	public void escolher(String nome) {
		if (nome == "Anderson") {
			System.out.println("Voce escolheu o: " + nome);
		} else
			System.out.println("Digite um apresentador valido");
	}

	public void falaCorreta() {
		System.out.println("Fala padrao:");
	}

}
