/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1014_entwurfalgorithmus;

/**
 *
 * @author Gergö Szijarto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Algorithmus a = new Algorithmus();
        int[] nums = {1, 2, 3, 4}; // gerade anzahl
        int[] nums2 = {1, 2, 3, 4, 5}; // ungerade anzahl
        
        System.out.println("Median: " + a.getMedian(nums)); // 2.5 erwartet
        System.out.println("Median: " + a.getMedian(nums2)); // 3 erwartet
        
        
    }

}
