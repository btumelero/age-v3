package agev3;

import agev3.civilizacoes.TiposDeCivilizacoes;
/**
 *
 * @author Bruno
 */
public abstract class Objeto {
  
  protected TiposDeCivilizacoes tipoDeCivilizacaoDoObjeto;

  protected Objeto(TiposDeCivilizacoes tipoDeCivilizacaoDoObjeto) {
    this.tipoDeCivilizacaoDoObjeto = tipoDeCivilizacaoDoObjeto;
  }
  
}
