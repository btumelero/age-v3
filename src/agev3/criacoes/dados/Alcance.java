package agev3.criacoes.dados;

import agev3.criacoes.CriavelDurantePartida;
import agev3.criacoes.Posicao;

/**
 * Armazena o valor do alcance de todas as unidades e construções que podem
 * mirar em algo
 * 
 * @author Bruno
 */
public enum Alcance {
  ARQUEIRO(7),
  CAMPONES(2),
  CAVALEIRO(2),
  ELEFANTE(2),
  FALANGE(2),
  GUERREIRO(2),
  SACERDOTE(10),
  
  CENTRODACIDADE(8),
  TORRE(7);
  
  private final int alcance;

  /**
   * Retorna a constante alcance
   * @return O alcance
   */
  public int getAlcance() {
    return alcance;
  }
  
  /**
   * Checa se aquele que está mirando tem alcance suficiente para acertar o seu alvo 
   * @param algoComAlcance A criação que está mirando
   * @param posicaoDoAlvo A posição do alvo
   * @return Verdadeiro se o alvo está dentro do alcance
   */
  public static boolean dentroDoAlcance(CriavelDurantePartida algoComAlcance, Posicao posicaoDoAlvo) {
    if (algoComAlcance != null && posicaoDoAlvo != null) {
      if (algoComAlcance.getTipoDeObjeto().temAlcance()) {
        double distanciaX, distanciaY, distancia;
        distanciaX = Math.pow(algoComAlcance.getPosicao().getX() - posicaoDoAlvo.getX(), 2.0);
        distanciaY = Math.pow(algoComAlcance.getPosicao().getY() - posicaoDoAlvo.getY(), 2.0);
        distancia = Math.sqrt(distanciaX + distanciaY);
        if (distancia <= Alcance.valueOf(algoComAlcance.getTipoDeObjeto().name()).getAlcance()) {
          return true;
        } else {
          System.out.println("Alvo fora de alcance");
        }
      } else {
        System.out.println("Esse objeto não tem alcance");
      }
    } else {
      System.out.println("algoComAlcance/posicaoDoAlvo null");
    }
    return false;
  }
  
  private Alcance(int alcance) {
    this.alcance = alcance;
  }

}
