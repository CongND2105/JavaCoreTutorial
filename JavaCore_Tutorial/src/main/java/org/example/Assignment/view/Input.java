package org.example.Assignment.view;

import org.example.Assignment.enums.RoleSelectionEnum;
import org.example.Assignment.model.Student;
import org.example.Assignment.model.StudentHighSchool;
import org.example.Assignment.model.StudentInfo;
import org.example.Assignment.model.StudentUnivercity;
import org.example.Assignment.repository.DataStudent;
import org.example.Assignment.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class Input {
	Scanner sc = new Scanner(System.in);
	DataStudent dataStudent = new DataStudent();
	StudentService sts = new StudentService(dataStudent.getList());

	/**
	 * Hiển thị menu chính và nhận lựa chọn người dùng.
	 *
	 * @return lựa chọn của người dùng
	 */
	public RoleSelectionEnum getMenuMain() {
		DisplayListStudents.displayChoiceSchool();
		int choice = sc.nextInt();
		sc.nextLine();

		return RoleSelectionEnum.getByValue(choice);
	}

	/**
	 * Hiển thị menu chức năng và nhận lựa chọn người dùng.
	 *
	 * @param role vai trò của sinh viên
	 * @return lựa chọn của người dùng
	 */
	public int getMenuFeature(RoleSelectionEnum role) {
		DisplayListStudents.displayChoiceFeature(role);
		int choice = sc.nextInt();
		sc.nextLine();

		return choice;
	}

	// method get List Student by Type
	public void getListStudents(RoleSelectionEnum role) {
		Class<? extends Student> type = createClassByRole(role);

		List<? extends Student> students = sts.getListStudentByType(sts.findAllStudents(), type);

		DisplayListStudents.displayListStudent(students, type);
	}

	//method input information update Student
	public Student inputUpdateStudent(Student st) {
		while (true) {
			try {
				System.out.println("Nhập tên mới :");
				st.setName(sc.nextLine());

				System.out.println("Nhập tuổi mới : ");
				st.setAge(sc.nextInt());
				sc.nextLine();

				System.out.println("Nhập GPA mới : ");
				st.setGpa(sc.nextDouble());
				sc.nextLine();

				castStudentSpecific(st);
				break;
			} catch (IllegalArgumentException e) {
				System.out.println("Error : " + e.getMessage());
				sc.nextLine();
			}
		}
		return st;
	}

	//method cast Student -> Student specific
	public void castStudentSpecific(Student student) {
		if (student instanceof StudentUnivercity st) {
			System.out.println("Nhập điểm toán mới : ");
			st.setScoreMath(sc.nextDouble());
			sc.nextLine();

			System.out.println(" Nhập điểm Lý mới :  ");
			st.setScorePhysics(sc.nextDouble());
			sc.nextLine();

			System.out.println("Nhập điểm Hóa mới :");
			st.setScoreChemistry(sc.nextDouble());
			sc.nextLine();
		} else if (student instanceof StudentHighSchool st) {
			System.out.println("Nhập điểm toán mới : ");
			st.setScoreMath(sc.nextDouble());
			sc.nextLine();

			System.out.println(" Nhập điểm Văn mới :  ");
			st.setScoreLiterature(sc.nextDouble());
			sc.nextLine();

			System.out.println("Nhập điểm Anh mới :");
			st.setScoreEnglish(sc.nextDouble());
			sc.nextLine();
		}
	}

	//method input Student
	public StudentInfo inputStudent() {
		StudentInfo studentInfo = new StudentInfo();
		while (true) {
			try {
				System.out.println(" Nhập vào mã sinh vien :  ");
				studentInfo.setId(sc.nextInt());
				//clear Scanner (enter)
				sc.nextLine();
				System.out.println(" Nhập vào ten sinh vien :  ");
				studentInfo.setName(sc.nextLine());
				System.out.println(" Nhập vào tuoi sinh vien :  ");
				studentInfo.setAge(sc.nextInt());
				System.out.println(" Nhập vào gpa sinh vien :  ");
				studentInfo.setGpa(sc.nextDouble());
				break;
			} catch (IllegalArgumentException e) {
				System.out.println("Error : " + e.getMessage());
			}
		}
		return studentInfo;
	}

	//method input UnivercityStudent
	public Student inputUnivercityStudent() {
		StudentInfo info = inputStudent();

		StudentUnivercity studentUnivercity = new StudentUnivercity(
			info.getId(),
			info.getName(),
			info.getAge(),
			info.getGpa()
		);

		System.out.println(" Nhập vào diem toan :  ");
		studentUnivercity.setScoreMath(sc.nextDouble());

		System.out.println(" Nhập vào diem ly:  ");
		studentUnivercity.setScorePhysics(sc.nextDouble());

		System.out.println(" Nhập vào diem hoa :  ");
		studentUnivercity.setScoreChemistry(sc.nextDouble());

		sc.nextLine();
		return studentUnivercity;
	}

	//method input HighSchoolStudent
	public Student inputHighSchoolStudent() {
		StudentInfo info = inputStudent();
		StudentHighSchool studentHighSchool = new StudentHighSchool(
			info.getId(),
			info.getName(),
			info.getAge(),
			info.getGpa()
		);

		System.out.println("Nhập vào điểm toán");
		studentHighSchool.setScoreMath(sc.nextDouble());

		System.out.println("Nhập vào điểm văn ");
		studentHighSchool.setScoreLiterature(sc.nextDouble());

		System.out.println(" Nhập vào điểm Anh  ");
		studentHighSchool.setScoreEnglish(sc.nextDouble());

		sc.nextLine();
		return studentHighSchool;
	}

	// method input id of update Student
	public int inputId() {
		while (true) {
			System.out.println("Nhập vào id sinh viên");
			int id = sc.nextInt();
			sc.nextLine();

			if (sts.findStudentById(id) != null) {
				return id;
			}

			System.out.println("id không tồn tại trong hệ thống");
		}
	}

	//method update Student
	public void updateStudent() {
		int idUpdate = inputId();
		Student studentUpdate = sts.findStudentById(idUpdate);
		Student newData = inputUpdateStudent(studentUpdate);
		sts.updateStudent(newData, idUpdate);
		System.out.println("Cập nhật thành công");

	}

	//method delete student
	public void deleteStudent() {
		int idDelete = inputId();
		List<Student> stDelete = sts.findAllStudents();
		Student studentTemp = null;
		for (Student st : stDelete) {
			if (st.getId() == idDelete) {
				System.out.println("tìm thấy sinh viên cần xóa");
				studentTemp = st;
				break;
			}
		}
		if (studentTemp != null) {
			sts.deleteStudent(studentTemp);
			System.out.println("Xóa thành công");
		} else {
			System.out.println("Không tìm thấy sinh viên");
		}

	}

	//method add Student
	public void addStudent(RoleSelectionEnum role) {
		Student s = createStudentByRole(role);
		sts.addStudent(s);
		System.out.println("Thêm sinh viên thành công");
	}

	//method tạo sinh viên bởi role
	public Student createStudentByRole(RoleSelectionEnum role) {
		switch (role) {
			case UNIVERSITY:
				return inputUnivercityStudent();
			case HIGH_SCHOOL:
				return inputHighSchoolStudent();
			default:
				System.out.println("Role không hợp lệ");
				return null;
		}
	}

	// method createClassbyRole
	public Class<? extends Student> createClassByRole(RoleSelectionEnum role) {

		switch (role) {
			case UNIVERSITY:
				return StudentUnivercity.class;
			case EXIT:
				return StudentHighSchool.class;
			default:
				System.out.println("Không có class hợp lệ");
				return null;
		}
	}
}