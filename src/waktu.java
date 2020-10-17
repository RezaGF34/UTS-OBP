public class waktu {
    public int jam;
    public int hari;

    public waktu(int jam, int hari) {
        this.jam = jam;
        this.hari = hari;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    void time(){
        System.out.println("Jam Yang Ingin diambil =" + this.jam);
    }
    void day(){
        System.out.println("Hari Yang Ingin diambil = " + this.hari);
    }
    void jadwal(){
        System.out.println("--------------- JADWAL ---------------");
        System.out.println("1. Hari Biasa");
        System.out.println("2. Weekend");
        System.out.println();
    }

}
