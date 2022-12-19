import React from 'react';
import { BarChart, Bar, Cell, XAxis, YAxis, CartesianGrid, Tooltip, Legend, ResponsiveContainer } from 'recharts';

const data = [
  {
    date: '11/01/2023',
    uv: 4000,
    pv: 2400,
    amt: 2400,
  },
  {
    date: '11/11/2023',
    uv: 30,
    pv: 1398,
    amt: 2210,
  },
  {
    date: '11/02/2023',
    uv: 2000,
    pv: 9800,
    amt: 2290,
  },
  {
    date: '11/03/2023',
    uv: 2780,
    pv: 3908,
    amt: 2000,
  },
  {
    date: '11/04/2023',
    uv: 1890,
    pv: 4800,
    amt: 2181,
  },
  {
    date: '11/05/2023',
    uv: 2390,
    pv: 3800,
    amt: 2500,
  },
  {
    date: '11/06/2023',
    uv: 3490,
    pv: 4300,
    amt: 2100,
  },
];

export const Graf1 = () => {
  return (
    <BarChart
      width={500}
      height={300}
      data={data}
      margin={{
        top: 20,
        right: 30,
        left: 20,
        bottom: 5,
      }}
    >
      <CartesianGrid strokeDasharray="3 3" />
      <XAxis dataKey="date" />
      <YAxis yAxisId="left" orientation="left" stroke="#8884d8" />
      <YAxis yAxisId="right" orientation="right" stroke="#82ca9d" />
      <Tooltip />
      <Legend />
      <Bar yAxisId="left" dataKey="pv" fill="#8884d8" />
      <Bar yAxisId="right" dataKey="uv" fill="#82ca9d" />
    </BarChart>
  );
};

export default Graf1;
