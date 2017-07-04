package lesson05;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import lesson05.lec0501util.PointCardAccount;

/**
 * 第5回 最終課題2
 * ポイントカード口座の所有者，暗証番号，残高の出力
 * @author 林宏典（15T055）
 *
 */
public class Person2 extends JFrame implements ActionListener {
	
		private static final long serialVersionUID = 1L;
		JPanel panel;
		GridBagLayout grid;
		JLabel lblpersonalCode;
		
		

		// コンストラクタでフレームを初期化
		public Person2() {
			
			
			
			getPanel().setLayout(getGrid());
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("JFrameを使ってフレームを表示");
			setSize(530, 100);
			
			add(getlblpersonalCode("暗証番号"),0,0);		
			                                                   
			
			 
			
					
			setVisible(true);
			
			
		}
		
		/**
		 * 
		 * @return
		 */
		private JPanel getPanel() {
			if (panel == null) panel = new JPanel();
			return panel;
		}
		
		/**
		 * 
		 * @return
		 */
		private GridBagLayout getGrid() {
			if (grid == null) grid = new GridBagLayout();
			return grid;
		}
		
		/**
		 * 
		 * @param strLbl
		 * @return
		 */
		private JLabel getlblpersonalCode(String strLbl) {
			if (lblpersonalCode == null) lblpersonalCode = new JLabel(strLbl);
			return lblpersonalCode;
		}
		
		
		
		
		private static PointCardAccount account;

		public static void main(String[] args) {

			// JFrameクラスのインスタンスを生成
			new Person2();




			// ポイントカードアカウントクラスをインスタンス化
			account = new PointCardAccount();
			account.initPointCardAccount("阿笠田奈", 1234, 10000);
		}
		
		
		
		public void actionPerformed(ActionEvent e) {

	
		}
}
