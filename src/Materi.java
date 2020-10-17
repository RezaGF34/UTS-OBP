public class Materi extends waktu {
    public int matkul;
    public int harga;
    public int total;

    public Materi(int jam, int hari, int matkul, int harga, int total) {
        super(jam, hari);
        this.matkul = matkul;
        this.harga = harga;
        this.total = total;
    }

    public int getMatkul() {
        return matkul;
    }

    public void setMatkul(int matkul) {
        this.matkul = matkul;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int hitung(int total, int harga, int jam){

        return this.total = this.harga * jam;
    }


    /*   if (b.matkul == 1){
        if(a.hari == 1){
            b.harga = 75000;
            b.total = b.harga * a.jam;
        }
        else if(a.hari == 2){
            b.harga = 100000;
            b.total = b.harga * a.jam;
        }
    }
        if (matkul == 2){
        if(hari == 1){
            harga = 50000;
            total = harga * jam;
        }
        else if(hari == 2){
            harga = 750000;
            total = harga * jam;
        }
    }
        if (matkul == 3){
        if(hari == 1){
            harga = 75000;
            total = harga * jam;
        }
        else if(hari == 2){
            harga = 100000;
            total = harga * jam;
        }
    }
        if (matkul == 4){
        if(hari == 1){
            harga = 75000;
            total = harga * jam;
        }
        else if(hari == 2){
            harga = 100000;
            total = harga * jam;
        }
    }
        if (matkul == 5){
        if(hari == 1){
            harga = 75000;
            total = harga * jam;
        }
        else if(hari == 2){
            harga = 100000;
            total = harga * jam;
        }
    }
        if (matkul == 6){
        if(hari == 1){
            harga = 75000;
            total = harga * jam;
        }
        else if(hari == 2){
            harga = 100000;
            total = harga * jam;
        }
    }*/

}
