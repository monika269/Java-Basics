package day2;

public class MultidimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[2][3];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		
		int[][] arr1= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		//jagged array
		int[][] arr2=new int[3][];
		arr2[0]=new int[2];
		arr2[1]=new int[3];
		arr2[2]=new int[4];
		
		arr2[0][0]=5;
		arr2[0][1]=15;
		
		arr2[1][0]=25;
		arr2[1][1]=35;
		arr2[1][2]=45;
		
		arr2[2][0]=55;
		arr2[2][1]=65;
		arr2[2][2]=75;
		arr2[2][3]=85;
		
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
				

	}

}
