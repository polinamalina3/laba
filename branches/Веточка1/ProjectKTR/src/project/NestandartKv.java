package project;

//��������� ���������� ��� ������ � ���������� ������, �������
//��� �������� ������������ ����
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

//������� �����, ����������� ��������� ActionListener
//��������� ����� ��� ��������� ������� ������� �� ������
public class NestandartKv implements ActionListener {
	JFrame frame = new JFrame("������ ��� ������������� �������"); // ������� ����
	JPanel panelLeft = new JPanel(); // ������ � �������
	JPanel panelRight = new JPanel(); // ������ � ���������� ������
	JPanel panelBottom = new JPanel(); // ������ � ��������
	public static JTextField[] arrTf = new JTextField[15];// ������ ��������� �����
	private boolean poly;
	private boolean oboy;

//�����������
	public NestandartKv() {
		this.poly = poly;
		this.oboy = oboy;
//������������� �������� ���������� ��� ������ � �������
//������ ������������ �� ���������
		panelLeft.setLayout(new BoxLayout(panelLeft, BoxLayout.Y_AXIS));
//������������ ������ 250 �� 300 ��������
		panelLeft.setPreferredSize(new Dimension(250, 300));

//������������� �������� ���������� ��� ������ � ���������� ������
//������ ������������ �� ���������
		panelRight.setLayout(new BoxLayout(panelRight, BoxLayout.Y_AXIS));
//������������� ������ 130 �� 300 ��������
		panelRight.setPreferredSize(new Dimension(130, 300));

//�������� ����� ����� ����� addLabel
		addLabel(panelLeft, "����� �������:", Color.BLACK);
		addLabel(panelLeft, "������ �������:", Color.BLACK);
		addLabel(panelLeft, "������ �������", Color.BLACK);
		addLabel(panelLeft, "����� ����:", Color.BLACK);
		addLabel(panelLeft, "������ ����:", Color.BLACK);
		addLabel(panelLeft, "���������� ����:", Color.BLACK);
		addLabel(panelLeft, "����� �����:", Color.BLACK);
		addLabel(panelLeft, "������ �����:", Color.BLACK);
		addLabel(panelLeft, "���������� ������� �������:", Color.BLACK);
		addLabel(panelLeft, "����� �����:", Color.BLACK);
		addLabel(panelLeft, "������ �����:", Color.BLACK);
		addLabel(panelLeft, "����� ����������� �.:", Color.BLACK);
		addLabel(panelLeft, "������ ����������� �.:", Color.BLACK);
		addLabel(panelLeft, "����� ������:", Color.BLACK);
		addLabel(panelLeft, "������ ������:", Color.BLACK);

//��������� ��������� ���� ����� ���� � ���������� �� � ������
		for (int i = 0; i < arrTf.length; i++) {
			if (arrTf.length >= 0) {
//���������� ������ �� ������ � ������ ��� ���������� ������ � ��������� �����
				arrTf[i] = addTextField(panelRight);
			}

		}

//��������� ������ ������� � ������
		JButton calc = addButton(panelBottom, "������");
//��������� ��������� �� ������� �������
		calc.addActionListener(this);
		JButton reset = addButton(panelBottom, "�����");
//��������� ��������� �� ������� �������
		reset.addActionListener(this);

//������ ������� ����� �������
		frame.setVisible(true);
//������������� �������� ��� ������� �� ������� - ���������� ����������
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ������������� ��������� ��������� ������������ ������ ������ (�� ������)
		frame.setLocationRelativeTo(null);
//������������� ������ �������� ����(400 �� 450)
		frame.setSize(400, 400);

//��������� ������ �� ������� ����
		frame.add(panelLeft, BorderLayout.WEST);
		frame.add(panelRight, BorderLayout.EAST);

		frame.add(panelBottom, BorderLayout.SOUTH);
		frame.setResizable(false); // ��������� ��������� �������� �������� ����

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

//����� �������
	public double planirovka(double kolOb, double kolPl) throws Exception {
		double dlinaKomn = 0;
		double shirinaKomn = 0;
		double vysotaKomn = 0;
		double dlinaVystup = 0;
		double shirinaVystup = 0;
		double dlinaOkna = 0;
		double shirinaOkna = 0;
		double kolOkon = 0;
		double dlinaDver = 0;
		double shirinaDver = 0;
		double kolDver = 0;
		double dlinaOb = 0;
		double shirinaOb = 0;
		double shirinaPl = 0;
		double dlinaPl = 0;
		double q1 = 0;
		double q2 = 0;
		double q3 = 0;
		double q4 = 0;
		double q5 = 0;
		q1 = 0;
		q2 = 0;
		q3 = 0;
		q4 = 0;
		q5 = 0;
		kolOb = 0;
		for (int i = 0; i < 15; i++) {
			if (arrTf[i].getText().length() == 0) {
				arrTf[i].setText(" ");
			}
		}

		if (!arrTf[0].getText().equals(" ")) {
			dlinaKomn = Double.valueOf(arrTf[0].getText()); // dlina komnaty
		}
		if (!arrTf[1].getText().equals(" ")) {
			shirinaKomn = Double.valueOf(arrTf[1].getText()); // shirina komnaty
		}
		if (!arrTf[2].getText().equals(" ")) {
			vysotaKomn = Double.valueOf(arrTf[2].getText()); // visota komnaty
		}
		if (!arrTf[3].getText().equals(" ")) {
			dlinaOkna = Double.valueOf(arrTf[3].getText()); // dlina okna
		}
		if (!arrTf[4].getText().equals(" ")) {
			shirinaOkna = Double.valueOf(arrTf[4].getText()); // shirina okna
		}
		if (!arrTf[5].getText().equals(" ")) {
			kolOkon = Double.valueOf(arrTf[5].getText()); // kol-vo okon
		}
		if (!arrTf[6].getText().equals(" ")) {
			dlinaDver = Double.valueOf(arrTf[6].getText()); // dlina dvery
		}
		if (!arrTf[7].getText().equals(" ")) {
			shirinaDver = Double.valueOf(arrTf[7].getText()); // shirina dvery
		}
		if (!arrTf[8].getText().equals(" ")) {
			kolDver = Double.valueOf(arrTf[8].getText()); // kol-vo dverei
		}
		if (!arrTf[9].getText().equals(" ")) {
			dlinaOb = Double.valueOf(arrTf[9].getText()); // dlina oboev
		}
		if (!arrTf[10].getText().equals(" ")) {
			shirinaOb = Double.valueOf(arrTf[10].getText()); // shirina oboev
		}
		if (!arrTf[11].getText().equals(" ")) {
			dlinaVystup = Double.valueOf(arrTf[11].getText()); // dlina vystupayushhei chasty
		}
		if (!arrTf[12].getText().equals(" ")) {
			shirinaVystup = Double.valueOf(arrTf[12].getText()); // shirina vystupayushhei chasty

		}
		if (!arrTf[13].getText().equals(" ")) {
			dlinaPl = Double.valueOf(arrTf[13].getText()); // shirina vystupayushhei chasty

		}
		if (!arrTf[14].getText().equals(" ")) {
			shirinaPl = Double.valueOf(arrTf[14].getText()); // shirina vystupayushhei chasty

		}
		if ((dlinaDver != 0) & (shirinaDver != 0) & (vysotaKomn != 0)) {
			q1 = 2 * vysotaKomn * (dlinaKomn + shirinaKomn + dlinaVystup + shirinaVystup); // ����� ��������
		}
		if ((dlinaOkna != 0) & (shirinaOkna != 0) & (kolOkon != 0)) {
			q2 = dlinaOkna * shirinaOkna * kolOkon; // ���� ��������
		}
		if ((dlinaDver != 0) & (shirinaDver != 0) & (kolDver != 0)) {
			q3 = dlinaDver * shirinaDver * kolDver; // ����� ��������
		}
		if ((dlinaOb != 0) & (shirinaOb != 0)) {
			q4 = dlinaOb * shirinaOb; // ����
		}
		if ((dlinaOb != 0) & (shirinaOb != 0)) {
			q5 = ((dlinaKomn * shirinaKomn) - (dlinaVystup * shirinaVystup)) / (dlinaPl * shirinaPl);// ���������� ������
			kolPl = Math.round(q5);
		}

		if ((q1 != 0) || (q2 != 0) || (q3 != 0) || (q4 != 0) || (q5 != 0)) {
			kolOb = Math.round((q1 - q2 - q3) / q4);// ���������� �����
			System.out.println(kolOb);
		}
		new Results(kolOb, kolPl);
		return kolOb;
	}

//����� ��������� ������� ������� �� ������
	@Override
	public void actionPerformed(ActionEvent e) {
//������ ��� ������, �� ������� ������
		if (e.getActionCommand().equals("������")) {
			try {
				// ��������� ������
				planirovka(5, 5);

			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "��������� ������������ �����");
			}

		} else {
//������� ��� ����
			for (int i = 0; i < arrTf.length; i++) {
				arrTf[i].setText("");
			}
		}
	}
}