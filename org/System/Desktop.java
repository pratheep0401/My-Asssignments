package org.System;

public class Desktop extends Computer {
public void DesktopSize() {
	System.out.println("DesktopSize");
}
public static void main(String[] args) {
	Desktop obj = new Desktop();
	obj.ComputerModel();
	obj.DesktopSize();
}
}
