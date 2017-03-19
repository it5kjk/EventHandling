import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class ButtonFrame extends JFrame {

	/**
	 * An example panel with a button.
	 * You either get insulted or complimented based
	 * on a random number generator.
	 */
	private static final long serialVersionUID = 8354984441214785073L;
	private JPanel contentPane;
	private JButton thisFuckingButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(
							UIManager.getSystemLookAndFeelClassName());
					ButtonFrame frame = new ButtonFrame();
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
	public ButtonFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Suprise button");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		thisFuckingButton = new JButton();
		thisFuckingButton.setBounds(95,67,229,111);
		thisFuckingButton.setText("Suprise me!  "
				+ "");
		thisFuckingButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Random rand = new Random();
				int randInt = rand.nextInt(100);
				System.out.println("Your random number is:" + randInt +
						"\r\nYour suprise is:");
				if (randInt > 50) {
					System.out.println("you're beatiful.");
				} else {
					System.out.println("fuck you!");
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(thisFuckingButton);
	}
}
