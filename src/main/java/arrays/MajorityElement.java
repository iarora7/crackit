package main.java.arrays;

/**
 * Created by arorai on 1/3/17.
 * A majority element in an array A[] of size n is
 * an element that appears more than n/2 times (and hence there is at most one such element).
 *  (Using Moore’s Voting Algorithm)
 */
public class MajorityElement {

    public void printMajorityElement(int[] a) {
        int cand = findCandidate(a);
        if(isMajority(a, cand)) {
            System.out.println("Majority element found: " + cand);
        } else {
            System.out.println("Majority element found: None");
        }
    }

    private boolean isMajority(int[] a, int cand) {
        int size = a.length;
        int maj_count = 0;
        for(int i=0; i< size; i++) {
            if(a[i]==cand){
                maj_count++;
            }
        }
        if(maj_count > size/2){
            return true;
        }
        return false;
    }

    private int findCandidate(int[] a) {
        int maj_index = 0, count = 1;
        int size = a.length;
        for (int i=1; i<size; i++) {
            if(a[maj_index] == a[i]) {
                count++;
            } else {
                count--;
            }
            if(count==0) {
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
    }

    public static void main(String args[]) {
        MajorityElement majorityElement = new MajorityElement();
        int a[] = new int[]{1, 3, 3, 1, 2, 3, 3};
        majorityElement.printMajorityElement(a);
    }
}
