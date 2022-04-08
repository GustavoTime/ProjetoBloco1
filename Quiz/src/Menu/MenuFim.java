package Menu;

public class MenuFim extends Mae{
	
	private String texto;
	private int totalPergunta;

	public void RespostaDetalhada() {
		System.out.println("Correto");
	}

	// Alterar para receber a resposta do usuario e a lista de resposta certa
	public void ContAcertosErros(int lit, int certo) {

		// Se a resposta for igual ao gabarito add 1 nos acerto
		if (lit == certo) {
			this.setContAcerto(this.getContAcerto() + 1);
			
			//Se não add 1 ao erro 
		} else {
			
			this.setContErro(this.getContErro() + 1);
		}

		System.out.println("contAcertos: " + this.getContAcerto() + "\nContErros: " + this.getContErro());
	}

	public int PorcentualAcerto() {
		int porcent = 0;
		// Soma o numero de perguntas acertadas e erradas para saber o numero de
		// perguntas total
		this.setTotalPergunta(this.getContAcerto() + this.getContErro());

		// O porcentual é o numero de perguntas certas * 100 dividido pelo numero de
		// perguntas total
		porcent = (this.getContAcerto() * 100) / this.getTotalPergunta();

		// Retorna o valor
		return porcent;
	}

	// Metodos auxilaires e mutantes
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getTotalPergunta() {
		return totalPergunta;
	}

	public void setTotalPergunta(int totalPergunta) {
		this.totalPergunta = totalPergunta;
	}

}
