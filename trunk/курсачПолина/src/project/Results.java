package project;

//��������� ���������� ��� ������ � ���������� ������, �������
//��� �������� ������������ ����
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

//������� �����, ����������� ��������� ActionListener
//��������� ����� ��� ��������� ������� ������� �� ������
public class Results extends JFrame {
	JFrame frame = new JFrame("���������� ��������"); // ������� ����
	JPanel panelLeft = new JPanel(); // ������ � �������
	JPanel panelRight = new JPanel(); // ������ � ���������� ������
	JPanel panelBottom = new JPanel(); // ������ � ��������
	public JTextField[] arrTf = new JTextField[18];// ������ ��������� �����
	private double kolOb;
	private double kolPl;

//�����������
	public Results(double kolOb, double kolPl) {
		this.kolOb = kolOb;
		this.kolPl = kolPl;
//������������� �������� ���������� ��� ������ � �������
//������ ������������ �� ���������
		panelLeft.setLayout(new BoxLayout(panelLeft, BoxLayout.Y_AXIS));
//������������ ������ 250 �� 300 ��������
		panelLeft.setPreferredSize(new Dimension(200, 300));

//������������� �������� ���������� ��� ������ � ���������� ������
//������ ������������ �� ���������
		panelRight.setLayout(new BoxLayout(panelRight, BoxLayout.Y_AXIS));
//������������� ������ 130 �� 300 ��������
		panelRight.setPreferredSize(new Dimension(130, 300));

//�������� ����� ����� ����� addLabel
		addLabel(panelLeft, "����������� ���������� �����", Color.BLACK);
		addLabel(panelLeft, "����������� ���������� ������", Color.BLACK);
//��������� ��������� ���� ����� ���� � ���������� �� � ������
		for (int i = 12; i < 14; i++) {
			if (arrTf.length >= 0) {
//���������� ������ �� ������ � ������ ��� ���������� ������ � ��������� �����
				arrTf[i] = addTextField(panelRight);
			}

		}
		arrTf[12].setText(""+kolOb);
		arrTf[13].setText(""+kolPl);
//������ ������� ����� �������
		frame.setVisible(true);
//������������� ��������� ��������� ������������ ������ ������ (�� ������)
		frame.setLocationRelativeTo(null);
//������������� ������ �������� ����(400 �� 450)
		frame.setSize(350, 200);
//��������� ������ �� ������� ����
		frame.add(panelLeft, BorderLayout.WEST);
		frame.add(panelRight, BorderLayout.EAST);
		frame.add(panelBottom, BorderLayout.SOUTH);
		frame.setResizable(false); // ��������� ��������� �������� ����

	}

//����� ���������� ��������� �����
	public void addLabel(JComponent container, String name, Color color) {
//������� �������� ����� � ������ name
		JLabel lb = new JLabel(name);
//������������� ����������� ���������� ������
		lb.setMaximumSize(new Dimension(400, 20));
//������������� ����� ������
		lb.setForeground(color);
//������������� ������������ �� ������� ����
		lb.setHorizontalAlignment(JLabel.RIGHT);
//��������� �����
		lb.setBorder(new EtchedBorder());
//��������� ��������� ����� � ������
		container.add(lb);
	}

//����� ���������� ��������� �����
	public JTextField addTextField(JComponent container) {
//������� ��������� ����
		JTextField tf = new JTextField();
//������������� ��� ����������� ���������� ������
		tf.setMaximumSize(new Dimension(150, 20));
//��������� ��������� ���� �� ������
		container.add(tf);
//���������� ������ �� ��������� ����
		return tf;
	}

//����� ���������� ������
	public JButton addButton(JComponent container, String name) {
//������� ������
		JButton btn = new JButton(name);
//������������� ����������� ���������� ������
		btn.setMaximumSize(new Dimension(100, 20));
//����������� �� ����������� �� ������
		btn.setHorizontalAlignment(JButton.CENTER);

//��������� ������
		container.add(btn);
//���������� ������ �� ������
		return btn;
	}

}
