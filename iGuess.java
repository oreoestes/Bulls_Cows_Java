/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COP2510.project.business;

import java.util.Random;

/**
 *
 * @author Oreti
 */
public class iGuess {
    public static String Rules(String r){
        r = "The rules for iGuess are simple. A secret code has will be generated, the goal is to guess this code."
                + "\nYou may only makes guesses of 5 characters or less, anymore will end the game."
                + "\nOnly uppercase letters are in use."
                + "\nThe secret code will be comprised of these select characters: "
                + " V,W,X,Y,Z,5,6,7,8,9,=,?,%,@,$"
                + "\nThat is all you need to know, feel free to type 'x' at anytime throughout the game to quit. Happy Guessing!";
    return r;
    }
    public static String randString(String rand){
        String chars = "=?%$56789VWXYZ";
        rand = "";
        int length = 5;
        int i = length;
        
        Random r = new Random();
        
        char[] t = new char[length];
        
        while(i-- > 0) {
            t[i] =  chars.charAt(r.nextInt(chars.length()));
        }
        
        for(i = 0; i<t.length; i++){
            rand += t[i];
        }
        rand = atSym(rand, r.nextInt(5), '@');
        return rand;
    }
    public static String atSym(String s, int pos, char c){
        return s.substring(0, pos) + c + s.substring(pos + 1);
    }
    public static int computeBulls(String num1, String num2) {
	int bullCounter = 0;

	for (int i = 0; i < num1.length(); i++) {
            if (num1.charAt(i) == num2.charAt(i)) {
		bullCounter++;
            }
	}
        return bullCounter;
    }

    public static int computeCows(String num1, String num2) {
	int cowsCounter = 0;
	for (int i = 0; i < num1.length(); i++) {
            for (int j = 0; j < num2.length(); j++) {
		if (i != j) {
                    if (num1.charAt(i) == num2.charAt(j)) {
			cowsCounter++;
                    }
		}
            }
	}
	return cowsCounter;
    }
}
