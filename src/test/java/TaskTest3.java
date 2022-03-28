import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import task3.*;

public class TaskTest3 {
    @Test
    public void testAlive() {
        final Person Arthur = new Person("Артур");
        Action lie = new Action("лежал", Arthur);
        lie.setGerund(new Gerund("как труп"));
        try {
            lie.changeAlive(false, false);
        } catch (AliveException ignored) {
        }

        assertFalse(Arthur.isAlive());
    }

    @Test
    public void testAliveFalseStatement() {
        final Person Arthur = new Person("Артур");
        Action lie = new Action("лежал", Arthur);
        lie.setGerund(new Gerund("как труп"));
        try {
            lie.changeAlive(true, false);
        } catch (AliveException ignored) {
        }

        assertFalse(Arthur.isAlive());
    }

    @Test
    public void testCondition() {
        final SomeThing door = new SomeThing("Дверь");
        final Person Ford = new Person("Форд");
        final Person Zaphod = new Person("Зафод");
        Ford.addFriend(Zaphod);
        Zaphod.addFriend(Ford);

        Action hold = new Action("открыть", Ford);
        hold.setSubject(door);

        assertEquals(hold.getObject(), Zaphod.getName());
        assertEquals(hold.getSubject(), door.getName());
    }
}
