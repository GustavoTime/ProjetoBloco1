package Menu;

public class MenuFim {
	private int contAcerto;
	private int contErro;
	private String texto;

	public void RespostaDetalhada() {
		System.out.println("Correto");
	}

	public void ContAcertosErros(int lit, int certo) {

		if (lit == certo) {
			this.setContAcerto(this.getContAcerto() + 1);
		} else {
			this.setContErro(this.getContErro() + 1);
		}
		
		System.out.println("contAcertos: " + this.getContAcerto() + "\nContErros: " + this.getContErro());
	}

	// Metodos auxilaires e mutantes
	public int getContAcerto() {
		return contAcerto;
	}

	public void setContAcerto(int contAcerto) {
		this.contAcerto = contAcerto;
	}

	public int getContErro() {
		return contErro;
	}

	public void setContErro(int contErro) {
		this.contErro = contErro;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
