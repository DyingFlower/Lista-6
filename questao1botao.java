package questao1;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Botao extends JButton{
	JPanel painel;
	String cor;
	public Botao(String cor) {
		this.cor=cor;
		setText(cor);
		setVisible(true);
	}
	
	/*public void actionPerformed(ActionEvent e) {
	if(cor=="Verde") {
		painel.setBackground(Color.GREEN);
	}
	else if(cor=="Amarelo") {
		painel.setBackground(Color.YELLOW);
	}
	else if(cor=="Azul") {
		painel.setBackground(Color.BLUE);
	}
}*/
}
