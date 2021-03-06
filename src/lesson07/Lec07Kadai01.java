package lesson07;

import java.applet.Applet;
import java.awt.Graphics;

import lesson07.mylengthUtil.MyLength;

public class Lec07Kadai01 extends Applet {

	private static final long serialVersionUID = 1L;

	public void paint(Graphics g){
		
		//MyLengthクラスのインスタンスaに1フィート2インチを設定する
		MyLength a = new MyLength();
		a.setLength( 1, 2);
		g.drawString("a="+a.getFeet()+"フィート"+a.getInch()+"インチ", 30, 20);
		
		//bにaの長さを設定する
		MyLength b = new MyLength();
		b.setLength( a);
		g.drawString("b="+b.getFeet()+"フィート"+b.getInch()+"インチ", 30, 40);
		
		//cに27インチ(=2フィート3インチ)を設定する
		MyLength c = new MyLength();
		c.setLength( 27);
		g.drawString("c="+c.getFeet()+"フィート"+c.getInch()+"インチ", 30, 60);
		
		//d=a+cを求める
		MyLength d;
		d = a.add( c);
		g.drawString("d="+d.getFeet()+"フィート"+d.getInch()+"インチ", 30, 80);
		
		//e=a+(3フィート4インチ)を求める
		MyLength e;
		e = a.add( 3, 4);
		g.drawString("e="+e.getFeet()+"フィート"+e.getInch()+"インチ", 30, 100);
		
		//f=a+(30インチ)を求める
		MyLength f;
		f = a.add( 30);
		g.drawString("f="+f.getFeet()+"フィート"+f.getInch()+"インチ", 30, 120);
	}
}