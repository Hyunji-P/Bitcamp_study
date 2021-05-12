package pkg1005;

public class Ex_Class_Main {

	public static void main(String[] args) {
		Ex_Class [] site = new Ex_Class[3];
		
		for (int i = 0; i < site.length; i++) {
			site[i] = new Ex_Class();
		}
		
		site[0].SiteAddress = "www.naver.com";
		site[0].SiteName = "네이버";
		
		site[1].SiteAddress = "www.google.com";
		site[1].SiteName = "구글";
		
		site[2].SiteAddress = "www.daum.net";
		site[2].SiteName = "다음";
		
		for (int i = 0; i < site.length; i++) {
			site[i].internet();
		}

	}

}
