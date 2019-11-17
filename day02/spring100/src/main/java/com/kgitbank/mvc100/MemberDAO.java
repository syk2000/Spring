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
			//1. Ŀ���� ����
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. Ŀ���� ���� ok...");
			
			//2. db����
			String url = "jdbc:mysql://localhost:3309/spring";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.print("2. db ���� ok...");
			
			
			//3. sql�� ����
			String sql = "insert into member values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getTel());
			
			System.out.print("3. SQL�� ��üȭ ok...");
			
			ps.executeUpdate();
			
			//view
			System.out.print("4. sql�� ���� ok....!");
		} catch (Exception e) {
		}
		
	}
}
