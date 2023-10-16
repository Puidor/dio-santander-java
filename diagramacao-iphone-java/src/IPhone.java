import java.util.List;
import java.util.ArrayList;

class IPhone {
    private String modelo;
    private String cor;
    private String numeroSerie;

    public IPhone(String modelo, String cor, String numeroSerie) {
        this.modelo = modelo;
        this.cor = cor;
        this.numeroSerie = numeroSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public void fazerLigacao(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }

    public void abrirNavegador(String url) {
        System.out.println("Abrindo navegador e acessando " + url);
    }

    public void reproduzirMusica() {
        System.out.println("Reproduzindo música");
    }
}

class ReprodutorMusical {
    private List<Musica> listaDeReproducao;

    public ReprodutorMusical() {
        listaDeReproducao = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        listaDeReproducao.add(musica);
    }

    public void removerMusica(Musica musica) {
        listaDeReproducao.remove(musica);
    }

    public void reproduzirMusica() {
        System.out.println("Reproduzindo música");
    }
}

class AparelhoTelefonico {
    private String numero;

    public AparelhoTelefonico(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void fazerLigacao(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }
}

class NavegadorInternet {
    private List<String> historico;

    public NavegadorInternet() {
        historico = new ArrayList<>();
    }

    public void abrirNavegador(String url) {
        System.out.println("Abrindo navegador e acessando " + url);
    }

    public void adicionarAoHistorico(String url) {
        historico.add(url);
    }

    public void mostrarHistorico() {
        System.out.println("Histórico de URLs visitadas:");
        for (String url : historico) {
            System.out.println(url);
        }
    }
}

class Musica {
    private String titulo;
    private String artista;

    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
}
