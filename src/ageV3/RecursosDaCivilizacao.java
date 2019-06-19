package ageV3;

import java.util.EnumMap;
import java.util.Map;

/**
 *
 * @author Bruno
 */
public class RecursosDaCivilizacao {
  private final Map<TiposDeRecursos, Integer> recursos;

  public void modificarQuantidadeEm (TiposDeRecursos recurso, int quantidade) {
    if (recurso != null) {
      recursos.put(recurso, recursos.get(recurso) + quantidade);
    }
  }
  
  public Integer[] getRecursos () {
    return recursos.values().toArray(new Integer[0]);
  }
  
  public RecursosDaCivilizacao() {
    this.recursos = new EnumMap<>(TiposDeRecursos.class);
    recursos.put(TiposDeRecursos.COMIDA, 300);
    recursos.put(TiposDeRecursos.MADEIRA, 300);
    recursos.put(TiposDeRecursos.OURO, 300);
  }
  
}
