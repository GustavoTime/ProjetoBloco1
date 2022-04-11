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
		fraseCorreta.add("Mas � um grande Imperador mesmo, reposta certa!");
		fraseCorreta.add("Boa, parceiro!");
		fraseCorreta.add("Que fofolete, resposta certa, parceiro.");
		
		fraseFalsa.add("N�o foi dessa vez, parceiro. Resposta errada! Fiquei como malvado novamente e voc� como bonzinho.");
		fraseFalsa.add("C�sar, o aventureiro, voc� foi fofolete na reposta, mas est� incorreta.");
		fraseFalsa.add("N�o � bem assim, parceiro!");
		
		for(int contador = 0; contador < 3; contador++) {
			System.out.println(fraseCorreta.get(contador));
		}
	}

	
}
