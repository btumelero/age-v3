package agev3.criacoes.dados;

import agev3.civilizacoes.Civilizacao;
import agev3.civilizacoes.Partida;
import agev3.criacoes.CriavelDurantePartida;
import agev3.criacoes.unidades.Unidades;

/**
 * Armazena o valor do ataque de todas as unidades e construções que podem
 * atacar algo
 * 
 * @author Bruno
 */
public enum Ataque {
  ARQUEIRO(5),
  CAMPONES(3),
  CAVALEIRO(12),
  ELEFANTE(18),
  FALANGE(20),
  GUERREIRO(13),
  
  CENTRODACIDADE(10),
  TORRE(20);

  private final int ataque;

  /**
   * 
   * @param criacao
   * @param alvo
   */
  public static void atacar(CriavelDurantePartida criacao, CriavelDurantePartida alvo) {
    if (criacao != null && alvo != null) {
      if (Alcance.dentroDoAlcance(criacao, alvo.getPosicao())) {
        if (criacao.getTipoDeObjeto().temAtaque()) {
          causarDano(Ataque.valueOf(criacao.getTipoDeObjeto().name()), alvo);
        } else {
          System.out.println("Esse objeto não pode atacar");
        }
      }
    } else {
      System.out.println("criacao/alvo null");
    }
  }

  private static void causarDano(Ataque atacante, CriavelDurantePartida alvo) {
    int dano = atacante.getAtaque();
    if (alvo instanceof Unidades) {
      dano -= Armadura.valueOf(alvo.getTipoDeObjeto().name()).getArmadura();
    }
    alvo.descontarDosPontosDeVida(dano);
    System.out.println(alvo.getTipoDeObjeto().toString() + " recebeu " + dano + " de dano");
  }
  
  public static void checarSeCivilizacaoFoiExtinta(Civilizacao civilizacao) {
    if (civilizacao != null) {
      civilizacao.atualizarExtinta();
      if (civilizacao.getExtinta()) {
        civilizacao.partida.removerCivilizacoesExtintas();
        System.out.println("A civilização inimiga foi extinta");
        checarSePartidaAcabou(civilizacao.partida);
      }
    } else {
      System.out.println("Civilizacao null");
    }
  }

  public static void checarSePartidaAcabou(Partida partida) {
    if (partida != null) {
      if (partida.getCivilizacoes().size() == 1) {
        System.out.println("Partida Acabou");
      }
    } else {
      System.out.println("Partida null");
    }
  }
  
  public int getAtaque() {
    return ataque;
  }

  private Ataque(int ataque) {
    this.ataque = ataque;
  }

}
