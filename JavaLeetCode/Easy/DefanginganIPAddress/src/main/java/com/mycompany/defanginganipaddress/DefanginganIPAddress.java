/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.defanginganipaddress;

/**
 *
 * @author gunda
 */
public class DefanginganIPAddress {

    public String defangIPaddr(String address) {
        String[] ads = address.split("\\.");
        String text = "[.]";
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i< ads.length; i++){
            if(i != ads.length-1) {
                sb.append(ads[i].concat(text));
            }
            else {
                sb.append(ads[i]);
            }
        }
        
        return sb.toString();
    }
    
        public String defangIPaddrEasy(String address) {
            return address.replaceAll("\\.", "[.]");
        }
}
