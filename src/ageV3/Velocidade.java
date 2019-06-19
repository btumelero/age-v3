package ageV3;

/**
 *
 * @author Bruno
 */
public enum Velocidade {
  ARQUEIRO(2),
  CAMPONES(2),
  CAVALEIRO(4),
  ELEFANTE(1),
  FALANGE(1.2),
  GUERREIRO(1.8),
  SACERDOTE(1);

  private final double velocidade;

  public double getVelocidade() {
    return this.velocidade;
  }

  private Velocidade(double valor) {
    this.velocidade = valor;
  }
}
