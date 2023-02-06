//package com.mycompany.myapp.web.rest;
//
//import com.mycompany.myapp.web.rest.NameDate;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import com.mycompany.myapp.web.rest.UserMetric;
//import org.springframework.stereotype.Component;
//
//private Map<Integer, List<String>> date;
//
//public GetData () {
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
//        }
//
//private void userMetricMonth(String orders) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(getDate(order));
//
//        List<String> dateList;
//        if (date.get(calendar.get(Calendar.MONTH_OF_YEAR)) != null) {
//        dateList = date.get(calendar.get(Calendar.MONTH_OF_YEAR));
//        } else {
//        dateList = new ArrayList<>();
//        }
//        dateList.add(orders);
//        date.put(calendar.get(Calendar.MONTH_OF_YEAR), datesList);
//        }
//
//private Date getDateMonth(String date) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date convertedDateMonth = new Date();
//        try {
//        convertedDateMonth = dateFormat.parse(date);
//        } catch (ParseException e) {
//        e.printStackTrace();
//        }
//        return convertedDateMonth;
//        }
//        }
