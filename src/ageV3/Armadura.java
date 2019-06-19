package ageV3;

/**
 * Armazena o valor da armadura das unidades 
 * @author Bruno
 */
public enum Armadura {
  ARQUEIRO(0),
  CAMPONES(0),
  CAVALEIRO(3),
  ELEFANTE(2),
  FALANGE(7),
  GUERREIRO(2),
  SACERDOTE(0);

  private final int armadura;

  /**
   * Retorna a constante armadura
   * @return a armadura
   */
  public int getArmadura() {
    return armadura;
  }

  private Armadura(int armadura) {
    this.armadura = armadura;
  }
}
