package NewThread;

public class Main {
	public static void main(String args[]) {
		int [] vet1 = new int[5];
		int [] vet2 = new int[5];	
		for(int i=0;i<vet1.length;i++) {
			vet1[i]=(int) (Math.random()*10+1);
			vet2[i]=(int) (Math.random()*10+1);
		}
		CustomThread c1 = new CustomThread();
		c1.run(vet1);
		CustomThread c2 = new CustomThread();
		c2.run(vet2);

	}
}
