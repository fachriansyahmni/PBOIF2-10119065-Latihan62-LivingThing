package pboif2.pkg10119065.latihan62.livingthing;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program hal yang bisa dilakukan manusia
 */
public abstract class LivingThing {
    public abstract void walk(String nama);
    public void breath(String nama)
    {
        System.out.println(nama + " Bernapas");
    }
    public void eat(String nama)
    {
        System.out.println(nama + " Makan");
    }
}
