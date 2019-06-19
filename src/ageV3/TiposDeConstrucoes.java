package ageV3;

/**
 *
 * @author Bruno
 */
public enum TiposDeConstrucoes {
  CASA(TiposDeCivilizacoes.AMBAS, false),
  CENTRODACIDADE(TiposDeCivilizacoes.AMBAS, true),
  QUARTEL(TiposDeCivilizacoes.AMBAS, true),
  TEMPLO(TiposDeCivilizacoes.AMBAS, true),
  TORRE(TiposDeCivilizacoes.AMBAS, false);
  
  private final TiposDeCivilizacoes civilizacao;
  private final boolean podeCriar;

  public TiposDeCivilizacoes getTipoDeCivilizacao() {
    return civilizacao;
  }

  public boolean podeCriar() {
    return podeCriar;
  }
  
  private TiposDeConstrucoes(TiposDeCivilizacoes civilizacao, boolean podeCriar) {
    this.civilizacao = civilizacao;
    this.podeCriar = podeCriar;
  }
}
