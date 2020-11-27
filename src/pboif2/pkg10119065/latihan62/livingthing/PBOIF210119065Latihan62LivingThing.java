package pboif2.pkg10119065.latihan62.livingthing;
/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program hal yang bisa dilakukan manusia
 */
public class PBOIF210119065Latihan62LivingThing {
    
    public static void main(String[] args) {
        Human human = new Human();
        human.setNama("Fachriansyah Muhammad Nur Ihsan");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
    
}
