class SingleLoopSort{
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,2,3};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1] && i < arr.length){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i = -1; // Reset index to start of array
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}