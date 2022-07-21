public class Player {

    private String name;

    public Player (String name){
        this.name = name;
    }

    public String askForRollAction(String enemy, Action action) {
        return DungeonMaster.getInstancia().rollAction(this.name, enemy, action);
    }

    public String describeAction(Action action) {
        return DungeonMaster.getInstancia().describeAction(this.name, action);
    }
}
