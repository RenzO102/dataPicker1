package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.web.rest.DataPick;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataPick {

    private Map<Integer, List<String>> dates;

    public DataPick() {
        dates = new HashMap<>();
    }

    private void putDataInCollection(String order) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(getDate(order));

        List<String> datesList;
        if (dates.get(calendar.get(Calendar.WEEK_OF_YEAR)) != null) {
            datesList = dates.get(calendar.get(Calendar.WEEK_OF_YEAR));
        } else {
            datesList = new ArrayList<>();
        }
        datesList.add(order);

        dates.put(calendar.get(Calendar.WEEK_OF_YEAR), datesList);
    }

    private Date getDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date convertedDate = new Date();
        try {
            convertedDate = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return convertedDate;
    }
}
