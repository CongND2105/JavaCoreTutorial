package org.example.assignment.view;

import org.example.assignment.enums.RoleSelectionEnum;
import org.example.assignment.model.Student;

import java.util.List;

public class DisplayListStudents {

	//method hiển thị list Student
	public static void displayListStudent(List<? extends Student> list, Class<? extends Student> type) {
		System.out.println("Danh Sách Sinh Viên : " + type.getSimpleName());
		System.out.println(list);
	}

	//method hiển thị lựa chọn trường
	public static void displayChoiceSchool() {
		String menus = """
			    ==========================================
			    Chào mừng đến với hệ thống Sinh Viên
			    Vui lòng chọn 1 trong 3 lựa chọn sau:
			    1. Sinh Viên Đại Học
			    2. Sinh Viên Phổ Thông
			    3. Exit
			    ==========================================
			""";
		System.out.print(menus);
	}

	// method hiển thị chức năng trường
	public static void displayChoiceFeature(RoleSelectionEnum role) {
		String roleName = role.getDesc();

		System.out.println("==========================================");
		System.out.println("Chào mừng đến với hệ thống Sinh Viên " + roleName);
		System.out.println("Vui Lòng chọn 1 trong các chức năng sau sau :  ");
		System.out.println("1 . Hiển thị Danh Sách Sinh Viên  ");
		System.out.println("2 . Thêm mới Sinh Viên  ");
		System.out.println("3 . Cập nhật Sinh Viên ");
		System.out.println("4 . Xóa Sinh Viên ");
		System.out.println("5 . Quay lại trang chính ");
		System.out.println("6 . Exit");
		System.out.println("==========================================");
	}

}