import javax.swing.*;

public class Frame extends JFrame {
	
	JMenuBar menuBar; 
	JMenu 	 fileMenu; 
	JMenu 	 optionsMenu; 
	JMenu 	 helpMenu; 
	
	public Frame(){
		JFrame frame = new JFrame("Payroll System"); 
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setJMenuBar(loadMenu()); 
		frame.setVisible(true);
		
		
	}
	
	public JMenuBar loadMenu(){

		//Create the menu bar.
		menuBar = new JMenuBar();

		//Build the file menu.
		fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		
		//Build the options menu
		optionsMenu = new JMenu("Options"); 
		menuBar.add(optionsMenu); 
		
		//Build the help menu
		helpMenu = new JMenu("Help");
		menuBar.add(helpMenu); 
		
		
		return menuBar;
		
	}

}
