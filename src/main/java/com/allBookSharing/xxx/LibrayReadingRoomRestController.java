package com.allBookSharing.xxx;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.allBookSharing.xxx.dto.ReadingRoom;
import com.allBookSharing.xxx.dto.Seats;
import com.allBookSharing.xxx.service.ReadingRoomManagement;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class LibrayReadingRoomRestController {

	@Autowired
	ReadingRoomManagement rm;

	// 열람실 등록
	@Secured("ROLE_LIBRARIAN")
	@RequestMapping(value = "/libraryreadingroominsert", produces = "application/json;charset=UTF-8")
	public String readingRoomInsert(String json, HttpServletRequest req)
			throws JsonParseException, JsonMappingException, IOException {

		// 제이슨 형태의 문자열을 객체로 변환
		ObjectMapper mapper = new ObjectMapper();
		ReadingRoom readingRoom = mapper.readValue(json, ReadingRoom.class);

		// 빅 데시멀 오류 발생 String.valueOf 사용하여 해결
		int lb_code = Integer.parseInt(String.valueOf(req.getSession().getAttribute("LB_CODE")));

		readingRoom.setRm_lcode(lb_code);

		return rm.readingRoomInsert(readingRoom);
	}

	// 열람실 목록 가져오기
	@Secured("ROLE_LIBRARIAN")
	@RequestMapping(value = "/readingroomlist", produces = "application/json;charset=UTF-8")
	public List<ReadingRoom> getReadingRoomList(HttpServletRequest req) {

		// 빅 데시멀 오류 발생 String.valueOf 사용하여 해결
		int lb_code = Integer.parseInt(String.valueOf(req.getSession().getAttribute("LB_CODE")));
		
		List<ReadingRoom> rList=rm.getReadingRoomList(lb_code);

		return rList;
	}
	
	//열람시 삭제하는 메소드
	@Secured("ROLE_LIBRARIAN")
	@RequestMapping(value = "/readingroomdelete", produces = "application/json;charset=UTF-8")
	public String ReadingRoomDelete(Integer rm_code) {
		
		String result= rm.ReadingRoomDelete(rm_code);

		return result;
	}
	
		// 열람실 수정
		@Secured("ROLE_LIBRARIAN")
		@RequestMapping(value = "/libraryreadingroommodify", produces = "application/json;charset=UTF-8")
		public String readingRoomModify(String json, HttpServletRequest req)
				throws JsonParseException, JsonMappingException, IOException {

			// 제이슨 형태의 문자열을 객체로 변환
			ObjectMapper mapper = new ObjectMapper();
			ReadingRoom readingRoom = mapper.readValue(json, ReadingRoom.class);

			// 빅 데시멀 오류 발생 String.valueOf 사용하여 해결
			int lb_code = Integer.parseInt(String.valueOf(req.getSession().getAttribute("LB_CODE")));

			readingRoom.setRm_lcode(lb_code);

			return rm.readingRoomModify(readingRoom);
		}
		
		// 열람실 좌석관리 목록 가져오기
		@Secured("ROLE_LIBRARIAN")
		@RequestMapping(value = "/readingroomseatlist", produces = "application/json;charset=UTF-8")
		public List<ReadingRoom> readingRoomSeatList(String json, HttpServletRequest req){

			// 빅 데시멀 오류 발생 String.valueOf 사용하여 해결
			int lb_code = Integer.parseInt(String.valueOf(req.getSession().getAttribute("LB_CODE")));
			List<ReadingRoom> rList=rm.readingRoomSeatList(lb_code);

			return rList;
		}
		
		// 사서가 열람실 좌석 예약 취소하는 메소드
		@Secured("ROLE_LIBRARIAN")
		@RequestMapping(value = "/librayreadingroomreservationcancel", produces = "application/json;charset=UTF-8")
		public String readingRoomCancel(String json, HttpServletRequest req)
						throws JsonParseException, JsonMappingException, IOException {

			// 제이슨 형태의 문자열을 객체로 변환
			ObjectMapper mapper = new ObjectMapper();
			Seats seat = mapper.readValue(json, Seats.class);
				
			return rm.readingRoomCancel(seat);
		}
		
		// 사서가 열람실 좌석 예약 취소하는 메소드
		@Secured("ROLE_LIBRARIAN")
		@RequestMapping(value = "/librayreadingroomreservationallcancel", produces = "application/json;charset=UTF-8")
		public String readingRoomAllCancel(String rm_code){
			System.out.println("모든 예약 취소:"+rm_code);
			
			return rm.readingRoomAllCancel(rm_code);
		}
		
}
