package controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import bean.Album;
import bean.CheckBean;
import dao.AlbumDao;

@Controller
public class AlbumUpdateController {// 앨범 수정하기
	private final String commandName = "album";

	@ModelAttribute(commandName)
	public Album some() {
		return new Album();
	}

	@Autowired
	@Qualifier("dao")
	private AlbumDao albumDao;

	@ModelAttribute("mediatypelist") // 미디어 유형
	public List<CheckBean> aaa() { // 모듈이 album 이고 mediatype 인 list 항목을 가져와서 체크박스에 넣음
		List<CheckBean> lists = this.albumDao.GetList("album", "mediatype");
		return lists;
	}

	@ModelAttribute("emailagreelist") // 이메일 수신 여부 관련
	public List<CheckBean> bbb() {
		List<CheckBean> lists = this.albumDao.GetList("album", "emailagree");
		return lists;
	}

	@ModelAttribute("genrelist") // 장르 목록
	public List<CheckBean> ccc() {
		List<CheckBean> lists = this.albumDao.GetList("album", "genre");
		return lists;
	}
	
	private final String requesturl = "/update.al"; // 요청 url
	private final String gotoPage = "alUpdateForm"; // 가고자 하는 페이지
	private final String redirect = "redirect:/list.al"; // 리다이렉션을 위한 페이지 

	// @GetMapping
	@RequestMapping(value = requesturl, method = RequestMethod.GET)
	public ModelAndView doGet(
			@RequestParam(value = "id", required = true) int id) { // 필수 파라미터 
		// 기본 키를 사용하여 이전에 기입했던 Album 정보를 읽어 옵니다. 
		System.out.println("AlbumUpdateController의 id : " + id);
		
		Album album = this.albumDao.getAlbumById(id);
		System.out.println("이전 앨범의 정보");
		System.out.println(album.toString());
		
		return new ModelAndView(gotoPage, "album" , album); // 앨범 정보도 가져옴 
	}

	// @PostMapping
	@RequestMapping(value = requesturl, method = RequestMethod.POST)
	public ModelAndView doPost(@ModelAttribute("album") @Valid Album xxx, BindingResult asdf,
			HttpServletRequest request) {
		
		System.out.println("커맨드 객체 정보 : ");
		System.out.println(xxx.toString());

		ModelAndView mav = new ModelAndView();

		if (asdf.hasErrors()) {
			System.out.println("유효성 검사에 문제가 있음");
			System.out.println(asdf.toString());
			mav.setViewName(gotoPage);
		} else {
			System.out.println("유효성 검사에 문제가 없음");
			// 파일 업로드를 진행
			MultipartFile multi = xxx.getAbcd(); // Album xxx 커맨드 객체, 사진 이름 가져오기
			String uploadPath = "/WEB-INF/upload"; // 업로드가 되는 폴더 이름

			// 업로드 파일이 저장되는 실제 경로
			String realPath = request.getRealPath(uploadPath);
			System.out.println(realPath);

			try {// 파일 업로드 성공
				// 업로드 폴더에 파일을 업로드 합니다.
				File destination = utility.Utility.getUploadecFileInfo(multi, realPath);
				// transferTo : 업로드한 파일 데이터를 지정한 file 객체에 저장
				// 파일을 받으면 transferTo 메소드를 이용하여 업로드 한다고 보면 됨
				// 단 , 이름이 중복되는 경우 자동으로 처리해주는 기능이 없으므로 파일 이름을 중복없이 저장하는 것을 고려
				multi.transferTo(destination);

				System.out.println(this.getClass() + "앨범 수정하기 command 정보");
				System.out.println(xxx.toString());
				
				// 최초 등록 시 업로드된 이미지는 삭제 되는 게 정석입니다. (추후 개발) 

				// 원래 이미지에 날짜를 붙인 새 이미지 이름
				xxx.setImage(destination.getName());
				
				// dao 를 이용하여 데이터 베이스에 행을 수정합니다.
				this.albumDao.update(xxx);

				// response.sendRedirect("list.al")와 등가의 개념
				mav.setViewName(redirect); // 리다이렉션
			} catch (IllegalStateException e) { // transferTo 메소드를 사용하면 IllegalStateException 이 발생함
				e.printStackTrace();
				mav.setViewName("redirect:/update.al" + "?id=" + xxx.getId()); // 리다이렉션
			} catch (Exception e) {// 파일 업로드 실패
				e.printStackTrace();
				mav.setViewName("redirect:/update.al" + "?id=" + xxx.getId()); // 리다이렉션
			}

		}

		return mav;
	}
}
