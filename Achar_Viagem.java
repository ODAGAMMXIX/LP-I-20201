package iii_agencia_viagens;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Achar_Viagem {

  public static void main(String[] args) {
    // Set up  
    manipula_lugar destino = new manipula_lugar();
    initializemanipula_lugar(destino);

    Map viagem = new HashMap();
    viagem.put("destino","La Reunion"); 
    viagem.put("nome","Fabio");
    
    List matchingViagens = search(Lugar);
    if (!matchingViagens.isEmpty()) {
      System.out.println("Fabio, seria a sua viagem para" + destino + "?");
      
    } else {
      System.out.println("Lamento, não há viagem cadastrada para vc...");
    }
  }

  private static void initializemanipula_lugar(manipula_lugar destino) {
    Map viagem = new HashMap();
    viagem.put("destino", "Cambodia");
    viagem.put("nome", "Odaga");
    destino.addLugar();
  }
}