package agev3.criacoes;

import agev3.Objeto;
import agev3.civilizacoes.Civilizacao;
import agev3.civilizacoes.TiposDeCivilizacoes;

/**
 *
 * @author Bruno
 */
public abstract class CriavelDurantePartida extends Objeto {

  protected Civilizacao civilizacao;
  protected int pontosDeVida;
  protected Posicao posicao;
  protected TiposCriaveisDurantePartidas tipoDeObjeto;
  
  public Civilizacao getCivilizacao () {
    return civilizacao;
  }

  /**
   * @return the pontosDeVida
   */
  public int getPontosDeVida() {
    return pontosDeVida;
  }

  /**
   * @param pontosDeVida the pontosDeVida to set
   */
  public void setPontosDeVida(int pontosDeVida) {
    this.pontosDeVida = pontosDeVida;
  }

  /**
   * @param pontosDeVida the pontosDeVida to set
   */
  public void descontarDosPontosDeVida(int pontosDeVida) {
    this.pontosDeVida -= pontosDeVida;
    if (this.pontosDeVida <= 0) {
      System.out.println("O inimigo foi morto/destruído");
      civilizacao.todasCriacoes.remove(this);
    }
  }

  public Posicao getPosicao () {
    return posicao;
  }

  /**
   * @return O Tipo de Objeto
   */
  public TiposCriaveisDurantePartidas getTipoDeObjeto() {
    return tipoDeObjeto;
  }

  protected CriavelDurantePartida(TiposDeCivilizacoes tipoDeCivilizacaoDoObjeto,//parâmetros da classe Objeto
                                  Civilizacao civilizacao, Posicao posicao) {//parâmetros dessa classe
    super(tipoDeCivilizacaoDoObjeto);
    this.civilizacao = civilizacao;
    this.posicao = posicao;
  }
  
}
