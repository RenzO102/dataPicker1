import './home.scss';
import TableDatePicker from 'app/modules/home/dataPick';
import React, { useState } from 'react';
import { Row, Col } from 'reactstrap';
import Graf1 from 'app/modules/home/Graf1';

export const Home = () => {
  const [startDate, setStartDate] = useState(new Date());
  const [endDate, setEndDate] = useState(new Date());
  return (
    <Row>
      <Col>
        <TableDatePicker startDate={startDate} endDate={endDate} pickStartDate={setStartDate} pickEndDate={setEndDate} />
      </Col>
      <Col>
        <Graf1 startDate={startDate} endDate={endDate} />
      </Col>
    </Row>
  );
};

export default Home;
