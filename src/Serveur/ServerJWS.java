package Serveur;
import Service.CalculatriceWS;
import javax.xml.ws.Endpoint;
public class ServerJWS {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CalculatriceWS calculatrice =new CalculatriceWS();
        String ur1 = "http://localhost:8084/";
        Endpoint.publish(ur1, calculatrice);
        System.out.println("service web publié avec succeés a l'url :" + ur1);
    }
}
