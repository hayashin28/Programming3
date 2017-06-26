package lesson04.Task2;

import java.applet.Applet;
import java.awt.Graphics;

import lesson04.Task2.MyCar.MyCar;

public class MyCarView extends Applet {

	private MyCar car;


	@Override
	public void init() {
		car = new MyCar();
		car.setCar("ポルシェ911カレラ", 5900, 315);
	}

	@Override
	public void paint(Graphics g) {

	}

}
