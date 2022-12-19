import './home.scss';

import TableDatePicker from 'app/modules/home/dataPick';
import React from 'react';
import { Row, Col } from 'reactstrap';
import Graf1 from 'app/modules/home/Graf1';

export const Home = () => {
  return (
    <Row>
      <Col>
        <TableDatePicker />
      </Col>
      <Col>
        <Graf1 />
      </Col>
    </Row>
  );
};

export default Home;
