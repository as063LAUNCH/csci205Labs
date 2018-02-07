/* *****************************************
* CSCI205 - Software Engineering and Design
* Spring 2016
* Instructor: Your instructor
* Section: List time of your lecture
*
* Name: Anushikha Sharma
* Date: 01/29/2016
*
* Lab / Assignment: lab04
*
* Description:The Array Challenge
*
* *****************************************/
package lab04;
public class ArrayChallenge {
    public static double[] concat(double[] a1, double[] a2){
	int a1len = a1.length;
   	int a2len = a2.length;
   	double[] a3 = new double[a1len + a2len];
  	System.arraycopy(a1, 0, a3, 0, a1len);
   	System.arraycopy(a2, 0, a3, a1len, a2len);
   	 //return a3;
	 System.out.println(a3);
	 return a3;
	}

    public static double[] reverse(double[] a){
	int len = a.length;
	int i = 0;
	int end = len - 1;
	if( a[i] >= end){
	   return;
	}
	 int temp = a[i];
	 a[i] = end ;
	 end = temp;
	 end -= 1;
	 return reverse(double[] a); 
	}

    public static double altSum(double[] a){
	double sum = 0;
	int len = a.length;
        for(int i = 0; i < len ; i++){
	    if (i%2 == 0){
		sum = sum + a[i];
	    }
	    else{
		sum = sum - a[i];
		    }
	    return sum;
	}      
    }   
    
    public static boolean isSorted(double[] a){
	int i;
	for (i = 0; i < a.length; i++) { 
	    if (a[i] < a[i + 1]) {
		return true;
	    }
	    else {
		return false;
	    }
    public static void main(String[] args) {
	  double[] array1 = { 2, 3, 5, 7, 11 };
	  double[] array2 = { 1, 4, 6, 8, 0 };
	  System.out.printf("array1: %s\n", Arrays.toString(array1));
	  System.out.printf("array2: %s\n", Arrays.toString(array2));
	  System.out.printf("concat test: %s\n",
       Arrays.toString(concat(array1,array2)));
	  System.out.printf("reverse test: %s\n",
       Arrays.toString(reverse(array1)));
	  System.out.printf("altSum test: %.1f\n", altSum(concat(array1,array2)));
	  System.out.printf("sorted test 1: %b\n", isSorted(array1));
	  System.out.printf("sorted test 2: %b\n", isSorted(array2));
	   }
	}
    }
}