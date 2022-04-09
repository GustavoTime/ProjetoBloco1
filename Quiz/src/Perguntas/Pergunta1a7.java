package Perguntas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pergunta1a7 {
	private int correto = 0;
	private int errada = 0;
	private int r; 
	public double receberResposta;

	public void Pergunta() {
		String[] pergunta = new String[7];

		pergunta[0] = "1- Qual o menor e o maior pais do mundo?";
		pergunta[1] = "2- Quanto tempo a luz do Sol demora para chegar é Terra?";
		pergunta[2] = "3- Qual o livro mais vendido no mundo depois da Biblia? ";
		pergunta[3] = "4- Que cidade brasileira é conhecida por chover todos os dias quase é mesma hora?";
		pergunta[4] = "5- Qual o tema do famoso discurso Eu Tenho um Sonho, de Martin Luther King?";
		pergunta[5] = "6- Normalmente, quantos litros de sangue uma pessoa tem? ";
		pergunta[6] = "7- De onde é a invenção do chuveiro elétrico? ";

		String[] respostaA = new String[7];

		respostaA[0] = "a-Vaticano e Russia";
		respostaA[1] = "a-12 minuto" + "";
		respostaA[2] = "a-O Senhor dos Aneis" + "";
		respostaA[3] = "a-So Paulo" + "";
		respostaA[4] = "a- Igualdade das raas";
		respostaA[5] = "a- Tem entre 2 a 4 litros.";
		respostaA[6] = "a- Fran" + "";

		String[] respostaB = new String[7];

		respostaB[0] = "b- Nauru e China";
		respostaB[1] = "b- 1 dia";
		respostaB[2] = "b- Dom Quixote";
		respostaB[3] = "b- Joinville";
		respostaB[4] = "b- Justiça para os menos favorecido";
		respostaB[5] = "b- Tem entre 4 a 6 litros";
		respostaB[6] = "b- Inglaterr";

		String[] respostaC = new String[7];

		respostaC[0] = "c-Minaco e Canada" + "";
		respostaC[1] = "c- 12 horas";
		respostaC[2] = "c- O Pequeno Pr�ncip" + "";
		respostaC[3] = "c- Belém" + "";
		respostaC[4] = "c- Intoler�ncia religiosa";
		respostaC[5] = "c- Tem 10 litros" + "";
		respostaC[6] = "c- Brasi" + "";

		String[] respostaD = new String[7];

		respostaD[0] = "d- Malta e Estados Unido" + "";
		respostaD[1] = "d- 8 minutos";
		respostaD[2] = "d- Ela, a Feiticeir" + "";
		respostaD[3] = "d- Nata" + "";
		respostaD[4] = "d- Pr�mio Nobel da Pa" + "";
		respostaD[5] = "d- Tem 7 litros" + "";
		respostaD[6] = "d- Australia" + "";

		String[] respostaCorr = new String[7];

		// Mesma resposta no metodo RespostaA que no metodo RespostaCerta
		respostaCorr[0] = "a- Vaticano e Russia";
		respostaCorr[1] = "d- 8 minutos";
		respostaCorr[2] = "b- Dom Quixote";
		respostaCorr[3] = "c- Belém";
		respostaCorr[4] = "a- Igualdade das raças";
		respostaCorr[5] = "b- Tem entre 4 a 6 litros.";
		respostaCorr[6] = "c- Brasil";

		for (int u = 0; u < pergunta.length; u++) {
			System.out.println(pergunta[u]);
			System.out.println(respostaA[u]);
			System.out.println(respostaB[u]);
			System.out.println(respostaC[u]);
			System.out.println(respostaD[u]);
			
			Scanner leia = new Scanner(System.in);
			System.out.print("Digite a sua resposta: ");
			this.setR(leia.nextInt());			
			if (this.getR()==1) {
		    if (respostaA[u]==respostaCorr[u]) {
		    	System.out.println("ANDERSON DIZ: sua resposta está correta, parceiro!");
		        this.setCorreto(this.getCorreto()+1);
		        
		  }
		      else  {
		    	  System.out.println("ANDERSON DIZ: sua resposta está errada, parceiro!\n A resposta correta é: "+respostaCorr[u]);
		      }
			}
             	

		}

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
