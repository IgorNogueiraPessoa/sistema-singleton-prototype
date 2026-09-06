public class Main {

    public static void main(String[] args) {

        // solicitando a instância única da fila de impressão.
        System.out.println(">>> Etapa 1: Preparação da fila de impressão (Singleton)");
        FilaDeImpressao fila = FilaDeImpressao.getInstance();

        //  criando o certificado original com "new", apenas com o nome do curso. O nome do aluno fica em branco.
        System.out.println("\n>>> Etapa 2: Criação do certificado molde (Prototype)");
        Certificado certificadoOriginal = new Certificado("Engenharia de Software");

        // 3) usando clonar() para gerar duas cópias independente
        System.out.println("\n>>> Etapa 3: Clonagem do certificado original");
        Certificado clone1 = certificadoOriginal.clonar();
        Certificado clone2 = certificadoOriginal.clonar();

        // definindo o nome de um aluno diferente em cada clone.
        System.out.println("\n>>> Etapa 4: Personalização de cada clone com o nome do aluno");
        clone1.setNomeAluno("João da Silva");
        clone2.setNomeAluno("Maria Oliveira");

        // enviando os dados de cada clone para a fila única de impressão.
        System.out.println("\n>>> Etapa 5: Envio dos certificados para a fila de impressão");
        fila.imprimir(clone1.getDados());
        fila.imprimir(clone2.getDados());

        // provando de que clone1 e clone2 são objetos distintos na memória (Prototype cria cópias independentes).
        System.out.println("\n>>> Validação do Prototype: clone1 == clone2 ?");
        System.out.println("Resultado: " + (clone1 == clone2));

        // Prova extra de que a Fila de Impressão é realmente única (Singleton):
        System.out.println("\n>>> Validação do Singleton: fila == FilaDeImpressao.getInstance() ?");
        FilaDeImpressao outraReferencia = FilaDeImpressao.getInstance();
        System.out.println("Resultado: " + (fila == outraReferencia));
    }
}
