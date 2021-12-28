package revisionjava;

public class commands {
	 public static int add(int a, int b)
	 {
        
       /* int z = a+b;
        return z;*/
        return a+b;
	 }

	 public  int add1(int a, int b)
	 {
        
        int z = a+b;
        return z;
        
	 }
	
	 public static void main(String[] args) {
		
		commands hw = new commands();
		 
		/*commands.x = 25;
		System.out.println(commands.x);*/
		/*int result = commands.add();
		System.out.println(result);*/
		 
		int result = commands.add(6,5);
		System.out.println(result);
		
		int result1 = hw.add1(13,5);
		System.out.println(result1);
		
		
	}
;
}
