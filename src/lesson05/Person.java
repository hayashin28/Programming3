package lesson05;

import java.applet.Applet;
import java.awt.Graphics;

import lesson05.lec0501util.PointCardAccount;

/**
 * 第5回 最終課題1
 *
 * @author 林宏典（15T055）
 *
 */
public class Person extends Applet {

		private static final long serialVersionUID = 1L;

		private PointCardAccount account;

		@Override
		public void init() {
			// ポイントカードアカウントクラスをインスタンス化
			account = new PointCardAccount();
			account.initPointCardAccount("阿笠田奈", 1234, 10000);
		}
		@Override
		public void paint(Graphics g) {
			// 各体積を表示
			g.drawString("名前："		  + account.getName()
		+				 "暗証番号："	  + account.getPersonalCode()
		+				 "残りポイント：" + account.getBalancePoint(), 30, 30);
		}
}
