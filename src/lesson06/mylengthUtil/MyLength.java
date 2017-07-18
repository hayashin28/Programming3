package lesson06.mylengthUtil;


public class MyLength {

	private int inch = 0; // インチ
	private int feet = 0; // フィート
	/**
	 * 'mylengthUtil.MyLength.setLength(int, int)'メソッド
	 */
	public void setLength(int inch, int feet) {
		this.inch = inch + ((this.feet + feet) / 12);
		this.feet = (this.feet + feet) % 12;
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
	public MyLength add(MyLength len) {
		MyLength length = new MyLength();
		length.setLength(inch + len.getInch(), feet + len.getFeet());
		return length;
	}
}