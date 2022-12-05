package questao2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Label label = new Label("teste");
		Botao botao1 = new Botao("JavaScript",label);
		Botao botao2 = new Botao("Java",label);
		Botao botao3 = new Botao("Python",label);
		Botao botao4 = new Botao("C++",label);
		Botao botao5 = new Botao("C",label);
		Botao botao6 = new Botao("C#",label);
		ArrayList<Botao> botoes = new ArrayList();
		botoes.add(botao1);
		botoes.add(botao2);
		botoes.add(botao3);
		botoes.add(botao4);
		botoes.add(botao5);
		botoes.add(botao6);
		Janela janela = new Janela(label,botoes);
		Display display = new Display(janela);

	}

}
