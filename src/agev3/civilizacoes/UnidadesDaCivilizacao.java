package agev3.civilizacoes;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;

import agev3.criacoes.dados.Ataque;
import agev3.criacoes.unidades.Campones;
import agev3.criacoes.unidades.Sacerdote;
import agev3.criacoes.unidades.TiposDeUnidades;
import agev3.criacoes.unidades.Unidades;

/**
 *
 * @author Bruno
 */
public class UnidadesDaCivilizacao {

  private final Map<TiposDeUnidades, ArrayList<Unidades>> unidades;

  public boolean add(Unidades unidade) {
    if (unidades.get(TiposDeUnidades.valueOf(unidade.getTipoDeObjeto().name())).add(unidade)) {
      unidade.getCivilizacao().atualizarPopulacaoAtual();
      return true;
    }
    return false;
  }
  
  public ArrayList<Unidades> get(TiposDeUnidades unidade) {
    return unidades.get(unidade);
  }
  
  public Unidades get(TiposDeUnidades unidade, int i) {
    return unidades.get(unidade).get(i);
  }
  
  public Campones getCampones(int i) {
    return (Campones) unidades.get(TiposDeUnidades.CAMPONES).get(i);
  }
  
  public Sacerdote getSacerdote(int i) {
    return (Sacerdote) unidades.get(TiposDeUnidades.SACERDOTE).get(i);
  }
  
  public int getTotalDeUnidades() {
    int soma = 0;
    soma = unidades.values().stream().map((array) -> array.size()).reduce(soma, Integer::sum);
    return soma;
  }

  public boolean remove(Unidades unidade) {
    if (unidades.get(TiposDeUnidades.valueOf(unidade.getTipoDeObjeto().name())).remove(unidade)) {
      unidade.getCivilizacao().atualizarPopulacaoAtual();
      Ataque.checarSeCivilizacaoFoiExtinta(unidade.getCivilizacao());
      return true;
    }
    return false;
  }

  public UnidadesDaCivilizacao() {
    this.unidades = new EnumMap<>(TiposDeUnidades.class);
    for (TiposDeUnidades unidade : TiposDeUnidades.values()) {
      unidades.put(unidade, new ArrayList<>());
    }
  }
}
