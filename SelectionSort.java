public class SelectionSort {  
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j; 
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[]){  
        int[] arr1 = {15,23,46,10,2,6,1,100,67,56,41,31,81};  
        System.out.println("Before Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1);  
         
        System.out.println("After applying Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
    }  
} 