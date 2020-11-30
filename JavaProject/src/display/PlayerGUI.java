package display;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

import javazoom.jl.player.Player;

public class PlayerGUI {

	private JFrame frame;
	private JTextField pathField;
	private File songFile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

					PlayerGUI window = new PlayerGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PlayerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("JavaProject MP3player");
		frame.setBounds(100, 100, 316, 142);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);

		// Play Music
		JButton startBtn = new JButton("Start");
		startBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Player p = new Player(new FileInputStream(songFile));
					p.play();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "No File Selected!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}

		});
		startBtn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		startBtn.setForeground(Color.DARK_GRAY);
		startBtn.setBounds(10, 42, 280, 47);
		frame.getContentPane().add(startBtn);

		pathField = new JTextField();
		pathField.setForeground(Color.DARK_GRAY);
		pathField.setFont(new Font("Times New Roman", Font.BOLD, 11));
		pathField.setEditable(false);
		pathField.setText("Song Path:");
		pathField.setBounds(10, 11, 209, 20);
		frame.getContentPane().add(pathField);
		pathField.setColumns(10);

		JButton openBtn = new JButton("Open");
		openBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				open();
			}
		});
		openBtn.setFont(new Font("Times New Roman", Font.BOLD, 11));
		openBtn.setBounds(229, 9, 61, 23);
		frame.getContentPane().add(openBtn);
	}

	private void open() {
		try {
			JFileChooser chooser = new JFileChooser();
			chooser.setDialogTitle("Choose Song To Load:");
			chooser.showOpenDialog(null);
			songFile = chooser.getSelectedFile();
			pathField.setText(songFile.getAbsolutePath());
			if (!songFile.getName().endsWith(".mp3")) {
				JOptionPane.showMessageDialog(null, "Invalid File Type Selected!", "Error", JOptionPane.ERROR_MESSAGE);
				open();
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
