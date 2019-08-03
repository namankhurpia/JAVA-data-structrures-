/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicleplacements;

import java.util.*;

/**
 *
 * @author Naman Khurpia
 */
public class microsoft_quest_5 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int sum = kb.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = kb.nextInt();
        }
        int c = 0;
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {

                if (arr[i] + arr[j] == sum) {
                    System.out.println("pair-" + arr[i] + "" + arr[j]);
                    c = c + 1;
                }

            }
        }

        System.out.println("total pairs are " + c);

    }

}
