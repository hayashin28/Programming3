package lesson01;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Random;

/**
 * 第1回 最終課題2
 * 整数型配列に格納されたデータを昇順に並び替え、
 * その中から正数データの値と同じ大きさの円を描く
 * @author 林宏典（15T055）
 *
 */
public class ArrayOval extends Applet {

	private static final long serialVersionUID = 1L;
	//配列を定義
	private int[] array;

	@Override
	public void init() {

		Random rand = new Random();
		//配列の要素数を50〜100で生成する。
		int count = rand.nextInt(50) + 50;
		//配列をインスタンス化
		array = new int[count];

		for (int i = 0; i < count; i++) {
			array[i] = rand.nextInt(90) + 10;
		}

		ascendingSort();
	}

	@Override
	public void paint(Graphics g) {
		int x = 0;
		for (int i = 0, count = array.length; i < count; i++) {
			g.drawOval(x + array[i], 0, array[i], array[i]);
			x += array[i];
		}
	}

	/**
	 * 配列の要素をバブルソートするメソッド
	 */
	private void ascendingSort() {

		for (int i = 0, count = array.length; i < count - 1; i++) {
			for (int j = i + 1; j < count; j++) {
				if (array[i] > array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
	}
}
