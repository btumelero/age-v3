package agev3.criacoes.unidades;

import agev3.civilizacoes.Civilizacao;
import agev3.civilizacoes.TiposDeCivilizacoes;
import agev3.criacoes.CriavelDurantePartida;
import agev3.criacoes.Posicao;
import agev3.criacoes.TiposCriaveisDurantePartidas;
import agev3.criacoes.dados.Direcao;
import agev3.criacoes.dados.PontosDeVida;
import agev3.criacoes.dados.Velocidade;

/**
 *
 * @author Bruno
 */
public class Unidades extends CriavelDurantePartida {
  
  public void mover (Direcao direcao) {
    if (direcao != null) {
      double velocidade = Velocidade.valueOf(tipoDeObjeto.name()).getVelocidade();
      this.posicao.modificarXEm(velocidade * direcao.getMudancaNoEixo()[0]);
      this.posicao.modificarYEm(velocidade * direcao.getMudancaNoEixo()[1]);
    }
  }
  
  public static Unidades newUnidade(//tipoDeCivilizacaoDoObjeto gerado automaticamente através tipoDeUnidade
                                    Civilizacao civilizacao, Posicao posicao, //parâmetros da classe CriavelDurantePartida
                                    TiposDeUnidades tipoDeUnidade) {//parâmetros dessa classe
    if (tipoDeUnidade != null && civilizacao != null && posicao != null) {
      return //uma nova unidade conforme o tipoDeUnidade passado por parâmetro
      tipoDeUnidade == TiposDeUnidades.CAMPONES ? 
        new Campones(tipoDeUnidade.getTipoDeCivilizacao(), civilizacao, posicao) :
        tipoDeUnidade == TiposDeUnidades.SACERDOTE ? 
          new Sacerdote(tipoDeUnidade.getTipoDeCivilizacao(), civilizacao, posicao) :
          new Unidades(tipoDeUnidade.getTipoDeCivilizacao(), civilizacao, posicao, tipoDeUnidade)
      ;
    } else {
      System.out.println("Tipo De Unidade/Civilização null");
    }
    return null;
  }
  
  protected Unidades(TiposDeCivilizacoes tipoDeCivilizacaoDoObjeto,//parâmetros da classe Objeto
                     Civilizacao civilizacao, Posicao posicao) {//parâmetros da classe CriavelDurantePartida
    super(tipoDeCivilizacaoDoObjeto, civilizacao, posicao);
  }
  
  private Unidades(TiposDeCivilizacoes tipoDeCivilizacaoDoObjeto,//parâmetros da classe Objeto
                   Civilizacao civilizacao, Posicao posicao,//parâmetros da classe CriavelDurantePartida
                   TiposDeUnidades tipoDeUnidade) {//parâmetros dessa classe
    super(tipoDeCivilizacaoDoObjeto, civilizacao, posicao);
    this.tipoDeObjeto = TiposCriaveisDurantePartidas.valueOf(tipoDeUnidade.name());
    this.pontosDeVida = PontosDeVida.valueOf(tipoDeObjeto.name()).getPontosDeVida();
  }
}
