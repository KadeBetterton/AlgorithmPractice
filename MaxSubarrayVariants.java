import java.util.Scanner;
import java.util.Random;

public class MaxSubarrayVariants
{
public static void Main(String[] args)
{
   Scanner keyboard = new Scanner(System.in);
	Random random = new Random();
   int size;
   int array[];
   System.out.println("Input for array size");
   size = keyboard.nextInt();
   array = new int[size];
   for(int i=0; i < size; i++)
		{
			array[i] = random.nextInt(size);
		}
      System.out.println(MaxSubSlow(array, size));
      System.out.println(MaxSubFaster(array, size));
      System.out.println(MaxSubFastest(array, size));






}




public static int MaxSubSlow(int array[], int size)
{
//innermost while loop counter
   int max = 0;
   int s;
   int counter = 0;
   int j, i, k;
   for(j=1;j<size-1;j++)
   
      s = 0;
      for(i=j;i<k;i++)
         counter++;
         s = (s+array[i]);
         if(s>max){
            max = s;}
         return max;
         System.out.println(counter + "slow");
         }
   

public static int MaxSubFaster(int array[], int size)
{
   int counter = 0, i, j, n, k;
   int s[] = new int [size];
   for(i =1;i<n;i++)
     counter++;
     s[i] = (s[i-1] + array[i]);
     int m = 0;
     for(j=1;j<size;j++)
     counter++;
      int sum = (s[k] - s[j-1]);
      if (sum > m)
      {  m = sum; }
      return m;
      System.out.println(counter + "faster");
      }
   
//counter at first for loop and innermost for loop
  
public static int MaxSubFastest(int array[],int size)
{
   int counter = 0, t;
   int m[] = new int[size];
   for(t=1;t<size;t++)
   counter++;
      m[t] = Math.max(0, m[t-1] + array[t]);
   max = 0;
   for(t=1;t<size; t++)
      counter++;
      m = Math.max(m, M[t]);
   return m;
   System.out.println(counter + "Fastest");
   }
//counter increment within both for loops 
}