import java.util.Scanner;

public class OperasiMatrix {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int menu;
        String lanjut;
        
        do {
            System.out.println("==== OPERASI MATRIX =====");
            System.out.println("1. Penjumlahan Matrix");
            System.out.println("2. Pengurangan Matrix");
            System.out.println("3. Perkalian Matrix");
            System.out.println("4. Invers Matrix");
            System.out.println("5. Transpose Matrix");
            System.out.println("6. Keluar");
            
            System.out.print("Pilih menu : ");
            menu = sc.nextInt();
            
        switch (menu) {
            case 1:
            System.out.println("Penjumlahan Matrix");
            // inputPrestasi(prestasi, kategori, tahun);
            break;
            case 2:
            System.out.println("Pengurangan Matrix");
            // tampilanPrestasi(prestasi, kategori, tahun);
            break;   
            case 3:
            System.out.println("Perkalian Matrix");
            // analisisPrestasi(prestasi, kategori, tahun);
            break;    
            case 4:
            System.out.println("Invers Matrix");   
            return;
            case 5:
            System.out.println("Transpose Matrix");   
            return;
            default:
            System.out.println("Input dari 1 - 5!");
            break;
        }
        
        System.out.print("Apakah anda ingin mengakses menu lagi? (y/n) : ");
        lanjut = sc.next();
        System.out.println();
    } while (lanjut.equalsIgnoreCase("y"));
}
}