public class Player {

    private String name;

    public String askForRollAction(String actionDescription, Action action) {
        return DungeonMaster.getInstancia().rollAction(this.name, actionDescription, action);
    }

    public String describeAction(Action action) {
        return DungeonMaster.getInstancia().describeAction(this.name, action);
    }
}
