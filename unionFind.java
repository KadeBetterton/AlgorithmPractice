public class unionFind
{
public static void main(String [] args)
{
   
   node nodeSet[] = new node[50];
   int i;
   
   for(i=0;i<50;i++)
   {
      nodeSet[i] = makeSet(i);
   }
   for(i=0;i<45;i++)
   {
      union(find(nodeSet[i]), find(nodeSet[i+5]));
      }
    for(i=0;i<50;i++)
    {
    System.out.print(nodeSet[i].value + " (" + find(nodeSet[i]).value + "," + nodeSet[i].depth + ") ");
      }
      System.out.println(" ");
      
      node nodeSet2[] = new node[50];
  
   
   for(i=0;i<50;i++)
   {
      nodeSet2[i] = makeSet(i);
   }
   for(i=0;i<45;i++)
   {
      union2(find2(nodeSet2[i]), find2(nodeSet2[i+5]));
      }
    for(i=0;i<50;i++)
    {
    System.out.print(nodeSet2[i].value + " (" + find2(nodeSet2[i]).value + "," + nodeSet2[i].depth + ") ");
      }

   }
public static node makeSet(int x)
{
   node n = new node();
   n.value = x;
   n.parent = n;
   n.size = 1;
   return n;
}
public static node union(node x, node y)
{
   if (x.size < y.size)
      {x.parent = y;
      y.size = y.size+x.size;
      }
     else
      y.parent = x;
      x.size = x.size + y.size;
      return x;
}
public static void union2(node x, node y)
{
      x.parent = y;
      y.size = y.size + x.size;
}

public static node find(node x)
{
   node r = x;

   x.depth = 0 ;
   while (r.parent != r)
     {
      x.depth += 1;
      r = r.parent;
      }
   
   node z = x;
   
   while (z.parent != z)
      {
      node w = z;
      z = z.parent;
      w.parent = r;
       }
       return r;
}
public static node find2(node x)
{
  
   node r = x;
   x.depth = 0 ;
   while (r.parent != r)
      {r = r.parent;
      x.depth += 1;}
      return r;
   
       
}
}