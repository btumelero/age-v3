package agev3.criacoes;

/**
 *
 * @author Bruno
 */
public enum TiposCriaveisDurantePartidas {
  ARQUEIRO(true, true),
  CAMPONES(true, true),
  CAVALEIRO(true, true),
  ELEFANTE(true, true),
  FALANGE(true, true),
  GUERREIRO(true, true),
  SACERDOTE(true, false),
  
  CASA(false, false),
  CENTRODACIDADE(true, true),
  QUARTEL(false, false),
  TEMPLO(false, false),
  TORRE(true, true);
  
  private final boolean temAlcance;
  private final boolean temAtaque;

  public boolean temAlcance() {
    return temAlcance;
  }

  public boolean temAtaque() {
    return temAtaque;
  }

  private TiposCriaveisDurantePartidas(boolean temAlcance, boolean temAtaque) {
    this.temAlcance = temAlcance;
    this.temAtaque = temAtaque;
  }
}
