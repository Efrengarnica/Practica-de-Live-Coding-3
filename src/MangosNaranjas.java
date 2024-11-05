public class MangosNaranjas {
	//Porpiedades
	int mangos;
	int naranjas;
	
	public MangosNaranjas(int mangos, int naranjas) {
		this.mangos=mangos;
		this.naranjas=naranjas;
	}//consructor
	
	public int maximoComunDivisor(int a, int b) { //Algoritmo de Euclides
	    while (b != 0) {
	        int temporal = b;
	        b = a % b;
	        a = temporal;
	    }
	    return a;
	}//maximoComunDivisor

	
	public void cantidadCajas() {
		int cantidadDeMangosPorCaja = this.mangos/maximoComunDivisor(this.mangos,this.naranjas);
		int cantidadDeNaranjasPorCaja = this.naranjas/maximoComunDivisor(this.mangos,this.naranjas);
		System.out.println("-------------------------------------------------------------");
		System.out.println("La cantidad de cajas de naranjas: " + maximoComunDivisor(this.mangos,this.naranjas));
		System.out.println("Hay " + cantidadDeNaranjasPorCaja + " naranjas en cada caja.");
		System.out.println("-------------------------------------------------------------");
		System.out.println("La cantidad de cajas de mangos: " + maximoComunDivisor(this.mangos,this.naranjas));
		System.out.println("Hay " + cantidadDeMangosPorCaja + " mangos en cada caja.");
	}//cantidadCajas
	
}//class MangosNaranjas
