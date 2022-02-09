package estruturaFila;

public class No {

	private String objeto;
	private No refNo;
	
	public No(String obj) {
		this.objeto = obj;
		this.refNo = null;
	}
	
	public String getObject() {
		return objeto;
	}
	
	public No getRefNo() {
		return refNo;
	}
	
	public void setRefNo(No referenciaNo) {
		this.refNo = referenciaNo;
	}
	
	public void imprimeObjeto(No itemNo) {
		System.out.println("NOME: "+ itemNo.getObject());
		System.out.println("HASH MEMORIA: "+ itemNo);
		System.out.println("APONTA REFERENCIA: "+ itemNo.getRefNo()+"\n");
	}
	
}
