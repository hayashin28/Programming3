package lesson03;

/**
 *
 *
 * @author 林宏典（15T055）
 *
 */
public class MyVolume {

		private int to;		// 斗を記憶する変数
		private int syou;	// 升を記憶する変数
		private int gou;	// 合を記憶する変数

		// 体積を設定するメソッド
		public void setVolume (int t, int s, int g) {
			//10合=1升，10升=1斗
			to   = t + (s + g / 10) / 10;
			syou = (s + g / 10) % 10;
			gou  = g % 10;

		}

		// toを参照するメソッド
		public int getTo () { return to; }

		// syouを参照するメソッド
		public int getSyou () { return syou; }

		// gouを参照するメソッド
		public int getGou (){ return gou; }

		// 体積の和を求めるメソッド
		public MyVolume add(MyVolume x) {
			to   += x.getTo();
			syou += x.getSyou();
			gou  += x.getGou();

			return this;
		}
}
