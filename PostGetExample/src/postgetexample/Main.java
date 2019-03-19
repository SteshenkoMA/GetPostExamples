/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postgetexample;

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

/**
 *
 * @author maxim
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
    
        System.out.println("Get request:");
        
        HttpSender example1 = new HttpSender("http://www.google.com");
        example1.sendGet();
        
        System.out.println("Post request:");
         
        HttpSender example2 = new HttpSender("http://www.google.com");
        example1.sendPost("name=Jack&occupation=programmer");
    
}
    
}
