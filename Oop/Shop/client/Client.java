package client;

public class Client{
    private String nom;
    private String mail;
    private  int points;

    public Client(String nom, String mail){
        this.nom=nom;
        this.mail=mail;
        this.points=0;
        System.out.println("a client has been registered");
    }
}