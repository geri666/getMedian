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
        int[] nums = {1,4,7,2,4,6,8,9,3,1,8,0};
        System.out.println("Median: " + a.getMedian(nums));

    }

}
