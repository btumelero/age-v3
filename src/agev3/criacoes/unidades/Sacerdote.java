package agev3.criacoes.unidades;

import agev3.civilizacoes.Civilizacao;
import agev3.civilizacoes.TiposDeCivilizacoes;
import agev3.criacoes.CriavelDurantePartida;
import agev3.criacoes.Posicao;
import agev3.criacoes.TiposCriaveisDurantePartidas;
import agev3.criacoes.construcoes.Construcoes;
import agev3.criacoes.dados.Alcance;
import agev3.criacoes.dados.PontosDeVida;

/**
 *
 * @author Bruno
 */
public class Sacerdote extends Unidades {
  
  public void converter (CriavelDurantePartida alvo) {
    if (alvo != null) {
      if (Alcance.dentroDoAlcance(this, alvo.getPosicao())) {
        if (alvo instanceof Construcoes || this.civilizacao.temCapacidadeSuficiente()) {
          this.civilizacao.todasCriacoes.add(alvo);
          alvo.getCivilizacao().todasCriacoes.remove(alvo);
          System.out.println("Inimigo Convertido");
        } else {
          System.out.println("Capacidade Insuficiente");
        }
      }
    } else {
      System.out.println("Alvo nulo");
    }
  }
  
  protected Sacerdote(TiposDeCivilizacoes tipoDeCivilizacaoDoObjeto,//parâmetros da classe Objeto
                   Civilizacao civilizacao, Posicao posicao) {//parâmetros da classe CriavelDurantePartida
    super(tipoDeCivilizacaoDoObjeto, civilizacao, posicao);
    this.tipoDeObjeto = TiposCriaveisDurantePartidas.SACERDOTE;
    this.pontosDeVida = PontosDeVida.SACERDOTE.getPontosDeVida();
  }
  
}
