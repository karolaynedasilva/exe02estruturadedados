import estruturas.ListaVetor;
import estruturas.PilhaVetor;

public class Main {
    public static void main(String[] args) {
        ListaVetor listavetor = new ListaVetor();
        PilhaVetor pilhavetor = new PilhaVetor();
        int elementoremovido;

        listavetor.adicionar(1);
        listavetor.adicionar(2);
        listavetor.adicionar(3);
        listavetor.adicionar(4);
        listavetor.adicionar(5);
        listavetor.adicionar(6);
        listavetor.adicionar(7);
        listavetor.adicionar(8);
        listavetor.adicionar(9);
        listavetor.adicionar(10);

        System.out.println("A Pilha está vazia?");
        pilhavetor.verificarPilha();

        System.out.println("-----");
        System.out.println("Tamanho da pilha: " + listavetor.getTamanho()); 
        System.out.println("Elementos da pilha: " );
        listavetor.mostrarElementos();
        System.out.println("-----");

       pilhavetor.empilhar(1);
       pilhavetor.empilhar(2);
       pilhavetor.empilhar(3);
       pilhavetor.empilhar(4);

       System.out.println("------");
       System.out.println("Elementos da pilha: " );
       pilhavetor.mostrarElementos();
       System.out.println("------");
       
       System.out.println("Removendo elemento da pilha");
       elementoremovido = pilhavetor.desempilhar();
       pilhavetor.mostrarElementos();

       System.out.println("Removendo elemento da pilha");
       elementoremovido = pilhavetor.desempilhar();
       pilhavetor.mostrarElementos();

       System.out.println("A Pilha está vazia?");
       pilhavetor.verificarPilha();


    }
}
