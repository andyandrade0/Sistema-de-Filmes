public class Filme extends Midia {

    private String diretor;
    private String genero;

    public Filme(String titulo, int ano, String diretor, String genero) {
        super(titulo, ano);
        this.diretor = diretor;
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(getAno());
        System.out.println(getTitulo());
        System.out.println(getNota());
        System.out.println(getDiretor());
        System.out.println(getGenero());
    }

    public void avaliar(double nota) {
        setNota(nota);
    }

    public void avaliar(boolean gostei) {
        if (gostei) {
            setNota(10);
        } else {
            setNota(5);
        }
    }
}