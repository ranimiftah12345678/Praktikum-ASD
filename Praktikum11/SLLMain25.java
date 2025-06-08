public class SLLMain25 {
    public static void main(String[] args) {
        SingleLinkedList25 sll = new SingleLinkedList25();

        Mahasiswa25 mhs1 = new Mahasiswa25("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa25 mhs2 = new Mahasiswa25("23212201", "Bimon", "2B", 3.8);
        Mahasiswa25 mhs3 = new Mahasiswa25("22212202", "Cintia", "3C", 3.5);
        Mahasiswa25 mhs4 = new Mahasiswa25("21212203", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertArt(2, mhs2);
        sll.print();
        
        System.out.println("data index 1 :");
        sll.getData(1);
        System.out.println("data mahasiswa an Bimon berada pada index :" + sll.indexOf("Bimon"));
        System.out.println();
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}