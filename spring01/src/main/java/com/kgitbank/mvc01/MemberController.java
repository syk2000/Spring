package com.kgitbank.mvc01;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //@ = Ư���� ó�� �̸� ǥ��
			//annotation(ǥ��)
			//controllerŬ���� ��ӹ޾Ƽ�  controller������ ���ִ� Ŭ������ ������ְ�, springframework�� ���
			//���������� �����̴� Ŭ���� annotation(ǥ��), ������̼�
public class MemberController {
	
	@Autowired //�������� ���� �̱����� �ڵ����� �־��ִ� ����
	MemberDAO dao;
	//�������� �ֵ������� ��ü�� �����,
	//���α׷��Ӵ� �������� ������� ��ü�� �ּҸ� ���.
	//�������� ���� ���� ������ �� �־��ش�.(������ ����) = (Inversion of Control) = IoC�� ����
	
	
	@RequestMapping("insert")
	public void insert(MemberDTO memberDTO) { //���ο� �ּҰ��� �����. //��Ʈ�ѷ��� �����ϸ� �ȴ�.
		System.out.println("��Ʈ�ѷ� ȣ���...!!!");
		dao.insert(memberDTO);
		
		/*
		 * System.out.println(MemberDTO.getId()); System.out.println(MemberDTO.getPw());
		 * System.out.println(MemberDTO.getName());
		 * System.out.println(MemberDTO.getTel());
		 */
			
	}
	
	@RequestMapping("delete")
	public void delte(MemberDTO memberDTO) {
		System.out.println("delete��û");
		System.out.println("DB���� ó��");
		dao.delete(memberDTO);
	}
	
	@RequestMapping("update")
	public void update(MemberDTO memberDTO) {
		System.out.println("update��û");
		System.out.println("DB���� ó��");
		dao.update(memberDTO);
	}
	
	
	@RequestMapping("select")
	public void select(MemberDTO memberDTO, Model model) {
		System.out.println("select��û");
		System.out.println("DB�˻� ó��");
		MemberDTO dto2 = dao.select(memberDTO);
		model.addAttribute("dto2",dto2);
		
		System.out.println(dto2.getId());
		System.out.println(dto2.getPw());
		System.out.println(dto2.getName());
		System.out.println(dto2.getTel());
	}
	
	@RequestMapping("selectAll")
	public void selectAll(MemberDTO memberDTO) {
		System.out.println("select��û");
		System.out.println("DB�˻� ó��");
		dao.selectAll(memberDTO);
	}
	
	

}
