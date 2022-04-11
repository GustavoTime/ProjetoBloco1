package Perguntas;

import pessoa.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pergunta1a7 {
	private int correto = 0;
	private int errada = 0;
	private int r;
	public double receberResposta;
	private Apresentador pessoas;

	public void Pergunta() {
		String[] pergunta = new String[21];

		pergunta[0] = "Qual o menor e o maior pa�s do mundo?";
		pergunta[1] = "Quanto tempo a luz do Sol demora para chegar � Terra?";
		pergunta[2] = "Qual o livro mais vendido no mundo depois da Biblia? ";
		pergunta[3] = "Que cidade brasileira � conhecida por chover todos os dias quase � mesma hora?";
		pergunta[4] = "Qual o tema do famoso discurso Eu Tenho um Sonho, de Martin Luther King?";
		pergunta[5] = "Normalmente, quantos litros de sangue uma pessoa tem? ";
		pergunta[6] = "De onde � a inven��o do chuveiro el�trico? ";
		pergunta[7] = "J�piter e Plutão s�o os correlatos romanos de quais deuses gregos?";
		pergunta[8] = "Quantas p�lpebras t�m uma coruja?";
		pergunta[9] = "Em que parte do corpo humano voc� encontra uma amostra completa do seu DNA?";
		pergunta[10] = "Que tipo de tempestade � um haboob?";
		pergunta[11] = "A famosa frase \" S� sei que nada sei\" foi dita por quem?";
		pergunta[12] = "Quem pintou o teto da Capela Sistina?";
		pergunta[13] = "Qual dos seguintes personagens folcl�ricos usa suas chamas para proteger as florestas brasileiras?";
		pergunta[14] = "Como � a conjuga��o do verbo caber na 1.� pessoa do singular do presente do indicativo?";
		pergunta[15] = "Um homem viu uma toupeira. A toupeira, que tamb�m olhou para ele, viu o que?";
		pergunta[16] = "Nesses pares, ambos s�o mam�feros?";
		pergunta[17] = "Em que ano foi lan�ado o site de v�deos Youtube?";
		pergunta[18] = "Quantos  per�odos tem um jogo de Basquetebol na NBA?";
		pergunta[19] = "Quais dos �rg�os abaixo pertencem ao sistema respirat�rio?";
		pergunta[20] = "Que subst�ncia � absorvida pelas plantas e expirada por todos os seres vivos?";

		String[] respostaA = new String[21];

		respostaA[0] = "1) Vaticano e R�ssia" + "";
		respostaA[1] = "1) 12 minuto" + "";
		respostaA[2] = "1) O Senhor dos An�is" + "";
		respostaA[3] = "1) S�o Paulo" + "";
		respostaA[4] = "1) Igualdade das ra�as" + "";
		respostaA[5] = "1) Tem entre 2 a 4 litros" + "";
		respostaA[6] = "1) Fran�a" + "";
		respostaA[7] = "1) Ares e Hermes" + "";
		respostaA[8] = "1) 3" + "";
		respostaA[9] = "1) Nos ossos" + "";
		respostaA[10] = "1) Tempestade de granizo" + "";
		respostaA[11] = "1) Arist�teles" + "";
		respostaA[12] = "1) Donatello" + "";
		respostaA[13] = "1) Saci-Perer�" + "";
		respostaA[14] = "1) Eu caibo" + "";
		respostaA[15] = "1) O homem que a viu" + "";
		respostaA[16] = "1) Baleia azul e golfinhos" + "";
		respostaA[17] = "1) 2000" + "";
		respostaA[18] = "1) 2 per�odos";
		respostaA[19] = "1) Laringe e traqueia" + "";
		respostaA[20] = "1) O oxig�nio" + "";

		String[] respostaB = new String[21];

		respostaB[0] = "2) Nauru e China" + "";
		respostaB[1] = "2) 1 dia" + "";
		respostaB[2] = "2) Dom Quixote" + "";
		respostaB[3] = "2) Joinville" + "";
		respostaB[4] = "2) Justi�a para os menos favorecidos" + "";
		respostaB[5] = "2) Tem entre 4 a 6 litros" + "";
		respostaB[6] = "2) Inglaterra" + "";
		respostaB[7] = "2) Cronos e Apolo" + "";
		respostaB[8] = "2) 2" + "";
		respostaB[9] = "2) No tecido dos dedos" + "";
		respostaB[10] = "2) Tempestade de areia" + "";
		respostaB[11] = "2) Plat�o" + "";
		respostaB[12] = "2) Michelangelo" + "";
		respostaB[13] = "2) Curupira" + "";
		respostaB[14] = "2) Ele cabe" + "";
		respostaB[15] = "2) A camisa do homem que era vermelha" + "";
		respostaB[16] = "2) Morcegos e galinhas" + "";
		respostaB[17] = "2) 2003" + "";
		respostaB[18] = "2) 3 per�odos.";
		respostaB[19] = "2) Pulm�es e faringe" + "";
		respostaB[20] = "2) O nitrog�nio" + "";

		String[] respostaC = new String[21];

		respostaC[0] = "3) M�naco e Canad�" + "";
		respostaC[1] = "3) 12 horas";
		respostaC[2] = "3) O Pequeno Pr�ncipe" + "";
		respostaC[3] = "3) Bel�m" + "";
		respostaC[4] = "3) Intoler�ncia religiosa";
		respostaC[5] = "3) Tem 10 litros" + "";
		respostaC[6] = "3) Brasil" + "";
		respostaC[7] = "3) Zeus e Hades" + "";
		respostaC[8] = "3) 1";
		respostaC[9] = "3) Nos cabelos";
		respostaC[10] = "3) Tempestade de raios";
		respostaC[11] = "3) S�crates" + "";
		respostaC[12] = "3) Leonardo da Vinci" + "";
		respostaC[13] = "3) Mula sem cabe�a" + "";
		respostaC[14] = "3) Eu cabo";
		respostaC[15] = "3) Um vulto difuso";
		respostaC[16] = "3) Girafas e tartarugas";
		respostaC[17] = "3) 2005";
		respostaC[18] = "3) 6 per�odos";
		respostaC[19] = "3) Es�fago e br�nquios";
		respostaC[20] = "3) o nitrato de s�dio";

		String[] respostaD = new String[21];

		respostaD[0] = "4) Malta e Estados Unidos" + "";
		respostaD[1] = "4) 8 minutos";
		respostaD[2] = "4) Ela, a Feiticeira" + "";
		respostaD[3] = "4) Natal" + "";
		respostaD[4] = "4) Pr�mio Nobel da Paz" + "";
		respostaD[5] = "4) Tem 7 litros" + "";
		respostaD[6] = "4) Austr�lia" + "";
		respostaD[7] = "4) Dion�sio e Dem�ter" + "";
		respostaD[8] = "4) Nenhuma" + "";
		respostaD[9] = "4) No cora��o" + "";
		respostaD[10] = "4) Tempestade de rel�mpagos" + "";
		respostaD[11] = "4) Descartes" + "";
		respostaD[12] = "4) Rafael Sanzio" + "";
		respostaD[13] = "4) Boitat�" + "";
		respostaD[14] = "4) Nenhuma das alternativas acima" + "";
		respostaD[15] = "4) Nenhuma das alternativas acima" + "";
		respostaD[16] = "4) Porcos e pinguins" + "";
		respostaD[17] = "4) 2004" + "";
		respostaD[18] = "4) 4 per�odos" + "";
		respostaD[19] = "4) Tire�ide e hip�fise" + "";
		respostaD[20] = "4) O di�xido de carbono" + "";

		String[] respostaCorr = new String[21];

		// Mesma resposta no metodo RespostaA que no metodo RespostaCerta
		respostaCorr[0] = "1) Vaticano e R�ssia";
		respostaCorr[1] = "4) 8 minutos";
		respostaCorr[2] = "2) Dom Quixote";
		respostaCorr[3] = "3) Belém";
		respostaCorr[4] = "1) Igualdade das ra�as";
		respostaCorr[5] = "2) Tem entre 4 a 6 litros";
		respostaCorr[6] = "3) Brasil";
		respostaCorr[7] = "3) Zeus e Hades";
		respostaCorr[8] = "1) 3";
		respostaCorr[9] = "3) Nos cabelos";
		respostaCorr[10] = "2) Tempestade de areia";
		respostaCorr[11] = "3) S�crates";
		respostaCorr[12] = "2) Michelangelo";
		respostaCorr[13] = "2) Boitat�";
		respostaCorr[14] = "1) Eu caibo";
		respostaCorr[15] = "4) Nenhuma das alternativas acima";
		respostaCorr[16] = "1) Baleia azul e golfinhos";
		respostaCorr[17] = "3) 2005";
		respostaCorr[18] = "4) 4 per�odos";
		respostaCorr[19] = "1) Laringe e traqueia";
		respostaCorr[20] = "4) O di�xido de carbono";

		for (int u = 0; u < pergunta.length; u++) {
			System.out.println(pergunta[u]);
			System.out.println(respostaA[u]);
			System.out.println(respostaB[u]);
			System.out.println(respostaC[u]);
			System.out.println(respostaD[u]);

			Scanner leia = new Scanner(System.in);
			System.out.print("Digite a sua resposta: ");
			this.setR(leia.nextInt());
			if (this.getR() == 1) {
				if (respostaA[u] == respostaCorr[u]) {
					// System.out.println("Esfinderson diz: C�sar, o aventureiro, sua resposta est�
					// correta, parceiro!");
					pessoas.falaCorreta();
					this.setCorreto(this.getCorreto() + 1);

				} else {

					// System.out.println("Esfinderson diz: C�sar, o aventureiro, sua resposta est�
					// errada, parceiro!\n A resposta correta �: "+respostaCorr[u]);

					this.setErrada(getErrada() + 1);
					pessoas.falaErrada();
				}
			}
			if (this.getR() == 2) {
				if (respostaB[u] == respostaCorr[u]) {
					// System.out.println("Esfinderson diz: C�sar, o aventureiro, sua resposta est�
					// correta, parceiro!");
					pessoas.falaCorreta();
					this.setCorreto(this.getCorreto() + 1);

				} else {

					// System.out.println("Esfinderson diz: C�sar, o aventureiro, sua resposta est�
					// errada, parceiro!\n A resposta correta �: "+respostaCorr[u]);

					this.setErrada(getErrada() + 1);
					pessoas.falaErrada();
				}
			}

			if (this.getR() == 3) {
				if (respostaC[u] == respostaCorr[u]) {
					// System.out.println("Esfinderson diz: C�sar, o aventureiro, sua resposta est�
					// correta, parceiro!");
					pessoas.falaCorreta();
					this.setCorreto(this.getCorreto() + 1);

				} else {

					// System.out.println("Esfinderson diz: C�sar, o aventureiro, sua resposta est�
					// errada, parceiro!\n A resposta correta �: "+respostaCorr[u]);

					this.setErrada(getErrada() + 1);
					pessoas.falaErrada();
				}
			}
			if (this.getR() == 4) {
				if (respostaD[u] == respostaCorr[u]) {
					// System.out.println("Esfinderson diz: C�sar, o aventureiro, sua resposta est�
					// correta, parceiro!");
					pessoas.falaCorreta();
					this.setCorreto(this.getCorreto() + 1);

				} else {

					// System.out.println("Esfinderson diz: C�sar, o aventureiro, sua resposta est�
					// errada, parceiro!\n A resposta correta �: "+respostaCorr[u]);

					this.setErrada(getErrada() + 1);
					pessoas.falaErrada();
				}
			}

		}

	}

	public Apresentador getPessoas() {
		return pessoas;
	}

	public void setPessoas(Apresentador pessoas) {
		this.pessoas = pessoas;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getCorreto() {
		return correto;
	}

	public void setCorreto(int correto) {
		this.correto = correto;
	}

	public int getErrada() {
		return errada;
	}

	public void setErrada(int errada) {
		this.errada = errada;
	}

	public double getReceberResposta() {
		return receberResposta;
	}

	public void setReceberResposta(double receberResposta) {
		this.receberResposta = receberResposta;
	}

}
