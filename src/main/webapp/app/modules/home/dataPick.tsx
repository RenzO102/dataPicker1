import React, { useState } from 'react';

import DatePicker from 'react-datepicker';
import 'react-datepicker/dist/react-datepicker.css';

function TableDatePicker() {
  const [startDate, setStartDate] = useState(new Date());
  const [endDate, setEndDate] = useState(new Date());
  console.log(startDate);
  console.log(endDate);

  return (
    <div style={{ margin: 20 }}>
      <DatePicker selected={startDate} selectsStart startDate={startDate} endDate={endDate} onChange={date => setStartDate(date)} />

      <DatePicker
        selected={endDate}
        selectsEnd
        startDate={startDate}
        endDate={endDate}
        minDate={startDate}
        onChange={date => setEndDate(date)}
      />
    </div>
  );
}

export default TableDatePicker;
