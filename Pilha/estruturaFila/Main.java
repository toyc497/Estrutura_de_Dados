package estruturaFila;

public class Main {

	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		No primeiro = new No("primeiro");
		No segundo = new No("segundo");
		No terceiro = new No("terceiro");
		No quarto = new No("quarto");
		
		fila.enqueue(primeiro);
		fila.enqueue(segundo);
		fila.enqueue(terceiro);
		fila.enqueue(quarto);
		
		fila.dequeue();
		
		primeiro.imprimeObjeto(primeiro);
		segundo.imprimeObjeto(segundo);
		terceiro.imprimeObjeto(terceiro);
		quarto.imprimeObjeto(quarto);
		
		System.out.println("\nEntrada Fila: "+ fila.getEntradaFila());
	}

}
