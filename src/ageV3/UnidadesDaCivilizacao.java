package ageV3;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;

/**
 *
 * @author Bruno
 */
public class UnidadesDaCivilizacao {

  private final Map<TiposDeUnidades, ArrayList<Unidades>> unidades;

  public boolean add(Unidades unidade) {
    if (unidades.get(TiposDeUnidades.valueOf(unidade.tipoDeObjeto.name())).add(unidade)) {
      unidade.civilizacao.atualizarPopulacaoAtual();
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
    if (unidades.get(TiposDeUnidades.valueOf(unidade.tipoDeObjeto.name())).remove(unidade)) {
      unidade.civilizacao.atualizarPopulacaoAtual();
      Ataque.checarSeCivilizacaoFoiExtinta(unidade.civilizacao);
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
