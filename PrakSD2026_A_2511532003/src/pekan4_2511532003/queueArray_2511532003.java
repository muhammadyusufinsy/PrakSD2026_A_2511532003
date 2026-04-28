package pekan4_2511532003;

public class queueArray_2511532003 {
	int front_2003, rear_2003, size_2003;
	int capacity_2003;
	int array_2003[];
	
	public queueArray_2511532003 (int capacity_2003) {
		this.capacity_2003 = capacity_2003;
		front_2003 = this.size_2003 = 0;
		rear_2003 = capacity_2003 -1;
		array_2003 = new int [this.capacity_2003];
	}
	boolean isFull (queueArray_2511532003 queue) {
		return (queue.size_2003 == queue.capacity_2003);
	}
	boolean isEmpty (queueArray_2511532003 queue) {
		return (queue.size_2003 == 0);
	}
	
	void enqueue_2003 (int item_2003) {
		if (isFull(this))
			return;
		this.rear_2003 = (this.rear_2003 +1) % this.capacity_2003;
		this.array_2003 [this.rear_2003] = item_2003;
		this.size_2003 = this.size_2003 + 1;
		System.out.println(item_2003 + "enqueued to queue");
	}
	int dequeue_2003 () {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		int item_2003 = this.array_2003[this.front_2003];
		this.front_2003 = (this.front_2003 + 1) % this.capacity_2003;
		this.size_2003 = this.size_2003 - 1;
		return item_2003;
	}
	int front_2003 () {
		if (isEmpty (this))
			return Integer.MIN_VALUE;
		return this.array_2003[this.front_2003];
	}
	int rear_2003() {
		if (isEmpty (this))
			return Integer.MIN_VALUE;
		return this.array_2003[this.rear_2003];
	}
	//mencetak elemen antrian
	void display () {
		int i_2003;
		if (front_2003 == rear_2003) {
			System.out.println ("\nAntrian kososng\n");
			return;
		}
		//kunjungi dari belakang dan cetak
		for (i_2003 = front_2003; i_2003 < rear_2003; i_2003++ ) {
			System.out.printf(" %d <-- ", array_2003 [i_2003]);
		}
		return;
	}
}
