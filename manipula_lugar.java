package iii_agencia_viagens;
	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.List;

	public class manipula_lugar {

	  private List destino;

	  public manipula_lugar() {
	    destino = new LinkedList();
	  }

	  public void addLugar(String destino) { 
	    Lugar lugar = new Lugar(destino);
	    Pessoa pessoa = new Pessoa(nome)
	    destino.add(lugar);
	  }

	  public Lugar get(String destino) {
	    for (Iterator i=destino.iterator(); i.hasNext(); ) {
	      Lugar lugar = (Lugar)i.next();
	      if (lugar.getDestino().equals(destino)) {
	        return lugar;
	      }
	    }
	    return null;
	  }

//	  public List search(Lugar pessoa) {
//	    List matchingDestino = new LinkedList();
//	    for (Iterator i = destino.iterator(); i.hasNext(); ) {
//	      Lugar lugar = (Lugar)i.next();
//	      if (lugar.getDestino().matches(destino))
//	        matchingDestino.add(lugar);
//	    }
//	    return matchingDestino;
	  }
	
}
