public class No{
  private No referenciaNo;
  private int dado;

  public No(int dado){
    this.referenciaNo = null;
    this.dado = dado;
  }

  public No getReferencia(){
    return referenciaNo;
  }

  public void setReferencia(No ref){
    this.referenciaNo = ref;
  }

  public int getDado(){
    return dado;
  }

}