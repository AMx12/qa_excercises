import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WorkingWithFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WorkingWithFiles wwf = new WorkingWithFiles();
		FilePersonManager fpm = new FilePersonManager();

		FilePerson fp = new FilePerson("Andrew", 21, "Java Developer");
		FilePerson fp1 = new FilePerson("Paul", 22, "Police Officer");
		FilePerson fp2 = new FilePerson("Nick", 22, "Retail Assistant");
		FilePerson fp3 = new FilePerson("Philip", 21, "Retail Assistant");
		FilePerson fp4 = new FilePerson("Mark", 20, "3D Animator");

		fpm.filePersonList.add(fp);
		fpm.filePersonList.add(fp1);
		fpm.filePersonList.add(fp2);
		fpm.filePersonList.add(fp3);
		fpm.filePersonList.add(fp4);

		wwf.writeToFile((wwf.arrayListToString(fpm.filePersonList)));
		System.out.println(wwf.arrayListToString(fpm.filePersonList));
	}

	public void writeToFile(String fileString) {

		BufferedWriter bw = null;
		File file = new File("C:\\Users\\Andrew\\Desktop/myfile.txt");

		try {
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(fileString);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("File written Successfully");

	}

	public String arrayListToString(ArrayList<FilePerson> filePersonList) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < filePersonList.size(); i++) {

			sb.append(filePersonList.get(i).toString());
			sb.append(System.getProperty("line.separator"));

		}

		return sb.toString();
	}

}
