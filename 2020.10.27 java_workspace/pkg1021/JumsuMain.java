package pkg1021;

import java.util.Scanner;

public class JumsuMain {

	public static void main(String[] args) {
		Scanner scan = null;
		String name = null;
		int kor = 0, eng = 0, math = 0, total = 0;
		double average = 0.0;

		try {
			scan = new Scanner(System.in);
			System.out.print("������ �Է� : ");
			name = scan.next();
			System.out.print("���� �Է� : ");
			kor = scan.nextInt();
			System.out.print("���� �Է� : ");
			eng = scan.nextInt();
			System.out.print("���� �Է� : ");
			math = scan.nextInt();

			total = kor + eng + math;
			average = (double) total / 3.0;

			//���������� �������� �ڵ��غ���
			if (kor <= 40 || eng <= 40 || math <= 40) {
				String result01 = "����";
				MinJumsuException message = new MinJumsuException(result01);
				throw message;

			} else if (total < 180) {
				String result02 = "��� ���� ����";
				throw new FailedException(result02);

			}
			System.out.println("���� : " + total);
			System.out.printf("����� %.2f\n", average);

		} catch (MinJumsuException ex) {// ��� ������ 40�� �����϶�
			System.out.println("���� ���ڿ� : " + ex.toString());
			System.out.println("�޼��� : " + ex.getMessage());
			ex.printStackTrace();

		} catch (FailedException ex) {// ���� ������ 180�� �̸��϶�
			System.out.println("�޼��� : " + ex.getMessage());
			System.out.println("���� ���ڿ� : " + ex.toString());
			ex.printStackTrace();
			
		} catch (Exception ex) {
			System.out.println("������ ����~");
		} finally {// ������ ����Ǵ� �Ŵϱ� ����ٰ� ���� , ��� ������ �ȵ�

			scan.close();
		}

	}

}
