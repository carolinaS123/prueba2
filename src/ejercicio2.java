import java.util.Scanner;
public class ejercicio2 {
   public static void main(String [] args){
	  Scanner sc=new Scanner (System.in);
	  String palabra=" ";
	  int cant=0;
	  System.out.print("Ingrese una palabra:"); 
	  palabra=sc.nextLine();
	  System.out.print("Ingrese una letra:");
	  String cad1=sc.nextLine();
	  for(int i=0;i<palabra.length();i++){
	       palabra.substring(i,i+1);
	       if( palabra.equals(cad1)) {
	           cant++;
	       }
	  }
	  System.out.println(cant);
   }

}
