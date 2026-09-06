public class Certificado implements Cloneable {

    private String nomeCurso;
    private String nomeAluno;
    public Certificado(String nomeCurso) {
        this.nomeCurso = nomeCurso;
        this.nomeAluno = "";
    }
    public Certificado clonar() {
        try {
            return (Certificado) super.clone();
        } catch (CloneNotSupportedException e) {
            // Não deve acontecer, pois a classe implementa Cloneable.
            throw new RuntimeException("Erro ao clonar o certificado.", e);
        }
    }

    public void setNomeAluno(String nome) {
        this.nomeAluno = nome;
    }

    public String getDados() {
        return "Certificado de Conclusão\nCurso: " + nomeCurso + "\nAluno: " + nomeAluno;
    }
}
