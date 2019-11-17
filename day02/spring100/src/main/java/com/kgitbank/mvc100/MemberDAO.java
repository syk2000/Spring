package com.kgitbank.mvc100;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	public void insert(MemberDTO dto) {
		try {
			//model
			//1. 커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 커넥터 설정 ok...");
			
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
			
			System.out.print("3. SQL문 객체화 ok...");
			
			ps.executeUpdate();
			
			//view
			System.out.print("4. sql문 전송 ok....!");
		} catch (Exception e) {
		}
		
	}
}
