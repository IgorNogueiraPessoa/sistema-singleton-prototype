public class FilaDeImpressao {
    private static FilaDeImpressao instance;
    private FilaDeImpressao() {}
    public static FilaDeImpressao getInstance() {
        if (instance == null) {
            instance = new FilaDeImpressao();
        }
        return instance;
    }
    public void imprimir(String documento) {
        System.out.println("----------------------------------------------------");
        System.out.println("Imprimindo na fila única (hashcode: " + this.hashCode() + ")");
        System.out.println(documento);
        System.out.println("----------------------------------------------------");
    }
}
