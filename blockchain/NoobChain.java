import java.util.ArrayList;

public class NoobChain{
  public static int difficulty = 1;

  public static Boolean isChainValid(ArrayList<Block> chain){
      final int chainLimit=chain.size();
      int i=1;
      Block currentBlock;
      Block previousBlock;

      while (i<chainLimit) {
        currentBlock=chain.get(i);
        previousBlock=chain.get(i-1);
        i++;
        if (!currentBlock.getHash().equals(currentBlock.calculateHash())) {
          System.out.println("block "+i+" hashes are not equals");
          return false;
        }
        if (!previousBlock.getHash().equals(currentBlock.getPreviousHash())) {
          System.out.println("previous ahse is not equal");
          return false;
        }
        //check if hash is solved
			  // if(!currentBlock.hash.substring( 0, difficulty).equals(hashTarget)) {
				//   System.out.println("This block hasn't been mined");
				//    return false;
        // }
      }
      return true;
  }

  public static void displayChain(ArrayList<Block> chain){
     final int chainLimit=chain.size();
     int i=0;
    while (i<chainLimit) {
      System.out.println(chain.get(i));
      i++;
    }
  }

  public static ArrayList<Block> blockchain=new ArrayList<Block>();

  public static void main(String[] args) {
    System.out.println("loadin");
    Block genesisBlock=new Block("Hi i'm the original block!","0");
    blockchain.add(genesisBlock);
    genesisBlock.mineBlock(difficulty);
    Block secondBlock=new Block("Hi i'm the second block",genesisBlock.getHash());
    blockchain.add(secondBlock);
    secondBlock.mineBlock(difficulty);
    Block thirdBlock=new Block("I'm the third block :) ",secondBlock.getHash());
    blockchain.add(thirdBlock);
    thirdBlock.mineBlock(difficulty);
    System.out.println("display");
    isChainValid(blockchain);
  }
}
