package cis111_2025_1_e4project2;

import java.util.Arrays;

public class EdgeDetection_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] binaryImage = {
			    {255, 255, 255, 255, 255, 255, 255},
			    {255, 255, 255, 255, 255, 255, 255},
			    {255, 255, 0, 0, 0, 255, 255},
			    {255, 255, 0, 0, 0, 255, 255},
			    {255, 255, 0, 0, 0, 255, 255},
			    {255, 255, 255, 255, 255, 255, 255},
			    {255, 255, 255, 255, 255, 255, 255}
			};
		
		int[][] ex1 = EdgeDetection.edgeDetector(binaryImage);
		
		for(int i = 0; i<binaryImage.length; i++) {
			System.out.println(Arrays.toString(ex1[i]));
		}
		
		System.out.println(EdgeDetection.edgePlot(EdgeDetection.edgeDetector(binaryImage)));

	}

}
