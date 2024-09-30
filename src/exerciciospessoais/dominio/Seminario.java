package exerciciospessoais.dominio;


public class Seminario {
    private String titulo;
    private Local local;
    private AlunoSem[] alunosSem;

    public String getTitulo() {
        return titulo;
    }

    public Seminario(String titulo, Local local, AlunoSem[] alunosSem) {
        this.titulo = titulo;
        this.local = local;
        this.alunosSem = alunosSem;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }


    public AlunoSem[] getAlunosSem() {
        return alunosSem;
    }

    public void setAlunosSem(AlunoSem[] alunosSem) {
        this.alunosSem = alunosSem;
    }
}
