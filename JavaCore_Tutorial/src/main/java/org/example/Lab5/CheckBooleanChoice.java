package org.example.Lab5;

public class CheckBooleanChoice {
    public static boolean checkChoice(){
      while(true){
          System.out.println("Bạn có muốn nhập thêm không ? (Y/N)");
          String choice = Utils.sc.nextLine();
          if(choice.equalsIgnoreCase("Y")){
              return true;
          }else if(choice.equalsIgnoreCase("N")){
              return false;
          }
              System.out.println("Lỗi: Chỉ được nhập 'Y' hoặc 'N'. Vui lòng thử lại!");

      }
    }
}
