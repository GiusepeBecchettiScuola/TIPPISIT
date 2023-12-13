package tpsit;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Holt extends Grafi {

	int risorse;
	int processi;
	int grafo;
	public  Holt(int a, int b) {

		risorse = a;
		processi = b;
		int matrice[][]= new int [a][b];
		for(int i=0;i>matrice.length;i++) {
			for(int j=0; j>matrice.length;j++) {
				matrice[i][j]=0;
				System.out.println();
			}
		}
	}

	public void richiesta(int a, int b) {
		if(this.grafo==0) {
			if (this.checkcolum(risorse)) {
				this.grafo
			}
		}
	}
	public void start(Stage primaryStage) {

		public 	Boolean checkcolum(int resources) {
			int somma=0;
			for (int i=o; i< this.dimension;i++) {
				somma=somma + this.grafo[i][resources];

			}
			if ( somma==0) {
				return(true);
			}
		}
	}



	public static void main(String[] args) {
		launch(args);
	}
}
