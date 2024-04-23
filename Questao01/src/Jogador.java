public class Jogador {

    public String nomeJogador;

    public int votos;

    public Jogador(String nomeJogador, int votos) {
        this.nomeJogador = nomeJogador;
        this.votos = votos;
    }

    public Jogador(int votos) {
        this.votos = votos;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public Jogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public void incrementaUmVoto() {
        this.votos = getVotos() + 1;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nomeJogador='" + nomeJogador + '\'' +
                ", votos=" + votos +
                '}';
    }
}
