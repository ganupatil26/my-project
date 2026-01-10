package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class DemoMain {

	public static void main(String[] args) throws Exception {

		Demo d = new Demo("bapuji salunke clg", "miraj", "ganu patil", 04, 2545254545l, 045254l, "comSci");
		FileOutputStream file = new FileOutputStream(
				"C:\\Users\\gp304\\eclipse-workspace\\Homework\\src\\serialization\\newfile.txt");
		ObjectOutputStream oss = new ObjectOutputStream(file);

		oss.writeObject(d);

		file.close();
		oss.close();
		System.out.println("file is created");
		System.out.println(
				d.collegeName + "  " + d.city + "  " + d.name + "  " + d.rollNo + "  " + d.pincode + "  " + d.dep);

	}
}
