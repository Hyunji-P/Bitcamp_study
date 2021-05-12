package pkg1008;

public class Shape {
	private String name;
	private double xpos;
	private double ypos;
	private double radius;// ������
	private double width;// �غ�
	private double height;// ����
	private double area; // ����
	private double perimeter; // ���ѷ�
	private double diagonal;// �밢��

	// pi��� Math Ŭ���� �޼ҵ� ������
	final double pi = 3.14;

	public Shape(String name, double xpos, double ypos, double radius) {// ��
		this.name = name;
		this.xpos = xpos;
		this.ypos = ypos;
		this.radius = radius;
		this.circle();

	}

	public Shape(String name, double width, double height) {// �ﰢ��, �簢��
		this.name = name;
		this.width = width;
		this.height = height;

		if (this.name.equals("t")) {
			this.triangle();
		} else {
			this.rectangle();
		}
	}

	private void circle() {// ��
		this.perimeter = 2 * this.pi * this.radius; // pi��� Math Ŭ���� �޼ҵ� ������
		this.area = this.pi * Math.pow(this.radius, 2);
		this.Display();

	}

	private void triangle() {// �ﰢ��
		this.area = (this.width * this.height) / 2.0;
		this.Display();

	}

	private void rectangle() {// �簢��
		this.area = this.width * this.height;
		this.diagonal = Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
		this.Display();

	}

	// �ߺ� ���� �ʰ� �ٽ� Ǯ�� �� ��
	public void Display() {
		if (this.name.equals("c")) {
			this.name = "��";
			System.out.println("���� : " + this.name);
			System.out.println("������ : " + this.radius);
			System.out.printf("���ѷ� : %.2f\n", this.perimeter);
			System.out.printf("���� : %.2f\n", this.area);
			System.out.println("�߽� : (" + this.xpos + "," + this.ypos + ")");
			System.out.println();
		} else if (this.name.equals("t")) {
			this.name = "�ﰢ��";
			System.out.println("���� : " + this.name);
			System.out.println("�غ� : " + this.width);
			System.out.println("���� : " + this.height);
			System.out.printf("���� : %.2f\n", this.area);
			System.out.println();
		} else if (this.name.equals("r")) {
			this.name = "�簢��";
			System.out.println("���� : " + this.name);
			System.out.println("�غ� : " + this.width);
			System.out.println("���� : " + this.height);
			System.out.printf("���� : %.2f\n", this.area);
			System.out.printf("�밢�� ���� : %.2f\n", this.diagonal);
			System.out.println();
		}

	}

}
