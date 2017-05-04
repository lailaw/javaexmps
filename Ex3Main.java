import java.util.Scanner;
import java.io.InputStreamReader;
import java.lang.*;

public class Ex3Main {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int rows=5;
//		IsoTriangle(rows);
		IsoTriangle(5);
	}//end of main

 static void IsoTriangle(Integer rows){
//	int rows=5;
	 System.out.println(rows);
	for(int count=1;count<rows+1;count++){
// test		System.out.println(count);
		Spaces(rows-count);
//		DrawBar(count);
		DrawBar((count-1)*2 +1);
	}//stops for loop
}//end of IsoTriangle

 static void Spaces(Integer numofspaces){
// test	 System.out.println(numofspaces);
	for(int count=0;count<numofspaces;count++){
		System.out.print(" ");
	}//end of for loop
}//end of spaces
 static void DrawBar(Integer asterisks){
// test	 System.out.println(asterisks);
	for(int count=0;count<asterisks;count++){
		System.out.print("*");
	}//end of for loop
	System.out.println();
}//end of spaces
	

}//end of class

