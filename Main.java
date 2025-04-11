import estruturas.ListaVetor;
import estruturas.PilhaVetor;

public class Main {
    public static void main(String[] args) {
        ListaVetor listavetor = new ListaVetor();
        PilhaVetor pilhavetor = new PilhaVetor();

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

        System.out.println("-----");
        System.out.println("Tamanho da lista: " + listavetor.getTamanho()); 
        System.out.println("Elementos da lista: " );
        listavetor.mostrarElementos();
        System.out.println("-----");

       pilhavetor.empilhar(1);
       pilhavetor.empilhar(2);
       pilhavetor.empilhar(3);
       pilhavetor.empilhar(4);

       System.out.println("------");
       System.out.println("Elementos da lista: " );
       pilhavetor.mostrarElementos();
       

    }
}
