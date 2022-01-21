public class Pilha{
  private No refNoEntradaPilha;

  public Pilha(){
    this.refNoEntradaPilha = null;
  }

  public void push(No novoNo){
    No referenciaElementoAnterior = refNoEntradaPilha;
    novoNo.setReferencia(referenciaElementoAnterior);
    this.refNoEntradaPilha = novoNo;
  }

  public No pop(){
    if(!this.isEmpty()){
      No elementoRemovido = refNoEntradaPilha;
      this.refNoEntradaPilha = refNoEntradaPilha.getReferencia();
      return elementoRemovido;
    }
    return null;
  }

  public No top(){
    return refNoEntradaPilha;
  }

  public boolean isEmpty(){
    return refNoEntradaPilha == null ? true : false;
  }

}