class MoveZeroes{

    public static void move(int[] arr){
        int zerothIndex = 0;
        for(int i = 0; i < arr.length;  i++){
            if(arr[i]!=0 && arr[zerothIndex]==0){
                int temp = arr[i];
                arr[i] = arr[zerothIndex];
                arr[zerothIndex] = temp;
            }
            if(arr[zerothIndex] !=0){
                zerothIndex++;
            }
        }
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,3,0,4,0,8,5,6};
        printArray(numbers);
        move(numbers);
        printArray(numbers);
    }
}