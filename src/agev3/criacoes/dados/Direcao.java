package agev3.criacoes.dados;

/**
 *
 * @author Bruno
 */
public enum Direcao {
  NORTE(new int[]{0, 1}),
  SUL(new int[]{0, -1}),
  LESTE(new int[]{1, 0}),
  OESTE(new int[]{-1, 0});

  private final int[] mudancaNoEixo;

  public int[] getMudancaNoEixo() {
    return mudancaNoEixo;
  }

  private Direcao(int[] mudancaNoEixo) {
    this.mudancaNoEixo = mudancaNoEixo;
  }

}
