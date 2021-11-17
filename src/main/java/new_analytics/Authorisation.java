package new_analytics;

import db.Авторизація;

public class Authorisation extends Авторизація {
    public boolean authorise(Database db) {
        return авторизуватися(db);
    }
}
