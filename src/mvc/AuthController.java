package mvc;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class AuthController {
	JFrame frame;
	AuthView view;

	public AuthController() {
		// TODO Auto-generated constructor stub
		frame=new JFrame();
		frame.setVisible(false);
		//frame.setBounds(100,100,456,535);
		frame.setBounds(100,100,656,635);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0,1,0,0));
		
		view = new AuthView();
	}
	
	public void login() {
		frame.add(view.login());
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}

}
