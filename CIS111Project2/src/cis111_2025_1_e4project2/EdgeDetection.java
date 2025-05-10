package cis111_2025_1_e4project2;

public class EdgeDetection {

	//Laplace 4-kernel
	private static final int[][] LAPLACE_KERNEL = { { 0, -1, 0 }, { -1, 4, -1 }, { 0, -1, 0 } };
	
	public static int[][] edgeDetector(int[][] image) {
		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		if (image == null || image.length == 0 || image[0].length == 0) {
	        return new int[0][0];
	    }

	    int height = image.length;
	    int width = image[0].length;
	    int[][] edges = new int[height][width];

	    for (int i = 0; i < height; i++) {
	        for (int j = 0; j < width; j++) {
	            int topNeighbor = 0;
	            if (i > 0) {
	                topNeighbor = image[i - 1][j];
	            }

	            int bottomNeighbor = 0;
	            if (i < height - 1) {
	                bottomNeighbor = image[i + 1][j];
	            }

	            int leftNeighbor = 0;
	            if (j > 0) {
	                leftNeighbor = image[i][j - 1];
	            }

	            int rightNeighbor = 0;
	            if (j < width - 1) {
	                rightNeighbor = image[i][j + 1];
	            }

	            int laplaceResponse = 4 * image[i][j] -
	                                    topNeighbor -
	                                    bottomNeighbor -
	                                    leftNeighbor -
	                                    rightNeighbor;

	            if (laplaceResponse != 0 && image[i][j] == 0) {
	                edges[i][j] = 255;
	            } else {
	                edges[i][j] = 0;
	            }
	        }
	    }
	    return edges;

		 //return new int[][] {{}}; // ~~fake~~

		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
	}
	
	public static String edgePlot(int[][] outImg) {
		
		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		 if (outImg == null || outImg.length == 0 || outImg[0].length == 0) {
			return "";
		}

		StringBuilder plot = new StringBuilder();
		for (int[] row : outImg) {
			for (int pixel : row) {
				if (pixel == 255) {
					plot.append(".");
				} else {
					plot.append(" ");
				}
			}
			plot.append("\n");
		}
		return plot.toString();
		 //return ""; // ~~fake~~

		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
		
	}
}
