import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class lab10
{
public static void main(String [] args)
{
System.out.println("Please enter array size.");
Random random = new Random();
Scanner keyboard = new Scanner(System.in);
int n = keyboard.nextInt();
int d;
double [] index = new double[n];
double [] profit = new double[n];
double [] weight = new double[n];
double [] ratio = new double[n];
double tempI,tempP,tempW;
double temp;

double currentWeight=0;
double currentProfit=0;




int maxWeight = n;
int i;
for(i = 0 ;i < n; i++)
      {  temp = random.nextInt(n)+1;
         profit[i] = Double.valueOf(temp);
      
      
         temp = random.nextInt(n)+1;
         weight[i] = Double.valueOf(temp);
         
         index[i]=i;
         
         }
for(i = 0 ;i < n; i++)
{
   ratio[i] = (profit[i]/weight[i]);
   System.out.println(" Item: " + index[i] + " Weight: " + weight[i] + " Profit: " + profit[i] + " Ratio: " + ratio[i] + " Total: " + currentWeight  );
   }
   
      for(i=0;i<n;i++)
      {
         for(d=0;d<n;d++)
         {
            if(ratio[d] > ratio[i])
            {
            temp = ratio[i];
            tempI = index[i];
            tempP = profit[i];
            tempW = weight[i];
            ratio[i] = ratio[d];
            index[i] = index[d];
            profit[i] = profit[d];
            weight[i] = weight[d];
            index[d] = tempI;
            ratio[d] = temp;
            profit[d] = tempP;
            weight[d] = tempW;
            }
          }
          System.out.println(" Item: " + index[i] + " Weight: " + weight[i] + " Profit: " + profit[i] + " Ratio: " + ratio[i] + " Total: " + currentWeight  );
       }
       
       for(i=0;i<n;i++)
       {
       
       currentWeight = currentWeight + weight[i];
      
       if(currentWeight < n)
       {
       
       System.out.println(" Item: " + index[i] + " Weight: " + weight[i] + " Profit: " + profit[i] + " Ratio: " + ratio[i] + " Total: " + currentWeight  );
       
       
       } 
       }
       
      
               
         
   
   
   }
   
   
   
   
          }
               
               
                
               
               
               
               
