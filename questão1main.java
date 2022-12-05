package questao1;

public class Main {

	public static void main(String[] args) {
		Botao botao1 = new Botao("Verde");
		Botao botao2 = new Botao("Amarelo");
		Botao botao3 = new Botao("Azul");
		Janela janela1 = new Janela(botao1,botao2,botao3);
		Display display = new Display(janela1);
	}

}
