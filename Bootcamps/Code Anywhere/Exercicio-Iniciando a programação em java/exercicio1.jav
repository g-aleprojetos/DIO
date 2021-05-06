import java.io.IOException;
import java.util.Scanner;

public class solution{
	
    public static void main(String[] args) throws IOException {
      
      Scanner scanner = new Scanner(System.in);
      int n = Integer.parseInt(scanner.nextLine());
    
    	for (int i = 1 ; i <= n ; i++) {
    		if (i % 2 == 0) System.out.println(i);
    	}
    }
}