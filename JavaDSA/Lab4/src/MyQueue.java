import java.util.Arrays;


public class MyQueue<E> {

	private E[] data;

	private int size = 0;

	private int first = 0;

	@SuppressWarnings("unchecked")
	public MyQueue(int capacity) {
		data = (E[]) new Object[capacity];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E peek() {
		if (isEmpty())
			return null;
		return data[first];
	}

	public E dequeue() {
		if (isEmpty())
			return null;
		E head = data[first];
		data[first] = null;
		first = (first + 1) % data.length;
		size--;
		return head;
	}

	public void enqueue(E e) {
		ensureCapacity();
		int rear = (first + size) % data.length;
		data[rear] = e;
		size++;
	}

	@SuppressWarnings("unchecked")
	private void ensureCapacity() {
		if (size == data.length) {
			E[] newData = (E[]) new Object[data.length * 2];

			for (int i = 0; i < size; i++) {
				newData[i] = data[(first + i) % data.length];
			}

			data = newData;
			first = 0;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");

		for (int i = 0; i < size; i++) {
			sb.append(data[(first + i) % data.length]);

			if (i != size - 1) {
				sb.append(", ");
			}
		}

		sb.append("] and Inner Array: ");
		sb.append(Arrays.toString(data));
		return sb.toString();
	}
}