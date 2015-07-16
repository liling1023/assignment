package java3;
import java.io.*;
public class ReadFile {

	public static void main(String[] args) {
		String fileName1="y.txt";
		String fileName2="w.txt";
		try {
			FileReader fr= new FileReader(fileName1);
			FileWriter fw = new FileWriter(fileName2);
			BufferedReader bufferedReader=new BufferedReader(fr);
			String oneline;
			try {
				while((oneline=bufferedReader.readLine())!=null){
					System.out.println(oneline);
					fw.append(oneline);
				}			
				bufferedReader.close();
				fw.flush();
				fw.close();
				System.out.println("大文件y.txt已读入文件w.txt中");

			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
