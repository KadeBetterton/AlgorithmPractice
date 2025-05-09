import java.util.Scanner;
public class BinarySearchTreeQueries
{
public static void main(String [] args)
{
   Scanner keyboard = new Scanner(System.in);
   System.out.println("Enter the size of your input.");
   int size = keyboard.nextInt();
   int input[] = new int[size];
   System.out.println("Enter your input.");
   BinaryNode root = new BinaryNode();
   
   for(int i=0;i<size;i++)
   {
      
      input[i] = keyboard.nextInt();
      root.value = input[0];
      addToTree(input[i], root);
   }
   
   
   
   outputTree(root);
   System.out.println("Enter first range query input");
   int q1 = keyboard.nextInt();
   System.out.println("Enter second range query input");
   int q2 = keyboard.nextInt();
   
   RangeQuery(q1, q2, root);
   
   System.out.println("Enter index to search for");
   int indexSearch = keyboard.nextInt();
   TreeSelect(indexSearch, root);
}
private static void addToTree(int k, BinaryNode v)
{
   
  
   v.index += 1;
   if((v.left == null) && (k < v.value))
   {
      BinaryNode u = new BinaryNode();
      u.value = k;
      v.left = u;
   }
   else if(v.right==null && k > v.value)
   {
      BinaryNode u = new BinaryNode();
      u.value = k;
      v.right = u;
   }
   else if(k < v.value)
   {
      addToTree(k,v.left);
   }
   else if(k > v.value)
   {
      addToTree(k, v.right);
   }
   
      
}



private static void outputTree(BinaryNode v)
{
   if(v.left!=null && v.right!=null)
   
   {
         System.out.print(v.value + "(" + v.left.value + "," + v.right.value + ")");
         outputTree(v.left);
         outputTree(v.right);
   }
   else if(v.left == null && v.right == null)
   {
      System.out.print(v.value + "(e, e)");
   }
   else if(v.left == null)
   {
      System.out.print(v.value + "(e," + v.right.value + ")");
      outputTree(v.right);
   }
   else if(v.right== null)
   {
      System.out.print(v.value + "(" + v.left.value + ",e)");
      outputTree(v.left);
      }
      }

private static void RangeQuery(int k1, int k2, BinaryNode v)

{
   
   if(v != null)
   {
   
   
   if(k1 <= v.value && v.value <= k2)
   {
      System.out.println(v.value);
      RangeQuery(k1, k2, v.left);
      RangeQuery(k1, k2, v.right);
      
   }
   else if (v.value < k1)
   
      RangeQuery(k1, k2, v.left);
   
   else if (v.value > k2)
   
      RangeQuery(k1, k2, v.right);
   
   }
    
}
private static void TreeSelect(int i, BinaryNode v)
{
   
   {
   BinaryNode w = new BinaryNode();
   w = v.left;
   if(v.left != null)
   {
   if (i <= w.index)
   {
   
      TreeSelect(i, w);
      }}
   
   else if(i == w.index+1)
   
      System.out.println(v.index + " " + v.value);
   
   else
      
      TreeSelect(i-w.index-1, v.right);
      
   

}
}
}