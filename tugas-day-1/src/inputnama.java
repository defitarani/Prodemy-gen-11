import java.util.Scanner;

public class inputnama {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String nama = sc.nextLine();
        System.out.print("Hai " + nama + "! have a good day");
    }
}
