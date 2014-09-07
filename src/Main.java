import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;


public class Main {

	public static void main(String[] args) {
		RegulatedMotor a = new EV3LargeRegulatedMotor(MotorPort.A);
		
		RegulatedMotor b = new EV3LargeRegulatedMotor(MotorPort.B);
		b.setSpeed(80);
		b.rotate(310);
		
		a.rotate(70);
		
		b.rotate(-310);
		
		RegulatedMotor c = new EV3LargeRegulatedMotor(MotorPort.C);
		c.rotate(-180);
		
		b.rotate(310);
		a.rotate(-70);
		
		b.rotate(-310);
		c.rotate(180);

	}

}
