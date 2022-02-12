import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int n = 0;
        for(int i = 0; i <= M; i++) {
          String str = sc.nextLine();
          if(str.equals("++x") || str.equals("++X")) {
              ++n;
          } else if (str.equals("x++") || str.equals("X++") ) {
              n++;
          } else if (str.equals("--x") || str.equals("--X")) {
              --n;
          } else if(str.equals("x--" ) || str.equals("X--")) {
              n--;
          } 
        }
        System.out.println(n);
        } 
    }
