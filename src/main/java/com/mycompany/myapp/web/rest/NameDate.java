package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.web.rest.DataPick;
import com.mycompany.myapp.web.rest.GetData;
import com.mycompany.myapp.web.rest.UserMetric;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameDate {

    @Autowired
    private GetData getData;

    @GetMapping("/userMetric/{period}")
    public List getUserMetric(@PathVariable String period) {
        switch (period) {
            case "week":
                return getData.list();
            case "month":
                return getData.list();
            case "quarter":
                return getData.list();
        }
        return getData.list();
    }
}
