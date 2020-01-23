package com.calculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }


        public static int findMax(int arr[]) {
            int max = arr[0];//arr[0] instead of 0
            for (int i = 1; i < 4; i++) {
                if (max < arr[i])
                    max = arr[i];
            }
            return max;
        }



}
