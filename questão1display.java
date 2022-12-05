package questao1;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Display extends JFrame{
	JPanel janela1;
	public Display(JPanel janela1) {
		this.janela1=janela1;
		add(janela1);
		setSize(600,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
