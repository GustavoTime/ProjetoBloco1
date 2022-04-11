package pessoa;

import java.util.ArrayList;
import java.util.Random;

public class Apresentador extends Pessoa {

	public Apresentador(String nome, String classe) {
		super(nome, classe);
	}
	Random aleatorio = new Random();

	ArrayList<String> fraseFalsa = new ArrayList<>();
	ArrayList<String> fraseCorreta = new ArrayList<>();

	@Override
	public void falaCorreta() {
		fraseCorreta.add("Mas � um grande Imperador mesmo, reposta certa!");
		fraseCorreta.add("Boa, parceiro!");
		fraseCorreta.add("Que fofolete, resposta certa, parceiro.");
		int sorteio = 0;
		System.out.println(fraseCorreta.get(sorteio));
	}
	
	public void falaErrada() {
		fraseFalsa.add("N�o foi dessa vez, parceiro. Resposta errada! Fiquei como malvado novamente e voc� como bonzinho.");
		fraseFalsa.add("C�sar, o aventureiro, voc� foi fofolete na reposta, mas est� incorreta.");
		fraseFalsa.add("N�o � bem assim, parceiro!");
		System.out.println(fraseFalsa.get(aleatorio.nextInt(3)));
	}

	
}
