package agev3.civilizacoes;

import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class Partida {
  
  private final ArrayList<Civilizacao> civilizacoes;

  public void add (TiposDeCivilizacoes tipoDeCivilizacao) {
    if (tipoDeCivilizacao != null) {
      if (tipoDeCivilizacao != TiposDeCivilizacoes.AMBAS) {
        this.civilizacoes.add(Civilizacao.newCivilizacao(tipoDeCivilizacao, this));
      }
    } else {
      System.out.println("Civilizacao nula");
    }
  }
  
  public void removerCivilizacoesExtintas () {
    for (Civilizacao civilizacao : civilizacoes.toArray(new Civilizacao[0])) {
      if (civilizacao.getExtinta()) {
        this.civilizacoes.remove(civilizacao);
      }
    }
  }

  public ArrayList<Civilizacao> getCivilizacoes() {
    return civilizacoes;
  }
  
  public Civilizacao getCivilizacao (int i) {
    return civilizacoes.get(i);
  }
  
  public Partida() {
    this.civilizacoes = new ArrayList<>();
  }
}
