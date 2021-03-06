package simulatedannealing;

public class Driver {

	public static void main(String[] args)
	{
		
		int size = 10;
		GraphGenerator testGraph = new GraphGenerator();
		int[][] graph = testGraph.getGraphOfSize(size);
		
		int[] route = {0,1,2,3,4,5,6,7,8,9};
		
		HillClimber climber = new HillClimber();
                SimulatedAnnealing simulation = new SimulatedAnnealing();
		
		int numberOfIterations = 5;
		
		//Print out graph
		for(int x = 0; x <route.length; x++)
		{
			for(int y =0; y<route.length;y++)
			{
				System.out.print(graph[x][y] + ", ");
			}
			System.out.println("\n");
		}
		//
			
		System.out.println("Graph of size " + size + "\n");
			
		for(int x = 0; x < numberOfIterations; x++)
		{
			System.out.println("Round: " + x);
			testGraph.shuffleArray(route);
			
			System.out.println("Hill climb:");
			System.out.println("-------------------------");
			climber.climbHill(route, graph, 10000);
			System.out.println("-------------------------");

			System.out.println("\nSimulated Annealing:");
			System.out.println("-------------------------");
			simulation.simulatedAnnealing(route, graph);
			System.out.println("-------------------------");

			System.out.println();
		}
	}
	
	
}