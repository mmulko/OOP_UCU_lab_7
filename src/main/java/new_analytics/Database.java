package new_analytics;

import db.БазаДаних;

public class Database extends БазаДаних {
    public String getUserData() {
        return отриматиДаніКористувача();
    }

    public String getStatisticsData() {
        return отриматиСтатистичніДані();
    }
}
