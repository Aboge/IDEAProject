package demo04;

public class Demo06Biggest {
    public static void main(String[] args) {
        int[] Array = {2,3,39,84,93,20};

        int max = Array[0];

        for (int i = 1; i < Array.length; i++) {
            //起始比较应该是不和自己比较
            if (max < Array[i]){
                max = Array[i];
            }
        }
        System.out.println(max);
    }
}
