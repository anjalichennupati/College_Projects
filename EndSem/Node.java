package EndSem;

import java.util.Arrays;
import java.util.Date;

class Node {
	private int prevBlockHash = 0;
	Date Timestamp;
	int hash;
	int previousHash;
	String data;
	Node next;
	Node prev;

	Node(Block1 b1) {
		this.Timestamp = b1.getTimestamp();
		this.hash = b1.getHash();
		this.previousHash = b1.getPreviousHash();
		this.data = b1.getData();
		next = null;
	}

	public int computeHash() {

		String dataToHash = "" + this.Timestamp + this.previousHash + this.data;
		int encoded = 0;
		encoded = Arrays.hashCode(new int[] { dataToHash.hashCode(), this.prevBlockHash });
		this.hash = encoded;
		return encoded;
	}

	public Date getTimestamp() {
		return Timestamp;
	}

	public void setTimestamp(Date timestamp) {
		Timestamp = timestamp;
	}

	public int getHash() {
		return hash;
	}

	public void setHash(int hash) {
		this.hash = hash;
	}

	public int getPreviousHash() {
		return previousHash;
	}

	public int setPreviousHash(int previousHash) {
		return this.previousHash = previousHash;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}