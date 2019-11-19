package agev3.criacoes.construcoes;

import agev3.civilizacoes.Civilizacao;
import agev3.civilizacoes.TiposDeCivilizacoes;
import agev3.criacoes.CriavelDurantePartida;
import agev3.criacoes.Posicao;
import agev3.criacoes.TiposCriaveisDurantePartidas;
import agev3.criacoes.dados.PontosDeVida;

/**
 *
 * @author Bruno
 */
public class Construcoes extends CriavelDurantePartida {

  public static Construcoes newConstrucao(//tipoDeCivilizacaoDoObjeto gerado automaticamente através tipoDeUnidade
                                          Civilizacao civilizacao, Posicao posicao, //parâmetros da classe CriavelDurantePartida
                                          TiposDeConstrucoes tipoDeConstrucao) {//parâmetros dessa classe
    if (tipoDeConstrucao != null && civilizacao != null && posicao != null) {
      return //uma nova construcao conforme o tipoDeConstrucao passado por parâmetro
      tipoDeConstrucao.podeCriar() ?
        new ConstrucoesQueCriam(tipoDeConstrucao.getTipoDeCivilizacao(), civilizacao, posicao, TiposDeConstrucoesQueCriam.valueOf(tipoDeConstrucao.name())) :
        new Construcoes(tipoDeConstrucao.getTipoDeCivilizacao(), civilizacao, posicao, tipoDeConstrucao)
      ;
    } else {
      System.out.println("tipoDeConstrução/civilizacao null");
    }
    return null;
  }
  
  protected Construcoes(TiposDeCivilizacoes tipoDeCivilizacaoDoObjeto,//parâmetros da classe Objeto
                        Civilizacao civilizacao, Posicao posicao) {//parâmetros da classe CriavelDurantePartida
    super(tipoDeCivilizacaoDoObjeto, civilizacao, posicao);
  }
  
  private Construcoes(TiposDeCivilizacoes tipoDeCivilizacaoDoObjeto,//parâmetros da classe Objeto
                      Civilizacao civilizacao, Posicao posicao,//parâmetros da classe CriavelDurantePartida
                      TiposDeConstrucoes tipoDeObjeto) {//parâmetros dessa classe
    super(tipoDeCivilizacaoDoObjeto, civilizacao, posicao);
    inicializarTipoDeObjetoPontosDeVida(tipoDeObjeto);
  }

  protected final void inicializarTipoDeObjetoPontosDeVida(TiposDeConstrucoes tipoDeObjeto) {
    this.tipoDeObjeto = TiposCriaveisDurantePartidas.valueOf(tipoDeObjeto.name());
    this.pontosDeVida = PontosDeVida.valueOf(tipoDeObjeto.name()).getPontosDeVida();
  }

}
