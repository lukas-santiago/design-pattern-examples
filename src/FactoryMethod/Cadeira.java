package FactoryMethod;

public class Cadeira implements Movel {
    String posicao = "Meio da Sala";
    String cor = "Marrom-Bombom";

    @Override
    public String posicionar(String _posicao) {
        posicao = _posicao;
        return posicao;
    }

    @Override
    public String pintar(String _cor) {
        cor = _cor;
        return null;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getCor() {
        return cor;
    }
}
