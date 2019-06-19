package ageV3;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;

/**
 *
 * @author Bruno
 */
public class ConstrucoesDaCivilizacao {

  private final Map<TiposDeConstrucoes, ArrayList<Construcoes>> construcoes;

  public boolean add(Construcoes construcao) {
    if (construcoes.get(TiposDeConstrucoes.valueOf(construcao.tipoDeObjeto.name())).add(construcao)) {
      construcao.civilizacao.atualizarCapacidade();
      return true;
    }
    return false;
  }

  public ArrayList<Construcoes> get(TiposDeConstrucoes construcao) {
    return construcoes.get(construcao);
  }
  
  public Construcoes get(TiposDeConstrucoes construcao, int i) {
    return construcoes.get(construcao).get(i);
  }
  
  public ConstrucoesQueCriam get(TiposDeConstrucoesQueCriam construcao, int i) {
    return (ConstrucoesQueCriam) construcoes.get(TiposDeConstrucoes.valueOf(construcao.name())).get(i);
  }

  public boolean remove(Construcoes construcao) {
    if (construcoes.get(TiposDeConstrucoes.valueOf(construcao.tipoDeObjeto.name())).remove(construcao)) {
      construcao.civilizacao.atualizarCapacidade();
      Ataque.checarSeCivilizacaoFoiExtinta(construcao.civilizacao);
      return true;
    }
    return false;
  }

  public ConstrucoesDaCivilizacao() {
    this.construcoes = new EnumMap<>(TiposDeConstrucoes.class);
    for (TiposDeConstrucoes construcao : TiposDeConstrucoes.values()) {
      construcoes.put(construcao, new ArrayList<>());
    }
  }
}
