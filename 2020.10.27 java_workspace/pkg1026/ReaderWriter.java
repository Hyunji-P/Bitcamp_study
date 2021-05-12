package pkg1026;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriter {

	public static void main(String[] args) {
		String path = "c:\\imsi\\fromfile.txt";
		String pathname = "c:\\imsi\\def.txt";
		
		File dest = new File(path);
		File dest1 = new File(pathname);

		FileReader fr = null;
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			// �б� �� ����
			fr = new FileReader(dest);
			br = new BufferedReader(fr);
			// ����
			bw = new BufferedWriter(new FileWriter(dest1));

			// �б� �� ����
			String imsi = "";
			while ((imsi = br.readLine()) != null) {
				bw.write(imsi);
				bw.newLine();
			}

			// ����
			imsi = "";
			for (int i = 1; i < 10; i++) {
				imsi = i + " * " + i + " = " + String.valueOf(i * i);
				bw.write(imsi);
				bw.newLine();
			}

			System.out.println("�۾� �Ϸ�");
		} catch (IOException e) {
			System.out.println("������ ����� ���� �Դϴ�.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("������ ���� �߻�");
			e.printStackTrace();
		} finally {
			try {
				if (br != null || bw != null) {
					br.close();
					bw.close();
				}
				if (fr != null) {
					fr.close();

				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
