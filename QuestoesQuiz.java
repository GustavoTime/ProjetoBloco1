package QuestoesQuiz;

import java.util.Scanner;

public class QuestoesQuiz {

	public static void main(String[] args) {
		
		
		public void Pergunta() {
			
			String [] pergunta = new String[3];
				
				pergunta[14] = "Como � a conjuga��o do verbo caber na 1.� pessoa do singular do presente do indicativo?";
				pergunta[15] = "Um homem viu uma toupeira. A toupeira, que tamb�m olhou para ele, viu o que?";
				pergunta[16] = "Nesses pares, ambos s�o mam�feros:";
				pergunta[17] = "Em que ano foi lan�ado o site de v�deos Youtube?";
				pergunta[18] = "Quantos  per�odos tem um jogo de Basquetebol na NBA?";
				pergunta[19] = "Quais dos �rg�os abaixo pertencem ao sistema respirat�rio?";
				pergunta[20] = "Que subst�ncia � absorvida pelas plantas e expirada por todos os seres vivos?";
				
			}
		
			public void RespostaA() {
				
				String [] respostaA = new String[3];
				
				respostaA[14] = "a) Eu caibo.";
				respostaA[15] = "a) O homem que a viu.";
				respostaA[16] = "a) Baleia azul e golfinhos.";
				respostaA[17] = "a) 2000.";
				respostaA[18] = "a) 2 per�odos.";
				respostaA[19] = "a) Laringe e traqueia.";
				respostaA[20] = "a) O oxig�nio.";
		        }
			
			public void RespostaB() {
				
				String [] respostaB = new String[3];
				
				respostaB[14] = "b) Ele cabe.";
				respostaB[15] = "b) A camisa do homem que era vermelha.";
				respostaB[16] = "b) Morcegos e galinhas.";
				respostaB[17] = "b) 2003.";
				respostaB[18] = "b) 3 per�odos.";
				respostaB[19] = "b) Pulm�es e faringe.";
				respostaB[20] = "b) O nitrog�nio.";
			    }
			
			public void RespostaC( ) {
				
				String [] respostaC = new String[3];
				
				respostaC[14] = "c) Eu cabo.";
				respostaC[15] = "c) Um vulto difuso.";
				respostaC[16] = "c) Girafas e tartarugas.";
				respostaC[17] = "c) 2005.";
				respostaC[18] = "c) 6 per�odos.";
				respostaC[19] = "c) Es�fago e br�nquios.";
				respostaC[20] = "c) o nitrato de s�dio.";	
				}
			
			public void RespostaD( ) {
				
				String [] respostaD = new String[3];
				
				respostaD[14] = "d) Nenhuma das alternativas acima.";
				respostaD[15] = "d) Nenhuma das alternativas acima.";
				respostaD[16] = "d) Porcos e pinguins.";
				respostaD[17] = "d) 2004.";
				respostaD[18] = "d) 4 per�odos.";
				respostaD[19] = "d) Tire�ide e hip�fise.";
				respostaD[20] = "d) O di�xido de carbono.";	
				}
			
			public void RespostaCerta() {
				
				String [] respostaCor = new String[3];
				
				respostaCor[14] = "a) Eu caibo.";
				respostaCor[15] = "d) Nenhuma das alternativas acima.";
				respostaCor[16] = "a) Baleia azul e golfinhos.";
				respostaCor[17] = "c) 2005.";
				respostaCor[18] = "d) 4 per�odos.";
				respostaCor[19] = "a) Laringe e traqueia.";
				respostaCor[20] = "d) O di�xido de carbono.";					
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

