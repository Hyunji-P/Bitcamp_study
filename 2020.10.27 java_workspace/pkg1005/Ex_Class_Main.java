package pkg1005;

public class Ex_Class_Main {

	public static void main(String[] args) {
		Ex_Class [] site = new Ex_Class[3];
		
		for (int i = 0; i < site.length; i++) {
			site[i] = new Ex_Class();
		}
		
		site[0].SiteAddress = "www.naver.com";
		site[0].SiteName = "���̹�";
		
		site[1].SiteAddress = "www.google.com";
		site[1].SiteName = "����";
		
		site[2].SiteAddress = "www.daum.net";
		site[2].SiteName = "����";
		
		for (int i = 0; i < site.length; i++) {
			site[i].internet();
		}

	}

}
