package lesson03;

public class MySum {
	//フィールド
	//合計
	private double sum = 0.0;
	//加えた数の個数
	private int count = 0;

	//メソッド
	//数を1つ加える
	public void add( double d){
		sum = sum  + d;
		count++;
	}
	//sumの値を返す
	public double getSum(){ return sum; }
	//countの値を返す
	public int getCount() { return count; }
	//リセットする
	public void reset(){
		sum = 0.0;
		count = 0;
	}

}
