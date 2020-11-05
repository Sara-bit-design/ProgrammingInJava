import java.applet.Applet;
import java.awt.Graphics; 

/*
 * <applet code =" Hello World" width=200 height=60 >
 * </applet>
 */
public class appletdemo extends Applet{
	
	public void paint(Graphics g) {
		g.drawString("Hello world", 20, 20);
	}
	

}
