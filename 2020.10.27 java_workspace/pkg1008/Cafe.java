package pkg1008;

import java.util.Scanner;

public class Cafe {

	private double totalSum = 0.0; // �� ����
	private int menuNum;// �޴� ��ȣ
	private int inOut; // ����Ļ����� ����ũ �ƿ����� ���ڸ� ��Ÿ��
	private String inOutKorea; // ����Ļ����� ����ũ �ƿ����� ���ڸ� ��Ÿ��
	// �޴� �̸�
	private String[] menuName = { "�Ƹ޸�ī��", "ī���", "īǪġ��", "������", "������ġ", "������ ��õ �޴�" };
	// �޴� ���� ����
	private int[] menuPrice = { 3500, 4000, 4500, 4300, 6000, 3000 };
	Scanner select;

	public Cafe() {
		this.select = new Scanner(System.in);
		this.inputMenu();
		this.calc();

	}

	private void inputMenu() {// �޴��� �Ļ����� �Է¹޴� �޼ҵ�
		System.out.println("************<Menu>************");
		System.out.println("1. �Ƹ޸�ī��	      3,500��");
		System.out.println("2. ī���             4,000��");
		System.out.println("3. īǪġ��             4,500��");
		System.out.println("4. ������             4,300��");
		System.out.println("5. ������ġ	      6,000��");
		System.out.println("6. ������ ��õ �޴�      3,000��");
		System.out.println("******************************");

		System.out.println("�������! �޴��� �����ϼ���.");
		this.menuNum = select.nextInt();
		System.out.println();
		System.out.println("����Ļ��̸� 1��,Take Out�̸� 2���� �����ϼ���.");
		System.out.println("1. ����Ļ� , 2. Take Out (15% ����)");
		System.out.println();
		this.inOut = select.nextInt();

	}

	private void calc() {// ������ �����ϴ� �޼ҵ�
		if (this.inOut == 1) { // ����Ļ�
			this.inOutKorea = "����Ļ�";
			this.totalSum += (double) this.menuPrice[this.menuNum - 1];
		} else if (this.inOut == 2) {// ����ũ �ƿ�
			this.inOutKorea = "����ũ �ƿ�";
			this.totalSum += (double) this.menuPrice[this.menuNum - 1] * (1.0 - 0.15);
		}

	}

	public void Display() {
		System.out.println("[��� ���]");
		System.out.println("����");
		if (this.menuNum == 6) {
			this.menuName[this.menuNum - 1] = "������ �ֽ�";
		} else {

		}
		System.out.println("�ֹ� �Ͻ� \"" + this.menuName[this.menuNum - 1] + "\" ���Խ��ϴ�.");
		System.out.print(this.inOutKorea + "�̹Ƿ� �� ������ ");
		System.out.printf("%d�� �Դϴ�.\n", (int) this.totalSum / 10 * 10);
		System.out.println("�����մϴ�.");

	}

}
