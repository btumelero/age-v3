package ageV3;

/**
 *
 * @author Bruno
 */
public abstract class CriavelDurantePartida extends Objeto {

  protected Civilizacao civilizacao;
  protected int pontosDeVida;
  protected Posicao posicao;
  protected TiposCriaveisDurantePartidas tipoDeObjeto;
  
  protected CriavelDurantePartida(TiposDeCivilizacoes tipoDeCivilizacaoDoObjeto,//parâmetros da classe Objeto
                                  Civilizacao civilizacao, Posicao posicao) {//parâmetros dessa classe
    super(tipoDeCivilizacaoDoObjeto);
    this.civilizacao = civilizacao;
    this.posicao = posicao;
  }
  
}
