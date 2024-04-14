package semester2.PBO.Polimorfism;

public class ContohPolimorfismeOverloading{
	public static void main(String[] args){
		ContohPolimorfismeOverloading cpo = new ContohPolimorfismeOverloading();

		cpo.runThis();
	}

	void runThis(){
		this.methodA();
		this.methodA(10);
		this.methodA("Joko");
		this.methodA(11,12);
		this.methodA(11,12,"Bejo");
		this.methodA("Surti", 11, 12);
	}

	void methodA(){
		System.out.println("\nKonten di method A tanpa parameter");
	} 
	int methodA(int x){
		System.out.println("\nKonten di method A, dengan parameter X = "+x);
		return x;
	} 
	void methodA(String nama){
		System.out.println("\nKonten di method A nama");
		System.out.println("dengan parameter nama = "+nama);
	} 
	void methodA(int x, int y){
		System.out.println("\nKonten di method A");
		System.out.println("dengan parameter X = "+x);
		System.out.println("dengan parameter Y = "+y);
	} 
	void methodA(int x, int y, String nama){
		System.out.println("\nKonten di method A I I S");
		System.out.println("dengan parameter X = "+x);
		System.out.println("dengan parameter Y = "+y);
		System.out.println("dengan parameter Nama = "+nama);
	} 
	void methodA(String nama, int x, int y){
		System.out.println("\nKonten di method A S I I");
		System.out.println("dengan parameter X = "+x);
		System.out.println("dengan parameter Y = "+y);
		System.out.println("dengan parameter Nama = "+nama);
	} 


}





// aMethod();
// //aMethod();
// aMethod(int);
// aMethod(int, int);
// aMethod(String, String);
// aMethod(int, int, String);
// aMethod(int, String, int);



