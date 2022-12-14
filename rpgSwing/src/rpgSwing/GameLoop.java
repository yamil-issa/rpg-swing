package rpgSwing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GameLoop {
	private static JFrame window = new JFrame("Age of Darkness");
	private static JPanel mainPanel = new JPanel();
	private static String playerName;
	private static String playerClass;
	
	public static JPanel getPanel() {
		return GameLoop.mainPanel;
		
	}
	
	public static JFrame getWindow() {
		return GameLoop.window;
		
	}
	public static void gameStart() {
		
		window.setSize(1000, 1000);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel.setLayout(new FlowLayout());
		
		JLabel mainLablel = new JLabel("Age of Darkness");
		JLabel secondLabel = new JLabel("A game made by Issa Yamil");
		JLabel thirdLabel = new JLabel("Choisissez une classe");
		JLabel fourthLabel = new JLabel("Choisissez une arme");
		
		JTextField playerName = new JTextField(20);

	    
		JButton playerNameButton = new JButton("Confirmer");
		
		ButtonAction infoPlayerName = new ButtonAction(playerName);
		
		
		 JComboBox<String> cb = new JComboBox<>(Player.getPlayerClassArray());
	
		
			
		playerNameButton.addActionListener(infoPlayerName);
		
		playerNameButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String classValue = (String) cb.getSelectedItem();
				GameLoop.playerClass = classValue;
			}
			
		});
        		
       
		mainPanel.add(mainLablel);
		mainPanel.add(secondLabel);
		mainPanel.add(playerName);
		mainPanel.add(thirdLabel);
		mainPanel.add(cb);
		mainPanel.add(playerNameButton);
		window.add(mainPanel);
		window.validate();
		window.setVisible(true);
	}
	
	public static String getPlayerNameGlobal() {
		return GameLoop.playerName;
	}
    
	public static String getPlayerClassGlobal() {
		return GameLoop.playerClass;
	}

}
