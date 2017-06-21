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
			to   += t;
			syou += s;
			gou  += g;

		}

		// toを参照するメソッド
		public int getTo () { return to; }

		// syouを参照するメソッド
		public int getSyou () { return syou; }

		// gouを参照するメソッド
		public int getGou (){ return gou; }

		// 体積の和を求めるメソッド
		public MyVolume calculation(MyVolume x) {
			// 10合=1升
			syou /= 10;
			gou  %= 10;
			// 10升=1斗
			to   += syou / 10;
			syou %= 10;
			return this;
		}
}
