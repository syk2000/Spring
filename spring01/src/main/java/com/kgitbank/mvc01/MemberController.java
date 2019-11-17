package com.kgitbank.mvc01;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //@ = 특정한 처리 이름 표시
			//annotation(표시)
			//controller클래스 상속받아서  controller역할을 해주는 클래스로 만들어주고, springframework에 등록
			//내부적으로 움직이는 클래스 annotation(표시), 어노테이션
public class MemberController {
	
	@Autowired //스프링이 만든 싱글톤을 자동으로 넣어주는 역할
	MemberDAO dao;
	//스프링이 주도적으로 객체를 만들고,
	//프로그래머는 스프링이 만들어준 객체의 주소를 사용.
	//스프링이 내가 만든 변수에 쏙 넣어준다.(제어의 역행) = (Inversion of Control) = IoC의 개념
	
	
	@RequestMapping("insert")
	public void insert(MemberDTO memberDTO) { //새로운 주소값을 만든다. //컨트롤러만 조심하면 된다.
		System.out.println("컨트롤러 호출됨...!!!");
		dao.insert(memberDTO);
		
		/*
		 * System.out.println(MemberDTO.getId()); System.out.println(MemberDTO.getPw());
		 * System.out.println(MemberDTO.getName());
		 * System.out.println(MemberDTO.getTel());
		 */
			
	}
	
	@RequestMapping("delete")
	public void delte(MemberDTO memberDTO) {
		System.out.println("delete요청");
		System.out.println("DB삭제 처리");
		dao.delete(memberDTO);
	}
	
	@RequestMapping("update")
	public void update(MemberDTO memberDTO) {
		System.out.println("update요청");
		System.out.println("DB수정 처리");
		dao.update(memberDTO);
	}
	
	
	@RequestMapping("select")
	public void select(MemberDTO memberDTO, Model model) {
		System.out.println("select요청");
		System.out.println("DB검색 처리");
		MemberDTO dto2 = dao.select(memberDTO);
		model.addAttribute("dto2",dto2);
		
		System.out.println(dto2.getId());
		System.out.println(dto2.getPw());
		System.out.println(dto2.getName());
		System.out.println(dto2.getTel());
	}
	
	@RequestMapping("selectAll")
	public void selectAll(MemberDTO memberDTO) {
		System.out.println("select요청");
		System.out.println("DB검색 처리");
		dao.selectAll(memberDTO);
	}
	
	

}
