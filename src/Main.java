import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pilih;
        double angka, pangkat;

        do {

            System.out.println("");
            System.out.println("== Calculator ==");
            System.out.println("1. Akar Kuadrat ");
            System.out.println("2. Pangkat ");
            System.out.println("3. Logaritma ");
            System.out.println("4. faktorial ");
            System.out.println("5. keluar ");
            System.out.print("Pilih operasi (1/2/3/4/5) : ");

            pilih = input.nextInt();

            if (pilih == 1) {
                System.out.print("Masukan angka : ");
                angka = input.nextDouble();
                System.out.println("Hasil akar kuadrat dari "+angka+" adalah : "+Math.sqrt(angka));
            } else if(pilih == 2) {
                System.out.print("Masukan angka : ");
                angka = input.nextDouble();
                System.out.print("Masukan pangkat : ");
                pangkat = input.nextDouble();
                System.out.println(angka+" pangkat "+pangkat+" adalah : "+Math.pow(angka, pangkat));
            } else if (pilih == 3){
                System.out.print("Masukan angka : ");
                angka = input.nextDouble();
                System.out.println("logaritma natural dari "+angka+" adalah : "+Math.log(angka));
            } else if (pilih == 4){

                System.out.print("Masukan angka : ");
                angka = input.nextDouble();
                double hasil=1;
                for (int i=1; i<=angka; i++){
                    hasil*=i;
                }
                System.out.println("Faktorial dari "+angka+" Adalah : "+hasil);
            } else if (pilih == 5){
                System.out.println("terimakasih sudah menggunakan kalkulator ini");
            } else {
                System.out.println("pilihan tidak tersedia :)");
            }

        } while (pilih != 5);
        input.close();
    }

}