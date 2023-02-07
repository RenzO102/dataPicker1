package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.web.rest.DataPick;
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
    private DataPick dataPick;

    @GetMapping("userMetric")
    public DataPick dataPick() {
        return dataPick;
    }
    //    @GetMapping("userMetricMonth")
    //    public DataPick dataPicka() {
    //        return dataPick;
    //    }
}
