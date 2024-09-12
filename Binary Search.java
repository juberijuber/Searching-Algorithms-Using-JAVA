class Main {
	public static void main(String args[]) {
		int[] arr= {10,50,40,20,15,100,70,88};
		int left=0;
		int right=arr.length-1;
		int t=20;
		int res=binary(arr,left,right,t);

		if(res==-1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found in "+res);
		}

	}
	public static int binary(int[] arr,int left,int right,int t) {
		while(left<=right) {

			int mid=(left+right)/2;

			if(arr[mid]==t) {
				return mid;
			}
			else if(arr[mid]>t) {
				right=mid-1;

			}
			else {
				left=mid +1;
			}
		}
		return -1;
	}
}