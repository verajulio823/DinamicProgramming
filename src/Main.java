
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hola mundo");
		Solution s = new Solution();
		int [] coins = {2};
		int amount = 11;
		System.out.println(s.coinChange(coins, amount));
		
		int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
		System.out.println(s.minFallingPathSum(matrix));
	}

}
