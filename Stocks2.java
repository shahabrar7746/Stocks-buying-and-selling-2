
import java.util.*;
class Stocks2 {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
	    //defining size of array
        int n = sc.nextInt();
        int array[] = new int[n];
	    //Defining values for array
        for(int i = 0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        int max = 0;
        int min = 0;
        int location = 0;
        int location1 = 0;
	    //Calculating max and min stocks
        for(int i = 0;i<array.length;i++){
            for(int j =0;j<array.length;j++){
                max = array[i];
                min = array[i];
                if(max<array[j]){
                    max = array[j];
                    location = i;
                    
                }if(min>array[j]){
                    min = array[j];
                    location = j;
                }
                
            }
            if(location1 < location){
                break;
            }
        }
	    //Printing profits
        System.out.println(max - min);
}
}
