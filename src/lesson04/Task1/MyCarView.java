package lesson04.Task1;

import java.applet.Applet;
import java.awt.Graphics;

import lesson04.Task1.MyCar.MyCar;

/**
 * 第4回 最終課題1
 * 車名，馬力，最高速度を設定後，これらの表示
 * @author 林宏典（15T055）
 *
 */
public class MyCarView extends Applet{

	private static final long serialVersionUID = 1L;
	
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
