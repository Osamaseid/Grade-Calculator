import java. util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner inpute= new Scanner(System.in);
     double grade;
     System.out.println("Please Enter The Result Of The Student Out Of 100%");
     grade=inpute.nextDouble();
if(grade < 45 ) {
    	 
    	 System.out.println("Your Grade is-F");
     }
     else if( grade >= 45 && grade <= 50) {
    	 
    	 System.out.println("Your Grade is-D");
     }
    else if(grade >= 50 && grade <= 60){
     
    	System.out.println("Your Grade is-C");
    }
    	 
    else if(grade >=60 && grade <= 65) {
    	
    	System.out.println("Your Grade is-C+");
    }
     
     else if(grade>=65 && grade <=70) {
    	 
    	System.out.println("Your Grade is-B-");
    	 
     }
     else if(grade>=70 && grade <=75) {
    	 
     	System.out.println("Your Grade is-B");
     	 
      }
     else if(grade>=75 && grade <=80) {
    	 
     	System.out.println("Your Grade is-B+");
     	 
      }
    
     else if(grade>=80 && grade <=85) {
    	 
     	System.out.println("Your Grade is-A-");
     	 
      }
     else if(grade>=85 && grade <=90) {
    	 
     	System.out.println("Your Grade is-A");
     	 
      }
     
     else if(grade>=90 && grade <=100) {
    	 
      	System.out.println("Your Grade is-A+99");
      	 
       } 
     
	}

}
