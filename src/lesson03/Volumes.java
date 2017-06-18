package lesson03;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * 第3回 最終課題
 * @author 林宏典（15T055）
 *
 */
public class Volumes extends Applet {

	int to[]   = { 2, 4, 5, 1, 3 };	// 斗
	int syou[] = { 2, 3, 5, 1, 4 };	// 升
	int gou[]  = { 4, 2, 3, 1, 5 };	// 合

	MyVolume val;
	MyVolume v;

	@Override
	public void init() {

		val = new MyVolume();

		for (int i = 0, count = to.length; i < count; i++) {
			v = new MyVolume();
			v.setVolume(to[i], syou[i], gou[i]);
		}




	}

	@Override
	public void paint(Graphics g) {
	}






	/**
	 * 体積クラス（インナークラスで定義）
	 *
	 * @author 林宏典（15T055）
	 *
	 */
	class MyVolume {

		private int to;		// 斗を記憶する変数
		private int syou;	// 升を記憶する変数
		private int gou;	// 合を記憶する変数

		// 体積を設定するメソッド
		public void setVolume (int t, int s, int g) {
		}

		// toを参照するメソッド
		public int getTo () { return to; }

		// syouを参照するメソッド
		public int getSyou () { return syou; }

		// gouを参照するメソッド
		public int getGou (){ return gou; }

		// 体積の和を求めるメソッド
		public MyVolume add(MyVolume x) {
			int t, s, g;
			return null;
		}

	}

}
