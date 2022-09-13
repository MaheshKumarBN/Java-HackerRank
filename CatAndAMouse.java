package com.berry.codingchallenge;

public class CatAndAMouse {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
    	int cat1 = z - x;
    	int cat2 = z - y;
    	
    	if(cat1 < 0)
    		cat1 *= -1;
    	if(cat2 < 0) 
    		cat2 *= -1;
    	String result = "";
    	if(cat1 < cat2)
    		result = "Cat A";
    	else if(cat2 < cat1)
    		result = "Cat B";
    	else if(cat1 == cat2)
    		result = "Mouse C";
    	return result;
    }


    public static void main(String[] args) {

            int x = 1;
            int y = 3;
            int z = 2;
            String result = catAndMouse(x, y, z);

           System.out.println(result);
    }
}
