package lesson08;

import java.applet.Applet;
import java.awt.Graphics;

public class Lec08 extends Applet{
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g){
		//コンストラクタを用いたクラスMyTimeのインスタンスtの生成
		//デフォルトコンストラクタによる生成
		MyTime t= new MyTime();
		g.drawString("H:"+t.getHour()+" M:"+t.getMinute()+" S:"+t.getSecond(), 30, 30);
		//引数が3つあるコンストラクタによるインスタンスt1の生成
		MyTime t1= new MyTime(10,20,30);
		//引数が1つのコンストラクタによるインスタンスt2の生成
		MyTime t2 = new MyTime(t1);
		g.drawString("H:"+t2.getHour()+" M:"+t2.getMinute()+" S:"+t2.getSecond(), 30, 30);
	}
}
