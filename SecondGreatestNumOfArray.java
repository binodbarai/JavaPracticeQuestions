
import java.util.*;
public class SecondGreatestNumOfArray {
    public static void main(String[] args) {
		int array[]= {1, 6, 0 , 7 , 5 };
		Arrays.sort(array);
		int secMax=array[array.length-2];
        /*System.out.print("How many elements you want on array ? ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[50];
        System.out.println("Enter the elements in array: ");

        for (int i=1; i<=n; i++){
            System.out.print("Element "+i+": ");
            array[i] = sc.nextInt();
        }
        System.out.println("\nElements of array are: ");
        for (int i=1; i<=n; i++){
            System.out.print(array[i]+" ");
        }

        int max = array[0];
        int secMax = array[1];
        for (int i=0;i<=n;i++) {
            if (array[i] > max) {
                secMax = max;
                max = array[i];
            }
            else if (array[i] < max && array[i] > secMax) {
                secMax = array[i];
            }
        }*/
        System.out.println("\n\nThe second greatest element of given array is "+secMax);
    }
}
