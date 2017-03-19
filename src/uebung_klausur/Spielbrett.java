package uebung_klausur;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class Spielbrett extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private char player = 'x';
	private JTextField textFieldMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(
						UIManager.getSystemLookAndFeelClassName());
					Spielbrett frame = new Spielbrett();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Spielbrett() {
		setTitle("Spiel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panelSpiel = new JPanel();
		panelSpiel.setLayout(new GridLayout(3, 3));
		contentPane.add(panelSpiel);
		
		JPanel panelMeldungen = new JPanel();
		panelMeldungen.setLayout(new FlowLayout());
		contentPane.add(panelMeldungen);
		
		JButton topRowLeft = new JButton("");
		topRowLeft.setFocusable(false);
		topRowLeft.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (topRowLeft.getText() != "") {
					textFieldMessage.setText("Feld bereits gesetzt.");
				} else {
					topRowLeft.setText(String.valueOf(getPlayer()));
					switchPlayer(getPlayer());
				}
			}
		});
		panelSpiel.add(topRowLeft);
		
		JButton topRowMiddle = new JButton("");
		topRowMiddle.setFocusable(false);
		topRowMiddle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (topRowMiddle.getText() != "") {
					textFieldMessage.setText("Feld bereits gesetzt.");
				} else {
					textFieldMessage.setText("");
					topRowMiddle.setText(String.valueOf(getPlayer()));
					switchPlayer(getPlayer());
				}
			}
		});
		panelSpiel.add(topRowMiddle);
		
		JButton topRowRight = new JButton("");
		topRowRight.setFocusable(false);
		topRowRight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (topRowRight.getText() != "") {
					textFieldMessage.setText("Feld bereits gesetzt.");
				} else {
					textFieldMessage.setText("");
					topRowRight.setText(String.valueOf(getPlayer()));
					switchPlayer(getPlayer());
				}
			}
		});
		panelSpiel.add(topRowRight);
		
		JButton midRowLeft = new JButton("");
		midRowLeft.setFocusable(false);
		midRowLeft.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (midRowLeft.getText() != "") {
					textFieldMessage.setText("Feld bereits gesetzt.");
				} else {
					textFieldMessage.setText("");
					midRowLeft.setText(String.valueOf(getPlayer()));
					switchPlayer(getPlayer());
				}
			}
		});
		panelSpiel.add(midRowLeft);
		
		JButton midRowMiddle = new JButton("");
		midRowMiddle.setFocusable(false);
		midRowMiddle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (midRowMiddle.getText() != "") {
					textFieldMessage.setText("Feld bereits gesetzt.");
				} else {
					textFieldMessage.setText("");
					midRowMiddle.setText(String.valueOf(getPlayer()));
					switchPlayer(getPlayer());
				}
			}
		});
		panelSpiel.add(midRowMiddle);
		
		JButton midRowRight = new JButton("");
		midRowRight.setFocusable(false);
		midRowRight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (midRowRight.getText() != "") {
					textFieldMessage.setText("Feld bereits gesetzt.");
				} else {
					textFieldMessage.setText("");
					midRowRight.setText(String.valueOf(getPlayer()));
					switchPlayer(getPlayer());
				}
			}
		});
		panelSpiel.add(midRowRight);
		
		JButton bottomRowLeft = new JButton("");
		bottomRowLeft.setFocusable(false);
		bottomRowLeft.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (bottomRowLeft.getText() != "") {
					textFieldMessage.setText("Feld bereits gesetzt.");
				} else {
					textFieldMessage.setText("");
					bottomRowLeft.setText(String.valueOf(getPlayer()));
					switchPlayer(getPlayer());
				}
			}
		});
		panelSpiel.add(bottomRowLeft);
		
		JButton bottomRowMiddle = new JButton("");
		bottomRowMiddle.setFocusable(false);
		bottomRowMiddle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (bottomRowMiddle.getText() != "") {
					textFieldMessage.setText("Feld bereits gesetzt.");
				} else {
					textFieldMessage.setText("");
					bottomRowMiddle.setText(String.valueOf(getPlayer()));
					switchPlayer(getPlayer());
				}
			}
		});
		panelSpiel.add(bottomRowMiddle);
		
		JButton bottomRowRight = new JButton("");
		bottomRowRight.setFocusable(false);
		bottomRowRight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (bottomRowRight.getText() != "") {
					textFieldMessage.setText("Feld bereits gesetzt.");
				} else {
					textFieldMessage.setText("");
					bottomRowRight.setText(String.valueOf(getPlayer()));
					switchPlayer(getPlayer());
				}
			}
		});
		panelSpiel.add(bottomRowRight);
		
		textFieldMessage = new JTextField("");
		textFieldMessage.setFocusable(false);
		textFieldMessage.setColumns(25);
		panelMeldungen.add(textFieldMessage);
	}

	private void switchPlayer(char player) {
		char newPlayer = player;
		switch (player) {
		case 'x':
			newPlayer = 'o';
			break;
		case 'o':
			newPlayer = 'x';
			break;
		}
		setPlayer(newPlayer);;
	}
	
	public char getPlayer() {
		return player;
	}
	
	public void setPlayer(char player) {
		this.player = player;
	}
}
