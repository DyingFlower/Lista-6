package questao2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Janela extends JPanel {
	JLabel label;
	ArrayList<Botao> Botao;
	public Janela(Label label,ArrayList<Botao> Botao) {
		this.label=label;
		add(label);
		this.Botao=Botao;
		for(int i=0;i<Botao.size();i++) {
			add(Botao.get(i));
		}
		setBackground(Color.GRAY);
		setVisible(true);
	}
}
