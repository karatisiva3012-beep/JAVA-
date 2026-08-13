package core_java;

public class WhileLoop {
	    public static void main(String[] args) {

	        int classroom = 1;

	        while (classroom <= 3) {

	            System.out.println("Class : " + classroom);

	            int student = 1;

	            while (student <= 5) {
	                System.out.println("Student :" + student + " Present");
	                student++;
	            }

	            classroom++;
	            System.out.println();
	        }
	    }
	}
 
