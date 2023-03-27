package EndSem;

import java.util.Arrays;
import java.util.Date;

public class Block1 {

	private int prevBlockHash = 0;
	// private String version;
	private Date Timestamp;
	private int hash;
	private int previousHash;
	private String data;

	public Block1(Date timestamp, String data) {
		// this.version = version;
		this.Timestamp = timestamp;
		this.data = data;
		this.hash = computeHash();
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

	public int setPreviousHash(int i) {
		return this.previousHash = i;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int get(int i) {
		return previousHash;
	}
}