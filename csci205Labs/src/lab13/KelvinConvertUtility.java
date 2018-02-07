/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

/**
 *
 * @author as063
 */
public class KelvinConvertUtility {
    /**
     * Utility method to convert a Celsius temperature to Kelvin
     *
     * @param celT Celsius temp to convert
     * @return equivalent temperature in Kelvin
     */
    public static double convertCtoK(double celT) {
        return 273.15 + celT;
    }
    
    /**
     * Utility method to convert a Celsius temperature specified by a String to Kelvin
     * 
     * @param celTemp Celsius temp (as a String) to convert
     * @return equivalent Kelvin temperature (as a String)
     * @throws NumberFormatException
     */
    public static String strConvertCtoK(String celTemp) throws NumberFormatException {
        Double c = Double.valueOf(celTemp);
        return Double.toString(convertCtoK(c));
    }
    
    /**
     * Utility method to convert a Fahrenheit temperature to Kelvin
     *
     * @param fahTemp Fahrenheit temp to convert
     * @return equivalent temperature in Kelvin
     */
    public static double convertFtoK(double fahT) {
        return (459.67 + fahT)*5/9;
    }
    
    /**
     * Utility method to convert a Fahrenheit temperature specified by a String to Kelvin
     * 
     * @param fahT Fahrenheit temp (as a String) to convert
     * @return equivalent Kelvin temperature (as a String)
     * @throws NumberFormatException
     */
    public static String strConvertFtoK(String fahT) throws NumberFormatException {
        Double c = Double.valueOf(fahT);
        return Double.toString(convertFtoK(c));
    }

    
}
