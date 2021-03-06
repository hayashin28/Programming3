package lesson08.lec0801util;

import junit.framework.TestCase;

public class MyCarTest extends TestCase {


	public static void main(String[] args) {
		junit.textui.TestRunner.run(MyCarTest.class);
	}

	/*
	 * 'lec0801util.MyCar.MyCar(String, int, int)' のためのテスト・メソッド
	 */
	public void testMyCarStringIntInt() {
		//("フェラーリF430", 450馬力，315km/h)を設定
		MyCar c = new MyCar("フェラーリF430", 450, 315);
		assertEquals("車名はフェラーリF430", "フェラーリF430", c.getCarName());
		assertEquals("馬力は450のはず", 450,c.getHosePower());
		assertEquals("最高速度は315のはず", 315, c.getMaxSpeed());
	}

	/*
	 * 'lec0801util.MyCar.MyCar(String, int)' のためのテスト・メソッド
	 */
	public void testMyCarStringInt() {
		//("フェラーリF430", 450馬力，315km/h)を設定
		MyCar c = new MyCar("フェラーリF430", 450);
		assertEquals("車名はフェラーリF430", "フェラーリF430", c.getCarName());
		assertEquals("馬力は450のはず", 450,c.getHosePower());
	}

	/*
	 * 'lec0801util.MyCar.getCarName()' のためのテスト・メソッド
	 */
	public void testGetCarName() {
		//("フェラーリF430", 450馬力，315km/h)を設定
		MyCar c = new MyCar("フェラーリF430", 450, 315);
		assertEquals("車名はフェラーリF430", "フェラーリF430", c.getCarName());
	}

	/*
	 * 'lec0801util.MyCar.getHosePower()' のためのテスト・メソッド
	 */
	public void testGetHosePower() {
		//("フェラーリF430", 450馬力，315km/h)を設定
		MyCar c = new MyCar("フェラーリF430", 450, 315);
		assertEquals("馬力は450のはず", 450,c.getHosePower());
	}

	/*
	 * 'lec0801util.MyCar.getMaxSpeed()' のためのテスト・メソッド
	 */
	public void testGetMaxSpeed() {
		//("フェラーリF430", 450馬力，315km/h)を設定
		MyCar c = new MyCar("フェラーリF430", 450, 315);
		assertEquals("最高速度は315のはず", 315, c.getMaxSpeed());
	}
}
