package day2;
/**
 *   1.  Assuming first k - 1  elements are smallest,
 *
 *   2 . Let's start iteration from k element
 *   current-element = arr[k]
 *   2.1 Lets find out max of 0...k, store it max along with its index
 *   2.2 if current-element < max {}
 *    shift one element to the left  side till we reach to maxPositions
 */
public class KSmallestElement {

    public static void Kelements(int[] arr, int k) {
        for(int i=k; i<arr.length; i++) {
            int currentElement = arr[i];

            int max = arr[k - 1];
            int maxPosition = k - 1;

            for (int reverseIndex = k - 2; reverseIndex >= 0; reverseIndex--) {
                if (arr[reverseIndex] > max) {
                    max = arr[reverseIndex];
                    maxPosition = reverseIndex;
                }
            }
            if (currentElement < max) {
                while (maxPosition < k - 1) {
                    arr[maxPosition] = arr[maxPosition + 1];
                    maxPosition++;
                }
                arr[k - 1] = currentElement;
            }
        }
        for(int i=0; i<k; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {50, 25, 100, 200, 30};
        Kelements(arr, 2);
    }
}
