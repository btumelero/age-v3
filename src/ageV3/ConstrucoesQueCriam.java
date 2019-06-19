package ageV3;

/**
 *
 * @author Bruno
 */
public class ConstrucoesQueCriam extends Construcoes {
  
  public void criar (TiposDeUnidades unidade) {
    if (unidade != null) {
      if (this.civilizacao.getExtinta() == false) {
        if (podeCriarEssaUnidade(this.tipoDeCivilizacaoDoObjeto, unidade)) {
          if (this.civilizacao.temCapacidadeSuficiente()) {
            Custo custoDaUnidade = Custo.valueOf(unidade.name());
            if (Custo.temRecursosSuficientesParaCriar(this.civilizacao.recursos, custoDaUnidade)) {
              Custo.descontarDosRecursos(this.civilizacao.recursos, custoDaUnidade);
              this.civilizacao.todasCriacoes.add(
                Unidades.newUnidade(
                  civilizacao, 
                  posicao,
                  unidade
                )
              );
              System.out.println("Unidade Pronta");
            }
          } else {
            System.out.println("Recursos Insuficientes");
          }
        }
      } else {
        System.out.println("Civilizações extintas não podem construir");
      }
    } else {
      System.out.println("Unidade nula");
    }
  }
  
  private boolean podeCriarEssaUnidade(TiposDeCivilizacoes tipoDeCivilizacaoDoCriador, TiposDeUnidades unidade) {
    if (unidade.getTipoDeCivilizacao() == TiposDeCivilizacoes.AMBAS || unidade.getTipoDeCivilizacao() == tipoDeCivilizacaoDoCriador) {
      return true;
    }
    System.out.println("Essa civilização não pode criar essa unidade");
    return false;
  }
  
  public ConstrucoesQueCriam(TiposDeCivilizacoes tipoDeCivilizacaoDoObjeto,//parâmetros da classe Objeto
                             Civilizacao civilizacao, Posicao posicao,//parâmetros da classe CriavelDurantePartida
                             TiposDeConstrucoesQueCriam tipoDeObjeto) {//parâmetros dessa classe
    super(tipoDeCivilizacaoDoObjeto, civilizacao, posicao);
    inicializarTipoDeObjetoPontosDeVida(TiposDeConstrucoes.valueOf(tipoDeObjeto.name()));
  }
  
}
