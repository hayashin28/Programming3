package lesson08.lec0801util;


public class MyCar {
	private String 	carName; 	// 車名を保持するフィールド変数
	private int 	hosePower; 	// 最大出力を保持するフィールド変数
	private int 	maxSpeed; 	// 最高速度を保持するフィールド変数

	/**
	 * コンストラクタの仕様
	 * MyCarクラスのオブジェクトの3つのフィールドを引数の値で初期化します．
	 * @param carName
	 * @param hosePower
	 * @param maxSpeed
	 */
	public MyCar(String carName, int hosePower, int maxSpeed) {
		this.carName	= carName;
		this.hosePower	= hosePower;
		this.maxSpeed	= maxSpeed;
	}

	// 車名を返す
	public String getCarName() { return carName; }
	// 最大出力を返す
	public int getHosePower() { return hosePower; }
	// 最高速度を返す 
	public int getMaxSpeed() { return maxSpeed; }
}
