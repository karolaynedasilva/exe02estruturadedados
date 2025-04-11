package estruturas;

public class PilhaVetor {
    private int[] elementos;
    private int topo;
    private int capacidade;

    public int[] getElementos() {
        return elementos;
    }

    public void setElementos(int[] elementos) {
        this.elementos = elementos;
    }

    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void mostrarElementos(){
        if (topo == -1) {
            System.out.println("A lista está vazia");
        }else{
            for(int i = topo; i>= 0; i--){
                System.out.println(elementos[i] + " ");
            }
        }
    }

    public PilhaVetor(){
        this.capacidade =10;
        this.elementos = new int[this.capacidade];
        this.topo = -1;
    }

    public void aumentarCapacidade(){
        int novaCapacidade = this.capacidade * (this.capacidade/2);
        int[] novoVetor = new int[novaCapacidade];

        for(int i =0; i<= topo; i++){
            novoVetor[i] = elementos[i];
        }
        elementos = novoVetor;
        this.capacidade = novaCapacidade;
    }

    public void empilhar(int elemento){
        if (topo >= capacidade -1) {
            aumentarCapacidade();
        }
        topo++;
        elementos[topo] = elemento;

        System.out.println("Elemento empilhado: " + elemento);
        System.out.println("Novo topo (índice): " + topo);
        
    }

    public int desempilhar(){
        if (topo >= 0) {
            int elemento = elementos[topo];
            topo --;
            return elemento;
        }else{
            throw new IllegalStateException("A Pilha está vazia");
        }
    }
}
