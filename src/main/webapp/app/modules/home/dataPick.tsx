import React, { FC } from 'react';

import DatePicker from 'react-datepicker';
import 'react-datepicker/dist/react-datepicker.css';

interface Props {
  startDate: Date;
  pickStartDate: (date: Date) => void;
  endDate: Date;
  pickEndDate: (date: Date) => void;
}

export const TableDatePicker: FC<Props> = props => {
  return (
    <>
      <div style={{ marginBottom: 20 }}>
        <DatePicker
          selected={props.startDate}
          selectsStart
          startDate={props.startDate}
          endDate={props.endDate}
          onSelect={props.pickStartDate}
          dateFormat={'dd.MM.yy'}
          style={{ marginBottom: 20 }}
        />
      </div>
      <div>
        <DatePicker
          selected={props.endDate}
          selectsEnd
          startDate={props.startDate}
          endDate={props.endDate}
          minDate={props.startDate}
          onSelect={props.pickEndDate}
          dateFormat={'dd.MM.yy'}
        />
      </div>
    </>
  );
};

export default TableDatePicker;
