package lesson08;

import java.applet.Applet;
import java.awt.Graphics;

public class Lec08 extends Applet{
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g){
		//コンストラクタを用いたクラスMyTimeのインスタンスtの生成
		MyTime t= new MyTime(10,20,30);
		g.drawString("H:"+t.getHour()+" M:"+t.getMinute()+" S:"+t.getSecond(), 30, 30);
		//クラスMyTimeのインスタンスtの生成
		//デフォルトコンストラクタによる生成
		MyTime t= new MyTime();
		g.drawString("H:"+t.getHour()+" M:"+t.getMinute()+" S:"+t.getSecond(), 30, 30);

	}
}
