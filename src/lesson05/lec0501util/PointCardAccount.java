package lesson05.lec0501util;

/**
 *
 * @author hayas
 *
 */
public class PointCardAccount {

	private String name;		// ポイントカード口座の所有者名を保持するフィールド変数
	private int personalCode;	// 暗証番号を保持するフィールド変数
	private int balancePoint;	// ポイント残高を保持するフィールド変数

	// オブジェクトを初期化する。引数に指定した値を，それぞれ対応するフィールド変数に代入する。
	public void  initPointCardAccount(String name, int personalCode, int balancePoint) {
		this.name		  = name;
		this.personalCode = personalCode;
		this.balancePoint = balancePoint;
	}

	// 所有者の名前を返す。
	public String getName() { return name; }

	// 暗証番号を返す。
	public int getPersonalCode() { return personalCode; }

	//ポイント残高を返す。
	public int getBalancePoint() { return balancePoint; }

	// ポイント残高に，引数に指定したポイント数だけ加算する。
	public void parchasePoint(int point) { balancePoint += point; }

	// ポイント残高から，引数に指定したポイント数だけ減算する。
	public void usePoint(int point) { balancePoint -= point; }

	// 引数に指定した暗証番号が，フィールドに保持してある暗証番号と一致するかどうかを判定する。
	public boolean isCorrectCode(int personalCode) { return (this.personalCode == personalCode); }
}
