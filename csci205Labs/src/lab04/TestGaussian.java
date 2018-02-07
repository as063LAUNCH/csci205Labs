/* *****************************************
* CSCI205 - Software Engineering and Design
* Spring 2016
* Instructor: Your instructor
* Section: List time of your lecture
*
* Name: Anushikha Sharma
* Date: 01/29/2016
*
* Lab / Assignment: 
*
* Description:
*
* *****************************************/
package lab04;
import java.util.Random;
public class TestGaussian {
    static final int MAX_NUMS = 10000;
	public static double calcStDev(double nums[]) {
		double sum = 0;
		double VarSum = 0;
		int numsLen = nums.length;
                for(int i = 0; i < numsLen ; i++){
                        sum = sum + nums[i];
                //calculate average value
		}
                double average = sum / numsLen;
		for(int i; i < numsLen ; i++){
		        double Dif = (nums[i] - average);
			double Pow  = Math.pow(Dif, 2);
			VarSum = VarSum + Pow;
                double variance = VarSum / numsLen;
	} 
                
        }
/*
}
	public static double calcAltStDev(double nums[]){
		int sum = 0;
		int index = 0;
		int VarSum = 0;
		numLen = nums.length;
                for(int index; index < numsLen ; i++){
			double Sqr = Math.pow(nums[i], 2);
                        sum = sum + Sqr
                double average = sum / numsLen;
	}
		for(int index; index < numsLen ; i++){
                        double Dif = double (nums[index] - average);
			double VarSum = Math.pow(Dif, 2);
			VarSum = VarSum + nums[index];
                double variance = VarSum / numsLen;
	} 
                
        }
}
				
	*/
 	public static void main(String[] args) {
 		Random rand = new Random();
 		double[] nums = new double[MAX_NUMS];
 		for (int i = 0; i < MAX_NUMS; i++) {
 		nums[i] = rand.nextGaussian();
 		}
 	}
}
