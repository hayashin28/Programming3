package lesson03;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * 体積クラス
 * @author 林宏典（15T055）
 *
 */
public class Volumes extends Applet {
	
	@Override
	public void init(){
		System.out.println();
	}

	@Override
	public void paint(Graphics g) {
		g.drawLine(10, 10, 10, 10);
	}

	
	
	
	


	class MyVolume {
		
		private int to;		// 斗を記憶する変数
		private int syou;	// 升を記憶する変数
		private int gou;	// 合を記憶する変数

		// 体積を設定するメソッド
		public void setVolume (int t, int s, int g) {
		}

		// toを参照するメソッド
		public int getTo () {return to; }

		// syouを参照するメソッド
		public int getSyou () { return syou; }

		// gouを参照するメソッド
		public int getGou (){ return gou; }

		// 体積の和を求めるメソッド
		public MyVolume add(MyVolume x) {
			return null;
		}

	}

}
