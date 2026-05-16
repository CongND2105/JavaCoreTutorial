package org.example.Assignment.controller;

import org.example.Assignment.enums.RoleSelectionEnum;
import org.example.Assignment.view.Input;

public class FeatureChoice {

	Input input = new Input();

	public void choiceMain() {
		while (true) {
			//hiển thị màn hình chọn dối tượng Student cụ thể . ví dụ : StudentUniversity or StudentHighSchool
			RoleSelectionEnum role = input.getMenuMain();
			switch (role) {
				case UNIVERSITY, HIGH_SCHOOL:
					choiceFeatureStudents(role);
					break;
				case EXIT:
					System.exit(0);
				default:
					System.out.println("Vui Lòng chọn đúng số");
			}
		}
	}

	// method chọn chức năng của sinh viên
	// role được truyền vào từ người dùng qua method ChoiceMain
	public void choiceFeatureStudents(RoleSelectionEnum role) {
		while (true) {
			// hiển thị các tính năng của 1 Student cụ thể
			int choice = input.getMenuFeature(role);
			switch (choice) {
				case 1:
					// hiển thị danh sách 1 Student cụ thể , Univercity or HighSchool
					input.getListStudents(role);
					break;
				case 2:
					System.out.println("Chức năng thêm mới sinh viên ");
					input.addStudent(role);
					System.out.println("Thêm thành công ");
					break;
				case 3:
					System.out.println("Chức năng cập nhật sinh viên");
					input.updateStudent();
					break;
				case 4:
					System.out.println("Chức năng xóa sinh viên ");
					input.deleteStudent();
					break;
				case 5:
					System.out.println("Quay lại trang chính ");
					choiceMain();
				case 6:
					System.exit(0);
				default:
					System.out.println("Vui lòng chọn đúng chức năng");
			}

		}
	}

}