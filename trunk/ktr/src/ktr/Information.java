package ktr;

import java.awt.*;
import javax.swing.*;

public class Information extends JFrame {
	private JLabel label = new JLabel("���� ��������� �������: ������ ����������");
	private JLabel label1 = new JLabel("��� �������� ��������:");
	private JLabel label2 = new JLabel("�������� ������ ��-220");
	private JLabel label3 = new JLabel("�������� ������, ������ �������, ����� ������");

	public Information() {
		super("����������");
		this.setBounds(300, 100, 400, 170);
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(4, 2, 2, 2));

		container.add(label);
		container.add(label1);
		container.add(label2);
		container.add(label3);
	}
}