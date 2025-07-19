import java.util.*;
public class Train {
   static Scanner s=new Scanner(System.in);
    static void menu(HashMap<String,Integer> bookedlist,ArrayList<Integer> availlist){
       System.out.println("book 1");
       System.out.println("Cancel 2");
       System.out.println("ViewBooked 3");
       System.out.println("Available 4");
       System.out.println("exit 5");
       System.out.println("enter your choice");
       int req = s.nextInt();
        s.nextLine(); 
       switch(req){
        case 1:
            book(bookedlist,availlist);
            break;
        case 2:
            cancel(bookedlist,availlist);
            break;
        case 3:
            viewb(bookedlist,availlist);
            break;
        case 4:
            viewa(bookedlist,availlist);
            break;
        case 5:
            System.exit(0);
            break;
        default:
            System.out.println("no such options");
       }
        }
 static void book(HashMap<String,Integer> bookedlist,ArrayList<Integer> availlist){
    System.out.println("enter the name of the passenger");
    String name = s.nextLine();
     if(availlist.size()>0){
          bookedlist.put(name,availlist.get(0));
            System.out.println("Passenger"+name+"ticket number is"+availlist.get(0));
          availlist.remove(availlist.get(0));
        
     }
     else{
        System.out.println("All tickets are booked");
     }
     menu(bookedlist, availlist);
 }
 static void cancel(HashMap<String,Integer> bookedlist,ArrayList<Integer> availlist){
     System.out.println("enter the name of the passenger to cancel");
    String name = s.nextLine();
    if(bookedlist.containsKey(name)){
        int num=bookedlist.get(name);
        availlist.add(num);
     bookedlist.remove(name);
    }
    else{
        System.out.println("passenger with that name is not presented");
    }
    menu(bookedlist, availlist);
 }
 static void viewb(HashMap<String,Integer> bookedlist,ArrayList<Integer> availlist){
     System.out.println(bookedlist);
      menu(bookedlist, availlist);
 }
 static void viewa(HashMap<String,Integer> bookedlist,ArrayList<Integer> availlist){
System.out.println(availlist);
 menu(bookedlist, availlist);
 }
 public static void main(String[] args) {
    HashMap<String,Integer> bookedlist=new HashMap<String,Integer>();
    ArrayList<Integer> availlist=new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    menu(bookedlist,availlist);
    }
}
