package lesson06.mylengthUtil;

/**
 * 第6回 最終課題
 * ポイントカード口座の所有者，暗証番号，残高の出力
 * @author 林宏典（15T055）
 *
 */


// 長さを扱うクラス
public class MyLength {		
	// フィールド
    private int feet = 0; // フィートの値を記憶
    private int inch = 0; // インチの値を記憶

	// メソッド
    // 長さオブジェクトに値を設定
    public void setLength(int ft, int in) {
    	inch = (inch + in) % 12;
    	feet += ft + in / 12;
    }
    // フィートを参照
    public int getFeet() { return feet; }
    //インチを参照
    public int getInch() { return inch; }
    // MyLengthオブジェクト同士の加算
    public MyLength add(MyLength x) {
    	MyLength len = new MyLength();
    	len.setLength(feet + x.getFeet(), inch + x.getInch());
    	return len;
    }
}