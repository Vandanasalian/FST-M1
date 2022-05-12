package Activities;

public class Activity4 {
    public static void main(String[] args) {
        int[] arr={4,2,7,3,6,5,9};
        System.out.println("Array befor sorting:");
        for(int i=0;i<=arr.length-1;i++)
            System.out.println(arr[i]);
        insertionsort(arr);
        System.out.println("Array after sorting:");
        for(int i=0;i<=arr.length-1;i++)
            System.out.println(arr[i]);


    }
    static void insertionsort(int[] arr){
        int size = arr.length, i;

        for (i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

    }
}
