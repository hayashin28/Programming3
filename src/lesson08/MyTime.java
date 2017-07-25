package lesson08;

public class MyTime {
	//フィールド
	//時間を記憶する
	private int hour;
	//分を記憶する
	private int minute;
	//秒を記憶する
	private int second;
	
	//デフォルトコンストラクタによる生成
	public MyTime() {}
	
	//コンストラクタ
	public MyTime( int h, int m, int s){
		second = s % 60;
		minute = ( m + s/60)%60;
		hour =  h + ( m + s/60)/60;
	}

	//メソッド
	//時間を返す
	public int getHour() { return hour; }
	//分を返す
	public int getMinute() { return minute; }
	//秒を返す
	public int getSecond() { return second; }
}
