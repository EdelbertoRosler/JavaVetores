package vetores;
public class vetorTADmain {

    public static void main(String[] args) {
        vetores.VetorTAD vet1 = new VetorTAD(2);

        vet1.insereFinal(5); vet1.imprime();
        vet1.insereInicio(57); vet1.imprime();
        vet1.insereInicio(58); vet1.imprime();
        vet1.insereFinal(25); vet1.imprime();
        vet1.insere(1,101); vet1.imprime();
        vet1.insere(3,103); vet1.imprime();
        vet1.insere(0,100); vet1.imprime();
        vet1.insereFinal(10); vet1.imprime();
        vet1.insereInicio(41); vet1.imprime();

        vet1.tamanhoVetor();
        System.out.println(vet1.acessa(4));
        System.out.println(vet1.ehVazia());
        System.out.println(vet1.toString());
        System.out.println(vet1.pesquisa(10));
        vet1.removeFinal(); vet1.imprime();
        vet1.removeInicio(); vet1.imprime();
        vet1.remove(2); vet1.imprime();
        vet1.altera(3, 77); vet1.imprime();
        vet1.limpa(); vet1.tamanhoVetor();

    }
}
