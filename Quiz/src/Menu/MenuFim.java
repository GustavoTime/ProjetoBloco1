package Menu;
import Perguntas.*;

public class MenuFim extends Mae{
	
	private String texto;
	private int totalPergunta;
	private Pergunta1a7 jog;
	private int porcentual;


	public void receberPesso(Pergunta1a7 perg) {
			this.jog = perg;
	}

	public void PorcentualAcerto() {
		
		// Soma o numero de perguntas acertadas e erradas para saber o numero de
		// perguntas total
		this.setTotalPergunta(this.jog.getCorreto() + this.jog.getErrada());

		// O porcentual � o numero de perguntas certas * 100 dividido pelo numero de
		// perguntas total
		this.setPorcentual( (this.jog.getCorreto() * 100) / this.getTotalPergunta());
		
		
	}
	
	public void Final() {
		System.out.println("O total de acerto: " + this.jog.getCorreto());
		System.out.println("O total de erros: " + this.jog.getErrada());
		System.out.println("O porcentural de acerto: " + this.getPorcentual());
	}

	// Metodos auxilaires e mutantes
	
	public String getTexto() {
		return texto;
	}

	public Pergunta1a7 getJog() {
		return jog;
	}

	public int getPorcentual() {
		return porcentual;
	}

	public void setPorcentual(int porcentual) {
		this.porcentual = porcentual;
	}

	public void setJog(Pergunta1a7 jog) {
		this.jog = jog;
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
