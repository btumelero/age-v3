package agev3.civilizacoes;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;

import agev3.criacoes.construcoes.Construcoes;
import agev3.criacoes.construcoes.ConstrucoesQueCriam;
import agev3.criacoes.construcoes.TiposDeConstrucoes;
import agev3.criacoes.construcoes.TiposDeConstrucoesQueCriam;
import agev3.criacoes.dados.Ataque;

/**
 *
 * @author Bruno
 */
public class ConstrucoesDaCivilizacao {

  private final Map<TiposDeConstrucoes, ArrayList<Construcoes>> construcoes;

  public boolean add(Construcoes construcao) {
    if (construcoes.get(TiposDeConstrucoes.valueOf(construcao.getTipoDeObjeto().name())).add(construcao)) {
      construcao.getCivilizacao().atualizarCapacidade();
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
    if (construcoes.get(TiposDeConstrucoes.valueOf(construcao.getTipoDeObjeto().name())).remove(construcao)) {
      construcao.getCivilizacao().atualizarCapacidade();
      Ataque.checarSeCivilizacaoFoiExtinta(construcao.getCivilizacao());
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
