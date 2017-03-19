package colorslider;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * A custom frame that uses three
 * JSlider to display a RGB value color
 * inside a JLabel.
 * 
 * @author JNK
 * @version 1.0
 */


public class RGBFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblColor;
	private JSlider slRed;
	private JSlider slGreen;
	private JSlider slBlue;

	/**
	 * Create the frame.
	 */
	public RGBFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("RGB Frame");
		setBounds(100, 100, 450, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		lblColor = new JLabel("");
		lblColor.setBounds(10, 10, 410, 70);
		lblColor.setOpaque(true);
		contentPane.add(lblColor);
		
		slRed 	= createNewSlider(35, 100, 100, 25);
		slGreen = createNewSlider(160, 100, 100, 25);
		slBlue 	= createNewSlider(285, 100, 100, 25);
		slRed.setForeground(Color.red);
		slGreen.setForeground(Color.green);
		slBlue.setForeground(Color.blue);
		contentPane.add(slRed);
		contentPane.add(slGreen);
		contentPane.add(slBlue);
		
		updatePanelColor();
	}
	
	private JSlider createNewSlider(int x, int y, int width, int height) {
		JSlider slider = new JSlider();
		slider.setBounds(x, y, width, height);
		slider.setMaximum(255);
		slider.setValue(128);
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				updatePanelColor();
			}
		});
		return slider;
	}

	protected void updatePanelColor() {
		lblColor.setBackground(new Color(
				slRed.getValue(), slGreen.getValue(), slBlue.getValue()));
	}
}
