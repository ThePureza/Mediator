import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    void deveElogiarSecretaria() {
        Player player = new Player("Marco");
        AttackAction action = new AttackAction();
        assertEquals("O jogador Marco realiza a ação de Ataque.\n" +
                        ">>Ataque realizado com sucesso contra o oponente Aaron.",
                player.askForRollAction("Aaron", action));
    }

    @Test
    void deveReclamarSecretaria() {
        Player player = new Player("Marco");
        AttackAction action = new AttackAction();
        assertEquals("Jogador Marco, segue abaixo a descrição da Ação Ataque.\n" +
                        ">>Essa ação realiza um ataque contra o oponente.",
                player.describeAction(action));
    }
}
