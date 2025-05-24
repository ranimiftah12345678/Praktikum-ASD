public class StackSurat25 {
    Surat25[] stack;
    int size, top;

    public StackSurat25(int size) {
        this.size = size;
        stack = new Surat25[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat25 srt) {
        if (!isFull()) {
            stack[++top] = srt;
        } else {
            System.out.println("Tumpukan surat penuh.");
        }
    }

    public Surat25 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat25 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    public boolean cariSurat(String nama) {
    boolean ditemukan = false;
    for (int i = top; i >= 0; i--) {
        if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
            System.out.println("Surat ditemukan:");
            stack[i].tampilSurat();
            ditemukan = true;
        }
    }
        return ditemukan;
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Tidak ada surat yang masuk.");
        } else {
            for (int i = top; i >= 0; i--) {
                stack[i].tampilSurat();
            }
        }
    }
}
