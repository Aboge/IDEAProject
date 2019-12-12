package demo04;

public class Demo05Array {
    public static void main(String[] args) {
        int[] Array = new int[5];

        for (int i = 0; i < 5; i++) {
            Array[i] = 10 + i;
        }

        //通过Array.length来遍历数组内的所有数据
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
    }
}
