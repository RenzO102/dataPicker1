package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.web.rest.UserMetric;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class GetData {

    private static List<UserMetric> userMetric;

    {
        userMetric = new ArrayList();
        userMetric.add(new UserMetric("2022-07-20", 65, 765));
        userMetric.add(new UserMetric("2022-07-21", 65, 665));
        userMetric.add(new UserMetric("2022-07-22", 65, 725));
        userMetric.add(new UserMetric("2022-07-23", 65, 715));
        userMetric.add(new UserMetric("2022-07-27", 65, 843));
        userMetric.add(new UserMetric("2022-08-20", 65, 436));
        userMetric.add(new UserMetric("2022-09-20", 65, 356));
        userMetric.add(new UserMetric("2022-10-20", 65, 555));
        userMetric.add(new UserMetric("2022-12-20", 65, 666));
        userMetric.add(new UserMetric("2023-02-20", 65, 761));
        userMetric.add(new UserMetric("2022-06-20", 65, 565));
    }

    public List list() {
        return userMetric;
    }
}
