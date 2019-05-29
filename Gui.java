package sample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui extends JFrame{
	// ウィンドウ本体
	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ウィンドウの閉じ方
		setBounds(100,100,640,480); //位置とサイズ

		//ボタン作成
		JButton btn1 = new JButton("ボタン1");
		add(btn1);

		//クリック時の処理
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("クリック");
			}
		});
	}

	public static void main(String[] args) {
		Gui frm = new Gui(); // ウィンドウ作成
		frm.setVisible(true); //表示
	}
}
