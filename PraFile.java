package java3;

import java.io.*;
import java.util.Scanner;

public class PraFile {
	public static File CreatFile() {
		File f = new File("E:/x.txt");
		boolean suc;
		try {
			suc = f.createNewFile();
			if (suc) {
				System.out.println("File x.txt has been created!");
			} else {
				System.out.println("Failed!! file x.txt already exists!");
			}
			return f;

		} catch (IOException e) {
			e.printStackTrace();
		}
		return f;

	}

	public static File WriteFile(File f) {
		try {
			char input;
			FileOutputStream os = new FileOutputStream(f);
			System.out.println("请输入字符，输入结束按#：");
			while ((input = (char) System.in.read()) != '#') {
				os.write(input);
			}
			os.close();
			System.out.println("content has been written to file x.txt");
			return f;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return f;

	}

	public static void ReadFile(File f) {
		try {
			int output;
			FileInputStream is = new FileInputStream(f);
			System.out.println("打印读入的数据：");
			while ((output = is.read()) != -1)
				System.out.print((char) output);
			is.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(" ");
	}

	public static void DeleteFile(File f) {

		boolean is_suc = f.delete();
		if (is_suc) {
			System.out.println("File x.txt has been deleted");
		} else {
			System.out.println("File x.txt has not been deleted");
		}

	}

	public static void main(String[] args) {
		File f = CreatFile();
		File file = WriteFile(f);
		ReadFile(file);
		System.out.println("是否要删除文件x.txt？yes or no");
		Scanner y = new Scanner(System.in);
		String in = y.next();
		if (in.equals("yes")) {
			DeleteFile(f);
		}

	}

}
