public class AttackAction implements Action{

    private AttackAction() {}

    @Override
    public String rollAction(String enemy) {
        return "Ataque realizado com sucesso contra o oponente " + enemy + ".";
    }

    @Override
    public String getDescription() {
        return "Essa ação realiza um ataque contra o oponente.";
    }

    @Override
    public String toString() {
        return "Ataque";
    }
}
