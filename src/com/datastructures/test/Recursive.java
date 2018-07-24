package src.com.datastructures.test;

/**
 * 递归调用，打印整数
 */
public class Recursive {
    public static void main(String[] args) {
        long timeMillis = System.currentTimeMillis();
        printDigit(1234567890987654321L);
        long timeMillis1 = System.currentTimeMillis();
        System.out.println();
        System.out.println(timeMillis - timeMillis1);
    }

    private static void printDigit(Long m){
        if(m > 9){
            printDigit(m/10);
        }
        System.out.print(m%10);
    }
}
