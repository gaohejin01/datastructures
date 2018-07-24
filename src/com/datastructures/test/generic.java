package src.com.datastructures.test;

public class generic {
    public static void main(String[] args) {
        String [] strArr = {"Joe","Bob","Bill","Zeke"};
        Long [] numArr = {1L,2L,31L,4L,5L};
        System.out.println(findMax(strArr));
        System.out.println(findMax(numArr));
    }

    public static Comparable findMax(Comparable [] arr){
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i].compareTo(arr[maxIndex]) > 0){
                maxIndex = i;
            }
        }

        return arr[maxIndex];
    }
}
