import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

public class Vybor extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Vybor() {
		super("����������� ��������");
		setBounds(400, 220, 100, 40);

		JPanel panelV = new JPanel(null);

		// ��������� ����� � ����������� � ������ � ����� ���� ����
		JLabel top = new JLabel("�������� ��� �������:");
		top.setBounds(10, 5, 250, 40);

		JRadioButton pryam = new JRadioButton("�������������", false);
		pryam.setBounds(10, 45, 150, 40);
		JRadioButton treyg = new JRadioButton("�������������", false);
		treyg.setBounds(10, 75, 150, 40);
		ButtonGroup group = new ButtonGroup();
		group.add(pryam);
		group.add(treyg);

		JButton zapusk = new JButton("������");
		zapusk.setBounds(100, 120, 100, 30);
		zapusk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pryam.isSelected()) {
					new PryamougKv();
					dispose();
				} else if (treyg.isSelected()) {
					new NestandartKv();
					dispose();
				}
			}
		});
		
		panelV.add(treyg);
		panelV.add(zapusk);
		panelV.add(pryam);
		panelV.add(top);
		setContentPane(panelV);
		setSize(400, 200);
		setVisible(true);
		// ������������� ������������ ������ � ����� �� ������
		top.setHorizontalAlignment(JLabel.CENTER);

		setResizable(false); // ��������� ��������� �������� �������� ����

	}

	public static void main(String[] args) {
		new Vybor();
	}
}
