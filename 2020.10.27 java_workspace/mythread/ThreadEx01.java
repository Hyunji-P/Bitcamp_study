package mythread;

public class ThreadEx01 {

	public static void main(String[] args) {
		RandomCreator rc = null;

		try {
			rc = new RandomCreator();
			rc.start();

			for (int i = 0; i < 20; i++) {
				// �����ڸ� 1���� ȣ���ϰ� ������(1ȸ��)
				new UserCalender();
				Thread.sleep(1000);

			}
//			int i = 0;
//			while (true) {
//				i += 1;
//				System.out.println("���� ������ : " + i);
//				Thread.sleep(1000);
//			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

//Thread.sleep(1000); �� �߰� �Ҷ� 
//���ۿ� ������ �ɴٺ��� �ٸ� �����尡 �ܺο��� ������ �� ����
//ex) �츮�� �����ؼ� ���� �ϰ� ������ �������� ������ �ϸ� ������ ���ϰ� �Ǽ� �� ���ɼ��� ����
//���� ���� ���� ���Ͽ� �����嵵 �Ȱ��� �ٸ� �����尡 �����Ҷ� ���� ����Ǵ� �����尡 ������ �ɼ� ������ 
//�ݵ�� try catch ���� ����ó���� �ض��� ���� 
//������ ���� exception�� ������������ InterruptedException ������ ���� ���ܸ� throws�ѰŶ�� ������(���� �ߴ��Ŷ� ����)
