package lesson08;

import java.applet.Applet;
import java.awt.Graphics;

import lesson08.lec0801util.MyCar;

public class MyCarView extends Applet {

	private static final long serialVersionUID = 1L;
	
	MyCar [] car = { new MyCar("フェラーリ", 490, 315),
					 new MyCar("ランボルギーニ",510),
					 new MyCar("ポルシェ", 310, 300),
					 new MyCar("カローラ",100) 
					};

	@Override
	public void paint(Graphics g) {
		MyCar Highspec = null;
		int max = 0;
		for (MyCar c : car) {
			if (max < c.getHosePower()) {
				Highspec = c;
				max = c.getHosePower();
			}
		}
		// 車の情報を表示
		g.drawString("最大馬力の車名：" + Highspec.getCarName()
		+			 "馬力："		   + Highspec.getHosePower(), 30, 30);
	}
}
