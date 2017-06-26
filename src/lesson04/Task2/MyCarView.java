package lesson04.Task2;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import lesson04.Task2.MyCar.MyCar;

public class MyCarView extends Applet {

	private MyCar car;
	private Button  btnName, btnPower, btnSpeed;
	private int flg = 0;

	@Override
	public void init() {
		car = new MyCar();
		car.setCar("ポルシェ911カレラ", 5900, 315);

		btnName  = new Button("車名");	add(btnName);
		btnPower = new Button("馬力");	add(btnPower);
		btnSpeed = new Button("速度");	add(btnSpeed);


		btnName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				flg = 1;
				repaint();
			}
		});

		btnPower.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				flg = 2;
				repaint();
			}
		});


		btnSpeed.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				flg = 3;
				repaint();
			}
		});
	}

	@Override
	public void paint(Graphics g) {

		switch (flg) {
		case 1:
			g.drawString("車名：" + car.getCarName(), 30, 50);
			break;
		case 2:
			g.drawString("馬力：" + car.getHosePower(), 30, 50);
			break;
		case 3:
			g.drawString("時速：" + car.getMaxSpeed(), 30, 50);
			break;
		}
	}

}
