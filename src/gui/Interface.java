package gui;

import java.awt.event.*;
import javax.swing.*;

import DAO.SaborDAO;
import pizzaria.*;

public class Interface extends JFrame implements ActionListener{
	
	private JLabel jlNome = new JLabel();
	private JLabel jlContato = new JLabel();
  	private JLabel jlEndereco = new JLabel();
	private JLabel jlEscolha = new JLabel();
	private JLabel jlNumsab = new JLabel();
	private JLabel jlEscolhasabor = new JLabel();
	private JTextField jtfNome = new JTextField();
	private JTextField jtfContato = new JTextField();
	private JTextField jtfEndereco = new JTextField();
	// Opções de Tamanho
	private JRadioButton p = new JRadioButton("Pequena");
	private JRadioButton m = new JRadioButton("Média");
	private JRadioButton g = new JRadioButton("Grande");
	private JRadioButton f = new JRadioButton("Família");
	private ButtonGroup bgtamanho = new ButtonGroup();
	// n° de sabores
	private JRadioButton um = new JRadioButton("Um Sabor");
	private JRadioButton dois = new JRadioButton("Dois Sabores");
	private JRadioButton tres = new JRadioButton("Três Sabores");
	private JRadioButton quatro = new JRadioButton("Quatro Sabores");
	private ButtonGroup bgNumsab = new ButtonGroup();
	// Combobox para seleção de sabor
	protected static JComboBox cbbSaboresA = new JComboBox<Object>();
	protected static JComboBox cbbSaboresB = new JComboBox<Object>();
	protected static JComboBox cbbSaboresC = new JComboBox<Object>();
	protected static JComboBox cbbSaboresD = new JComboBox<Object>();
	private JButton jbOk = new JButton();
	private Cliente clienteA = new Cliente();
	
	public Interface(){
		
		this.setTitle("Pizzaria");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		this.setSize(450,750);
		this.setLocation(100,100);
		this.setLayout(null);

		jlNome.setText("Nome:");
		jlNome.setBounds(20,10,150,10);
		this.add(jlNome);
		
		jtfNome.setBounds(20, 30, 250, 20);
		jtfNome.setToolTipText("Digite seu nome");
		this.add(jtfNome);
		
		jlContato.setText("Contato:");
		jlContato.setBounds(20,55,150,10);
		this.add(jlContato);
		
		jtfContato.setBounds(20, 75, 250, 20);
		jtfContato.setToolTipText("Digite um número para contato");
		this.add(jtfContato);

    	jlEndereco.setText("Endereço:");
		jlEndereco.setBounds(20,100,150,10);
		this.add(jlEndereco);
		
		jtfEndereco.setBounds(20, 120, 250, 20);
		jtfEndereco.setToolTipText("Digite o endereço de entrega");
		this.add(jtfEndereco);

		jlEscolha.setText("Escolha o tamanho da pizza:");
		jlEscolha.setBounds(20, 150, 300, 20);
		this.add(jlEscolha);


		p.setBounds(20, 180, 120, 20);
		p.addActionListener(this);

		m.setBounds(20,200,120,20);
		m.addActionListener(this);

		g.setBounds(20,220,120,20);
		g.addActionListener(this);

		f.setBounds(20, 240, 120, 20);
		f.addActionListener(this);

		this.add(jlNumsab);
		this.add(cbbSaboresA);
		this.add(cbbSaboresB);
		this.add(cbbSaboresC);
		this.add(cbbSaboresD);
		this.add(jlEscolhasabor);
		this.add(p);
		this.add(m);
		this.add(g);
		this.add(f);
		this.add(um);
		this.add(dois);
		this.add(tres);
		this.add(quatro);

		bgtamanho.add(p);
		bgtamanho.add(m);
		bgtamanho.add(g);
		bgtamanho.add(f);

		bgNumsab.add(um);
		bgNumsab.add(dois);
		bgNumsab.add(tres);
		bgNumsab.add(quatro);

		
		jbOk.setText("Fazer pedido");
		jbOk.setBounds(80,600,120,20);
		jbOk.setMnemonic(KeyEvent.VK_C);
		jbOk.addActionListener(this);
		this.add(jbOk);

		SaborDAO.atualizaCombo();

		this.setVisible(true);
		
		}

		public void actionPerformed(ActionEvent event){

			if(event.getSource() == p){

				jlNumsab.setText("Escolha a quantidade de sabores: ");
				jlNumsab.setBounds(20, 270, 300, 20);

				um.setBounds(20, 290, 120, 20);
				um.addActionListener(this);

				dois.setBounds(20,310,120,20);
				dois.addActionListener(this);

			}

			if(event.getSource() == m){

				jlNumsab.setText("Escolha a quantidade de sabores: ");
				jlNumsab.setBounds(20, 270, 300, 20);

				um.setBounds(20, 290, 120, 20);
				um.addActionListener(this);

				dois.setBounds(20,310,120,20);
				dois.addActionListener(this);

			}

			if(event.getSource() == g){

				jlNumsab.setText("Escolha a quantidade de sabores: ");
				jlNumsab.setBounds(20, 270, 300, 20);

				um.setBounds(20, 290, 120, 20);
				um.addActionListener(this);

				dois.setBounds(20,310,120,20);
				dois.addActionListener(this);

				tres.setBounds(20, 330, 120, 20);
				tres.addActionListener(this);

			}

			if(event.getSource() == f){

				jlNumsab.setText("Escolha a quantidade de sabores: ");
				jlNumsab.setBounds(20, 270, 300, 20);

				um.setBounds(20, 290, 120, 20);
				um.addActionListener(this);

				dois.setBounds(20,310,120,20);
				dois.addActionListener(this);

				tres.setBounds(20, 330, 120, 20);
				tres.addActionListener(this);

				quatro.setBounds(20, 350, 120, 20);
				quatro.addActionListener(this);

			}

			if(event.getSource() == um){

				jlEscolha.setText("Escolha o(s) sabor(es):");
				jlEscolha.setBounds(20, 340, 300, 20);

				cbbSaboresA.setBounds(30, 370, 120, 20);
				cbbSaboresA.addActionListener(this);

			}

			if(event.getSource() == dois){

				jlEscolha.setText("Escolha o(s) sabor(es):");
				jlEscolha.setBounds(20, 340, 300, 20);

				cbbSaboresA.setBounds(30, 370, 120, 20);
				cbbSaboresA.addActionListener(this);

				cbbSaboresB.setBounds(30, 390, 120, 20);
				cbbSaboresB.addActionListener(this);

			}

			if(event.getSource() == tres){

				jlEscolha.setText("Escolha o(s) sabor(es):");
				jlEscolha.setBounds(20, 340, 300, 20);

				cbbSaboresA.setBounds(30, 370, 120, 20);
				cbbSaboresA.addActionListener(this);

				cbbSaboresB.setBounds(30, 390, 120, 20);
				cbbSaboresB.addActionListener(this);

				cbbSaboresC.setBounds(30, 410, 120, 20);
				cbbSaboresC.addActionListener(this);

			}

			if(event.getSource() == quatro){

				jlEscolha.setText("Escolha o(s) sabor(es):");
				jlEscolha.setBounds(20, 340, 300, 20);

				cbbSaboresA.setBounds(30, 370, 120, 20);
				cbbSaboresA.addActionListener(this);

				cbbSaboresB.setBounds(30, 390, 120, 20);
				cbbSaboresB.addActionListener(this);

				cbbSaboresC.setBounds(30, 410, 120, 20);
				cbbSaboresC.addActionListener(this);

				cbbSaboresD.setBounds(30, 430, 120, 20);
				cbbSaboresD.addActionListener(this);

			}

			if(event.getSource() == jbOk){

				clienteA.setnome(jtfNome.getText());
				clienteA.setcontato(jtfContato.getText());
				clienteA.setendereco(jtfEndereco.getText());

				JOptionPane.showMessageDialog(null, "Nome: " + clienteA.getnome() + "\n" + "Contato: " + clienteA.getcontato() + "\n" + "Endereço: " + clienteA.getendereco() , "Olá", JOptionPane.PLAIN_MESSAGE);

			}

		}
	
	}
