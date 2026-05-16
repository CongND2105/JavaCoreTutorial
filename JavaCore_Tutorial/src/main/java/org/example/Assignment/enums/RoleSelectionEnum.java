package org.example.Assignment.enums;

public enum RoleSelectionEnum {
	UNIVERSITY(1, "Đại Học"),
	HIGH_SCHOOL(2, "Phổ Thông"),
	EXIT(3, "Exit");

	private final int value;
	private final String desc;

	RoleSelectionEnum(int value, String desc) {
		this.value = value;
		this.desc = desc;
	}

	public static RoleSelectionEnum getByValue(int value) {
		for (RoleSelectionEnum role : values()) {
			if (role.value == value) {
				return role;
			}
		}

		return null;
	}

	public int getValue() {
		return value;
	}

	public String getDesc() {
		return desc;
	}
}