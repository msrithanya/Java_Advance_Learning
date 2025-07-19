import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

// public class Collection {
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         // int a =s.nextInt();
//         ArrayList<Integer> num=new ArrayList<Integer>();
//         ArrayList<Integer> nums=new ArrayList<Integer>();
//         // for(int i=0;i<a;i++){
//         //      num.add(s.nextInt());
//         // }
//         // for(int i=0;i<a;i++){
//         //     if(num.get(i)%2!=0){
//         //       nums.add(num.get(i));
//         //     }
//         // }
//         num.add(6);
//         num.add(8);
//         num.add(5);
//         System.out.println(num);
//         Collections.sort(num);
//         System.out.println(num);
//     }
// }


// public class Collection //problem2 input=800 output=[500:1,200:1,100:1]
// {
// 	public static void main(String[] args) {
// 	   // ArrayList <Integer> a=new ArrayList<Integer>();
// 	   ArrayList<String> a = new ArrayList<>();
// 	    int arr[]={2000,500,200,100,50,20,10,5,1};
// 	    int num=2453;
// 	    int i=0;
// 	    int c=0;
// 	    while(num!=0){
// 	        while(num>=arr[i]){ 
// 	            c++;
// 	            a.add(arr[i]+":"+c);
// 	            num=num-arr[i];
	            
// 	        }
// 	        i++;
// 	        c=0;
// 	    }
// 	    System.out.println(a);
	    
// 	}
// }
public class Collection //Hashmap
{
	public static void main(String[] args) {
	    HashMap<String,String> a=new HashMap<String,String>();
		a.put("name","riya");
		System.out.println(a);
	    System.out.println(a.get("name"));
		
	}	
}
