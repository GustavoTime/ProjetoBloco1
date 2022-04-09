package Perguntas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pergunta1a7 {
	public double receberResposta;
	

	public  boolean Pergunta() {
		String[] pergunta = new String[7];
	
		pergunta[0] = "1- Qual o menor e o maior pais do mundo?";
		pergunta[1] = "2- Quanto tempo a luz do Sol demora para chegar é Terra?";
		pergunta[2] = "3- Qual o livro mais vendido no mundo depois da Biblia? ";
		pergunta[3] = "4- Que cidade brasileira é conhecida por chover todos os dias quase é mesma hora?";
		pergunta[4] = "5- Qual o tema do famoso discurso Eu Tenho um Sonho, de Martin Luther King?";
		pergunta[5] = "6- Normalmente, quantos litros de sangue uma pessoa tem? ";
		pergunta[6] = "7- De onde é a invenção do chuveiro elétrico? ";

			// Imprimi as perguntas o .lenght é pra contar o tamanho do vetor
		for (int i = 0; i < pergunta.length; i++) {
		
			System.out.println(pergunta[i]);

		}
		System.out.println("");
		this.Resposta1();
		this.Resposta2();
		this.Resposta3();
		this.Resposta4();
		return false;


	}
	   public void respondendoPerguntas(char resposta) {
		   String [] pergunta =  new String [6];
		   String [] Resposta1 =  new String [6];
		   String [] Resposta2 =  new String [6];
		   String [] Resposta3 =  new String [6];
		   String [] Resposta4 =  new String [6];
		  
		
			System.out.println(pergunta[u]);
			System.out.println(Resposta1[u]);
			System.out.println(Resposta2[u]);
			System.out.println(Resposta3[u]);
			System.out.println(Resposta4[u]);
			
			
		}
		   
		
	
	

	public void Resposta1() {
		String[] respostaA = new String[7];

		respostaA[0] = "a-Vaticano e Russia";
		respostaA[1] = "a-12 minuto"
				+ "";
		respostaA[2] = "a-O Senhor dos Aneis"
				+ "";
		respostaA[3] = "a-So Paulo"
				+ "";
		respostaA[4] = "a- Igualdade das raas";
		respostaA[5] = "a- Tem entre 2 a 4 litros.";
		respostaA[6] = "a- Fran"
				+ "";

		// Imprimi as respostas o .lenght é pra contar o tamanho do vetor
		for (int i = 0; i < respostaA.length; i++) {
			System.out.println(respostaA[i]);
		}
		System.out.println("");
	}

	public void Resposta2() {
		String[] respostaB = new String[7];

		respostaB[0] = "b- Nauru e China";
		respostaB[1] = "b- 1 dia";
		respostaB[2] = "b- Dom Quixote";
		respostaB[3] = "b- Joinville";
		respostaB[4] = "b- Justi�a para os menos favorecido";
		respostaB[5] = "b- Tem entre 4 a 6 litros";
		respostaB[6] = "b- Inglaterr";

		// Imprimi as respostas o .lenght é pra contar o tamanho do vetor
		for (int i = 0; i < respostaB.length; i++) {
			System.out.println(respostaB[i]);
		}
		System.out.println("");
	}

	public void Resposta3() {
		String[] respostaC = new String[7];

		respostaC[0] = "c-M�naco e Canad"
				+ "";
		respostaC[1] = "c- 12 horas";
		respostaC[2] = "c- O Pequeno Pr�ncip"
				+ "";
		respostaC[3] = "c- Bel�m"
				+ "";
		respostaC[4] = "c- Intoler�ncia religiosa";
		respostaC[5] = "c- Tem 10 litros"
				+ "";
		respostaC[6] = "c- Brasi"
				+ "";

		// Imprimi as respostas o .lenght é pra contar o tamanho do vetor
		for (int i = 0; i < respostaC.length; i++) {
			System.out.println(respostaC[i]);
		}
		System.out.println("");
	}

	public void Resposta4() {
		String[] respostaD = new String[7];

		respostaD[0] = "d- Malta e Estados Unido"
				+ "";
		respostaD[1] = "d- 8 minutos";
		respostaD[2] = "d- Ela, a Feiticeir"
				+ "";
		respostaD[3] = "d- Nata"
				+ "";
		respostaD[4] = "d- Pr�mio Nobel da Pa"
				+ "";
		respostaD[5] = "d- Tem 7 litros"
				+ "";
		respostaD[6] = "d- Austr�li"
				+ "";
		// Imprimi as respostas o .lenght é pra contar o tamanho do vetor
		for (int i = 0; i < respostaD.length; i++) {
			System.out.println(respostaD[i]);
		}
		System.out.println("");
	}

	public void RespostaCerta() {
		String[] respostaCorr = new String[7];

		// Mesma resposta no metodo RespostaA que no metodo RespostaCerta
		respostaCorr[0] = "a- Vaticano e R�ssia";
		respostaCorr[1] = "d- 8 minutos";
		respostaCorr[2] = "b- Dom Quixote";
		respostaCorr[3] = "c- Belém";
		respostaCorr[4] = "a- Igualdade das raças";
		respostaCorr[5] = "b- Tem entre 4 a 6 litros.";
		respostaCorr[6] = "c- Brasil";

		// Imprimi as respostas o .lenght é pra contar o tamanho do vetor
		for (int i = 0; i < respostaCorr.length; i++) {
			System.out.println(respostaCorr[i]);
		}
		System.out.println("");
	}

	public void receberResposta(char resposta) {
		int[] respotaCorreta = new int[7];
		int[] pergunta = new int[7];
		int correto = 0;
		int errada = 0;

		for (int r = 0; r < 7; r++) {

			if (resposta == respotaCorreta[r]) {
				correto++;
				System.out.println("ANDERSON: Você está indo muito bem, Brilha que o palco é seu!!!");
			}

			if (resposta != respotaCorreta[r]) {
				errada++;
				System.out.println("ANDERSON: Meu Parceiro, presta mais um pouco de atenção, você é bom cara!! ");
			}
		
		}
	}
	
}





