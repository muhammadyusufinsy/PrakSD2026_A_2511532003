package pekan4_2511532003;

public class AntrianLoket_2511532003 {
	String queue_2003[];
    int front_2003, rear_2003, max_2003;

    public AntrianLoket_2511532003(int max) {
        max_2003 = max;
        queue_2003 = new String[max];
        front_2003 = -1;
        rear_2003 = -1;
    }

    // cek kosong
    public boolean isEmpty() {
        return (front_2003 == -1);
    }

    // cek penuh
    public boolean isFull() {
        return (rear_2003 == max_2003 - 1);
    }

    // enqueue
    public void enqueue(String data) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
        } else {
            if (isEmpty()) {
                front_2003 = 0;
            }
            rear_2003++;
            queue_2003[rear_2003] = data;
            System.out.println("Data berhasil ditambahkan ke antrian");
        }
    }

    // dequeue
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println(queue_2003[front_2003] + " telah dilayani");

            if (front_2003 == rear_2003) {
                front_2003 = rear_2003 = -1;
            } else {
                front_2003++;
            }
        }
    }

    // tampilkan antrian
    public void display() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Isi antrian:");
            for (int i = front_2003; i <= rear_2003; i++) {
                System.out.println((i - front_2003 + 1) + ". " + queue_2003[i]);
            }
        }
    }

    // reverse antrian
    public void reverse() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            int start = front_2003;
            int end = rear_2003;

            while (start < end) {
                String temp = queue_2003[start];
                queue_2003[start] = queue_2003[end];
                queue_2003[end] = temp;

                start++;
                end--;
            }

            System.out.println("Antrian berhasil dibalik!");
        }
    }
}


