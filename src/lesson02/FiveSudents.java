package lesson02;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * 第2回 最終課題
 * 時間クラスMyTimeを使って，５人の生徒の学習時間（時間，分，秒）の平均を求めて表示
 * @author 林宏典（15T055）
 *
 */
public class FiveSudents extends Applet {

	public void paint(Graphics g) {
		// 5人の学生の学習時間のデータ
		int h[]={  2, 4,   5,  1,  3 }; // 時間のデータ
		int m[]={ 23, 31, 54, 12, 42 }; // 分 のデータ
		int s[]={ 40, 21, 33, 10, 55 }; // 秒 のデータ

		// MyTimeクラスのインスタンスを参照する変数 totalTimeを宣言する
		MyTime totalTime;

		// (1人目の和を求めるときtotalTime.add(t)を使うので，生成しておく)
		totalTime = new MyTime();

		// 5人分の学習時間を加えていく
		for (int i = 0; i < 5; i++) {

			// MyTimeクラスのインスタンスを参照する変数 t を宣言し，
			// MyTimeクラスのインスタンスを生成して代入する
			MyTime t = new MyTime();

			// MyTimeクラスのインスタンスtに，i番目の学生の学習時間を設定する
			t.setTime(h[i], m[i], s[i]);

			// 時間の和 totalTime + t を求めて，totalTimeに代入する
			totalTime = totalTime.add(t);
		}

		//MyTimeクラスのインスタンスを参照する変数 averageTime を宣言し、
		//MyTimeクラスのインスタンスを生成して代入する
		MyTime averageTime = new MyTime();

		//時間の合計 totalTime を学生の数で割って、averageTimeに代入する
		averageTime.setTime(0, 0, totalTime.toSecond() / 5); // ←空白を埋める

		// 平均学習時間を表示する
		g.drawString("平均学習時間 = "+averageTime.getHour()   + "時間 "
									  +averageTime.getMinute() + "分 "
									  +averageTime.getSecond() + "秒", 30, 30);
	}

}
