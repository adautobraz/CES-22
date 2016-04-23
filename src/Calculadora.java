import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField visor;
	JButton btSoma, btDiv, btSub, btMult, bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, btClear;
	CalculatorEngine c;
	
	
	public Calculadora(){
		
		setSize(193,230);
		setTitle("Calculadora");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Instanciamento dos componentes
		visor = new JTextField(15);
		btSoma = new JButton("+");
		btDiv = new JButton("/");
		btMult = new JButton("*");
		btSub = new JButton("-");
		bt0 = new JButton("0");
		bt1 = new JButton("1");
		bt2 = new JButton("2");
		bt3 = new JButton("3");
		bt4 = new JButton("4");
		bt5 = new JButton("5");
		bt6 = new JButton("6");
		bt7 = new JButton("7");
		bt8 = new JButton("8");
		bt9 = new JButton("9");
		btClear = new JButton("Limpar");
		
		//Pondo objetos na tela
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		
		getContentPane().add(visor);
		getContentPane().add(bt0);
		getContentPane().add(bt1);
		getContentPane().add(bt2);
		getContentPane().add(bt3);
		getContentPane().add(bt4);
		getContentPane().add(bt5);
		getContentPane().add(bt6);
		getContentPane().add(bt7);
		getContentPane().add(bt8);
		getContentPane().add(bt9);
		getContentPane().add(btSoma);
		getContentPane().add(btDiv);
		getContentPane().add(btMult);
		getContentPane().add(btSub);
		getContentPane().add(btClear);
		
		//Adicionar ações a componentes
		btSoma.addActionListener(this);
		btSub.addActionListener(this);
		btDiv.addActionListener(this);
		btMult.addActionListener(this);
		btClear.addActionListener(this);
		bt0.addActionListener(this);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
		bt6.addActionListener(this);
		bt7.addActionListener(this);
		bt8.addActionListener(this);
		bt9.addActionListener(this);
		
	}
	
	public static void main(String[]args){
		Calculadora c = new Calculadora();
		c.setVisible(true);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == btSoma){
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
