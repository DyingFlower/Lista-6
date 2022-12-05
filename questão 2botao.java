package questao2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Botao extends JButton implements ActionListener{
	JLabel label;
	String Texto;
	public Botao(String Texto,JLabel label) {
		this.label=label;
		this.Texto=Texto;
		setText(Texto);
		addActionListener(this);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		
		label.setText(Texto);
	}
}
