package myPro;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class FirstClass
{
	public static void main(String args[]) throws Exception
	{
		String details = ".... Ronak has made this ....";          // Here you can give whatever message you want.
		
		ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();
		
		File f = new File("C:\\Users\\Raounak Sharma\\Desktop\\Ronaq\\Ronaq's_QRcode.jpg");
		FileOutputStream fos = new FileOutputStream(f);
		
		fos.write(out.toByteArray());
		fos.flush();
		
	}
}
	
   
   
   
  

