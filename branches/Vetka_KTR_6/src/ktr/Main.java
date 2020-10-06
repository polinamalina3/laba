package ktr;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Main extends JFrame {
	int a = 55 * 10 * 100 / 100;
	private JTextField input = new JTextField("");
	private JTextField info = new JTextField("Тема курсового проекта: Расчет планировки");
	private JButton button = new JButton("Расчет");
	private JButton button2 = new JButton("Мнемосхема");
	private JButton button3 = new JButton("Информация");
	private JLabel label1 = new JLabel("Уфимский государственный авиационный технический университет");
	private JLabel label = new JLabel("ПИ-220");
	private JLabel label2 = new JLabel("Каменева Полина Робертовна kampoly@gmail.com");
	private JLabel label3 = new JLabel("Темник Наталья Сергеевна temniknatali6@gmail.com");
	private JLabel label4 = new JLabel("Редин Максим Александрович alexandrovich.m@gmail.com");
	private JLabel label5 = new JLabel("449");
	private JLabel label6 = new JLabel("463");
	private JLabel label7 = new JLabel("020");
	private JLabel label10 = new JLabel("ФГБОУ ВО");
	private JLabel label8 = new JLabel("0бъем параллелепипеда равен:");

	public Main(int b) {
		super("Simple Example");
		
		this.setBounds(100, 100, 700, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(new ButtonEventListener());
		button3.addActionListener(new ButtonEventListener1());
		setContentPane(new JLabel(new ImageIcon("logotype.jpg")));
		Container container = this.getContentPane();

		container.setLayout(new GridLayout(12, 2, 2, 2));
		container.add(label1);

		container.add(label10);

		
		input.setText(String.valueOf(b));
		
		
		container.add(label);
		container.add(label2);
		container.add(label3);
		container.add(label4);
		// container.add(label5);
		// container.add(label6);
		// container.add(label7);
		
		container.add(button);
		container.add(button2);
		container.add(button3);
		container.add(label8);
		container.add(info);
		container.add(input);

		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Schema m = new Schema();
				new Mnem();
				m.setVisible(true);
			}
		});
		



        
		JLabel txtBrowserURILabel;
		txtBrowserURILabel = new JLabel("asu.ugatu.ac.ru");
		txtBrowserURILabel.setBounds(260, 170, 150, 30);
		txtBrowserURILabel.setForeground(Color.blue);
		txtBrowserURILabel.setFont(new Font("Arial", Font.BOLD, 12));

		MouseListener listener = new LinkMouseListener();
		txtBrowserURILabel.addMouseListener(listener);

		txtBrowserURILabel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON1) {
					launchBrowser(txtBrowserURILabel.getText());
				}
			}
		});

		add(txtBrowserURILabel);
	}

	class LinkMouseListener extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
			if (!(e.getSource() instanceof JLabel)) {
				return;
			}
			JLabel label = (JLabel) e.getSource();
			label.setForeground(Color.RED);
			Cursor cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
			label.setCursor(cursor);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (!(e.getSource() instanceof JLabel)) {
				return;
			}
			JLabel label = (JLabel) e.getSource();
			label.setForeground(Color.BLUE);
		}
	}

	// launch browser
	private void launchBrowser(String uriStr) {
		Desktop desktop;
		if (Desktop.isDesktopSupported()) {
			desktop = Desktop.getDesktop();
			if (desktop.isSupported(Desktop.Action.BROWSE)) {
				// launch browser
				URI uri;
				try {
					uri = new URI("http://" + uriStr);
					desktop.browse(uri);
				} catch (IOException ioe) {
					ioe.printStackTrace();
				} catch (URISyntaxException use) {
					use.printStackTrace();
				}
			}
		}
	}

	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				int a = 55 * Integer.parseInt(input.getText()) * 100 / 100;
				label8.setText("Объем параллелепипеда равен: " + a + " куб. м.");
			} catch (NumberFormatException use) {
				JOptionPane.showMessageDialog(Main.this, "Ввод неверный!");

			}
		}

	}
	class ButtonEventListener1 implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Main.this,
				"<html><h2>Информация</h2><i>GitHub — крупнейший веб-сервис для хостинга IT-проектов и их совместной разработки.</i>");
				}

	}

	public static void main(String[] args) {
		File settingsFile = new File("input.txt");
		byte[] b = new byte[100];
		String input;
    	try {
    	    if (settingsFile.createNewFile()) {
    	    	System.out.println("Нет файла");;
    	    	return;
    	    }
    	}
    	catch (Exception e) {
    	    System.out.println(e);
    	}
        try {
        	FileInputStream settingsStream = new FileInputStream(settingsFile);	
    	    settingsStream.read(b);
    	    settingsStream.close();
        }
    	catch (Exception e) {
    		System.out.println(e);
    	}
		
        
        input = new String(b).trim();
        int value = Integer.valueOf(input);
        
		Main app = new Main(value);
		app.setVisible(true);
	}
}

class Schema extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Schema() {
		setBounds(100, 100, 530, 330);
		setResizable(false);
		setContentPane(new Mnem());
		getContentPane();
		setVisible(true);

	}
}

class Mnem extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String a;

	protected void paintComponent(Graphics g) {
		Image image = null;
		try {
			image = ImageIO.read(new File("мнем.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		super.paintComponent(g);
		g.drawImage(image, 0, 0, null);
	}
}
