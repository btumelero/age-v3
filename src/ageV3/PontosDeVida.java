package ageV3;

/**
 *
 * @author Bruno
 */
public enum PontosDeVida {
  ARQUEIRO(45),
  CAMPONES(50),
  CAVALEIRO(180),
  ELEFANTE(600),
  FALANGE(120),
  GUERREIRO(160),
  SACERDOTE(25),
  
  CASA(75),
  CENTRODACIDADE(600),
  QUARTEL(350),
  TEMPLO(350),
  TORRE(200);
  
  private final int pontosDeVida;

  public int getPontosDeVida() {
    return pontosDeVida;
  }
  
  private PontosDeVida(int pontosDeVida) {
    this.pontosDeVida = pontosDeVida;
  }
}
