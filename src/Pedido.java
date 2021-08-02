import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Pedido implements ActionListener {
	
	JLabel label;
	JButton button;
	JButton limpar;
	JCheckBox checkBox1;
	JCheckBox checkBox2;
	JCheckBox checkBox3;
	JCheckBox checkBox4;
	JCheckBox checkBox5;
	float sum = 0;
	JTextField textField;
	
	public Pedido() {
		
		JFrame frame = new JFrame("Lanche");
		frame.setVisible(true);
		frame.setSize(170, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		label = new JLabel("Itens Selecionados:");
		frame.add(label);
		
		checkBox1 = new JCheckBox("Opção 1");
		checkBox1.addActionListener(this);
		checkBox2 = new JCheckBox("Opção 2");
		checkBox2.addActionListener(this);
		checkBox3 = new JCheckBox("Opção 3");
		checkBox3.addActionListener(this);
		checkBox4 = new JCheckBox("Opção 4");
		checkBox4.addActionListener(this);
		checkBox5 = new JCheckBox("Opção 5");
		checkBox5.addActionListener(this);
		
		frame.add(checkBox1);
		frame.add(checkBox2);
		frame.add(checkBox3);
		frame.add(checkBox4);
		frame.add(checkBox5);
		
		button = new JButton("Adicionar");
		button.addActionListener(this);
		frame.add(button);
		
		JLabel label = new JLabel("        Valor Total:          ");
		frame.add(label);
		
		textField = new JTextField(10);
		frame.add(textField);
		textField.addActionListener(this);
		textField.setActionCommand("Enter");
		
		limpar = new JButton("Limpar");
		frame.add(limpar);
		limpar.addActionListener(this);
		limpar.setActionCommand("Enter");
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {

				new Pedido();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		if(e.getActionCommand().equalsIgnoreCase("Opção 1")) {

		sum += 10;
		textField.setText("" + sum);
		}else if(e.getActionCommand().equalsIgnoreCase("Opção 2")) {

			sum += 15;
			textField.setText("" + sum);
		}else if(e.getActionCommand().equalsIgnoreCase("Opção 3")) {

			sum += 25;
			textField.setText("" + sum);
		}else if(e.getActionCommand().equalsIgnoreCase("Opção 4")) {

			sum += 35;
			textField.setText("" + sum);
		}else if(e.getActionCommand().equalsIgnoreCase("Opção 5")) {

			sum += 45;
			textField.setText("" + sum);
		}else {
			e.getActionCommand().equalsIgnoreCase("Limpar");
			textField.setText("");
			sum = 0;
		}
		
	}
}
