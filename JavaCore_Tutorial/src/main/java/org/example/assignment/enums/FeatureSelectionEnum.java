package org.example.assignment.enums;

public enum FeatureSelectionEnum {
    VIEW(1,"Danh Sách Sinh Viên"),
    ADD(2,"Thêm Sinh Viên"),
    UPDATE(3," Sửa Sinh Viên"),
    DELETED(4,"Xóa Sinh Viên"),
    BACK(5, "Trở lại trang chính"),
    EXIT(6,"Thoát chương trình");


    private final int value;
    private final String desc;

    FeatureSelectionEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }
    public static FeatureSelectionEnum getByValue(int value){
        for(FeatureSelectionEnum s : values()){
            if(s.value == value){
                return s;
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
