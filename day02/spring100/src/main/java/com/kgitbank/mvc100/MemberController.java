package com.kgitbank.mvc100;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Ư����ó���̸� ǥ��!
//annotation(ǥ��), ������̼�
//ControllerŬ���� ��ӹ޾Ƽ� controller������ ���ִ�
//Ŭ������ ������ְ�,
//spring framework�� ���

@Controller
public class MemberController {

	@Autowired
	MemberDAO dao;
	//�������� �ֵ������� ��ü�� �����,
	//���α׷��Ӵ� �������� ������� ��ü�� �ּҸ� ���.
	//�������� ���� ���� ������ �� �־��ش�.
	//������ ����(Inversion of Control: IoC) 
	
	@RequestMapping("insert")
	public void insert(MemberDTO memberDTO) {
		System.out.println("��Ʈ�ѷ� ȣ���...!!");
		dao.insert(memberDTO);
		
		System.out.println(memberDTO.getId());
		System.out.println(memberDTO.getPw());
		System.out.println(memberDTO.getName());
		System.out.println(memberDTO.getTel());
	}
	
	
}
