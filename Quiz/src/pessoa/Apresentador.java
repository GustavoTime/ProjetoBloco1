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
		fraseCorreta.add("Mas e um grande Imperador mesmo, reposta certa!");
		fraseCorreta.add("Boa, parceiro!");
		fraseCorreta.add("Que fofolete, resposta certa, parceiro.");
		int sorteio = aleatorio.nextInt(3);
		System.out.println(fraseCorreta.get(sorteio));
	}

	public void falaErrada() {
		fraseFalsa.add(
				"Nao foi dessa vez, parceiro. Resposta errada! Fiquei como malvado novamente e voce como bonzinho.");
		fraseFalsa.add("Cesar, o aventureiro, voce foi fofolete na reposta, mas esta incorreta.");
		fraseFalsa.add("Nao e bem assim, parceiro!");
		System.out.println(fraseFalsa.get(aleatorio.nextInt(3)));
	}

}
