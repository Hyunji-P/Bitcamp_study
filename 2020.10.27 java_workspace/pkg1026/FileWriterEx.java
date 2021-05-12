package pkg1026;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {
		String pathname = "c:\\imsi\\abct.txt";
		File dest = new File(pathname);

		// 1.����
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			// 2. ��ü ���� (���� ����)
			fw = new FileWriter(dest);
			bw = new BufferedWriter(fw);

			bw.write("������,ȣȣ,10,abc");
			bw.newLine();// ����Ű
			bw.write("��������,ũũ,20,def");
			bw.newLine();
			// �Է� �� imsi ���� Ȯ��

			for (int i = 1; i < 101; i++) {
				bw.write(String.valueOf(i * i));//�Ű������� String �̿��� ���� ��ȯ������� 
				bw.newLine();//���Ͽ� ���
			}

			System.out.println("�۾� �Ϸ�"); //����Ϳ� ��� 
		} catch (IOException e) {
			System.out.println("����� ���� �߻�");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("��Ÿ ���� �߻�");
			e.printStackTrace();
		} finally {
			try {
				// �ݴ� ����
				if (bw != null) {
					bw.close();
				}

				if (fw != null) {
					fw.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
