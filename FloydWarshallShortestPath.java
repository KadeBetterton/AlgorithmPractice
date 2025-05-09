public class FloydWarshallShortestPath
{
static int[][] pth;
public static void main(String [] args )
{
	

	
		
		int[][] W1 = {{0, 5, 9999, 11, 9999, 9999},
                    {7, 0, 3, 9999, 9999, 9999},
                    {9999, 9999, 9999, 9999, 1, 9999},
                    {9999, 9999, 9999, 0, 9999, 20},
                    {9999, 1, 3, 1, 0, 6},
                    {9999, 9999, 9999, 9999, 9999, 0}} ;		//matrix containing weight between each pair of nodes on graph
		int[][] D1 = new int[6][6];		//matrix containing total sum of all weights on shortest paths between two nodes
		int[][] P1 = new int[6][6];		//matrix containing highest node index used on shortest path between two nodes

		int[][] W2 = {{0, 5, 9999, 1, 3, 9999},
                    {5, 0, 11, 5, 7, 9999},
                    {9999, 11, 0, 9999, 4, 13},
                    {1, 5, 9999, 0, 9999, 4},
                    {3, 7, 4, 9999, 0, 4},
                    {9999, 9999, 13, 4, 4, 0}};
                    
		int[][] D2 = new int[6][6];
		int[][] P2 = new int[6][6];

		//Set each value W[i][j] equal to the weight of the edge from i to j
		//If i=j, set W[i][j] equal to 0
		//If no edge connects i to j, set W[i][j] equal to 9999

		floyd(0, 5, W1, D1, P1);				//perform Floyd's algorithm using 0 as lowest index and 5 as highest index
		//make calls to print the matrices W1, D1, and P1
		printMatrix(W1);
      printMatrix(D1);
      printMatrix(P1);
		pth = P1;						
		getPath(0, 5);						//print path from element 0 to element 5
	
		floyd(0, 5, W2, D2, P2);
      printMatrix(W2);
      printMatrix(D2);
      printMatrix(P2);
		pth = P2;						
		getPath(0, 5);					
		

	 	//pth = P2;						//array of highest-indexed intermediates, generated as P[][] in floyd function
		//getPath(0, 5);						//print path from element 0 to element 5
	}
	
	public static void floyd(int m, int n, int[][] W, int[][] D, int[][] P )
	{
   int i=m;
   int j=m;
   int k=m;
		for (i=m; i <= n; i++){
			for (j=m; j<=n; j++){
				P[i][j] = -1;				//initialize max index on path from i to j as -1 (i.e. direct edge from i to j with no intermediates being used)
				D[i][j] = W[i][j];
            }}    			//initalize weight of shortest path from i to j as the direct edge between them (9999 if no edge exists)
		for(k=m; k<=n; k++){							//every possible intermediate node
			for(i=m; i<=n; i++){						//every possible start node
				for(j=m; j<=n; j++){					//every possible end node
					if( (D[i][k]+D[k][j]) < D[i][j] )		//if the path from i to j using the k as the highest intermediate, is shorter than current path using (k-1) as highest intermediate
						{P[i][j] = k;				//k is new max index node on shortest path from i to j
						D[i][j] = D[i][k] + D[k][j];}
                  }
                  }
                  }
                  		//recalculate shortest path from i to j, using k as intermediate
	}
	
	public static void printMatrix(int[][] arr)
	{
   int x=0;
		for(int i=0; i<=5; i++)
			{for(int j=0; j<=5; j++)
				{x = arr[i][j];
				System.out.print("\t"+x);}
			System.out.println("");	}				//new line every 6 elements
	}
	
	public static void getPath(int q, int r)
	{
		int w = pth[q][r];			//w = highest-index from start to end
		if (pth[q][r] != -1)			//if w is not equal to -1 (i.e. path from start to end uses intermediates, and isn't a direct edge)
			{getPath(q, w);			//find path from starting index to highest-indexed intermediate
			System.out.println("Node "+ w);		//print the highest-index
			getPath(w, r);}			//find path from highest-indexed intermediate to end
	}
   
}

