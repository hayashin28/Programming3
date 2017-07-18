package lesson06.mylengthUtil;

public class MyLength {

	private int inch;	// インチ
	private int feet;	// フィート
	/**
	 * 'mylengthUtil.MyLength.setLength(int, int)'メソッド
	 */
	public void setLength(int inch, int feet) {
		this.inch = inch;
		this.feet = feet;
	}

	/**
	 * 'mylengthUtil.MyLength.getFeet()'メソッド
	 */
	public int getFeet() { return feet;	}

	/**
	 * 'mylengthUtil.MyLength.getInch()'メソッド
	 */
	public int getInch() { return inch; }

	/**
	 * 'mylengthUtil.MyLength.add(MyLength)'メソッド
	 */
	public void add() {
	}
}