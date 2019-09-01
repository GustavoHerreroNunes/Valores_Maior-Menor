package ValorMaior;

import javax.swing.JOptionPane;

public class ValorMaior {

	public static void main(String[] args) {
		double N[] = new double[5], Max =0, Min =0;
		
		for(int A =0; A< N.length; A++) {
			N[A] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o "+ (A+1) +"º digito:", "Val3000", 3));
			if(A==0) {
				Max = N[A];
				Min = N[A];
			}if(N[A]>Max) {
				Max = N[A];
			}if(N[A]<Min) {
				Min = N[A];
			}
		}
		JOptionPane.showMessageDialog(null, "Esse é o maior valor:\n" + Max + "\nE esse é o menor valor:\n" + Min, "Val3000", 1);
		
		
		

	}

}
