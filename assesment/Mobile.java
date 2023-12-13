package assesment;

public class Mobile {
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
	Mobile function=new Mobile();
	function.CallMaking();
	function.TakePicture();
	function.Sharing();
}
}
