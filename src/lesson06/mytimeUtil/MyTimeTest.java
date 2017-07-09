package lesson06.mytimeUtil;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class MyTimeTest {

	@Test
	/**
	 * 'myTimeLib.MyTime.setTime(int, int, int)' のためのテスト・メソッド
	 */
	public void testSetTime() {
		// 1時間2分3秒が正しく設定されるかテストする
		MyTime t1 = new MyTime();   // (1)
		t1.setTime( 1, 2, 3);       // (2)
		assertEquals( "時間は1のはず", 1, t1.getHour());  // (3)
		assertEquals( "分は2のはず", 2, t1.getMinute());  // (4)
		assertEquals( "秒は3のはず", 3, t1.getSecond());  // (5)
		
		// (1*3600+2*60+3)秒が正しく設定されるかテストする
		t1.setTime( 0, 0, (3600+2*60+3));  // (6)
		assertEquals( "時間は1のはず", 1, t1.getHour());  // (7)
		assertEquals( "分は2のはず", 2, t1.getMinute());  // (8)
		assertEquals( "秒は3のはず", 3, t1.getSecond());  // (9)
	}
	
	@Test
	public void testGetHour() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetMinute() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetSecond() {
		fail("まだ実装されていません");
	}

	@Test
	public void testAdd() {
		fail("まだ実装されていません");
	}

}
