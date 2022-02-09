package estruturaFila;

public class Fila {
	
	private No refereciaEntradaFila;
	
	public Fila() {
		this.refereciaEntradaFila = null;
	}
	
	public void enqueue(No novoNo) {
		novoNo.setRefNo(refereciaEntradaFila);
		refereciaEntradaFila = novoNo;
	}
	
	public No first() {
		if(!this.isEmpity()) {
			No primeiroNo = refereciaEntradaFila;
			while(true) {
				if(primeiroNo.getRefNo() != null) {
					primeiroNo = primeiroNo.getRefNo();
				}else {
					break;
				}
			}
		}
		return null;
	}
	
	public No dequeue() {
		if(!this.isEmpity()) {
			No primeiroNo = refereciaEntradaFila;
			No noAuxiliar = refereciaEntradaFila;
			while(true) {
				if(primeiroNo.getRefNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
				}else {
					noAuxiliar.setRefNo(null);
					break;
				}
			}
		}
		return null;
	}
	
	public boolean isEmpity() {
		return refereciaEntradaFila == null ? true : false;
	}
	
	public No getEntradaFila() {
		return this.refereciaEntradaFila;
	}
}
