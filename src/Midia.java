public class Midia {

    private String titulo;
    private int ano;
    private double nota;

    public Midia(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
        this.nota = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public double getNota() {
        return nota;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void exibirInformacoes() {
        System.out.println(titulo);
        System.out.println(ano);
        System.out.println(nota);
    }
}