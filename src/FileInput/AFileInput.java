package FileInput;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class AFileInput  {
	private String text;
    public AFileInput(String text) {
	   settext(text);
	}


public void settext(String text) {
		this.text = text;
}

public String gettext() {
	return this.text;
}

public void fileinputcheck(String text) throws IOException  {
     FileInputStream input = null;
	try {
		input = new FileInputStream(text);
		@SuppressWarnings("resource")
		BufferedInputStream bin = new BufferedInputStream(input);
		int c;
		while((c = bin.read()) !=-1) {
			System.out.print((char) c);
		}
			
		} finally {
			if(input != null) {
				input.close();
			}
		}
	}
}

