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
		String[] pergunta = new String[21];

		pergunta[0] = "Qual o menor e o maior país do mundo?";
		pergunta[1] = "Quanto tempo a luz do Sol demora para chegar à Terra?";
		pergunta[2] = "Qual o livro mais vendido no mundo depois da Bíblia? ";
		pergunta[3] = "Que cidade brasileira é conhecida por chover todos os dias quase à mesma hora?";
		pergunta[4] = "Qual o tema do famoso discurso Eu Tenho um Sonho, de Martin Luther King?";
		pergunta[5] = "Normalmente, quantos litros de sangue uma pessoa tem? ";
		pergunta[6] = "De onde é a invenção do chuveiro elétrico? ";
		pergunta[7] = "Júpiter e Plutão são os correlatos romanos de quais deuses gregos?";
		pergunta[8] = "Quantas pálpebras têm uma coruja?";
		pergunta[9] = "Em que parte do corpo humano você encontra uma amostra completa do seu DNA?";
		pergunta[10] = "Que tipo de tempestade é um haboob?";
		pergunta[11] = "A famosa frase \" Só sei que nada sei\" foi dita por quem?";
		pergunta[12] = "Quem pintou o teto da Capela Sistina?";
		pergunta[13] = "Qual dos seguintes personagens folclóricos usa suas chamas para proteger as florestas brasileiras?";	
		pergunta[14] = "Como é a conjugação do verbo caber na 1.ª pessoa do singular do presente do indicativo?";
		pergunta[15] = "Um homem viu uma toupeira. A toupeira, que também olhou para ele, viu o que?";
		pergunta[16] = "Nesses pares, ambos são mamíferos?";
		pergunta[17] = "Em que ano foi lançado o site de vídeos Youtube?";
		pergunta[18] = "Quantos  períodos tem um jogo de Basquetebol na NBA?";
		pergunta[19] = "Quais dos órgãos abaixo pertencem ao sistema respiratório?";
		pergunta[20] = "Que substância é absorvida pelas plantas e expirada por todos os seres vivos?";

		String[] respostaA = new String[21];

		respostaA[0] = "1) Vaticano e Rússia" +"";
		respostaA[1] = "1) 12 minuto" + "";
		respostaA[2] = "1) O Senhor dos Anéis" + "";
		respostaA[3] = "1) São Paulo" + "";
		respostaA[4] = "1) Igualdade das raças" +"";
		respostaA[5] = "1) Tem entre 2 a 4 litros" +"";
		respostaA[6] = "1) França" + "";
		respostaA[7] = "1) Ares e Hermes" +"";
		respostaA[8] = "1) 3" +"";
		respostaA[9] = "1) Nos ossos" +"";
		respostaA[10] = "1) Tempestade de granizo" +"";
		respostaA[11] = "1) Aristóteles" +"";
		respostaA[12] = "1) Donatello" +"";
		respostaA[13] = "1) Saci-Pererê" +"";
		respostaA[14] = "1) Eu caibo" +"";
		respostaA[15] = "1) O homem que a viu" +"";
		respostaA[16] = "1) Baleia azul e golfinhos" +"";
		respostaA[17] = "1) 2000" +"";
		respostaA[18] = "1) 2 períodos";
		respostaA[19] = "1) Laringe e traqueia" +"";
		respostaA[20] = "1) O oxigênio" +"";

		String[] respostaB = new String[21];

		respostaB[0] = "2) Nauru e China" +"";
		respostaB[1] = "2) 1 dia" +"";
		respostaB[2] = "2) Dom Quixote" +"";
		respostaB[3] = "2) Joinville" +"";
		respostaB[4] = "2) Justiça para os menos favorecidos" +"";
		respostaB[5] = "2) Tem entre 4 a 6 litros" +"";
		respostaB[6] = "2) Inglaterra" +"";
		respostaB[7] = "2) Cronos e Apolo" +"";
		respostaB[8] = "2) 2" +"";
		respostaB[9] = "2) No tecido dos dedos" +"";
		respostaB[10] = "2) Tempestade de areia" +"";
		respostaB[11] = "2) Platão" +"";
		respostaB[12] = "2) Michelangelo" +"";
		respostaB[13] = "2) Curupira" +"";
		respostaB[14] = "2) Ele cabe" +"";
		respostaB[15] = "2) A camisa do homem que era vermelha" +"";
		respostaB[16] = "2) Morcegos e galinhas" +"";
		respostaB[17] = "2) 2003" +"";
		respostaB[18] = "2) 3 períodos.";
		respostaB[19] = "2) Pulmões e faringe" +"";
		respostaB[20] = "2) O nitrogênio" +"";

		String[] respostaC = new String[21];

		respostaC[0] = "3) Mônaco e Canadá" + "";
		respostaC[1] = "3) 12 horas";
		respostaC[2] = "3) O Pequeno Príncipe" + "";
		respostaC[3] = "3) Belém" + "";
		respostaC[4] = "3) Intolerância religiosa";
		respostaC[5] = "3) Tem 10 litros" + "";
		respostaC[6] = "3) Brasil" + "";
		respostaC[7] = "3) Zeus e Hades" +"";
		respostaC[8] = "3) 1";
		respostaC[9] = "3) Nos cabelos";
		respostaC[10] = "3) Tempestade de raios";
		respostaC[11] = "3) Sócrates" +"";
		respostaC[12] = "3) Leonardo da Vinci" +"";
		respostaC[13] = "3) Mula sem cabeça" +"";
		respostaC[14] = "3) Eu cabo";
		respostaC[15] = "3) Um vulto difuso";
		respostaC[16] = "3) Girafas e tartarugas";
		respostaC[17] = "3) 2005";
		respostaC[18] = "3) 6 períodos";
		respostaC[19] = "3) Esôfago e brônquios";
		respostaC[20] = "3) o nitrato de sódio";

		String[] respostaD = new String[21];

		respostaD[0] = "4) Malta e Estados Unidos" + "";
		respostaD[1] = "4) 8 minutos";
		respostaD[2] = "4) Ela, a Feiticeira" + "";
		respostaD[3] = "4) Natal" + "";
		respostaD[4] = "4) Prêmio Nobel da Paz" + "";
		respostaD[5] = "4) Tem 7 litros" + "";
		respostaD[6] = "4) Austrália" + "";
		respostaD[7] = "4) Dionísio e Deméter" +"";
		respostaD[8] = "4) Nenhuma" +""
		respostaD[9] = "4) No coração" +"";
		respostaD[10] = "4) Tempestade de relâmpagos" +"";
		respostaD[11] = "4) Descartes" +"";
		respostaD[12] = "4) Rafael Sanzio" +"";
		respostaD[13] = "4) Boitatá" +"";
		respostaD[14] = "4) Nenhuma das alternativas acima" + "";
		respostaD[15] = "4) Nenhuma das alternativas acima" + "";
		respostaD[16] = "4) Porcos e pinguins" + "";
		respostaD[17] = "4) 2004" + "";
		respostaD[18] = "4) 4 períodos" +"";
		respostaD[19] = "4) Tireóide e hipófise" + "";
		respostaD[20] = "4) O dióxido de carbono" + "";	

		String[] respostaCorr = new String[21];

		// Mesma resposta no metodo RespostaA que no metodo RespostaCerta
		respostaCorr[0] = "1) Vaticano e Rússia";
		respostaCorr[1] = "4) 8 minutos";
		respostaCorr[2] = "2) Dom Quixote";
		respostaCorr[3] = "3) Belém";
		respostaCorr[4] = "1) Igualdade das raças";
		respostaCorr[5] = "2) Tem entre 4 a 6 litros";
		respostaCorr[6] = "3) Brasil";
		respostaCorr[7] = "3) Zeus e Hades";
		respostaCorr[8] = "1) 3";
		respostaCorr[9] = "3) Nos cabelos";
	    respostaCorr[10] = "2) Tempestade de areia";
		respostaCorr[11] = "3) Sócrates";
		respostaCorr[12] = "2) Michelangelo";
		respostaCorr[13] = "2) Boitatá";
		respostaCorr[14] = "1) Eu caibo";
		respostaCorr[15] = "4) Nenhuma das alternativas acima";
		respostaCorr[16] = "1) Baleia azul e golfinhos";
		respostaCorr[17] = "3) 2005";
		respostaCorr[18] = "4) 4 períodos";
		respostaCorr[19] = "1) Laringe e traqueia";
		respostaCorr[20] = "4) O dióxido de carbono";

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
		    	System.out.println("Esfinderson diz: César, o aventureiro, sua resposta está correta, parceiro!");
		        this.setCorreto(this.getCorreto()+1);
		        
		  }
		      else  {
		    	  System.out.println("Esfinderson diz: César, o aventureiro, sua resposta está errada, parceiro!\n A resposta correta é: "+respostaCorr[u]);
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
