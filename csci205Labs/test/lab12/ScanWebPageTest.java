/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author as063
 */
public class ScanWebPageTest {
    
    public ScanWebPageTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
   
     /**
     * Test of main method, of class ScanWebPage.
     * @throws java.io.IOException
     */
    @Test(expected = MalformedURLException.class)
    public void malformedException() throws IOException {
        String address = "www.bucknell.edu";
        URL locator = new URL(address);
    }

    @Test(expected = UnknownHostException.class)
    public void unknownHostException() throws IOException {
        String add = "https://www.bucknell.ed";
        URL locator = new URL(add);
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalArgumentException() throws IOException {
        String address = "http:\\www.bucknell.edu";
        URL locator = new URL(address);
    }

    @Test(expected = FileNotFoundException.class)
    public void fileNotFoundException() throws IOException {
        String address = "http://www.bucknell.edu/blah.html";
        URL locator = new URL(address);
    }
    }
    

