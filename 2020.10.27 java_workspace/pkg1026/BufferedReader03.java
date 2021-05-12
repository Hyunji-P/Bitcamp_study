package pkg1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader03 {

	public static void main(String[] args) {
		BufferedReader br = null;

		try {
			//br ��ü Stream open
			// 1. System.in �� InputStreamReader �Ű������� ��
			// 2. new InputStreamReader(System.in) �� BufferedReader �Ű������� ��
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("���� �Ѱ��� �Է��ϼ���");
			int first = Integer.parseInt(br.readLine());

			System.out.println("���� �Ѱ��� �Է��ϼ���");
			int second = Integer.parseInt(br.readLine());

			int result = Math.max(first, second);

			System.out.println("�Է��Ͻ� ���� �� ū ���� \'" + result + "\' �Դϴ�.");
		} catch (IOException e) {
			System.out.println("������ ����¿� ������ �߻��߽��ϴ�.");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("�߸��� ���� ���� �Դϴ�.");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

	}

}
