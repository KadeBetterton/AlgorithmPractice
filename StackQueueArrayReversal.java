import java.util.Stack;
import java.util.PriorityQueue;
import java.util.Queue;

public class StackQueueArrayReversal
{
public static void main(String [] args)
{
int array1[] = new int[]{1, 2, 3, 4, 5};
int array2[] = new int[]{1, 2, 3, 4, 5, 6};
stackDemo(array1);
queueDemo(array2);
tempVariable(array1);
tempVariable(array2);

}

public static void stackDemo(int A[])
{
   int i = 0;
   int size = A.length;
   for(i=0;i<size-1;i++)
   {
   Stack<Integer> s = new Stack<Integer>();
      s.push(A[i]);
      }
  for(i=0;i<size-1;i++)
  {
  int[] reverseA = new Int[
   reverseA[i] = s.pop();
   }
   for(i=0;i<size-1;i++)
   {
      System.out.println(" " + reverseA[i] + " ");
      }
   }

public static void queueDemo(int A[])
{  int i = 0;
   Queue<Integer> q = new PriorityQueue<Integer>();   
   for(i=0;i<A.length-1;i++)
   {
       q.add(A[i]);
   }
   for(i=A.length-1;i>0;i--)
   {
       q.remove(A[i]);
       }
       for(i=0;i<A.length-1;i++)
   {
      System.out.println(" " + A[i] + " ");
      }
}

public static void tempVariable(int A[])
{
   int temp = 0;
   int i = 0;
   for(i=0;i<A.length-1;i++){
      temp = A[i];
      A[i] = A[A.length-i-1];
      A[A.length-i-1] = temp;
      }
      for(i=0;i<A.length-1;i++)
   {
      System.out.println(" " + A[i] + " ");
      }
}
}