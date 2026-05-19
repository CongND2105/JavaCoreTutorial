package org.example.Assignment.controller;

import org.example.Assignment.enums.FeatureSelectionEnum;
import org.example.Assignment.enums.RoleSelectionEnum;
import org.example.Assignment.view.Input;

public class FeatureChoice {

	Input input = new Input();

	public void choiceMain() {
		while (true) {
			//hiển thị màn hình chọn dối tượng Student cụ thể . ví dụ : StudentUniversity or StudentHighSchool
			RoleSelectionEnum role = input.getMenuMain();
			switch (role) {
				case UNIVERSITY:
					choiceFeatureStudents(role);
					break;
				case HIGH_SCHOOL:
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
			FeatureSelectionEnum choice = input.getMenuFeature(role);
			switch (choice) {
				case VIEW:
					// hiển thị danh sách 1 Student cụ thể , Univercity or HighSchool
					input.getListStudents(role);
					break;
				case ADD:
					System.out.println(choice.getDesc());
					input.addStudent(role);
					System.out.println("Thêm thành công ");
					break;
				case UPDATE:
					System.out.println("Chức năng cập nhật sinh viên");
					input.updateStudent();
					break;
				case DELETED:
					System.out.println("Chức năng xóa sinh viên ");
					input.deleteStudent();
					break;
				case BACK:
					System.out.println("Quay lại trang chính ");
					choiceMain();
				case EXIT:
					System.exit(0);
				default:
					System.out.println("Vui lòng chọn đúng chức năng");
			}

		}
	}

}