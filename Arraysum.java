public class Arraysum{
	public static void main(String[] args) {
		System.out.println("Array elements: 5.5 10.1 11 12.8 56.8 2.5");
		double num[]={5.5,10.1,11,12.8,56.8,2.5};
		double res=0;
		 for (int i=0;i<6 ;++i ) {
		 	res=res+num[i];
		 }
		System.out.print("Sum of array: "+res);
	}
}