package cis111_2025_1_e4project2;

public class EdgeDetection {

	//Laplace 4-kernel
	private static final int[][] LAPLACE_KERNEL = { { 0, -1, 0 }, { -1, 4, -1 }, { 0, -1, 0 } };
	
	public static int[][] edgeDetector(int[][] image) {
		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		int height = image.length;
        int width  = image[0].length;
        int[][] output = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int sum = 0;
                // apply 3×3 Laplacian kernel
                for (int ki = 0; ki < 3; ki++) {
                    for (int kj = 0; kj < 3; kj++) {
                        int ii = i + ki - 1;
                        int jj = j + kj - 1;
                        int pixel = 0;
                        if (ii >= 0 && ii < height && jj >= 0 && jj < width) {
                            pixel = image[ii][jj];
                        }
                        sum += pixel * LAPLACE_KERNEL[ki][kj];
                    }
                }

                // any non-zero response is an edge → mark as 255
                output[i][j] = (sum != 0) ? 255 : 0;
            }
        }
        return output;

		 //return new int[][] {{}}; // ~~fake~~

		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
	}
	
	public static String edgePlot(int[][] outImg) {
		
		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		 StringBuilder sb = new StringBuilder();
	        int height = outImg.length;
	        int width  = outImg[0].length;

	        for (int i = 0; i < height; i++) {
	            for (int j = 0; j < width; j++) {
	                // plot edges as '*' for visualization
	                sb.append(outImg[i][j] > 0 ? '*' : ' ');
	            }
	            sb.append('\n');
	        }
	        return sb.toString();
		 //return ""; // ~~fake~~

		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
		
	}
}
