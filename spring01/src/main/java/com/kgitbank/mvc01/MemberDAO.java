package com.kgitbank.mvc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

@Repository//싱글톤으로 객체를 만들어줘 //이것이 먼저 선행이 되어야한다.

public class MemberDAO {
		Connection con;
	public MemberDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.print("1. 커넥터 설정 ok...");
			
			//2. db연결
			String url = "jdbc:mysql://localhost:3309/spring";
			String user = "root";
			String password = "1234";
			con =  DriverManager.getConnection(url, user, password);
			System.out.print("2. db 연결 ok...");
			
		} catch (Exception e) {
			
		}
		

	}
	
	public void delete(MemberDTO dto) {
		
		try {
			
			
			//3. sql문 결정
			String sql = "delete from member where id= ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			
			System.out.print("3.SQL문 객체화 ok...");
			//부품(class)
			//자바 class
			//String site = "www.naver.com";
			//URL url = new URL(site);
			//File file = new File("c:/temp/test.txt");
			//File file2 = MakeFile.getFile("c:temp/test.txt"); 
			//4. sql문 전송
			ps.executeUpdate();
			
			//view - 복잡해지면 관리하기 힘들다.
			System.out.print("4. sql문 전송 ok....!");
			
		}catch (Exception e) {
			
		}		
	}
	public void update(MemberDTO dto) {
		try {
			String sql = "update member set tel=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getTel());
			ps.executeUpdate();
		} catch (Exception e) {
			
		}
	}
	public void insert(MemberDTO dto) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.print("1. 커넥터 설정 ok...");
			//2. db연결
			String url = "jdbc:mysql://localhost:3309/spring";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.print("2. db 연결 ok...");
			
			
			//3. sql문 결정
			String sql = "insert into member values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getTel());
			
			System.out.print("3.SQL문 객체화 ok...");
			//부품(class)
			//자바 class
			//String site = "www.naver.com";
			//URL url = new URL(site);
			//File file = new File("c:/temp/test.txt");
			//File file2 = MakeFile.getFile("c:temp/test.txt"); 
			//4. sql문 전송
			ps.executeUpdate();
			
			//view - 복잡해지면 관리하기 힘들다.
			System.out.print("4. sql문 전송 ok....!");
			
		}catch (Exception e) {
			
		}
		
	}
	
public  void select(MemberDTO dto) {
		MemberDTO dto2 =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.print("1. 커넥터 설정 ok...");
			//2. db연결
			String url = "jdbc:mysql://localhost:3309/spring";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.print("2. db 연결 ok...");
			
			
			//3. sql문 결정
			String sql = "select * from member where id= ?";
			PreparedStatement ps = con.prepareStatement(sql);//위에 것만 쓰면 컴퓨터 인식 못함
			ps.setString(1, dto.getId());
			System.out.print("3.SQL문 객체화 ok...");
			//4. sql문 전송
			ResultSet rs = ps.executeQuery(); //테이블형태로 담을 수있는 것
			
			//5. 검색결과 받아와야 함.=> record 하나!
			if (rs.next()) {
				dto2 = new MemberDTO();
				dto2.setId(rs.getString(1));
				dto2.setPw(rs.getString(2));
				dto2.setName(rs.getString(3));
				dto2.setTel(rs.getString(4));
				
			//	System.out.println(id);
				//System.out.println(pw);
				//System.out.println(name);
				//System.out.println(tel);
				
			}//이대로 실행 시키면 
			ps.executeUpdate();
			
			//view - 복잡해지면 관리하기 힘들다.
			System.out.print("4. sql문 전송 ok....!");
			
		}catch (Exception e) {
			e.printStackTrace();//정확한 에러 알고싶을때	
		}
		
	}

public void selectAll(MemberDTO dto) {
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.print("1. 커넥터 설정 ok...");
		//2. db연결
		String url = "jdbc:mysql://localhost:3309/spring";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.print("2. db 연결 ok...");
		
		
		//3. sql문 결정
		String sql = "select '*'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());
		
		System.out.print("3.SQL문 객체화 ok...");

		ps.executeUpdate();
		
		//view - 복잡해지면 관리하기 힘들다.
		System.out.print("4. sql문 전송 ok....!");
		
	}catch (Exception e) {
		
	}
	
}


}
