package week1.day1;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num= {2,5,7,7,5,9,2,3};
System.out.println("Duplicate values in the array:");

// Outer loop to iterate through the array
for (int i = 0; i < num.length; i++) {
    // Inner loop to compare the current element with the rest
    for (int j = i + 1; j < num.length; j++) {
        // If a duplicate is found
        if (num[i] == num[j]) {
            System.out.println(num[i]);
            break; }
	}
    }
}}