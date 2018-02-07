/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 *
 * @author as063
 */
public class ScanWebPage {
    //Create a buffered input stream reader connected to the file
    public static void main(String[] args) throws IOException{
            Scanner sc = new Scanner(System.in);
            boolean ValidURL = false;
            System.out.println("Enter URL to scan:");
            while (ValidURL == false){
                String address = sc.nextLine();
                try{
                  URL locator = new URL(address);
                  BufferedInputStream Buf = new BufferedInputStream(locator.openStream());  
                  Scanner in = new Scanner(Buf);
                  
                  ValidURL = true;
                  Scanner sec = new Scanner(System.in);
                  System.out.println("Enter tag to search for");
                  String tag = sec.next();
                  
                  System.out.println("Enter the file name to store the results:");
                    String results = sec.next();
                    PrintWriter result = new PrintWriter(results);
                    
                    Pattern p = Pattern.compile("<+" + tag);

                    String sMatch;
                    int counter = 0;
                    while ((sMatch = in.findWithinHorizon(p, 0)) != null) {
                        result.println(sMatch);
                        counter++;
                    }
                    System.out.println(
                            "Wrote " + counter + " <" + tag + "> tags to " + results);
                    Buf.close();
                    in.close();
                    result.close();
// Use try and catch blocks to catch all the errors
                } catch (MalformedURLException locator) {
                    System.err.println(
                            "Malformed URL, please try again");
                } catch (IllegalArgumentException locator) {
                    System.err.println(
                            "Illegal argument, please check the URL syntax and try again");
                } catch (FileNotFoundException locator) {
                    System.err.println(
                            "File not found, please try again");
                } catch (UnknownHostException locator) {
                    System.err.println(
                            "Unknown host, please try again");
                } catch (IOException ex) {
                    Logger.getLogger(ScanWebPage.class.getName()).log(Level.SEVERE,
                            null, ex);
            }
        }
    }       
    }

