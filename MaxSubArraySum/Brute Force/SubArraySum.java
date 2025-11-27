public class SubArraySum {
     public static void main(String[] args) {
    	 	int res = maxSum(new int[] {2, 3, -8, 7, -1, 2, 3});
    	 	System.out.println(res);
     }
     
     
     public static int maxSum(int[] arr) {
    	 	int res = 0;
    	 
    	 	for(int i = 0; i < arr.length; i++) {
    		 	int currVal = 0;
    		 
    		 	for(int j = i; j < arr.length; j++) {
    			 	currVal += arr[j];
    			 	res = Math.max(res, currVal);
    		 	}
    	 	}
    	 
    		return res;
     }
}