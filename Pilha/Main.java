public class Main {
  public static void main(String[] args) {
    Pilha pilha = new Pilha();

    No hulk = new No(1);
    No capitao = new No(2);
    No batman = new No(3);
    No spider = new No(4);

    pilha.push(hulk);
    pilha.push(capitao);
    pilha.push(batman);
    pilha.push(spider);
    
    System.out.println("\nMemória\n");
    System.out.println("Hulk: "+hulk);
    System.out.println("Capitao: "+capitao);
    System.out.println("Batman: "+batman);
    System.out.println("Spider: "+spider);
    System.out.println("\n...............\n");

    System.out.println("\nPILHA\n");
    System.out.println("Pilha Vazia: "+pilha.isEmpty());
    //Testar o método POP 
    //System.out.println("POP(Elemento Removido): "+pilha.pop());
    System.out.println("Entrada TOPO: "+pilha.top());
    System.out.println("\n...............\n");

    System.out.println("\nReferências\n");
    System.out.println("Hulk Referencia: "+hulk.getReferencia());
    System.out.println("Capitao Referencia: "+capitao.getReferencia());
    System.out.println("Batman Referencia: "+batman.getReferencia());
    System.out.println("Spider Referencia: "+spider.getReferencia());
    System.out.println("\n...............\n");
  }
}