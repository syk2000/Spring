package com.kgitbank.mvc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

@Repository//�̱������� ��ü�� ������� //�̰��� ���� ������ �Ǿ���Ѵ�.

public class MemberDAO {
		Connection con;
	public MemberDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.print("1. Ŀ���� ���� ok...");
			
			//2. db����
			String url = "jdbc:mysql://localhost:3309/spring";
			String user = "root";
			String password = "1234";
			con =  DriverManager.getConnection(url, user, password);
			System.out.print("2. db ���� ok...");
			
		} catch (Exception e) {
			
		}
		

	}
	
	public void delete(MemberDTO dto) {
		
		try {
			
			
			//3. sql�� ����
			String sql = "delete from member where id= ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			
			System.out.print("3.SQL�� ��üȭ ok...");
			//��ǰ(class)
			//�ڹ� class
			//String site = "www.naver.com";
			//URL url = new URL(site);
			//File file = new File("c:/temp/test.txt");
			//File file2 = MakeFile.getFile("c:temp/test.txt"); 
			//4. sql�� ����
			ps.executeUpdate();
			
			//view - ���������� �����ϱ� �����.
			System.out.print("4. sql�� ���� ok....!");
			
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
			System.out.print("1. Ŀ���� ���� ok...");
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
			
			System.out.print("3.SQL�� ��üȭ ok...");
			//��ǰ(class)
			//�ڹ� class
			//String site = "www.naver.com";
			//URL url = new URL(site);
			//File file = new File("c:/temp/test.txt");
			//File file2 = MakeFile.getFile("c:temp/test.txt"); 
			//4. sql�� ����
			ps.executeUpdate();
			
			//view - ���������� �����ϱ� �����.
			System.out.print("4. sql�� ���� ok....!");
			
		}catch (Exception e) {
			
		}
		
	}
	
public  void select(MemberDTO dto) {
		MemberDTO dto2 =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.print("1. Ŀ���� ���� ok...");
			//2. db����
			String url = "jdbc:mysql://localhost:3309/spring";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.print("2. db ���� ok...");
			
			
			//3. sql�� ����
			String sql = "select * from member where id= ?";
			PreparedStatement ps = con.prepareStatement(sql);//���� �͸� ���� ��ǻ�� �ν� ����
			ps.setString(1, dto.getId());
			System.out.print("3.SQL�� ��üȭ ok...");
			//4. sql�� ����
			ResultSet rs = ps.executeQuery(); //���̺����·� ���� ���ִ� ��
			
			//5. �˻���� �޾ƿ;� ��.=> record �ϳ�!
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
				
			}//�̴�� ���� ��Ű�� 
			ps.executeUpdate();
			
			//view - ���������� �����ϱ� �����.
			System.out.print("4. sql�� ���� ok....!");
			
		}catch (Exception e) {
			e.printStackTrace();//��Ȯ�� ���� �˰������	
		}
		
	}

public void selectAll(MemberDTO dto) {
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.print("1. Ŀ���� ���� ok...");
		//2. db����
		String url = "jdbc:mysql://localhost:3309/spring";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.print("2. db ���� ok...");
		
		
		//3. sql�� ����
		String sql = "select '*'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());
		
		System.out.print("3.SQL�� ��üȭ ok...");

		ps.executeUpdate();
		
		//view - ���������� �����ϱ� �����.
		System.out.print("4. sql�� ���� ok....!");
		
	}catch (Exception e) {
		
	}
	
}


}
