import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        waktu a = new waktu(0,0);
        waktu b = new Materi(0, 0,0,0,0);
        Scanner r = new Scanner(System.in);

        System.out.println("------------ PAKET BIMBEL ------------");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. SQL Database");
        System.out.println("4. HTML & CSS");
        System.out.println("5. C++");
        System.out.println("6. PHP & Javascript");
        System.out.println();
        a.jadwal();

        System.out.print("Mata Kuliah = ");
        ((Materi) b).matkul = r.nextInt();
        System.out.print("Hari        = ");
        a.hari = r.nextInt();

        System.out.print("Total : Rp. " + ((Materi) b).hitung(((Materi) b).total, ((Materi) b).harga, a.jam ));
        if (((Materi) b).matkul == 1) {
            if (a.hari == 1) {
                System.out.println("Bimbel Java");
                System.out.println("Hari Biasa");
                System.out.println("Harga = Rp. 75.000/jam");
                System.out.println();
                a.jam = r.nextInt();
                ((Materi) b).harga = 75000;
                System.out.print("Total : Rp. " + ((Materi) b).hitung(((Materi) b).total, ((Materi) b).harga, a.jam ));
            } else if (a.hari == 2) {
                System.out.println("Bimbel Java");
                System.out.println("Weekend");
                System.out.println("Harga = Rp.100.000/jam");
                System.out.println();
                System.out.print("Jam = ");
                a.jam = r.nextInt();
                ((Materi) b).harga = 100000;
                System.out.print("Total : Rp. " + ((Materi) b).hitung(((Materi) b).total, ((Materi) b).harga, a.jam ));
            }
        }
        if (((Materi) b).matkul == 2) {
            if (a.hari == 1) {
                System.out.println("Bimbel Python");
                System.out.println("Hari Biasa");
                System.out.println("Harga = Rp. 150.000/jam");
                System.out.println();
                a.jam = r.nextInt();
                ((Materi) b).harga = 150000;
                System.out.print("Total : Rp. " + ((Materi) b).hitung(((Materi) b).total, ((Materi) b).harga, a.jam ));
            } else if (a.hari == 2) {
                System.out.println("Bimbel Python");
                System.out.println("Weekend");
                System.out.println("Harga = Rp. 300.000/jam");
                System.out.println();
                System.out.print("Jam = ");
                a.jam = r.nextInt();
                ((Materi) b).harga = 300000;
                System.out.print("Total : Rp. " + ((Materi) b).hitung(((Materi) b).total, ((Materi) b).harga, a.jam ));
            }
        }
        if (((Materi) b).matkul == 3) {
            if (a.hari == 1) {
                System.out.println("Bimbel SQL Database");
                System.out.println("Hari Biasa");
                System.out.println("Harga = Rp. 45.000/jam");
                System.out.println();
                a.jam = r.nextInt();
                ((Materi) b).harga = 45000;
                System.out.print("Total : Rp. " + ((Materi) b).hitung(((Materi) b).total, ((Materi) b).harga, a.jam ));
            } else if (a.hari == 2) {
                System.out.println("Bimbel SQL Database");
                System.out.println("Weekend");
                System.out.println("Harga = Rp. 90.000/jam");
                System.out.println();
                System.out.print("Jam = ");
                a.jam = r.nextInt();
                ((Materi) b).harga = 90000;
                System.out.print("Total : Rp. " + ((Materi) b).hitung(((Materi) b).total, ((Materi) b).harga, a.jam ));
            }
        }
        if (((Materi) b).matkul == 4) {
            if (a.hari == 1) {
                System.out.println("Bimbel HTML & CSS");
                System.out.println("Hari Biasa");
                System.out.println("Harga = Rp. 90.000/jam");
                System.out.println();
                a.jam = r.nextInt();
                ((Materi) b).harga = 90000;
                System.out.print("Total : Rp. " + ((Materi) b).hitung(((Materi) b).total, ((Materi) b).harga, a.jam ));
            } else if (a.hari == 2) {
                System.out.println("Bimbel HTML & CSS");
                System.out.println("Weekend");
                System.out.println("Harga = Rp. 180.000/jam");
                System.out.println();
                System.out.print("Jam = ");
                a.jam = r.nextInt();
                ((Materi) b).harga = 180000;
                System.out.print("Total : Rp. " + ((Materi) b).hitung(((Materi) b).total, ((Materi) b).harga, a.jam ));
            }
        }
        if (((Materi) b).matkul == 5) {
            if (a.hari == 1) {
                System.out.println("Bimbel C++");
                System.out.println("Hari Biasa");
                System.out.println("Harga = Rp. 65.000/jam");
                System.out.println();
                a.jam = r.nextInt();
                ((Materi) b).harga = 65000;
                System.out.print("Total : Rp. " + ((Materi) b).hitung(((Materi) b).total, ((Materi) b).harga, a.jam ));
            } else if (a.hari == 2) {
                System.out.println("Bimbel C++");
                System.out.println("Weekend");
                System.out.println("Harga = Rp. 120.000/jam");
                System.out.println();
                System.out.print("Jam = ");
                a.jam = r.nextInt();
                ((Materi) b).harga = 120000;
                System.out.print("Total : Rp. " + ((Materi) b).hitung(((Materi) b).total, ((Materi) b).harga, a.jam ));
            }
        }
        if (((Materi) b).matkul == 6) {
            if (a.hari == 1) {
                System.out.println("Bimbel PHP & Javascript");
                System.out.println("Hari Biasa");
                System.out.println("Harga = Rp. 100.000/jam");
                System.out.println();
                a.jam = r.nextInt();
                ((Materi) b).harga = 100000;
                System.out.print("Total : Rp. " + ((Materi) b).hitung(((Materi) b).total, ((Materi) b).harga, a.jam ));
            } else if (a.hari == 2) {
                System.out.println("Bimbel PHP & Javasript");
                System.out.println("Weekend");
                System.out.println("Harga = Rp.130.000/jam");
                System.out.println();
                System.out.print("Jam = ");
                a.jam = r.nextInt();
                ((Materi) b).harga = 130000;
                System.out.print("Total : Rp. " + ((Materi) b).hitung(((Materi) b).total, ((Materi) b).harga, a.jam ));
            }
        }

    }
}