import java.util.*;
class Person {
    String name;
    int age;
    char bearth;
    int ticketid;
    Person(String name, int age,char bearth,int ticketid) {
        this.name = name;
        this.age = age;
        this.bearth=bearth;
        this.ticketid=ticketid;
    }

}
public class Advance_collection {
    static Scanner s=new Scanner(System.in);
    static void menu(ArrayList<Person> bookedlist,ArrayList<Person> availlist,int id,ArrayList<Integer> tickets){
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
            booking(bookedlist,availlist,id,tickets);
            break;
        case 2:
            cancelling(bookedlist,availlist);
            break;
        case 3:
            viewbooking(bookedlist,availlist,id,tickets);
            break;
        case 4:
            viewavail(bookedlist,availlist);
            break;
        case 5:
            System.exit(0);
            break;
        default:
            System.out.println("no such options");
       }
        }
         static void booking(ArrayList<Person> bookedlist,ArrayList<Person> availlist,int id,ArrayList<Integer> tickets){
            id++;
    System.out.println("enter the name of the passenger");
    String name = s.nextLine();
    System.out.println("enter the age of the passenger");
    int age = s.nextInt();
     System.out.println("enter the prefered Breath");
    char bearth = s.next().charAt(0);
    s.nextLine();
    if(bearth=='u'){
        if(tickets.get(0)!=0){
            bookedlist.add(new Person(name,age,bearth,id));
            System.out.println("preferred Bearth Given");
            System.out.println("-------------Booking succeed");
            int c= tickets.get(0)-1;
            tickets.set(0,c);
            menu(bookedlist,availlist,id,tickets);
        }
        else if(tickets.get(1)!=0){
              bookedlist.add(new Person(name,age,bearth,id));
            System.out.println("M Breath assigned");
            System.out.println("-------------Booking succeed");
        }
        else if(tickets.get(2)!=0){
              bookedlist.add(new Person(name,age,bearth,id));
            System.out.println("L Breath assigned");
            System.out.println("-------------Booking succeed");
        }
          else if(tickets.get(3)!=0){
              bookedlist.add(new Person(name,age,bearth,id));
            System.out.println("RAC assigned");
            System.out.println("-------------Booking succeed");
        }
           else if(tickets.get(4)!=0){
              bookedlist.add(new Person(name,age,bearth,id));
            System.out.println("RAC assigned");
            System.out.println("-------------Booking succeed");
        }
    }
    if(bearth=='m'){
        if(tickets.get(1)!=0){
            bookedlist.add(new Person(name,age,bearth,id));
            System.out.println("preferred Bearth Given");
            System.out.println("-------------Booking succeed");
            int c= tickets.get(0)-1;
            tickets.set(0,c);
            menu(bookedlist,availlist,id,tickets);
        }
        else if(tickets.get(0)!=0){
              bookedlist.add(new Person(name,age,bearth,id));
            System.out.println("M Breath assigned");
            System.out.println("-------------Booking succeed");
        }
        else if(tickets.get(2)!=0){
              bookedlist.add(new Person(name,age,bearth,id));
            System.out.println("L Breath assigned");
            System.out.println("-------------Booking succeed");
        }
          else if(tickets.get(3)!=0){
              bookedlist.add(new Person(name,age,bearth,id));
            System.out.println("RAC assigned");
            System.out.println("-------------Booking succeed");
        }
        else{
            System.out.println("No Tickets Available");
        }
    }
 }
 static void cancelling(ArrayList<Person> bookedlist,ArrayList<Person> availlist){
     System.out.println("enter the ID of the passenger to cancel");
    int id = s.nextInt();
    
 }
 static void viewbooking(ArrayList<Person> bookedlist,ArrayList<Person> availlist,int id,ArrayList<Integer> tickets){
   for(int i=0;i<bookedlist.size();i++){
    System.out.println("TicketID :"+bookedlist.get(i).ticketid);
    System.out.println("Name :"+bookedlist.get(i).name);
    System.out.println("Age :"+bookedlist.get(i).age);
    System.out.println("Breath :"+bookedlist.get(i).bearth);
    System.out.println("-----------------------------------------------");
   }
   menu(bookedlist,availlist,id,tickets);
 }
 static void viewavail(ArrayList<Person> bookedlist,ArrayList<Person> availlist){

 }

    public static void main(String[] args) {
        ArrayList<Integer> tickets=new ArrayList<>(Arrays.asList(21, 21, 21, 18, 10));
        ArrayList<Person> bookedlist = new ArrayList<>();
         ArrayList<Person> availlist = new ArrayList<>();
    //      HashMap<String,Integer> bookedlist=new HashMap<String,Integer>();
    // ArrayList<Integer> availlist=new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    int id=0;
        menu(bookedlist,availlist,id,tickets);
    }
}
