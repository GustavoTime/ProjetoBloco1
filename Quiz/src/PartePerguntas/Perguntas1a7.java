package PartePerguntas;


public class Perguntas1a7 {
		
		public void Pergunta() {
			String [] pergunta = new String[6];
			
			pergunta[0] = "1- Qual o menor e o maior pa�s do mundo? \r\n"
					+ "";
			pergunta[1] = "2- Quanto tempo a luz do Sol demora para chegar � Terra? \r\n"
					+ "";
			pergunta[2] = "3- Qual o livro mais vendido no mundo depois da B�blia? ";
			pergunta[3] = "4- Que cidade brasileira � conhecida por chover todos os dias quase � mesma hora? \r\n"
					+ "";
			pergunta[4] = "5- Qual o tema do famoso discurso Eu Tenho um Sonho, de Martin Luther King? \r\n"
					+ "";
			pergunta[5] = "6- Normalmente, quantos litros de sangue uma pessoa tem? ";
			pergunta[6] = "7- De onde � a inven��o do chuveiro el�trico? ";
			
		}
		public void Resposta1() {
			String [] respostaA = new String[6];
			
			respostaA[0] = "a) Vaticano e R�ssia";
			respostaA[1] = "a) 12 minutos\r\n"
					+ "";
			respostaA[2] = "a) O Senhor dos An�is\r\n"
					+ "";
			respostaA[3] = "a) S�o Paulo\r\n"
					+ "";
			respostaA[4] = "a) Igualdade das ra�as";
			respostaA[5] = "a) Tem entre 2 a 4 litros.";
			respostaA[6] = "a) Fran�a\r\n"
					+ "";
		
			
		}
		
		public void Resposta2() {
			String [] respostaB = new String[6];
			
			respostaB[0] = "b) Nauru e China";
			respostaB[1] = "b) 1 dia\r\n";
			respostaB[2] = "b) Dom Quixote";
			respostaB[3] = "b) Joinville";
			respostaB[4] = "b) Justi�a para os menos favorecidos\r\n";
			respostaB[5] = "b) Tem entre 4 a 6 litros.\r\n";			
			respostaB[6] = "b) Inglaterra\r\n";
		
			
		}
		public void Resposta3() {
			String [] respostaC = new String[6];
			
			respostaC[0] = "c) M�naco e Canad�\r\n"
					+ "";
			respostaC[1] = "c) 12 horas";
			respostaC[2] = "c) O Pequeno Pr�ncipe\r\n"
					+ "";
			respostaC[3] = "c) Bel�m"
					+ "";
			respostaC[4] = "c) Intoler�ncia religiosa";
			respostaC[5] = "c) Tem 10 litros.\r\n"
					+ "";			
			respostaC[6] = "c) Brasil\r\n"
					+ "";
		
			
		}
		public void Resposta4() {
			String [] respostaD = new String[6];
			
			respostaD[0] = "d) Malta e Estados Unidos\r\n"
					+ "";
			respostaD[1] = "d) 8 minutos";
			respostaD[2] = "d) Ela, a Feiticeira\r\n"
					+ "";
			respostaD[3] = "d) Natal\r\n"
					+ "";
			respostaD[4] = "d) Pr�mio Nobel da Paz\r\n"
					+ "";
			respostaD[5] = "d) Tem 7 litros.\r\n"
					+ "";			
			respostaD[6] = "d) Austr�lia\r\n"
					+ "";
		
			
		}
		
		public void RespostaCerta() {
			String [] respostaCorr = new String[6];
			
				//Mesma resposta no metodo RespostaA que no metodo RespostaCerta
			respostaCorr[0] = "a) Vaticano e R�ssia";
			respostaCorr[1] = "d) 8 minutos";
			respostaCorr[2] = "b) Dom Quixote";
			respostaCorr[3] = "c) Bel�m";
			respostaCorr[4] = "a) Igualdade das ra�as";
			respostaCorr[5] = "b) Tem entre 4 a 6 litros.\\r\\n";
			respostaCorr[6] = "c) Brasil\\r\\n";
			
			
		}
		
		public void receberResposta(char resposta) {
			int[] respotaCorreta = new int[7];
			int[] pergunta = new int[7];
			int correto = 0;
			int errada = 0;

			for (int r = 0; r < 7; r++) {

				if (resposta == respotaCorreta[r]) {
				correto++;
				}

				if (resposta != respotaCorreta[r]) {
					errada++;
					System.out.println("ANDERSON: " );
				}
			}
		}
	}
	
	


