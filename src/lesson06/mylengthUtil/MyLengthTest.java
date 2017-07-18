package lesson06.mylengthUtil;

import org.junit.Test;

import junit.framework.TestCase;

public class MyLengthTest extends TestCase {
	
	@Test
	/**
	 * 'mylengthUtil.MyLength.setLength(int, int)' のためのテスト・メソッド
	 */
	public void testSetLength() {
		
		//1フィート2インチが正しく設定されているかテストする
		MyLength len = new MyLength();
		len.setLength(1, 2);
		assertEquals( "フィートは1のはず", 1, len.getFeet() );
		assertEquals( "インチは2のはず",   2, len.getInch() );
		
		//0フィート14(=12+2)インチが正しく設定されているかテストする
		len.setLength(0, 14);
		assertEquals( "フィートは1のはず", 1, len.getFeet() );
		assertEquals( "インチは2のはず", 2, len.getInch() );
	}

	/*
	 * 'mylengthUtil.MyLength.getFeet()' のためのテスト・メソッド
	 */
	public void testGetFeet() {
		//1フィート2インチが正しく設定されているかテストする
		MyLength len = new MyLength();
		len.setLength(1, 2);
		assertEquals( "フィートは1のはず", 1, len.getFeet() );
	}

	/*
	 * 'mylengthUtil.MyLength.getInch()' のためのテスト・メソッド
	 */
	public void testGetInch() {
		//1フィート2インチが正しく設定されているかテストする
		MyLength len = new MyLength();
		len.setLength(1, 2);
		assertEquals( "インチは2のはず", 2, len.getInch() );
	}

	/*