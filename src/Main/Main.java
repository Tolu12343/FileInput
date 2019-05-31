package Main;


import java.io.IOException;

import FileInput.AFileInput;

public class Main {
 public static void main(String[] args) throws IOException{
	 AFileInput p1 = new AFileInput("C:\\Users\\tolua\\Desktop\\input.txt");
	 p1.fileinputcheck(p1.gettext());
	 
  }
}
