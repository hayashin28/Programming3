package lesson09.lec0901util;



public class MyOval {

	private	int xPosition; 	// 円の始点のx座標を保持するフィールド変数
	private	int yPosition; 	// 円の始点のy座標を保持するフィールド変数
	private	int radius; 	// 円の半径を保持するフィールド変数
	private	int colorRed; 	// 円の色（赤の要素）を保持するフィールド変数
	private	int colorGreen; // 円の色（緑の要素）を保持するフィールド変数
	private	int colorBlue; 	// 円の色（青の要素）を保持するフィールド変数
	
	/**
	 * 
	 * コンストラクタその１
	 * オブジェクトの初期化をする。
	 * このコンストラクタでは， 円の始点座標と半径，色を引数の値で設定する。
	 *
	 */
	public MyOval(int xPosition, int yPosition, int radius, int colorRed, int colorGreen, int colorBlue) {
		
		this.xPosition  = xPosition;	// 始点のx座標
		this.yPosition  = yPosition;	// 始点のy座標
		this.radius	    = radius;		// 半径：int
		this.colorRed   = colorRed;		// 赤色の要素
		this.colorGreen = colorGreen;	// 緑色の要素
		this.colorBlue  = colorBlue;	// 青色の要素 		
	}
}
