package agev3.criacoes.unidades;

import agev3.civilizacoes.Civilizacao;
import agev3.civilizacoes.TiposDeCivilizacoes;
import agev3.civilizacoes.TiposDeRecursos;
import agev3.criacoes.Posicao;
import agev3.criacoes.TiposCriaveisDurantePartidas;
import agev3.criacoes.construcoes.Construcoes;
import agev3.criacoes.construcoes.TiposDeConstrucoes;
import agev3.criacoes.dados.Custo;
import agev3.criacoes.dados.PontosDeVida;

public class Campones extends Unidades {
  
  public void construir (TiposDeConstrucoes construcao) {
    if (construcao != null) {
      Custo custoDaConstrucao = Custo.valueOf(construcao.name());
      if (Custo.temRecursosSuficientesParaCriar(this.civilizacao.recursos, custoDaConstrucao)) {
        Custo.descontarDosRecursos(this.civilizacao.recursos, custoDaConstrucao);
        this.civilizacao.todasCriacoes.add(
          Construcoes.newConstrucao(
            this.civilizacao, 
            this.posicao,
            construcao
          )
        );
        System.out.println("Construção Pronta");
      }
    } else {
      System.out.println("Construção Nula");
    }
  }
  
  public void colher () {
    this.civilizacao.recursos.modificarQuantidadeEm(TiposDeRecursos.COMIDA, 1);
  }
  
  public void cortar () {
    this.civilizacao.recursos.modificarQuantidadeEm(TiposDeRecursos.MADEIRA, 1);
  }
  
  public void minerar () {
    this.civilizacao.recursos.modificarQuantidadeEm(TiposDeRecursos.OURO, 1);
  }
  
  protected Campones(TiposDeCivilizacoes tipoDeCivilizacaoDoObjeto,//parâmetros da classe Objeto
                     Civilizacao civilizacao, Posicao posicao) {//parâmetros da classe CriavelDurantePartida
    super(tipoDeCivilizacaoDoObjeto, civilizacao, posicao);
    this.tipoDeObjeto = TiposCriaveisDurantePartidas.CAMPONES;
    this.pontosDeVida = PontosDeVida.CAMPONES.getPontosDeVida();
  }

}
