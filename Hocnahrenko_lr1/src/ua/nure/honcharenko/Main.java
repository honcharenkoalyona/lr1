package ua.nure.korolovich;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;


public class Main
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            System.out.println("Enter length of num array");
            int [] array = new int[Integer.parseInt(d.readLine())];

            System.out.println("\n Enter numbers");

            for(int i = 0; i < array.length; i++)
            {

                System.out.print("Index № " + i + ": ");
                array[i] = Integer.parseInt(d.readLine());
            }
            boolean isSorted = false;
            int buf;
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < array.length-1; i++)
                {
                    if(array[i] > array[i+1]){
                        isSorted = false;

                        buf = array[i];
                        array[i] = array[i+1];
                        array[i+1] = buf;
                    }
                }
            }
            System.out.println("\n Sorted array :");
            System.out.println(Arrays.toString(array));

            System.out.println("\n Enter index of the element");
            int n = Integer.parseInt(d.readLine());

            System.out.print("\n Index" + n + ", = - " + array[n]);

        }
        catch (Exception e)
        {
            System.out.println("Exception");
        }
    }
}
