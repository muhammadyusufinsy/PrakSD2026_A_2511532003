package pekan4_2511532003;

public class queueArrayDriver_2511532003 {
	public static void main (String [] args ) {
		queueArray_2511532003 queue_2003 = new queueArray_2511532003 (1000);
		queue_2003.enqueue_2003(10);
		queue_2003.enqueue_2003(20);
		queue_2003.enqueue_2003(30);
		queue_2003.enqueue_2003(40);
		System.out.println("item di depan" + queue_2003.front_2003());
		System.out.println("item paling belakang" + queue_2003.rear_2003());
		System.out.println("tampilan queue");
		queue_2003.display ();
		System.out.println();
		System.out.println(queue_2003.dequeue_2003() + " dihapus dari queue");
		System.out.println("item di depan :" + queue_2003.front_2003());
		System.out.println("item di belakang : " + queue_2003.rear_2003());
		System.out.println("tampilan queue setelah satu data dihapus");
		queue_2003.display ();
		
	}

}
