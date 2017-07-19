package lesson06.mylengthUtil;


public class MyLength {

	private int feet = 0; // フィート
	private int inch = 0; // インチ
	
	

    // 長さオブジェクトに値を設定するメソッド 
    public void setLength(int ft, int in) {
    	feet += ft + ((inch + in)/12);
    	inch = (inch + in) % 12 ;
    }
    // フィートを参照するメソッド 
    public int getFeet() { return feet; }
    // インチを参照するメソッド 
    public int getInch() { return inch; }
    // MyLengthオブジェクト同士の加算 
    public MyLength add(MyLength x) {
		return x;
    }
}