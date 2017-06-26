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
			}
		});

		btnPower.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});


		btnSpeed.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
	}

	@Override
	public void paint(Graphics g) {

	}

}
