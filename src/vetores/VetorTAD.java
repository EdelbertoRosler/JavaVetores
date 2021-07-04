package vetores;
/**
 * Estrutura de dados sequenciais estátiticas
 * Baseado na aula do prof. Felipe Sampaio - IFRS
 * @author edelberto Hermann Rösler
 */

public class VetorTAD {
    private int[] vetor; //referência
    private int num;

    public VetorTAD(int tamanho) {  //método construtor
        this.vetor = new int[tamanho];  //criação das posições do vetor na memória
        this.num = 0;
    }

    public int [] getVetor(){
        return this.vetor;
    }

    public void insereFinal(int elem) {
        if( this.vetor.length == this.num ) { // se o vetor está cheio ele dobra o tamanho do vetor e insere o novo
            VetorTAD vet2 = new VetorTAD(this.num * 2);
            for(int i = 0; i < this.num; i ++){
                vet2.insere(i, this.vetor[i]);
            }
            this.vetor = vet2.getVetor();
        }
        this.vetor[this.num] = elem;
        this.num += 1;
    }//insere um valor no final do vetor

    public void insereInicio(int elem) {
        if( this.vetor.length == this.num ) { // se o vetor está cheio ele dobra o tamanho do vetor e insere o novo
            VetorTAD vet2 = new VetorTAD(this.num * 2);
            for(int i = 0; i < this.vetor.length; i ++){
                vet2.insere(i, this.vetor[i]);
            }
            vet2.insere(0, elem);
            this.vetor = vet2.getVetor();
            this.num += 1;
        }
        else {
            for( int i = this.num-1 ; i >= 0 ; i-- ) {
                this.vetor[i+1] = this.vetor[i];
            }
            this.vetor[0] = elem;
            this.num += 1;
        }
    }//insere um valor no início do vetor

    public void insere(int pos, int valor){
        if( this.vetor.length == this.num ) { // se o vetor está cheio ele dobra o tamanho do vetor e insere o novo elemento
            VetorTAD vet2 = new VetorTAD(this.num * 2);
            for(int i = 0; i < this.num; i ++){
                vet2.insere(i, this.vetor[i]);
            }
            vet2.insere(pos, valor);
            this.vetor = vet2.getVetor();
            this.num += 1;
        }
        else{
            for( int i = this.num-1 ; i >= pos ; i-- ) {
                this.vetor[i+1] = this.vetor[i];
            }
            this.vetor[pos] = valor;
            this.num = this.num + 1;
        }
    }//insere um valor em uma posição específica do vetor

    public void imprime(){
        for (int i = 0; i < this.num; i ++){
            System.out.print(this.vetor[i] + " ");
        }
        System.out.println();
    }// imprime o vetor

    public int acessa(int pos){
        return this.vetor[pos];
    }// acessa uma posição do vetor e traz esse valor

    public void tamanhoVetor(){
        System.out.println(this.num);
    }// imprime a quantidade de elementos do vetor

    public boolean ehVazia(){ // retorna true se o vetor está vazio e false se tem algum elemento
        return this.num <= 0;
    }//verifica se o vetor está vazio

    @Override
    public String toString() {    //Converte para uma string
        String result = "";
        for (int i = 0; i < this.num; i ++){
            result += this.vetor[i] + " ";
        }
        return (result);
    }//converte o vetor numa string

    public void removeFinal(){
        if (this.num <= 0){
            System.out.println("Não há elementos a serem removidos!");
        }
        else{
            this.num -= 1;
        }
    }// o último elemento do vetor

    public void removeInicio(){
        if (this.num <= 0){
            System.out.println("Não há elementos a serem removidos!");
        }
        else{
            for( int i = 1; i < num ; i++ ) {
                this.vetor[i-1] = this.vetor[i];
            }
            this.num -= 1;
        }
    }//remove o primeiro elemento do vetor

    public void remove(int pos){
        if (pos >= this.num){
            System.out.println("Não há elementos para remover nessa posição!");
        }
        else {
            for( int i = pos + 1; i < num ; i++ ) {
                this.vetor[i-1] = this.vetor[i];
            }
            this.num -= 1;
        }
    }//remove um elemento passado pela posição que ele se encontra no vetor

    public boolean pesquisa(int valor){ // pesquisa um valor específico no
        for(int i = 0; i < this.num; i++){
            if(valor == this.vetor[i]){
                return true;
            }
        }
        return false;
    }//pesquisa se um valor está no vetor

    public void altera(int pos, int valor) {
        if (pos >= this.num){
            System.out.println("Não há elementos nessa posição!");
        }
        else{
            this.vetor[pos] = valor;
        }
    }//altera um valor de uma posição indicada

    public void limpa() {
        this.num = 0;
    }//limpa o conteúdo do vetor
}
