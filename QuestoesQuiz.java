package QuestoesQuiz;

import java.util.Scanner;

public class QuestoesQuiz {

	public static void main(String[] args) {
		
		
		public void Pergunta() {
			
			String [] pergunta = new String[3];
				
				pergunta[14] = "Como é a conjugação do verbo caber na 1.ª pessoa do singular do presente do indicativo?";
				pergunta[15] = "Um homem viu uma toupeira. A toupeira, que também olhou para ele, viu o que?";
				pergunta[16] = "Nesses pares, ambos são mamíferos:";
				pergunta[17] = "Em que ano foi lançado o site de vídeos Youtube?";
				pergunta[18] = "Quantos  períodos tem um jogo de Basquetebol na NBA?";
				pergunta[19] = "Quais dos órgãos abaixo pertencem ao sistema respiratório?";
				pergunta[20] = "Que substância é absorvida pelas plantas e expirada por todos os seres vivos?";
				
			}
		
			public void RespostaA() {
				
				String [] respostaA = new String[3];
				
				respostaA[14] = "a) Eu caibo.";
				respostaA[15] = "a) O homem que a viu.";
				respostaA[16] = "a) Baleia azul e golfinhos.";
				respostaA[17] = "a) 2000.";
				respostaA[18] = "a) 2 períodos.";
				respostaA[19] = "a) Laringe e traqueia.";
				respostaA[20] = "a) O oxigênio.";
		        }
			
			public void RespostaB() {
				
				String [] respostaB = new String[3];
				
				respostaB[14] = "b) Ele cabe.";
				respostaB[15] = "b) A camisa do homem que era vermelha.";
				respostaB[16] = "b) Morcegos e galinhas.";
				respostaB[17] = "b) 2003.";
				respostaB[18] = "b) 3 períodos.";
				respostaB[19] = "b) Pulmões e faringe.";
				respostaB[20] = "b) O nitrogênio.";
			    }
			
			public void RespostaC( ) {
				
				String [] respostaC = new String[3];
				
				respostaC[14] = "c) Eu cabo.";
				respostaC[15] = "c) Um vulto difuso.";
				respostaC[16] = "c) Girafas e tartarugas.";
				respostaC[17] = "c) 2005.";
				respostaC[18] = "c) 6 períodos.";
				respostaC[19] = "c) Esôfago e brônquios.";
				respostaC[20] = "c) o nitrato de sódio.";	
				}
			
			public void RespostaD( ) {
				
				String [] respostaD = new String[3];
				
				respostaD[14] = "d) Nenhuma das alternativas acima.";
				respostaD[15] = "d) Nenhuma das alternativas acima.";
				respostaD[16] = "d) Porcos e pinguins.";
				respostaD[17] = "d) 2004.";
				respostaD[18] = "d) 4 períodos.";
				respostaD[19] = "d) Tireóide e hipófise.";
				respostaD[20] = "d) O dióxido de carbono.";	
				}
			
			public void RespostaCerta() {
				
				String [] respostaCor = new String[3];
				
				respostaCor[14] = "a) Eu caibo.";
				respostaCor[15] = "d) Nenhuma das alternativas acima.";
				respostaCor[16] = "a) Baleia azul e golfinhos.";
				respostaCor[17] = "c) 2005.";
				respostaCor[18] = "d) 4 períodos.";
				respostaCor[19] = "a) Laringe e traqueia.";
				respostaCor[20] = "d) O dióxido de carbono.";					
			    }
			
			public void receberResposta(char resposta) {
				
				
				int[] respotaCorreta = new int[3];
				int[] pergunta = new int[3];
				int correto = 0;
				int errada = 0;

				for (int i = 0; i < 3; i++) {

					if (resposta == respotaCorreta[i]) {
					correto++;
					}

					if (resposta != respotaCorreta[i]) {
						errada++;
						System.out.println("ANDERSON: " );
					}
				}
			}
			
	}

