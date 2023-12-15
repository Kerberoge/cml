import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class JFrameWindow {
	private JFrame frame;

	public JFrameWindow() {
		initialize();
	}

	public void initialize() {
		frame = new JFrame();
		//frame.setTitle("Main Window");
		//frame.setSize(800, 500);
		//frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
		frame.setBackground(Color.GREEN);

		JButton button1 = new JButton("Button 1");
		//panel.add(button1);
		JButton button2 = new JButton("Button 2");
		panel.add(button2);
		JButton button3 = new JButton("Button 3");
		panel.add(button3);
		JButton button4 = new JButton("Button 4");
		panel.add(button4);
		


		panel.setPreferredSize(new Dimension(250, 250));
		
		frame.add(button1, BorderLayout.EAST);

		frame.pack();
		frame.setVisible(true);
	}
}
