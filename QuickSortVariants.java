import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class QuickSortVariants
{
public static int counter = 0;
public static void main(String [] args)
{

Random random = new Random();
Scanner keyboard = new Scanner(System.in);
   
   System.out.println("Enter the size of your array.");
   int size = keyboard.nextInt();
   int input[] = new int[size];
   int input2[] = new int[size];
   int input3[] = new int[size];
   for(int i = 0 ;i < size; i++)
      { input[i] = random.nextInt(1000 - -1000) + -1000;
         input2[i] = input[i];
         input3[i] = input[i];
      }
      quicksort(0, size-1, input);
      System.out.println("1st without cutoff");
      System.out.println(Arrays.toString(input));
      System.out.println("Counter:" + counter);
      System.out.println("median without cutoff");
      
      
   
      counter = 0 ;
      quicksortMed(0, size-1, input2);
      System.out.println(Arrays.toString(input2));
      System.out.println("Counter:" + counter);
      counter = 0;
      quicksortInsert(0, size-1, input3);
      System.out.println("median with cutoff");
      System.out.println(Arrays.toString(input3));
      System.out.println("Counter:" + counter);



}
static int partition ( int low, int high, int pivotPoint, int a[])
{
int pivot = a[low];
int i = low+1;
int j = high;
while (i<j)
{
   while(i<high && a[i] <= pivot)
      {i++;}
   while(j>low&&a[j]>=pivot)
      {j--;}
   if(i<j)
      {int temp = a[i];
      a[i] = a[j];
      a[j] = temp;}
      }
if(i>j)
{i--;}
if(a[low]>a[i])
   {int temp = a[low];
   a[low] = a[i];
   a[i] = temp;}
   pivotPoint = i;
   return pivotPoint;

}
public static int quicksort(int low, int high, int[]a)
{
   counter = counter + 1;
   int pivotPoint=0;

   if(high > low)
   {
    pivotPoint = partition(low, high, pivotPoint, a);
    quicksort(low, pivotPoint-1, a);
    quicksort(pivotPoint+1, high, a);
    }
    return pivotPoint;
}
static int partitionMedian ( int low, int high, int pivotPoint, int a[])
{
int median = (low+high)/2;
int medianA[] = new int[3];

   medianA[0]= a[low];
   medianA[1] = a[median];
   medianA[2] = a[high];
   Arrays.sort(medianA);
   medianA[1] = median;
   int pivot = median;
   

int i = low+1;
int j = high;
while (i<j)
{
   while(i<high && a[i] <= pivot)
      {i++;}
   while(j>low&&a[j]>=pivot)
      {j--;}
   if(i<j)
      {int temp = a[i];
      a[i] = a[j];
      a[j] = temp;}
      }
if(i>j)i--;
if(a[low]>a[i])
   {int temp = a[low];
   a[low] = a[i];
   a[i] = temp;}
   pivotPoint = i;
   return pivotPoint;
}

  public static void insertionSort(int low, int high, int S[])
   {
      counter = counter +1;
      int i, j, x;
      for(i=low+1; i <= high; i++)
      {
      x = S[i];
      j = i - 1;
      while(j>0 && S[j] > x)
      {
         S[j+1] = S[j];
         j--;
         }
         S[j+1] = x;
         }
         }
  public static int quicksortMed(int low, int high, int[]a)
{
   counter = counter + 1;
   int pivotPoint=0;

   if(high > low)
   {
    pivotPoint = partitionMedian(low, high, pivotPoint, a);
    quicksort(low, pivotPoint-1, a);
    quicksort(pivotPoint+1, high, a);
    }
    return pivotPoint;
}
public static int quicksortInsert(int low, int high, int[]a)
{
   counter = counter + 1;
   int pivotpoint=0;
   if(high>low)
      pivotpoint = partition(low, high, pivotpoint, a);
      if((pivotpoint-1) - low <10)
         insertionSort( low, pivotpoint-1, a);
      else
         quicksortInsert(low, pivotpoint-1, a);
      if(high - (pivotpoint+1) < 10)
         insertionSort( pivotpoint+1, high, a);
      else
         quicksortInsert(pivotpoint+1, high, a);
         
         return pivotpoint;
         }
        
         


         
         
         }
         
         
    
    
   