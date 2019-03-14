
public class NoobChain{
  public static void main(String[] args) {
    Block genesisBlock=new Block("Hi i'm the original block!","0");
    System.out.println(genesisBlock.getHash());
    System.out.println(genesisBlock.getData());
    Block secondBlock=new Block("Hi i'm the second block",genesisBlock.getHash());
    System.out.println(secondBlock.getHash());
    System.out.println(secondBlock.getData());
    Block thirdBlock=new Block("I'm the third block :) ",secondBlock.getHash());
    System.out.println(thirdBlock.getHash());
    System.out.println(thirdBlock.getData());
  }
}
