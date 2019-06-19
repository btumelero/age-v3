package ageV3;

/**
 *
 * @author Bruno
 */
public enum Custo {
  ARQUEIRO(new int[]{40, 0, 20}),
  CAMPONES(new int[]{50, 0, 0}),
  CAVALEIRO(new int[]{70, 0, 80}),
  ELEFANTE(new int[]{170, 0, 40}),
  FALANGE(new int[]{60, 0, 40}),
  GUERREIRO(new int[]{35, 0, 15}),
  SACERDOTE(new int[]{0, 0, 125}),
  
  CASA(new int[]{0, 30, 0}),
  CENTRODACIDADE(new int[]{0, 200, 0}),
  QUARTEL(new int[]{0, 125, 0}),
  TEMPLO(new int[]{0, 250, 0}),
  TORRE(new int[]{0, 70, 0});

  private final int[] custo;

  public int[] getCusto() {
    return this.custo;
  }

  public static boolean temRecursosSuficientesParaCriar(RecursosDaCivilizacao recursosDaCivilizacao, Custo custo) {
    if (recursosDaCivilizacao != null && custo != null) {
      Integer[] recursos = recursosDaCivilizacao.getRecursos();
      int[] custos = custo.getCusto();
      for (int i = 0; i < 3; i++) {
        if (recursos[i] < custos[i]) {
          System.out.println("Recursos insuficientes");
          return false;
        }
      }
      return true;
    }
    System.out.println("Recursos Da Civilização/Custo null");
    return false;
  }

  public static void descontarDosRecursos(RecursosDaCivilizacao recursosDaCivilizacao, Custo custo) {
    if (recursosDaCivilizacao != null && custo != null) {
      Integer[] recursos = recursosDaCivilizacao.getRecursos();
      int[] custos = custo.getCusto();
      for (int i = 0; i < 3; i++) {
        recursos[i] = recursos[i] - custos[i];
      }
    }
  }

  private Custo(int[] valor) {
    this.custo = valor;
  }
}
