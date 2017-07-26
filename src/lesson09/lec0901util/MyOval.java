package lesson09.lec0901util;



public class MyOval {

	private	int xPosition; 	// 円の始点のx座標を保持するフィールド変数
	private	int yPosition; 	// 円の始点のy座標を保持するフィールド変数
	private	int radius; 	// 円の半径を保持するフィールド変数
	private	int colorRed; 	// 円の色（赤の要素）を保持するフィールド変数
	private	int colorGreen; // 円の色（緑の要素）を保持するフィールド変数
	private	int colorBlue; 	// 円の色（青の要素）を保持するフィールド変数
	
	/**
	 * コンストラクタその１
	 * オブジェクトの初期化をする。
	 * このコンストラクタでは， 円の始点座標と半径，色を引数の値で設定する。
	 * 
	 * @param xPosition
	 * @param yPosition
	 * @param radius
	 * @param colorRed
	 * @param colorGreen
	 * @param colorBlue
	 */
	public MyOval(int xPosition, int yPosition, int radius, int colorRed, int colorGreen, int colorBlue) {
		
		this.xPosition  = xPosition;	// 始点のx座標
		this.yPosition  = yPosition;	// 始点のy座標
		this.radius	    = radius;		// 半径
		this.colorRed   = colorRed;		// 赤色の要素
		this.colorGreen = colorGreen;	// 緑色の要素
		this.colorBlue  = colorBlue;	// 青色の要素 		
	}

	/**
	 * コンストラクタその２
	 * オブジェクトの初期化をする。
	 * このコンストラクタでは，円 の始点座標と半径は引数の値で設定するが，
	 * 色は青になるように設定する。(赤=緑=0, 青=255)
	 * 
	 * @param xPosition
	 * @param yPosition
	 * @param radius
	 */
	public MyOval(int xPosition, int yPosition, int radius) {
		this.xPosition  = xPosition;	// 始点のx座標
		this.yPosition  = yPosition;	// 始点のy座標
		this.radius	    = radius;		// 半径：int
	}
	
	
	// 円の始点のx座標を返す
	public int getX() { return xPosition; }
	// 円の始点のy座標を返す
	public int getY() { return yPosition; }
	// 円の半径を返す
	public int getR() { return radius; }
	// 赤色の要素の値を返す
	public int getRed() { return colorRed; }
	// 緑色の要素の値を返す
	public int getGreen() {return colorGreen; }
	// 青色の要素の値を返す
	public int getBlue() { return colorBlue; }
	// 赤色の要素を引数の値に設定する
	public void setRed(int colorRed) { this.colorRed = colorRed; }
	// 緑色の要素を引数の値に設定する
	public void setGreen(int colorGreen) { this.colorGreen = colorGreen; }
	// 青色の要素を引数の値に設定する
	public void setBlue(int colorBlue) { this.colorBlue = colorBlue; }
	// 他のMyOvalオブジェクト：MyOval 	引数のMyOvalオブジェクトに，この円が重なっているか否かを判定する。
	public int isCollision 	boolean 	


	
	
	
}
