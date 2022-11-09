import java.util.Scanner;
class Duplicate{
	public static void main(String [] a) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of elements in an array:");
	int k =sc.nextInt();
	int[] arr=new int[k];
	for(int i=0;i<k;i++) {
		arr[i]=sc.nextInt();
		
	}
	System.out.println("Elements in a array are :");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"  ");
	}
	
	System.out.println("the duplicates present in an array are: ");
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if (arr[i]==(arr[j])) {
			System.out.print(arr[j]+" ");	
			}
		}
	}
	}
}