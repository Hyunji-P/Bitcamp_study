package pkg1026;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		// ��� �����ڴ� \\���� ǥ���Ѵ�.(/ �����ô� �Ѱ�)
		String pathname = "c:\\imsi\\jumsu.txt";

		File source = null;
		FileReader fr = null;
		// ���� Ŭ������ �ַ� �����
		BufferedReader br = null;

		try {
			// Stream Open ������ �ƴ�
			source = new File(pathname);
			// exists() : �����ϴ����� ��Ÿ���� �޼ҵ�
			System.out.println(source.exists());

			// FileReader�� �Ű����� File �̰� source ��ü�� File�̴� ���� �־��ش�.
			// new FileReader(source) ����Ϸ��� ������ ����ó�� �ؾ���
			// Stream Open ���� , fr�� br�� Stream ����
			fr = new FileReader(source);
			br = new BufferedReader(fr);

			String imsi = "";
			while ((imsi = br.readLine()) != null) {
				System.out.println(imsi);
			}

			System.out.println("�۾� �Ϸ�");

		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("��Ÿ ���� �߻�");
			e.printStackTrace();
		} finally {
			try {
				// fr�� ������� �����Ǿ����� �Ҹ��� ���� ���߿� �Ǿ����
				// ��? br �� fr�� �����ϰ� fr �� source�� ������
				// �׷��� , fr�� ���� ���� ������ ������ �ƿ� ���ϰ� �Ǿ���� NullPointerException �߻�
				if (br != null) {
					br.close();
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
