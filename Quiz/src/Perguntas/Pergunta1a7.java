package Perguntas;

import pessoa.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pergunta1a7 {
	private int correto = 0;
	private int errada = 0;
	private int r;
	public double receberResposta;
	private Apresentador pessoas;
	Scanner leia = new Scanner(System.in);

	public void recebePessoa(Apresentador p1) {
		this.pessoas = p1;
	}

	public void Pergunta() {
		String[] pergunta = new String[21];

		pergunta[0] = "Qual o menor e o maior pais do mundo?";
		pergunta[1] = "Quanto tempo a luz do Sol demora para chegar a Terra?";
		pergunta[2] = "Qual o livro mais vendido no mundo depois da Biblia? ";
		pergunta[3] = "Que cidade brasileira e conhecida por chover todos os dias quase a mesma hora?";
		pergunta[4] = "Qual o tema do famoso discurso 'Eu Tenho um Sonho', de Martin Luther King?";
		pergunta[5] = "Normalmente, quantos litros de sangue uma pessoa tem? ";
		pergunta[6] = "De onde e a invencao do chuveiro eletrico? ";
		pergunta[7] = "Jupiter e Plutao sao os correlatos romanos de quais deuses gregos?";
		pergunta[8] = "Quantas palpebras tem uma coruja?";
		pergunta[9] = "Em que parte do corpo humano voce encontra uma amostra completa do seu DNA?";
		pergunta[10] = "Que tipo de tempestade e um haboob?";
		pergunta[11] = "A famosa frase 'so sei que nada sei' foi dita por quem?";
		pergunta[12] = "Quem pintou o teto da Capela Sistina?";
		pergunta[13] = "Qual dos seguintes personagens folcloricos usa suas chamas para proteger as florestas brasileiras?";
		pergunta[14] = "Como e a conjugacao do verbo caber na 1.º pessoa do singular do presente do indicativo?";
		pergunta[15] = "Um homem viu uma toupeira. A toupeira, que tambem olhou para ele, viu o que?";
		pergunta[16] = "Nesses pares, ambos sao mamiferos?";
		pergunta[17] = "Em que ano foi lancado o site de videos 'Youtube'?";
		pergunta[18] = "Quantos  periodos tem um jogo de Basquetebol na NBA?";
		pergunta[19] = "Quais dos orgaos abaixo pertencem ao sistema respiratorio?";
		pergunta[20] = "Que substancia e absorvida pelas plantas e expirada por todos os seres vivos?";

		String[] respostaA = new String[21];

		respostaA[0] = "1- Vaticano e Russia";
		respostaA[1] = "1- 12 minutos";
		respostaA[2] = "1- O Senhor dos Aneis";
		respostaA[3] = "1- Sao Paulo";
		respostaA[4] = "1- Igualdade das racas";
		respostaA[5] = "1- Tem entre 2 a 4 litros";
		respostaA[6] = "1- Franca";
		respostaA[7] = "1- Ares e Hermes";
		respostaA[8] = "1- 3";
		respostaA[9] = "1- Nos ossos";
		respostaA[10] = "1- Tempestade de granizo";
		respostaA[11] = "1- Aristoteles";
		respostaA[12] = "1- Donatello";
		respostaA[13] = "1- Saci-Perere";
		respostaA[14] = "1- Eu caibo";
		respostaA[15] = "1- O homem que a viu";
		respostaA[16] = "1- Baleia azul e golfinhos";
		respostaA[17] = "1- 2000";
		respostaA[18] = "1- 2 periodos";
		respostaA[19] = "1- Laringe e traqueia";
		respostaA[20] = "1- O oxigenio";

		String[] respostaB = new String[21];

		respostaB[0] = "2- Nauru e China";
		respostaB[1] = "2- 1 dia";
		respostaB[2] = "2- Dom Quixote";
		respostaB[3] = "2- Joinville";
		respostaB[4] = "2- Justica para os menos favorecidos";
		respostaB[5] = "2- Tem entre 4 a 6 litros";
		respostaB[6] = "2- Inglaterra";
		respostaB[7] = "2- Cronos e Apolo";
		respostaB[8] = "2- 2";
		respostaB[9] = "2- No tecido dos dedos";
		respostaB[10] = "2- Tempestade de areia";
		respostaB[11] = "2- Platao";
		respostaB[12] = "2- Michelangelo";
		respostaB[13] = "2- Curupira";
		respostaB[14] = "2- Ele cabe";
		respostaB[15] = "2- A camisa do homem que era vermelha";
		respostaB[16] = "2- Morcegos e galinhas";
		respostaB[17] = "2- 2003";
		respostaB[18] = "2- 3 periodos";
		respostaB[19] = "2- Pulmoes e faringe";
		respostaB[20] = "2- O nitrogenio";

		String[] respostaC = new String[21];

		respostaC[0] = "3- Monaco e Canada";
		respostaC[1] = "3- 12 horas";
		respostaC[2] = "3- O Pequeno Principe";
		respostaC[3] = "3- Belem";
		respostaC[4] = "3- Intolerancia religiosa";
		respostaC[5] = "3- Tem 10 litros";
		respostaC[6] = "3- Brasil";
		respostaC[7] = "3- Zeus e Hades";
		respostaC[8] = "3- 1";
		respostaC[9] = "3- Nos cabelos";
		respostaC[10] = "3- Tempestade de raios";
		respostaC[11] = "3- Socrates";
		respostaC[12] = "3- Leonardo da Vinci";
		respostaC[13] = "3- Mula sem cabeca";
		respostaC[14] = "3- Eu cabo";
		respostaC[15] = "3- Um vulto difuso";
		respostaC[16] = "3- Girafas e tartarugas";
		respostaC[17] = "3- 2005";
		respostaC[18] = "3- 6 periodos";
		respostaC[19] = "3- Esofago e branquios";
		respostaC[20] = "3- O nitrato de sodio";

		String[] respostaD = new String[21];

		respostaD[0] = "4- Malta e Estados Unidos";
		respostaD[1] = "4- 8 minutos";
		respostaD[2] = "4- Ela, a Feiticeira";
		respostaD[3] = "4- Natal";
		respostaD[4] = "4- Premio Nobel da Paz";
		respostaD[5] = "4- Tem 7 litros";
		respostaD[6] = "4- Australia";
		respostaD[7] = "4- Dionisio e Demeter";
		respostaD[8] = "4- Nenhuma";
		respostaD[9] = "4- No coracao";
		respostaD[10] = "4- Tempestade de relampagos";
		respostaD[11] = "4- Descartes";
		respostaD[12] = "4- Rafael Sanzio";
		respostaD[13] = "4- Boitata";
		respostaD[14] = "4- Nenhuma das alternativas acima";
		respostaD[15] = "4- Nenhuma das alternativas acima";
		respostaD[16] = "4- Porcos e pinguins";
		respostaD[17] = "4- 2004";
		respostaD[18] = "4- 4 periodos";
		respostaD[19] = "4- Tireoide e hipofise";
		respostaD[20] = "4- O dioxido de carbono";

		String[] respostaCorr = new String[21];

		// Mesma resposta no metodo RespostaA que no metodo RespostaCerta

		respostaCorr[0] = "1- Vaticano e Russia";
		respostaCorr[1] = "4- 8 minutos";
		respostaCorr[2] = "2- Dom Quixote";
		respostaCorr[3] = "3- Belem";
		respostaCorr[4] = "1- Igualdade das racas";
		respostaCorr[5] = "2- Tem entre 4 a 6 litros";
		respostaCorr[6] = "3- Brasil";
		respostaCorr[7] = "3- Zeus e Hades";
		respostaCorr[8] = "1- 3";
		respostaCorr[9] = "3- Nos cabelos";
		respostaCorr[10] = "2- Tempestade de areia";
		respostaCorr[11] = "3- Socrates";
		respostaCorr[12] = "2- Michelangelo";
		respostaCorr[13] = "2- Boitata";
		respostaCorr[14] = "1- Eu caibo";
		respostaCorr[15] = "4- Nenhuma das alternativas acima";
		respostaCorr[16] = "1- Baleia azul e golfinhos";
		respostaCorr[17] = "3- 2005";
		respostaCorr[18] = "4- 4 periodos";
		respostaCorr[19] = "1- Laringe e traqueia";
		respostaCorr[20] = "4- O dioxido de carbono";
		
			for (int u = 0; u < pergunta.length; u++) {
			
				System.out.println((u + 1) + " de " + pergunta.length);
				System.out.println(pergunta[u] + "    Quantidades de acertos: " + this.getCorreto());
				System.out.println(respostaA[u]);
				System.out.println(respostaB[u]);
				System.out.println(respostaC[u]);
				System.out.println(respostaD[u]);

				System.out.print("Digite a sua resposta: ");
		
				this.setR(leia.nextInt());
			
				if (this.getR() == 1) {
					if (respostaA[u] == respostaCorr[u]) {
						this.pessoas.falaCorreta();
						this.setCorreto(this.getCorreto() + 1);
						System.out.println("");
						System.out.println("_____________________________________");

					} else {
						this.pessoas.falaErrada();
						System.out.println("");
						System.out.println("A resposta certa e: " + respostaCorr[u]);
						System.out.println("_____________________________________");
						this.setErrada(this.getErrada() + 1);
					}
				}

				if (this.getR() == 2) {
					if (respostaB[u] == respostaCorr[u]) {
						this.pessoas.falaCorreta();
						this.setCorreto(this.getCorreto() + 1);
						System.out.println("");
						System.out.println("_____________________________________");
					} 
					
					else {
						this.pessoas.falaErrada();
						System.out.println("A resposta certa e: " + respostaCorr[u]);
						System.out.println("");
						System.out.println("_____________________________________");
						this.setErrada(this.getErrada() + 1);
					}
				}

				if (this.getR() == 3) {
					if (respostaC[u] == respostaCorr[u]) {
						this.pessoas.falaCorreta();
						this.setCorreto(this.getCorreto() + 1);
						System.out.println("");
						System.out.println("_____________________________________");
					} else {
						this.pessoas.falaErrada();
						System.out.println("A resposta certa e: " + respostaCorr[u]);
						System.out.println("");
						System.out.println("_____________________________________");
						this.setErrada(this.getErrada() + 1);
					}
				}

				if (this.getR() == 4) {
					if (respostaD[u] == respostaCorr[u]) {
						this.pessoas.falaCorreta();
						this.setCorreto(this.getCorreto() + 1);
						System.out.println("_____________________________________");
					} else {
						this.pessoas.falaErrada();
						System.out.println("A resposta certa e: " + respostaCorr[u]);
						System.out.println("_____________________________________");
						this.setErrada(this.getErrada() + 1);
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
