public class ProductOfPositiveNo {
	public static void main(String[] args) {
		int[] arr = {0,-3,-4,-5};
		int result = positiveProduct(arr);
		System.out.println("Product of positive no. : "+result);
	}
	
	static int positiveProduct(int[] arr) {
		int product = 1;
		boolean positive = false;
		
		for(int i : arr) {
			if (i>0) {
				product*=i;
				positive = true;
			}
		}
		if(!positive)
			return 0;
		return product;
	}
}
