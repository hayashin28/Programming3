package lesson04.Task2;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import lesson04.Task2.MyCar.MyCar;

/**
 * 第4回 最終課題2
 * 車名，馬力，最高速度を設定後，これらの表示
 * @author 林宏典（15T055）
 *
 */
public class MyCarView extends Applet {

	private MyCar car;
	private Button  btnName, btnPower, btnSpeed;
	// ボタン判定フラグ
	private int flg = 0;

	@Override
	public void init() {
		car = new MyCar();
		car.setCar("ポルシェ911カレラ", 5900, 315);
		// ボタンをインスタンス化しアプレットに登録
		btnName  = new Button("車名");	add(btnName);
		btnPower = new Button("馬力");	add(btnPower);
		btnSpeed = new Button("速度");	add(btnSpeed);

		/**
		 *  無名クラスにてボタン押下時の動きを登録
		 */
		// 車名ボタン押下時の処理
		btnName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				flg = 1;
				// 描画処理を再呼び出し
				repaint();
			}
		});

		// 馬力ボタン押下時の処理
		btnPower.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				flg = 2;
				repaint();
			}
		});

		// 速度ボタン押下時の処理
		btnSpeed.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				flg = 3;
				repaint();
			}
		});
	}

	@Override
	public void paint(Graphics g) {

		switch (flg) {
		case 1:
			g.drawString("車名：" + car.getCarName(), 30, 50);
			break;
		case 2:
			g.drawString("馬力：" + car.getHosePower(), 30, 50);
			break;
		case 3:
			g.drawString("時速：" + car.getMaxSpeed(), 30, 50);
			break;
		}
	}

}
