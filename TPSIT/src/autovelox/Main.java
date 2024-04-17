package autovelox;

public class Main {
	 public static void main(String[] args) {
			Automobilista nino = new Automobilista(50, 100);
			Poliziotto sparrow = new Poliziotto(30);
			//nino.pagareMulte();
			sparrow.modificaAutoVelox(50);
			sparrow.fareMulta(nino.velocita);
			System.out.println(sparrow.limite);
			
	 }
}
