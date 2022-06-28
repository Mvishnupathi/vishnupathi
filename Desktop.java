package org.system;

public class Desktop extends computer {
	public void desktopSize() {
	     
		system.out.println("This desktop size is 28 inches");
	}
	public static void main(String[] args) {
		
		Desktop size = new Desktop();
		computer model = new computer();
		size.desktopSize();
		model.computerModel();
		
	
	}
}
