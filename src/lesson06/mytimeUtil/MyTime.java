package lesson06.mytimeUtil;

public class MyTime {
	private int hour = 0;	//時間
	private int minute = 0;	//分
	private int second = 0;	//秒
	
	//	 メソッド
	//	 時間(時間，分，秒)を設定する
	public void setTime( int h, int m, int s){
		second = s % 60;
		minute = ( m + s/60)%60;
		hour =  h + ( m + s/60)/60;
	}
	//	 時間を返す
	public int getHour(){
		return hour;
	}
	//	 分を返す
	public int getMinute(){
		return minute;
	}
	//	 秒を返す
	public int getSecond(){
		return second;
	}
	//時間オブジェクト同士の加算
	public MyTime add( MyTime x){
		int h, m, s;
		h = hour   + x.getHour();
		m = minute + x.getMinute();
		s = second + x.getSecond();
		MyTime y = new MyTime();
		y.setTime( h, m, s);
		return y;
	}
}
