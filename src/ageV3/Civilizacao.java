package ageV3;

/**
 *
 * @author Bruno
 */
public class Civilizacao extends Objeto {
  public final RecursosDaCivilizacao recursos;
  public final TodasAsCriacoesDaCivilizacao todasCriacoes;
  public final Partida partida;
  private int capacidade, populacaoAtual;
  private boolean extinta;

  public int getCapacidade() {
    return capacidade;
  }

  public void atualizarCapacidade() {
    if (todasCriacoes != null) {
      this.capacidade = todasCriacoes.get(TiposDeConstrucoes.CASA).size() * 2 +
                        todasCriacoes.get(TiposDeConstrucoes.CENTRODACIDADE).size() * 10;
    }
  }
  
  public boolean temCapacidadeSuficiente() {
    if (populacaoAtual < capacidade) {
      return true;
    }
    System.out.println("Capacidade Insuficiente");
    return false;
  }
  
  public int getPopulacaoAtual() {
    return populacaoAtual;
  }

  public void atualizarPopulacaoAtual() {
    if (todasCriacoes != null) {
      this.populacaoAtual = todasCriacoes.unidades.getTotalDeUnidades();
    }
  }

  public boolean getExtinta () {
    return extinta;
  }
  
  public void atualizarExtinta() {
    extinta = getCapacidade() == 0 && getPopulacaoAtual() == 0 && todasCriacoes.get(TiposDeConstrucoes.TORRE).isEmpty();
  }
  
  public static Civilizacao newCivilizacao (TiposDeCivilizacoes tipoDeCivilizacao,//Parâmetros da classe Objeto
                                            Partida partida) {//Parâmetros dessa classe
    if (tipoDeCivilizacao != null && partida != null) {
      return new Civilizacao(tipoDeCivilizacao, partida);
    }
    System.out.println("Tipo de civilizacao/partida nula");
    return null;
  }
  
  private Civilizacao(TiposDeCivilizacoes tipoDeCivilizacao,//Parâmetros da classe Objeto
                      Partida partida) {//Parâmetros dessa classe
    super(tipoDeCivilizacao);
    this.tipoDeCivilizacaoDoObjeto = tipoDeCivilizacao;
    this.partida = partida;
    this.recursos = new RecursosDaCivilizacao();
    this.todasCriacoes = TodasAsCriacoesDaCivilizacao.newTodasAsCriacoesDaCivilizacao(this);
    this.extinta = false;
    this.capacidade = 10;
    this.populacaoAtual = 3;
  }
}
