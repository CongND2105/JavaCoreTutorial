package org.example.java8plusFeatures;


/**
 * Example Funtional Interface , Lambda, method reference
 *
 */
@FunctionalInterface
interface Calculator{
    int calculator(int x, int y);
}
class MathUtils{
    public static int sum(int a , int b){
        return a + b ;
    }
    public static int minius(int a , int b ){
        return a - b ;
    }
}
public class Main {
    public static void main(String [] agrs){
        int a = 5 ;
        int b = 7 ;

        // Example anonymous
        Calculator cal = new Calculator() {
            @Override
            public int calculator(int x, int y) {
                return MathUtils.sum(x,y);
            }
        };

        Calculator cal2 = new Calculator() {
            @Override
            public int calculator(int x, int y) {
                return MathUtils.minius(x,y);
            }
        };
        int result1 = doAction(a,b,cal);
        int result2 = doAction(a,b,cal2);
        System.out.println("Example with Anonymous : " +result1);
        System.out.println("Example with Anonymous : " +result2);

        //Example lambda
        int result3 = doAction(a,b,(x,y) -> MathUtils.sum(x,y));
        int result4 = doAction(a,b,(x,y) -> MathUtils.minius(x,y));
        System.out.println("Example with lambda : " +result3);
        System.out.println("Example with lambda : " +result4);

        //Example with Method Reference
        int result5 = doAction(a,b,MathUtils::sum);
        int result6 = doAction(a,b,MathUtils::minius);
        System.out.println("Example with Method Reference : " +result5);
        System.out.println("Example with Method Reference : " +result6);
    }

    public static int doAction(int a , int b , Calculator action){
        return action.calculator(a,b);
    }
}
