package LinkedList;

public class LinkedList {

	protected Element head;
	protected Element tail;

	public LinkedList() {
	}

	public void purge() {
		head = null;
		tail = null;
	}

	public Element getHead() {
		return head;
	}

	public Element getTail() {
		return tail;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void append(Object item) {
		Element tmp = new Element(item, null);
		if (head == null)
			head = tmp;
		else
			tail.next = tmp;
		tail = tmp;

	}

	public void prepend(Object item) {
		Element tmp = new Element(item, head);
		if (head == null)
			tail = tmp;
		head = tmp;
	}

	public void assign(LinkedList list) {
		if (list != this) {
			purge();
			for (Element ptr = list.head; ptr != null; ptr = ptr.next) {
				append(ptr.datum);
			}
		}
	}

	public final class Element {	

		Object datum;
		Element next;

		Element(Object datum, Element next) {
			this.datum = datum;
			this.next = next;

		}

		public Object getDatum() {
			return datum;
		}

		public Object getNext() {
			return next;
		}

		public Object getFrist() throws ContainerEmptyException {
			if (head == null)
				throw new ContainerEmptyException();
			return head.datum;
		}

		public Object getLast() throws ContainerEmptyException {
			if (tail == null)
				throw new ContainerEmptyException();
			return tail.datum;
		}

		public void extract(Object item) {
			Element ptr = head;
			Element prevPtr = null;
			while (ptr != null && ptr.datum != item) {
				prevPtr = ptr;
				ptr = ptr.next;
			}
			if (ptr == null)
				throw new IllegalArgumentException("Item no encontrado");
			if (ptr == head)
				head = ptr.next;
			else
				prevPtr.next = ptr.next;
			if (ptr == tail)
				tail = prevPtr;
		}

		public void insertAfter(Object item) {
			next = new Element(item, next);
			if (tail == this)
				tail = next;
		}

		public void insertBefore(Object item) {
			Element tmp = new Element(item, this);
			if (this == head)
				head = tmp;
			else {
				Element prevPtr = head;
				while (prevPtr != null && prevPtr.next != this)
					prevPtr = prevPtr.next;
				prevPtr.next = tmp;
			}
		}
	}

}
