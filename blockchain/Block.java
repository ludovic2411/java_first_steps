import java.util.Date;

public class Block {

	private String hash;
	private String previousHash;
	private String data; //our data will be a simple message.
	private long timeStamp; //as number of milliseconds since 1/1/1970.

	//Block Constructor.
	public Block(String data,String previousHash ) {
		this.data = data;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
    //always doing this after setting the others values
    this.hash=calculateHash();
	}

  public String calculateHash() {
	   String calculatedhash = StringUtil.applySha256(
			previousHash +
			Long.toString(timeStamp) +
			data
			);
	return calculatedhash;
  }

  public String getHash(){
    return this.hash;
  }
  public String getData(){
    return this.data;
  }
}
