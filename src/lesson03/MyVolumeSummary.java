package lesson03;

import java.applet.Applet;
import java.awt.Graphics;

public class MyVolumeSummary extends Applet {

	private static final long serialVersionUID = 1L;

	private MyVolume v;

	@Override
	public void init() {

		int to[]   = { 2, 4, 5, 1, 3 };	// 斗
		int syou[] = { 2, 3, 5, 1, 4 };	// 升
		int gou[]  = { 4, 2, 3, 1, 5 };	// 合

		for (int i = 0, count = to.length; i < count; i ++) {
			v = new MyVolume();
			v.setVolume(to[i], syou[i], gou[i]);
			v = v.calculation(v);
		}
	}

	@Override
	public void paint(Graphics g) {
		//
//		g.drawString("平均学習時間 = "+ averageTime.getHour()   + "時間 "
//									  + averageTime.getMinute() + "分 "
//									  + averageTime.getSecond() + "秒", 30, 30);
	}

}
