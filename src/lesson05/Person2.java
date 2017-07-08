package lesson05;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
	JLabel lblPersonalCode, lblPoint;
	JTextField txtPersonalCode, txtPoint, txtPointBalance;
	JButton btnPointBalance, btnPurchasePoints, btnUseThePoints;

	// コンストラクタでフレームを初期化
	public Person2() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JFrameを使ってフレームを表示");
		setSize(530, 100);

		getPanel().setLayout(getGrid());

		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.gridy = 0;
		//	gbc.gridwidth  = 1
		//	gbc.gridheight = 2;	// 縦２つ分
		getLblPersonalCode().setText("暗証番号");
		getGrid().setConstraints(getLblPersonalCode(), gbc);			
		getPanel().add(getLblPersonalCode());

		gbc.gridx = 1;
		getGrid().setConstraints(getTxtPersonalCode(), gbc);
		getPanel().add(getTxtPersonalCode());

		gbc.gridx = 2;
		getBtnPointBalance().setText("ポイント照会");
		getGrid().setConstraints(getBtnPointBalance(), gbc);
		getPanel().add(getBtnPointBalance());
		
		gbc.gridx = 3;
		getBtnPurchasePoints().setText("ポイント購入");
		getGrid().setConstraints(getBtnPurchasePoints(), gbc);
		getPanel().add(getBtnPurchasePoints());
				
		

		gbc.gridx = 4;
		getBtnUseThePoints().setText("ポイント利用");
		getGrid().setConstraints(getBtnUseThePoints(), gbc);
		getPanel().add(getBtnUseThePoints());
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		getGrid().setConstraints(getTxtPoint(), gbc);
		getPanel().add(getTxtPoint());


		gbc.gridx = 1;
		getLblPoint().setText("ポイント");
		getGrid().setConstraints(getLblPoint(), gbc);
		getPanel().add(getLblPoint());
		
		gbc.gridx = 2;
		gbc.gridwidth = 3;
		getGrid().setConstraints(getTxtPointBalance(), gbc);
		getPanel().add(getTxtPointBalance());
		
		
		
		getTxtPersonalCode().addActionListener(this);
		getBtnPointBalance().addActionListener(this);
		getBtnPurchasePoints().addActionListener(this);
		getBtnUseThePoints().addActionListener(this);
		
		
		setBtnEnabled(false);
		

		getContentPane().add(getPanel(), BorderLayout.CENTER);
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
	 * @return
	 */
	private JLabel getLblPersonalCode() {
		if (lblPersonalCode == null) lblPersonalCode = new JLabel();
		return lblPersonalCode;
	}

	/**
	 * 
	 * @return
	 */
	private JTextField getTxtPersonalCode() {
		if (txtPersonalCode == null) txtPersonalCode = new JTextField("", 4);				
		return txtPersonalCode;
	}


	private JButton getBtnPointBalance() {
		if (btnPointBalance == null) btnPointBalance = new JButton();
		return btnPointBalance;
	}
	
	
	private JButton getBtnPurchasePoints() {
		if (btnPurchasePoints == null) btnPurchasePoints = new JButton();
		return btnPurchasePoints;
	}
	
	
	private JButton getBtnUseThePoints() {
		if (btnUseThePoints == null) btnUseThePoints = new JButton();
		return btnUseThePoints;
	}
	
	
	private JTextField getTxtPoint() {
		if (txtPoint == null) txtPoint = new JTextField("", 10);
		return txtPoint;
	}
	
	
	private JLabel getLblPoint() {
		if (lblPoint == null) lblPoint = new JLabel();
		return lblPoint;
	}
	
	
	private JTextField getTxtPointBalance() {
		if (txtPointBalance == null) txtPointBalance = new JTextField("", 20);
		return txtPointBalance;
	}
	
	
	

	
	private static PointCardAccount account;

	public static void main(String[] args) {

		// JFrameクラスのインスタンスを生成
		new Person2();
		// ポイントカードアカウントクラスをインスタンス化
		account = new PointCardAccount();
		account.initPointCardAccount("阿笠田奈", 1234, 10000);
		
	}


	/**
	 * 
	 */
	public void actionPerformed(ActionEvent e) {
		//
		if (e.getSource() == getTxtPersonalCode()) {
			getTxtPoint().setText(null);
			getTxtPointBalance().setText(null);
			
			try {
				if (account.getPersonalCode() == Integer.parseInt(getTxtPersonalCode().getText())) {
					setBtnEnabled(true);
				}
				else {
					setBtnEnabled(false);
					showMessage("アカウントが存在しません。", "警告");
				}
			} catch (NumberFormatException ex) {
				setBtnEnabled(false);
				showMessage("アカウントが存在しません。", "警告");
			}
		} 
		// ポイント残高照会
		else if (e.getSource() == getBtnPointBalance()) {
			getTxtPointBalance().setText("ポイント残高は" + account.getBalancePoint() + "ポイントです。");
		}
		// ポイント購入
		else if (e.getSource() == getBtnPurchasePoints()) {
			try {
				account.parchasePoint(Integer.parseInt(getTxtPoint().getText()));
				getTxtPointBalance().setText("ポイント残高は" + account.getBalancePoint() + "ポイントです。");
			} catch(NumberFormatException ex) {
				showMessage("入力されたポイントの数値が不正です。", "警告");				
			}
		}
		//　ポイント利用
		else if (e.getSource() == getBtnUseThePoints()) {
			try {
				account.usePoint(Integer.parseInt(getTxtPoint().getText()));
				
				if (account.getBalancePoint() < Integer.parseInt(getTxtPoint().getText())) {
					showMessage("ポイント残高が不足しています。", "警告");
					return;
				}
				getTxtPointBalance().setText("ポイント残高は" + account.getBalancePoint() + "ポイントです。");
			} catch(NumberFormatException ex) {
				showMessage("入力されたポイントの数値が不正です。", "警告");								
			}
		}
	}
	
	/**
	 * 
	 * @param bool
	 */
	private void setBtnEnabled(boolean bool) {
		getBtnPointBalance().setEnabled(bool);
		getBtnPurchasePoints().setEnabled(bool);
		getBtnUseThePoints().setEnabled(bool);
	}

	/**
	 * 
	 */
	private void showMessage(String text, String title) {
		//●タイトルを付けたメッセージ出力
		JOptionPane.showMessageDialog(this, text, title, JOptionPane.WARNING_MESSAGE);	

	}
}