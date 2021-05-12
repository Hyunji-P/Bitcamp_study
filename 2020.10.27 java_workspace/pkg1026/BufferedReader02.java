package pkg1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReader02 {

	public static void main(String[] args) {
		InputStream in = null; // 1. Ű����� ���𰡸� ������ ����Ʈ�� �ٲ�

		// �긴�� ��Ʈ�� : ���ڿ��� ����Ʈ�� �Ǵ� ����Ʈ�� ���ڿ��� ��ȯ���ִ� ��Ʈ��
		// InputStreamReader : 2. ����Ʈ �� ���ڿ�
		InputStreamReader isr = null;
		// BufferedReader : 3. Reader Ŭ������ ȿ������ ���̱� ���Ͽ� �������ִ� ���� ��Ʈ��
		BufferedReader br = null;

		try {
			// Stream open
			in = System.in;
			// in �� Ű���� ����
			isr = new InputStreamReader(in);
			// isr �� in����
			br = new BufferedReader(isr);
			// br �� isr ����
			System.out.print("�غ� �Է� : ");
			double width = Double.parseDouble(br.readLine()); // readLine() : ������ ������ �о� ���δ�.

			System.out.print("���� �Է� : ");
			double height = Double.parseDouble(br.readLine()); // readLine() : ������ ������ �о� ���δ�.

			double area = width * height / 2.0;
			System.out.println("���� : " + area);

			System.out.println("�۾� �Ϸ�");

		} catch (IOException e) { // ������ �аų� ���� ���� �߻� , readLine() �ϸ� throws �ϱ⶧���� �ݵ�� �ۼ�������� 
			System.out.println("������ ����¿� ������ �ֽ��ϴ�.");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("�߸��� ���� �����Դϴ�.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("��Ÿ ���� �߻�");
			e.printStackTrace();

		} finally {
			// Stream close �� not null(�ǹ̰� �ִ� ������)
			try {
				if (br != null) {
					br.close();
				}

				if (isr != null) {
					isr.close();
				}

			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
	}

}
