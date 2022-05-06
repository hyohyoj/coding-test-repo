package _01;
import java.util.ArrayList;
import java.util.Scanner;

public class Student_Search {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("김효정", "0225");
		Student s2 = new Student("최연지", "1234");
		Student s3 = new Student("권두하", "5678");

		
		ArrayList<Student>Students = new ArrayList<Student>();
		Students.add(s1);
		Students.add(s2);
		Students.add(s3);
		
//		for (Student student : Students) {
//			System.out.println(student.getName());
//			System.out.println(student.getNo());
//		}
//		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("계속 검색하겠습니까? y/n");
			String input = scan.next();
			
			if(input.equals("y")) {
				System.out.println("검색을 시작합니다 이름을 입력하세요.");
				String name = scan.next();
				boolean flag = false;
				
				for (Student student : Students) {
					if(student.getName().equals(name)) {
						System.out.println(student.getName() + "님의 학번 : " + student.getNo());
						flag = true;
					}
				}
				
				if(!flag) {
					System.out.println("없는 학생입니다.");
				}
				
			}else if(input.equals("n")) {
				break;
			}
			else {
				System.out.println("다시 입력해주세요.");
			}
		}
		System.out.println("종료되었습니다.");
		
	}
	

}
