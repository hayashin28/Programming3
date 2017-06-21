package lesson03;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * 第3回 最終課題
 * 体積を扱う「体積オブジェクト」を定義して，5つの体積の合計を求める
 * @author 林宏典（15T055）
 *
 */
public class MyVolumeSummary extends Applet {

	private static final long serialVersionUID = 1L;

	private MyVolume v;

	@Override
	public void init() {
		// 10合=1升，10升=1斗
		int to[]   = { 2, 4, 5, 1, 3 };	// 斗
		int syou[] = { 2, 3, 5, 1, 4 };	// 升
		int gou[]  = { 4, 2, 3, 1, 5 };	// 合

		// 体積クラスをインスタンス化
		v = new MyVolume();
		for (int i = 0, count = to.length; i < count; i ++) {
			v.setVolume(to[i], syou[i], gou[i]);
		}
		v = v.add (v);
	}
	@Override
	public void paint(Graphics g) {
		// 各体積を表示
		g.drawString("各体積 = "+ v.getTo()   + "斗 "
								+ v.getSyou() + "升 "
								+ v.getGou()  + "合", 30, 30);
	}

}
