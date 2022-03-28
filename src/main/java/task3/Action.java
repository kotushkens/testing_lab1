package task3;

public class Action {
    private Gerund gerund;
    private final String action;
    private final Thing object;
    private Thing subject;

    public Action(String action, Thing object) {
        this.action = action;
        this.object = object;
    }

    public void changeAlive (boolean who, boolean alive){
        if (who && subject == null) throw new AliveException(true);
        (who ? subject : object).setAlive(alive);
    }

    public void changeCondition (boolean who, String condition) throws AliveException {
        if (who && subject == null) throw new AliveException(true);
        (who ? subject : object).setCondition(condition);
    }

    public String getObject() {
        return object.getName();
    }

    public String getAction() {
        return action;
    }

    public Gerund getGerund() {
        return gerund;
    }

    public void setGerund(Gerund gerund) {
        this.gerund = gerund;
    }

    public String getSubject() {
        return subject.getName();
    }

    public void setSubject(Thing subject) {
        this.subject = subject;
    }
}
