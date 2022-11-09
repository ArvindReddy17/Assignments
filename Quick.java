public class Quick {
public static void main(String[] args) {
int[] array = {15,23,46,10,2,6,1,100,67,56,41,31,81 };
quickSortAlgo(array, 0, array.length - 1);
for (int ar : array) {
System.out.print(ar + " ");
}
}
public static int arrayPartition(int[] array, int start, int end) {
int pivot = array[end];
int i = (start - 1);
for (int ele = start; ele < end; ele++) {
if (array[ele] <= pivot) {
i++;
int swap = array[i];
array[i] = array[ele];
array[ele] = swap;
}
}

int swap = array[i + 1];
array[i + 1] = array[end];
array[end] = swap;
return i + 1;
}
public static void quickSortAlgo(int[] arrayTobeSorted, int start, int end) {
if (start < end) {
int pivot = arrayPartition(arrayTobeSorted, start, end);
quickSortAlgo(arrayTobeSorted, start, pivot - 1);
quickSortAlgo(arrayTobeSorted, pivot + 1, end);
}
}
}