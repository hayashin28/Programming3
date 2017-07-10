package lesson06;

import java.applet.Applet;
import java.awt.Graphics;

import lesson06.mytimeUtil.MyTime;

public class Lec0401 extends Applet{

	private static final long serialVersionUID = 1L;

	public void paint(Graphics g){
		MyTime t= new MyTime();
		t.setTime( 10, 20, 30);
		g.drawString("H:"+t.getHour()+"M:"+t.getMinute()+"S:"+t.getSecond(),30, 30);
		   }

}
