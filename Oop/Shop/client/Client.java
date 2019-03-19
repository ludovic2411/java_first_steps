package client;

public class Client{
    private String nom;
    private String mail;
    private static  int points=0;

    public Client(String nom, String mail){
        this.nom=nom;
        this.mail=mail;
        System.out.println("a client has been registered");
    }

    public String getNomClient(){
      return this.nom;
    }

    public String getMailClient(){
      return this.mail;
    }

    public int getPointsClient(){
      return this.points;
    }

    public void setPointsClient(int montant){
       this.points=montant;
    }
}
