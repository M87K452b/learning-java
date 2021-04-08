import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ReadFile extends JFrame {
	
	private JTextField addressBar;
	private JEditorPane Display;
	
	//Constructor
	
	public ReadFile(){
		
		super("myBrowser");
		
		addressBar = new JTextField("http://");
		addressBar.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent event){
					loadCrap(event.getActionCommand());
				}
			}
		);
		add(addressBar, BorderLayout.NORTH);
		
		Display = new JEditorPane();
		Display.setEditable(false);
		Display.addHyperlinkListener(
			new HyperlinkListener(){
				public void hyperlinkUpdate(HyperlinkEvent event){
					if(event.getEventType()==HyperlinkEvent.EventType.ACTIVATED){
						loadCrap(event.getURL().toString());
					}
				}
			}
		);
		add(new JScrollPane(Display), BorderLayout.CENTER);
		setSize(800,600);
		setVisible(true);
	}
	//loadCrap method to display on the screen
	private void loadCrap(String userText){
		try{
			Display.setPage(userText);
			addressBar.setText(userText);
		}catch(Exception e){
			System.out.println("Oops! You don't know how to spell! :-P");
		}
		
	}
}
