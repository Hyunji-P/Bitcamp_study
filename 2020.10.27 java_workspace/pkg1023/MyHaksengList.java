package pkg1023;

import java.util.ArrayList;
import java.util.List;

public class MyHaksengList {

	public static void main(String[] args) {
		Hakseng soo = new Hakseng("±èÃ¶¼ö", 1, 3, 30, 40, 50);
		Hakseng hee = new Hakseng("¹Ú¿µÈñ", 1, 4, 70, 80, 90);

		List<Hakseng> lists = new ArrayList<Hakseng>();
		lists.add(soo);
		lists.add(hee);
		lists.add(new Hakseng("È«±æµ¿", 1, 5, 40, 50, 60));

		HaksengHtml html = new HaksengHtml(lists);
		html.Display();

	}

}
