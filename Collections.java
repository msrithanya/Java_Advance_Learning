import java.util.Scanner;
import java.util.ArrayList;
public class Collections {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a =s.nextInt();
        ArrayList<Integer> num=new ArrayList<Integer>();
        ArrayList<Integer> nums=new ArrayList<Integer>();
        for(int i=0;i<a;i++){
             num.add(s.nextInt());
        }
        for(int i=0;i<a;i++){
            if(num.get(i)%2!=0){
              nums.add(num.get(i));
            }
        }
        System.out.println(nums);
    }
}
