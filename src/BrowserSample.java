import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.BrowserFactory;


public class BrowserSample {
    
	public static void main(String args[])
	{
		Browser browser=BrowserFactory.create();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.add(browser.getView().getComponent(),BorderLayout.CENTER);
		frame.setSize(700,500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		browser.loadURL("https://www.google.com");
		
		
		
	}
}
