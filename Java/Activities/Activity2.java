package Activities;

public class Activity2 {
    public static void main(String[] args){
        int[] array = {10, 77, 10, 54, -11, 10};
        int x=10;
        int finalvalue=30;
        System.out.println("Result:" +result(array, x, finalvalue));

        }
    public static boolean result (int[] num, int x, int finalvalue){
        int sum=0;
        for(int y:num){
            if(y==x){
                sum+=x;
            }
            if(sum>finalvalue)
                break;

    }
        return sum==finalvalue;

    }
}
