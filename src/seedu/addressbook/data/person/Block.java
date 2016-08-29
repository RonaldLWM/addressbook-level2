package seedu.addressbook.data.person;

public class Block {
	private int blockNum;
	
	public Block(int blockNum) {
		this.blockNum = blockNum;
	}
	
	public int getBlockNumber() {
		return blockNum;
	}
	
	public void setBlockNum(int inputBlockNum) {
		this.blockNum = inputBlockNum;
	}

	public boolean isBlockValid() {
		if (blockNum >= 0 && blockNum <1000) {
			return true;
		}
		return false;
	}
}
