import java.util.Scanner;
public class Addelementtoarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []array = {1,2,3,4,5,6};
        System.out.print("vi tri ban muon chen vao : ");
        int index = scanner.nextInt();
        System.out.print("Value : ");
        int number = scanner.nextInt();
        for (int i = array.length -1;i>index;i--){
            array[i]= array[i-1];
        }
        array[index] = number;
        for (int x:array) {
            System.out.printf("%d \t", x);
        }


    }
}
