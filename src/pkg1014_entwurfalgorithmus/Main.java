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
        int[] nums = {1, 2, 3}; // ungerade anzahl
        int[] nums2 = {1, 2, 3, 4}; // gerade anzahl
        int[] nums3 = {1, 3, 2}; // ungerade anzahl nicht sortiert
        int[] nums4 = {4, 2, 1, 3}; // gerade anzahl nicht sortiert

        System.out.println("Median: " + a.getMedian(nums));
        System.out.println("Median: " + a.getMedian(nums2));
        System.out.println("Median: " + a.getMedian(nums3));
        System.out.println("Median: " + a.getMedian(nums4));
        

    }

}
