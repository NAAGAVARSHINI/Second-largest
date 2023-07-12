import java.util.Scanner;

public class SecondLargest {

    public static int secondLargest(int arr[]){
                int n = arr.length;
                if (n < 2) {
                    return -1;
                }
                int largest = Integer.MIN_VALUE;
                int secLargest = Integer.MIN_VALUE;

                for (int i = 0; i < n; i++) {
                    if (arr[i] > largest) {
                        secLargest = largest;
                        largest = arr[i];
                    } else if (arr[i] > secLargest && arr[i] < largest) {
                        secLargest = arr[i];
                    }
                }

                if (secLargest == Integer.MIN_VALUE) {
                    return -1;
                }

                return secLargest;
            }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(secondLargest(arr));
    }
}
