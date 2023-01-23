package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.web.rest.Bobla;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class GetData {

    private static List<Bobla> bobla;

    {
        bobla = new ArrayList();
        bobla.add(new Bobla("2022.07.20", 65, 765));
        bobla.add(new Bobla("2022.07.21", 65, 665));
        bobla.add(new Bobla("2022.07.22", 65, 725));
        bobla.add(new Bobla("2022.07.23", 65, 715));
        bobla.add(new Bobla("2022.07.27", 65, 843));
        bobla.add(new Bobla("2022.08.20", 65, 436));
        bobla.add(new Bobla("2022.09.20", 65, 356));
        bobla.add(new Bobla("2022.10.20", 65, 555));
        bobla.add(new Bobla("2022.12.20", 65, 666));
        bobla.add(new Bobla("2023.02.20", 65, 761));
        bobla.add(new Bobla("2022.06.20", 65, 565));
    }

    public List list() {
        return bobla;
    }
}
