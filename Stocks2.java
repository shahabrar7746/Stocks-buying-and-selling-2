
import java.util.*;
class Stocks2 {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
//Defining Array and its value
 int array[] = {20,90,98,56,35,84,73,12,56,9,56,89,34};
;
	int max = array[0];
	int min = array[0];
	int location = 0;
	int location1 = 0;
	//Finding maximum and minimum stock for days
	for(int i = 0;i<array.length;i++){
	    if(max < array[i]){
	        max = array[i];
	        location = i;
	    }if(min > array[i]){
	        min = array[i];
	        location1 = i;
	    }
	   
	    
	    
	} location = location + 1;
	location1 = location1 + 1;
	//Showing maximum and minimum stock values
	 System.out.println("Max stock value is " + max + " at " + location + " "  );
	
	     System.out.println("Min stock value is " + min + " at " + location1 + " ");
	     int profit = max - min;
	     System.out.println("Profit would be " + profit);
}
}
