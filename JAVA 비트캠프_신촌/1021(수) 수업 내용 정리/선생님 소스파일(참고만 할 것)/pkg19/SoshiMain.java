package pkg19;
public class SoshiMain {
	public static void main(String[] args) {
		String[] soshi = {"����", "ȿ��", "����"} ;		
		String name = "��ö��" ;
		
		//false�̸� �ҽ� ����� �ƴ϶�� ����
		boolean isMember = false ; //flag ����
		
		try {
			for (int i = 0; i < soshi.length; i++) {
				if (soshi[i].equals(name)) {
					isMember = true ; 
					break ;
				}
			}
			if (isMember == true) {
				System.out.println( name + "�� �ҽ� ����� �¾ƿ�.");
				
			} else {			
				String message = name + "�� �ҽ� ����� �ƴմϴ�." ;
				 
				//1ȸ�� ��ü�� ���� throw�� �Ѱ� �ݴϴ�.
				throw new GirlException(message);  
			}
		}catch(GirlException ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
			System.out.println();
			ex.printStackTrace();
		}
	}
}











