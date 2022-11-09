
class SubArray{

	   static boolean isSubset(int arr1[], int arr2[], int m, int n)
	    {
	        int i = 0;
	        int j = 0;
	        for (i = 0; i < n; i++) {
	            for (j = 0; j < m; j++) {
	                if (arr2[i] == arr1[j])
	                    break;
	            }
	 
	            if (j == m)
	            return false;
	        }
	 
	        return true;
	    }
	 
	    public static void main(String args[])
	    {
	        int arr1[] = { 10,9,8,7,6,5,4,3,2,1 };
	        int arr2[] = { 2,4,6,8 };
	    
	        int m = arr1.length;
	        int n = arr2.length;
	 
	        if (isSubset(arr1, arr2, m, n))
	            System.out.print(" yes the second array is subarray of first array");
	        else
	            System.out.print(" no its not a subarray ");
	 
	    }
	}