package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.web.rest.DataPick;
import com.mycompany.myapp.web.rest.GetData;
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

        userMetric("2022-07-20, 65, 765");
        userMetric("2022-07-21, 65, 665");
        userMetric("2022-07-22, 65, 725");
        userMetric("2022-07-23, 65, 715");
        userMetric("2022-07-27, 65, 843");
        userMetric("2022-08-20, 65, 436");
        userMetric("2022-09-20, 65, 356");
        userMetric("2022-10-20, 65, 555");
        userMetric("2022-12-20, 65, 666");
        userMetric("2023-02-20, 65, 761");
        userMetric("2022-06-20, 65, 565");
    }

    private void userMetricWeek(String order) {
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

    private void userMetricMonth(String order) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(getDate(order));

        List<String> datesList;
        if (dates.get(calendar.get(Calendar.MONTH_OF_YEAR)) != null) {
            datesList = dates.get(calendar.get(Calendar.MONTH_OF_YEAR));
        } else {
            datesList = new ArrayList<>();
        }
        datesList.add(order);

        dates.put(calendar.get(Calendar.WEEK_OF_YEAR), datesList);
    }

    private void userMetricQuarter(String order) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(getDate(order));

        List<String> datesList;
        if (dates.get(calendar.get(Calendar.MONTH_OF_YEAR)) != null) {
            datesList = dates.get(calendar.get(Calendar.MONTH_OF_YEAR));
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
