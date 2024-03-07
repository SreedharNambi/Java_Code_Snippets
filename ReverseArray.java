class ReverseArray{

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
    }
    System.out.println();
    }
    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp =  arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        printArray(numbers);
        reverse(numbers,0,numbers.length-1);
        printArray(numbers);
        
    }
}