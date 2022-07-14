public class DungeonMaster {

    private static DungeonMaster instancia = new DungeonMaster();

    private DungeonMaster() {}

    public static DungeonMaster getInstancia() {
        return instancia;
    }

    public String rollAction(String name, String actiondescription, Action action) {
        return "O jogador " + name + "realiza a ação de " + action.toString() + ".\n" +
                ">>" + action.rollAction(actiondescription);
    }

    public String describeAction(String name, Action action) {
        return "Jogador " + name + ", segue abaixo a descrição da Ação " + action.toString() + ".\n" +
                ">>" + action.getDescription();
    }
}
