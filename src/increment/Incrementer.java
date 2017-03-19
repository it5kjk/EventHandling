package increment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Incrementer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnIncrementCount;
	private JTextField tfCount; 

	/**
	 * Create the frame.
	 */
	public Incrementer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 252, 207);
		setTitle("Incrementer");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnIncrementCount = new JButton("+");
		btnIncrementCount.setBounds(108,64,60,23);
		btnIncrementCount.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tfCount.setText(
						increment(tfCount.getText())
				);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnIncrementCount);
		
		tfCount = new JTextField("0");
		tfCount.setBounds(10,64,88,23);
		contentPane.add(tfCount);
		
		JLabel lblCounter = new JLabel("Counter");
		lblCounter.setBounds(10, 47, 46, 14);
		contentPane.add(lblCounter);
	}
	
	private String increment(String count) {
		try {
			//return incremented value
			return Long.toString(Long.parseLong(count) + 1);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(
					this,
					"Argument is not a number.",
					"Argument exception",
					JOptionPane.ERROR_MESSAGE);
			return null;
		}
	}
}