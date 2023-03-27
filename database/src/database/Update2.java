package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update2 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";

			con = DriverManager.getConnection(url, user, password);
			
			//sc.nextLine() : 줄 단위로 읽기(엔터 포함), sc.next() : 엔터 직전까지 읽기==> String 입력 처리
			//sc.nextInt() : 엔터 직전까지만 읽기
			
			System.out.println("변경할 부서 코드 입력 >>");
			int deptno = sc.nextInt();  // int deptno = Integer.parsInt(sc.nextLine());
			System.out.println("변경할 부서명 입력 >>");
			String dname = sc.next();
			
			// 
			String sql = "update dept_temp set dname=? where deptno = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dname);
			pstmt.setInt(2, deptno);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println("업데이트 성공");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				con.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
