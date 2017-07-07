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
	JLabel lblPersonalCode;
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
		getPanel().add(getBtnUseThePoints());
				

		gbc.gridx = 4;
		getBtnUseThePoints().setText("ポイント利用");
		getGrid().setConstraints(getBtnPurchasePoints(), gbc);
		getPanel().add(getBtnUseThePoints());
		
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		getGrid().setConstraints(getTxtPoint(), gbc);
		getPanel().add(getTxtPoint());


		gbc.gridy = 1;
		getGrid().setConstraints(getTxtPointBalance(), gbc);
		getPanel().add(getTxtPointBalance());
		
		
		
		getTxtPersonalCode().addActionListener(this);
		getBtnPointBalance().addActionListener(this);
		getBtnPointBalance().addActionListener(this);
		getBtnUseThePoints().addActionListener(this);
		

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
	
	
	
	private JTextField getTxtPointBalance() {
		if (txtPointBalance == null) txtPointBalance = new JTextField();
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



	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == getTxtPersonalCode()) {
			try {
				if (account.getPersonalCode() == Integer.parseInt(getTxtPersonalCode().getText())) {
					
					return;													
				}
				else {
					//●タイトルを付けたメッセージ出力
					JOptionPane.showMessageDialog(null, "本文", "タイトル", JOptionPane.WARNING_MESSAGE);	
				}
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "本文", "タイトル", JOptionPane.WARNING_MESSAGE);	
			}
		} 
		else {
			
		}
	}
}