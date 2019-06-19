package ageV3;

/**
 *
 * @author Bruno
 */
public class Sacerdote extends Unidades {
  
  public void converter (CriavelDurantePartida alvo) {
    if (alvo != null) {
      if (Alcance.dentroDoAlcance(this, alvo.posicao)) {
        if (alvo instanceof Construcoes || this.civilizacao.temCapacidadeSuficiente()) {
          this.civilizacao.todasCriacoes.add(alvo);
          alvo.civilizacao.todasCriacoes.remove(alvo);
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
