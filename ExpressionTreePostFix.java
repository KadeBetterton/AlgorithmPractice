import java.util.Stack;
import java.lang.*;
import java.util.*;
public class ExpressionTreePostFix
{
public static void main(String [] args)
{

char[] word1 = new char[]{'1','2','+','3','4','-','-','5','6','*','7','8','+','*','/'};
BinaryNode node2 = new BinaryNode();

node2 = postFix(word1);

System.out.println("Pre-Order-Traverse");
preOrderTraverse(node2);

System.out.println("Post-Order-Traverse");
postOrderTraverse(node2);

System.out.println("In-Order-Traverse");
inOrderTraverse(node2);

char[] word2 = new char[]{'3','4','*','5','4','/','7','8','+','9','2','-'};

}

public static BinaryNode postFix(char word[])
{
Stack<BinaryNode> s = new Stack<BinaryNode>();

for(int i=0;i < word.length; i++)
{
  
   if((word[i] == '0')||(word[i] == '1')||(word[i] == '2')||(word[i] == '3')||(word[i] == '4')||(word[i] == '5')||(word[i] == '6')||(word[i] == '7')||(word[i] == '8')||(word[i] == '9'))
    {  BinaryNode node1 = new BinaryNode();
      node1.value = word[i];
      s.push(node1);
      }
      
   else if((word[i] == '+')||(word[i] == '-')||(word[i] == '*')||(word[i] == '/'))
    {BinaryNode node1 = new BinaryNode();
      node1.value = word[i];
      node1.rightchild = s.pop();
      node1.leftchild = s.pop();
      s.push(node1);
      }
     } 
     
     return s.pop();
 }    
public static void preOrderTraverse(BinaryNode v)
{
   
	System.out.print(v.value);
	if(v.leftchild != null)
      {preOrderTraverse(v.leftchild);}
   if(v.rightchild != null)
      {preOrderTraverse(v.rightchild);}
      
}
public static void postOrderTraverse(BinaryNode v)
{
   
	if(v.leftchild != null)
      {preOrderTraverse(v.leftchild);}
   if(v.rightchild != null)
     { preOrderTraverse(v.rightchild);}
   System.out.print(v.value); 
}
public static void inOrderTraverse(BinaryNode v)
{
   
   if(v.leftchild != null)
      {preOrderTraverse(v.leftchild);}
   if(v.rightchild != null)
      {preOrderTraverse(v.rightchild);}
}
}

