package agev3.civilizacoes;

import java.util.ArrayList;

import agev3.criacoes.CriavelDurantePartida;
import agev3.criacoes.Posicao;
import agev3.criacoes.construcoes.Construcoes;
import agev3.criacoes.construcoes.ConstrucoesQueCriam;
import agev3.criacoes.construcoes.TiposDeConstrucoes;
import agev3.criacoes.construcoes.TiposDeConstrucoesQueCriam;
import agev3.criacoes.unidades.Campones;
import agev3.criacoes.unidades.Sacerdote;
import agev3.criacoes.unidades.TiposDeUnidades;
import agev3.criacoes.unidades.Unidades;

/**
 *
 * @author Bruno
 */
public class TodasAsCriacoesDaCivilizacao {
  public final UnidadesDaCivilizacao unidades;
  public final ConstrucoesDaCivilizacao construcoes;
  
  /**
   * Adiciona uma criação nas criações da civilização
   * @param criacao A criação a ser adicionada
   * @return Verdadeiro se adicionou no mapa, independentemente se for unidade ou construção
   */
  public boolean add (CriavelDurantePartida criacao) {
    if (criacao != null) {
      return
      criacao instanceof Unidades ? 
        unidades.add((Unidades) criacao) : 
        construcoes.add((Construcoes) criacao)
      ;
    }
    System.out.println("Não é permitido adicionar Null");
    return false;
  }
  
  public ArrayList<Construcoes> get (TiposDeConstrucoes tipo) {
    if (tipo != null) {
      return construcoes.get(tipo);
    }
    System.out.println("Nunca há valores nulos aqui");
    return null;
  }
  
  public Construcoes get(TiposDeConstrucoes construcao, int i) {
    if (construcao != null) {
      return construcoes.get(construcao, i);
    }
    System.out.println("Nunca há valores nulos aqui");
    return null;
  }
  
  public ConstrucoesQueCriam get(TiposDeConstrucoesQueCriam construcao, int i) {
    if (construcao != null) {
      return construcoes.get(construcao, i);
    }
    System.out.println("Nunca há valores nulos aqui");
    return null;
  }
  
  public ArrayList<Unidades> get (TiposDeUnidades tipo) {
    if (tipo != null) {
      return unidades.get(tipo);
    }
    System.out.println("Nunca há valores nulos aqui");
    return null;
  }
  
  public Unidades get(TiposDeUnidades unidade, int i) {
    if (unidade != null) {
      return unidades.get(unidade, i);
    }
    System.out.println("Nunca há valores nulos aqui");
    return null;
  }
  
  public Campones getCampones(int i) {
    return unidades.getCampones(i);
  }
  
  public Sacerdote getSacerdote(int i) {
    return unidades.getSacerdote(i);
  }
  
  /**
   * Remove uma criação das criações da civilização
   * @param criacao A criação a ser removida
   * @return Verdadeiro se removeu do mapa, independentemente se for unidade ou construção
   */
  public boolean remove (CriavelDurantePartida criacao) {
    if (criacao != null) {
      return
      criacao instanceof Unidades ? 
        unidades.remove((Unidades) criacao) : 
        construcoes.remove((Construcoes) criacao)
      ;
    }
    System.out.println("Nunca há valores nulos aqui");
    return false;
  }
  
  public static TodasAsCriacoesDaCivilizacao newTodasAsCriacoesDaCivilizacao(Civilizacao civilizacao) {
    if (civilizacao != null) {
      return new TodasAsCriacoesDaCivilizacao(civilizacao);
    }
    System.out.println("Civilizacao nula");
    return null;
  }
  
  private TodasAsCriacoesDaCivilizacao(Civilizacao civilizacao) {
    this.construcoes = new ConstrucoesDaCivilizacao();
    this.unidades = new UnidadesDaCivilizacao();
    Posicao posicao = new Posicao(0, 0);
    this.construcoes.add(Construcoes.newConstrucao(civilizacao, posicao, TiposDeConstrucoes.CENTRODACIDADE));
    for (int i = 0; i < 3; i++) {
      this.unidades.add(Unidades.newUnidade(civilizacao, posicao, TiposDeUnidades.CAMPONES));
    }
  }
}
