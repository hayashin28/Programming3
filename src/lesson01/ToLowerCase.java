package lesson01;

import java.applet.Applet;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * 第1回 最終課題1
 * テキストボックスに入力された大文字の文字列を小文字に変換
 * @author 林宏典（15T055）
 *
 */
public class ToLowerCase extends Applet {

	private static final long serialVersionUID = 1L;

	//各テキストフィールドを宣言
	private TextField inputText, outputText;
	
	@Override
	public void init() {
		//各テキストフィールドをインスタンス化
		inputText  = new TextField("", 10);
		outputText = new TextField("", 10);
		//出力テキストフィールドを非活性火
		outputText.setEnabled(false);
		outputText.setBackground(Color.LIGHT_GRAY);
		//各入力項目をフォームに登録
		add(inputText);	add(outputText);
		
		/**
		 * テキストフィールド Enter押下時のリスナー
		 * 入力テキストフィールドに紐付け
		 */
		inputText.addActionListener(new ActionListener() {
			/**
			 * ActionListenerの持つメソッド
			 */
			public void actionPerformed(ActionEvent e) {
				//入力された値の小文字を大文字に変換して出力
				outputText.setText(inputText.getText().toLowerCase());
			}
		});
		
		/**
		 * テキストフィールド変更リスナー
		 * 入力テキストフィールドに紐付け
		 */
		inputText.addTextListener(new TextListener() {
			/**
			 * TextListenerの持つメソッド
			 */	
			public void textValueChanged(TextEvent e) {
				//出力テキストフィールドを初期化	
				outputText.setText("");
			}
		});
	}
}
