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

    //    public String getDate() {
    //        return Date;
    //    }
    //
    //    public int getYandex() {
    //        return Yandex;
    //    }
    //
    //    public int getMail() {
    //        return Mail;
    //    }
    //
    //    private String Date;
    //    private int Yandex;
    //    private int Mail;
    //
    //    public UserMetric(String Date, int Yandex, int Mail) {
    //        this.Date = Date;
    //        this.Yandex = Yandex;
    //        this.Mail = Mail;
    //    }

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

    private void userMetric(String order) {
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
//    public GetData() {
//        date = new HashMapMonth<>();
//
//        userMetricMonth("2022-07-20, 65, 765");
//        userMetricMonth("2022-07-21, 65, 665");
//        userMetricMonth("2022-07-22, 65, 725");
//        userMetricMonth("2022-07-23, 65, 715");
//        userMetricMonth("2022-07-27, 65, 843");
//        userMetricMonth("2022-08-20, 65, 436");
//        userMetricMonth("2022-09-20, 65, 356");
//        userMetricMonth("2022-10-20, 65, 555");
//        userMetricMonth("2022-12-20, 65, 666");
//        userMetricMonth("2023-02-20, 65, 761");
//        userMetricMonth("2022-06-20, 65, 565");
//    }
//
//    private void userMetricMonth(String orders) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(getDate(order));
//
//        List<String> dateList;
//        if (date.get(calendar.get(Calendar.MONTH_OF_YEAR)) != null) {
//            dateList = date.get(calendar.get(Calendar.MONTH_OF_YEAR));
//        } else {
//            dateList = new ArrayList<>();
//        }
//        dateList.add(orders);
//        date.put(calendar.get(Calendar.MONTH_OF_YEAR), datesList);
//    }
//
//    private Date getDateMonth(String date) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date convertedDateMonth = new Date();
//        try {
//            convertedDateMonth = dateFormat.parse(date);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        return convertedDateMonth;
//    }
//}
