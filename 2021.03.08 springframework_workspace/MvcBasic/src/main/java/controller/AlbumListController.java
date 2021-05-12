package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import bean.Album;
import dao.AlbumDao;
import utility.Paging;

@Controller
public class AlbumListController { // 앨범 목록

	@Autowired // 자동 주입 (현재 값이 null 이기 때문에 외부에서 의미있는 값으로 주입)
	@Qualifier("dao") // 여러가지 다오가 존재 할 수도 있기 때문에 AlbumDao 에서의 객체로 명시
	private AlbumDao albumDao; // 인스턴스 변수이므로 현재 값은 null

	@RequestMapping(value = "list.al")
	public ModelAndView handleRequest(
			@RequestParam(value = "what", required = false) String what,
			@RequestParam(value = "keyword", required = false) String keyword,
			@RequestParam(value = "pageNumber", required = false) String pageNumber,
			@RequestParam(value = "pageSize", required = false) String pageSize,
			HttpSession session) {
		
		// 인터셉터 
		String loginfo = (String)session.getAttribute("loginfo");
		System.out.println("세션 정보");
		System.out.println(loginfo);
		
		
		System.out.println("what : " + what);
		System.out.println("keyword : " + keyword);
		System.out.println("pageNumber : " + pageNumber);
		System.out.println("pageSize : " + pageSize);

		// 필드 검색을 위한 코딩
		Map<String, String> map = new HashMap<String, String>();

		if (what != null && what.equals("all")) {
			what = null;
		}
		map.put("what", what);
		// %는 데이터 베이스의 like 연산자 때문에 작성함
		// 매퍼 파일에서 동적 sql 로 what 이 null 이 아닐 때 keyword 를 검색하는 것이기 때문에
		// keyword 가 null이여도 DB에서 %null% 로 검색되지는 않는다.
		// 즉 , keyword 가 null이 아닐때만 검색이 된다는 것 
		map.put("keyword", "%" + keyword + "%");

		int totalCount = this.albumDao.GetTotalCount(map);
		System.out.println("앨범 목록 갯수 : " + totalCount);

		// 페이징 처리를 위한 코딩
		String url = "";
		String whologin = "";
		Paging pageInfo = new Paging(pageNumber, pageSize, totalCount, url, what, keyword, whologin);

		System.out.println("offset : " + pageInfo.getOffset());
		System.out.println("limit : " + pageInfo.getLimit());

		List<Album> albumLists = this.albumDao.getAlbumList(pageInfo, map);
		
		System.out.println("앨범 리스트 갯수 : " + albumLists.size());
		
		// 각 데이터를 담아서 목록 페이지로 이동 
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("albumLists", albumLists);
		mav.addObject("pageInfo", pageInfo);
		
		mav.setViewName("alList");

		return mav;
	}

}
