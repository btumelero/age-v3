package agev3.criacoes.unidades;

import agev3.civilizacoes.TiposDeCivilizacoes;

/**
 *
 * @author Bruno
 */
public enum TiposDeUnidades {
  ARQUEIRO(TiposDeCivilizacoes.AMBAS),
  CAMPONES(TiposDeCivilizacoes.AMBAS),
  CAVALEIRO(TiposDeCivilizacoes.AMBAS),
  ELEFANTE(TiposDeCivilizacoes.EGIPCIOS),
  FALANGE(TiposDeCivilizacoes.GREGOS),
  GUERREIRO(TiposDeCivilizacoes.AMBAS),
  SACERDOTE(TiposDeCivilizacoes.AMBAS);

  private final TiposDeCivilizacoes civilizacao;

  public TiposDeCivilizacoes getTipoDeCivilizacao() {
    return civilizacao;
  }

  private TiposDeUnidades(TiposDeCivilizacoes civilizacao) {
    this.civilizacao = civilizacao;
  }

}
