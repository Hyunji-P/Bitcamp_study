package pkg0928;
// ��°� �����غ��� 
public class ArrayExam5 {
	public static void main(String[] args) {
		int[] aaa = { 10, 20 };
		int[][] arr = new int[2][3];
//        arr.length : ���
//        arr[i].length : ����
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				arr[i][k] = i % arr.length + 3 * k + i;
			}
		}
		arr[0][2] = aaa[0] - 5;
		arr[1][1] = arr[0][2] * aaa[1] - 7;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("===" + i + "��° �� ��� === ");
			for (int k = 0; k < arr[i].length; k++) {
				System.out.print(arr[i][k] + "\t");
			}
			System.out.println();
		}
	}
}
