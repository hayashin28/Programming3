package lesson05;

import java.awt.Graphics;

import javax.swing.JFrame;

import lesson05.lec0501util.PointCardAccount;

/**
 * 第5回 最終課題2
 * ポイントカード口座の所有者，暗証番号，残高の出力
 * @author 林宏典（15T055）
 *
 */
public class Person2 extends JFrame {

		private static final long serialVersionUID = 1L;

		private static PointCardAccount account;

		public static void main(String[] args) {

			// JFrameクラスのインスタンスを生成
			new Person2();




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
