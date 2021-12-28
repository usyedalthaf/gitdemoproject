package revisionjava;

public class cons {

  cons()
   {
	  System.out.println("Default constructor");
       }
  cons(int age)
         {
	  System.out.println("age:" +"  "+age);
	  
       }
  
       public static void main(String[] args) {
   cons s =  new cons();
   cons t = new cons(45);
   System.out.println(s);
   System.out.println(t); 
   
       }
}
  