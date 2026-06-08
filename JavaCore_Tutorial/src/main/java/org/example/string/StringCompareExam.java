package org.example.string;

public class StringCompareExam {
    public static void main (String [] args){
        /**
         * Các method so sánh của chuõi
         */

        // equals so sánh chuỗi vs chuỗi , phân biệt viết HOA viết thường
        String s1 = "nguyen van teo";
        String s2 = "Nguyen Van Teo";
        String s3 = "nguyen van teo";
        System.out.println("[equals]so sánh chuỗi " + s1 + " vs "+s2 + " = " + s1.equals(s2));
        System.out.println("[equals]so sánh chuỗi " + s1 + " vs "+s3 + " = " + s1.equals(s3));

        //equalsIgnoreCase so sánh chuỗi vs chuỗi , không phân biệt HOA thường
        System.out.println("[equalsIgnoreCase]so sánh chuỗi " + s1 + " vs "+s2 + " = " + s1.equalsIgnoreCase(s2));
        System.out.println("[equalsIgnoreCase]so sánh chuỗi " + s1 + " vs "+s3 + " = " + s1.equalsIgnoreCase(s3));

        //compareTo so sánh < > =
        String name1 = "Nguyen Van a";
        String name2 = "Nguyen Van A";
        System.out.println("[compareTo]" + name1.compareTo(name2));

        //compareToIgnoreCase so sánh < > = không phân biệt HOA thường .
        System.out.println("[compareToIgnoreCase]" + name1.compareToIgnoreCase(name2));


    }
}
