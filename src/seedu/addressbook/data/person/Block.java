package seedu.addressbook.data.person;

public class Block {
	private String blockNum;
	
	public Block(String blockNum) {
		this.blockNum = blockNum;
	}
	
	public String getBlockNumber() {
		return blockNum;
	}
	
	public void setBlockNum(String blockNum) {
		this.blockNum = blockNum;
	}

}
