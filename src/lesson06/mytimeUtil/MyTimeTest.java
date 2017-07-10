package lesson06.mytimeUtil;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyTimeTest {

	@Test
	/**
	 * 'myTimeLib.MyTime.setTime(int, int, int)' のためのテスト・メソッド
	 */
	public void testSetTime() {
		// 1時間2分3秒が正しく設定されるかテストする
		MyTime t1 = new MyTime();   // (1)
		t1.setTime(1, 2, 3);       // (2)
		assertEquals( "時間は1のはず", 1, t1.getHour());   // (3)
		assertEquals( "分は2のはず",   2, t1.getMinute()); // (4)
		assertEquals( "秒は3のはず",   3, t1.getSecond()); // (5)
		
		// (1*3600+2*60+3)秒が正しく設定されるかテストする
		t1.setTime(0, 0, (3600+2*60+3));  // (6)
		assertEquals("時間は1のはず",1, t1.getHour());     // (7)
		assertEquals("分は2のはず",  2, t1.getMinute());   // (8)
		assertEquals("秒は3のはず",  3, t1.getSecond());   // (9)
	}
	
	@Test
	/**
	 * 'mytimeUtil.MyTime.getHour()' のためのテスト・メソッド
	 */
	public void testGetHour() {
		// 1時間2分3秒を設定して，時間の値をテストする
		MyTime t1 = new MyTime();
		t1.setTime(1, 2, 3);
		assertEquals("時間は1のはず", 1, t1.getHour());	
	}

	@Test
	/**
	 * 'mytimeUtil.MyTime.getMinute()' のためのテスト・メソッド
	 */
	public void testGetMinute() {
		// 1時間2分3秒を設定して，分の値をテストする
		MyTime t1 = new MyTime();
		t1.setTime(1, 2, 3);
		assertEquals("分は2のはず", 2, t1.getMinute());
	}

	@Test
	/**
	 * 'mytimeUtil.MyTime.getSecond()' のためのテスト・メソッド
	 */
	public void testGetSecond() {
		// 1時間2分3秒を設定して，秒の値をテストする
		MyTime t1 = new MyTime();
		t1.setTime(1, 2, 3);
		assertEquals("秒は3のはず", 3, t1.getSecond());	
	}

	@Test
	/**
	 * 'mytimeUtil.MyTime.add(MyTime)' のためのテスト・メソッド
	 */
	public void testAdd() {
		// 1h2m3s + 2h59m40s = 4h1m43s となっているかをテストする
		MyTime t1 = new MyTime();
		t1.setTime(1, 2, 3);
		MyTime t2 = new MyTime();
		t2.setTime(2, 59, 40);
		MyTime actual;
		actual = t1.add( t2);
		
		assertEquals("時間は4のはず", 4, actual.getHour());
		assertEquals("分は1のはず",   1, actual.getMinute());
		assertEquals("秒は43のはず", 43, actual.getSecond());		}
}