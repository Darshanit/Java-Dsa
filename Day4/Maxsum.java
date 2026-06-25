class Maxsum{
	public static void main(String[] args){
	int[] arr = {-2,1,-3,4,-1,2,5,4};
	int max_Sum = 0;
	int sum=0;
	for(int i=0;i<arr.length;i++){
		sum+=arr[i];
		max_Sum=Math.max(sum,max_Sum);
		
		if(sum<0){
			sum=0;
		}
	}
	System.out.println("Sum :"+max_Sum);
	}
}