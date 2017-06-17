package lesson02;

class MyTime { //クラスの始まり
	private int hour   = 0; //時間
	private int minute = 0; //分
	private int second = 0; //秒

	// メソッド
	// 時,分，秒を設定します
	public void setTime(int h, int m, int s) {
		hour   = h + (m + s / 60) / 60;
		minute = (m + s / 60) % 60;
		second = s % 60;
	}

	// 時間を返します
	public int getHour() { return hour; }

	// 分を返します
	public int getMinute() { return minute; }

	// 秒を返します
	public int getSecond() { return second; }

	// 時間を秒換算します
	public int toSecond() {
		return hour * 60 * 60 + minute * 60 + second;
	}

	//時間オブジェクト同士の加算
	public MyTime add(MyTime x) {
		int h, m, s;
		h = hour   + x.getHour();
		m = minute + x.getMinute();
		s = second + x.getSecond();
		MyTime y = new MyTime();
		y.setTime(h, m, s);
		return y;
	}
} //クラスの終わり
