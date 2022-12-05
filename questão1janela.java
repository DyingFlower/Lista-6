package questao1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Janela extends JPanel{
	Botao botao,botao2,botao3;
	public Janela(Botao botao,Botao botao2, Botao botao3) {
		this.botao=botao;
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.GREEN);
			}
		});
		add(botao);
		this.botao2=botao2;
		botao2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				setBackground(Color.YELLOW);
				
			}
			
		});
		add(botao2);
		this.botao3=botao3;
		botao3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				setBackground(Color.BLUE);
				
			}
			
		});
		add(botao3);
		setBackground(Color.BLACK);
		setVisible(true);
	}
}
