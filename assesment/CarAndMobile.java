package assesment;

public class CarAndMobile {
	public void EngineStart() {
		// TODO Auto-generated method stub
	System.out.println("ENGINE STARTED SUCCESFULLY!!");
	}
	public void ClutchRelease() {
		// TODO Auto-generated method stub
	System.out.println("CLUTCH DIS ENGAGED FROM FLYWHEEL");
	}
	public void ApplyGear() {
		// TODO Auto-generated method stub
	System.out.println("GEAR CHANGED NEUTRAL INTO 1ST");
	}
	public void ApplyAccelerator() {
		// TODO Auto-generated method stub
	System.out.println("ONCE APPLY THE ACCELERATOR CAR GETS MOVE");

	}
	private void CallMaking() {
		// TODO Auto-generated method stub
	System.out.println("It's making a call!!");
	}
	private void TakePicture() {
		// TODO Auto-generated method stub
	System.out.println("Successfully captured!!");
	}
	private void Sharing() {
		// TODO Auto-generated method stub
	System.out.println("A media file shared");
	}
	
	public static void main(String[] args) {
		CarAndMobile trail=new CarAndMobile();
		System.out.println("---------CAR-----------------");
		trail.EngineStart();
		trail.ClutchRelease();
		trail.ApplyGear();
		trail.ApplyAccelerator();
		System.out.println("----------MOBILE-------------");
		trail.CallMaking();
		trail.TakePicture();
		trail.Sharing();
	}
	
}
