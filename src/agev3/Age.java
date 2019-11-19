package agev3;

import agev3.civilizacoes.Partida;
import agev3.civilizacoes.TiposDeCivilizacoes;

/**
 *
 * @author Bruno
 */
public class Age {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Partida partida = new Partida();
    partida.add(TiposDeCivilizacoes.EGIPCIOS);
    partida.add(TiposDeCivilizacoes.GREGOS);
    //TodasAsCriacoesDaCivilizacao civilizacao1 = partida.getCivilizacao(0).todasCriacoes;
    //TodasAsCriacoesDaCivilizacao civilizacao2 = partida.getCivilizacao(1).todasCriacoes;
    
    /*System.out.println("Teste de Construção");
    System.out.println(civilizacao1.get(TiposDeConstrucoes.TEMPLO).size());
    civilizacao1.getCampones(0).construir(TiposDeConstrucoes.TEMPLO);
    System.out.println(civilizacao1.get(TiposDeConstrucoes.TEMPLO).size());*/
    
    /*System.out.println("Teste de Criação");
    System.out.println(civilizacao1.get(TiposDeUnidades.SACERDOTE).size());
    civilizacao1.get(TiposDeConstrucoesQueCriam.TEMPLO, 0).criar(TiposDeUnidades.SACERDOTE);
    System.out.println(civilizacao1.get(TiposDeUnidades.SACERDOTE).size());*/
    
    /*System.out.println("Teste de Conversão");
    System.out.println(civilizacao1.get(TiposDeUnidades.CAMPONES).size());
    System.out.println(civilizacao2.get(TiposDeUnidades.CAMPONES).size());
    civilizacao1.getSacerdote(0).converter(partida.getCivilizacao(1).todasCriacoes.get(TiposDeUnidades.CAMPONES).get(0));
    System.out.println(civilizacao1.get(TiposDeUnidades.CAMPONES).size());
    System.out.println(civilizacao2.get(TiposDeUnidades.CAMPONES).size());*/
    
    /*System.out.println("Teste de Ataque");
    System.out.println(civilizacao2.get(TiposDeUnidades.CAMPONES).size());
    var campones = civilizacao2.getCampones(0);
    for (int i = 0; i < 17; i++) {
    Ataque.atacar(civilizacao1.getCampones(0), campones);
    }
    System.out.println(civilizacao2.get(TiposDeUnidades.CAMPONES).size());*/
    
    /*System.out.println("Teste de Extinção e Vitória da Partida");
    System.out.println(partida.getCivilizacoes().size());
    civilizacao2.remove(civilizacao2.getCampones(0));
    civilizacao2.remove(civilizacao2.getCampones(0));
    civilizacao2.remove(civilizacao2.getCampones(0));
    civilizacao2.remove(civilizacao2.get(TiposDeConstrucoes.CENTRODACIDADE, 0));
    System.out.println(partida.getCivilizacoes().size());*/
    
    /*System.out.println("Teste de Colheita, Corte e Mineração");
    System.out.println(Arrays.toString(partida.getCivilizacao(0).recursos.getRecursos()));
    civilizacao1.getCampones(0).colher();
    civilizacao1.getCampones(0).cortar();
    civilizacao1.getCampones(0).minerar();
    System.out.println(Arrays.toString(partida.getCivilizacao(0).recursos.getRecursos()));*/
    
    /*System.out.println("Teste de Movimentação");
    System.out.println(civilizacao1.getCampones(0).posicao);
    civilizacao1.getCampones(0).mover(Direcao.NORTE);
    System.out.println(civilizacao1.getCampones(0).posicao);
    civilizacao1.getCampones(0).mover(Direcao.SUL);
    System.out.println(civilizacao1.getCampones(0).posicao);
    civilizacao1.getCampones(0).mover(Direcao.LESTE);
    System.out.println(civilizacao1.getCampones(0).posicao);
    civilizacao1.getCampones(0).mover(Direcao.OESTE);
    System.out.println(civilizacao1.getCampones(0).posicao);*/
  }
  
}
