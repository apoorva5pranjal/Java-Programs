import java.util.*;
public class revhalfpyramid {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = 5;
            for(int i =n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    
}
