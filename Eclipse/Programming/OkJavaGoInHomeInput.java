import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;


public class OkJavaGoInHomeInput {
	
	

	public static void main(String[] args) { //args = parameter, 매개변수라 한다.
		String id = args[0];
		String bright = args[1];
		
		
		
		
		//Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		
		//Security off
		Security mySecurity = new Security(id);
		
		mySecurity.off();
		
		//Light on
		Lighting hallLamp = new Lighting(id+"/HallLamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+"/floorLamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+ " moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
		
	
	}

}