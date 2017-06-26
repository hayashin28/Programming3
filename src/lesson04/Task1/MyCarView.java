package lesson04.Task1;

import java.applet.Applet;
import java.awt.Graphics;

import lesson04.Task1.MyCar.MyCar;

/**
 *
 * @author
 *
 */
public class MyCarView extends Applet{

	private MyCar car;

	@Override
	public void init() {
		car = new MyCar();
		car.setCar("フェラーリF430", 490, 315);
	}



	@Override
	public void paint(Graphics g) {
		// 車の情報を表示
		g.drawString("車名：" + car.getCarName()
	+				 "馬力：" + car.getHosePower()
	+				 "時速：" + car.getMaxSpeed(), 30, 30);
	}

}
