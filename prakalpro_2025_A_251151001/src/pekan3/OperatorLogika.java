package pekan3;
import java.util.Scanner;
public class OperatorLogika {

	public static void main(String[] args) {
	boolean A1;
	boolean A2;
	boolean c;
	Scanner keyboard = new Scanner(System.in);
	 System.out.print("Input Nilai boolean-1(true / false): ");
     A1 = keyboard.nextBoolean();//input 10
     System.out.print("Input Nilai boolean-2(true / false): ");
     A2 = keyboard.nextBoolean();//input 5
     keyboard.close();
     
     System.out.println("A1 = " + A1);
     System.out.println("A2 = " + A2);
    
     System.out.println("Konjungsi");
     c= A1&&A2;
     System.out.println("true and false= " + c);
    
     System.out.println("Disjungsi");
     c= A1 ||A2;
     System.out.println("true or false= " + c);
     
     System.out.println("Negasi");
     c= !A1;
     System.out.println("bukan true= " + c);
    

	}

}
