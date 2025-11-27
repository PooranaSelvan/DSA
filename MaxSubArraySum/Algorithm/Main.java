class Main {
     public static void main(String[] args) {
          int res = kadanes(new int[]{2, 3, -8, 7, -1, 2, 3});
          System.out.println(res);
     }

     public static  int kadanes(int[] arr){
          int currSum = arr[0];
          int maxSum = arr[0];

          for(int i = 1; i < arr.length; i++){
               if(currSum < 0){
                    currSum = 0;
               }
               currSum += arr[i];
               maxSum = Math.max(maxSum, currSum);
          }

          return maxSum;
     }
}