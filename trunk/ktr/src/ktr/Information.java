package ktr;

import java.awt.*;
import javax.swing.*;

public class Information extends JFrame {
	private JLabel label = new JLabel("Тема курсового проекта: Расчет планировки");
	private JLabel label1 = new JLabel("Над проектом работали:");
	private JLabel label2 = new JLabel("Студенты группы ПИ-220");
	private JLabel label3 = new JLabel("Каменева Полина, Темник Наталья, Редин Максим");

	public Information() {
		super("Информация");
		this.setBounds(300, 100, 400, 170);
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(4, 2, 2, 2));

		container.add(label);
		container.add(label1);
		container.add(label2);
		container.add(label3);
	}
}