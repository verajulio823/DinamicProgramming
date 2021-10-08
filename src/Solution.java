class Solution {
    public int coinChange(int[] coins, int amount) {
        int [] memo = new int[amount+1];
    	memo[0]=0;
    	
    	for(int i = 1; i < amount +1; i++){
    	     memo[i] = 999999;
    	}
    	
    	for(int i=1; i< amount+1; i++) {
    		for(int j=0; j<coins.length; j++) {
    			if(i-coins[j]>=0) {
    				memo[i] = Math.min(memo[i],1+memo[i-coins[j]]);
    			}
    		}
    	}
    	if(memo[amount]!= 999999)
    		return memo[amount];
    	return -1;
    	
    }
    
    
	 public int minFallingPathSum(int[][] matrix) {
		 if(matrix.length==1)
			 return matrix[0][0];
		 int size_matrix = matrix.length;
		 int result= 999999;
		 
		 for(int i=1; i< size_matrix; i++) {
			 for(int j=0; j<size_matrix; j++) {
				 int previous=matrix[i-1][j];
				 if(j>0) {
					 previous = Math.min(previous, matrix[i-1][j-1]);
				 }
				 if(j<size_matrix-1) {
					 previous = Math.min(previous, matrix[i-1][j+1]);
				 }
				 matrix[i][j]+=previous;
				 if(i==size_matrix-1) {
					 result= Math.min(result, matrix[i][j]);
				 }
					 
				 
			 }
		 }
		 
		 return result;
	 }
    
    
}