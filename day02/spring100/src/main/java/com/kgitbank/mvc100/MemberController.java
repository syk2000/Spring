package com.kgitbank.mvc100;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@특정한처리이름 표시!
//annotation(표시), 어노테이션
//Controller클래스 상속받아서 controller역할을 해주는
//클래스로 만들어주고,
//spring framework에 등록

@Controller
public class MemberController {

	@Autowired
	MemberDAO dao;
	//스프링이 주도적으로 객체를 만들고,
	//프로그래머는 스프링이 만들어준 객체의 주소를 사용.
	//스프링이 내가 만든 변수에 쏙 넣어준다.
	//제어의 역행(Inversion of Control: IoC) 
	
	@RequestMapping("insert")
	public void insert(MemberDTO memberDTO) {
		System.out.println("컨트롤러 호출됨...!!");
		dao.insert(memberDTO);
		
		System.out.println(memberDTO.getId());
		System.out.println(memberDTO.getPw());
		System.out.println(memberDTO.getName());
		System.out.println(memberDTO.getTel());
	}
	
	
}
