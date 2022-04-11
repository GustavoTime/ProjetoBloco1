package pessoa;

import java.util.ArrayList;

public class Apresentador extends Pessoa {

	public Apresentador(String nome, String classe) {
		super(nome, classe);
	}

	ArrayList<String> fraseFalsa = new ArrayList<>();
	ArrayList<String> fraseCorreta = new ArrayList<>();

	@Override
	public void fala() {
		fraseCorreta.add("Mas é um grande Imperador mesmo, reposta certa!");
		fraseCorreta.add("Boa, parceiro!");
		fraseCorreta.add("Que fofolete, resposta certa, parceiro.");
		
		fraseFalsa.add("Não foi dessa vez, parceiro. Resposta errada! Fiquei como malvado novamente e você como bonzinho.");
		fraseFalsa.add("César, o aventureiro, você foi fofolete na reposta, mas está incorreta.");
		fraseFalsa.add("Não é bem assim, parceiro!");
		
		for(int contador = 0; contador < 3; contador++) {
			System.out.println(fraseCorreta.get(contador));
		}
	}

	
}
