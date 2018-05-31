import React from 'react';
import ReactDOM from 'react-dom';
import LifeCycleMethods from './Components/LifeCycleMethod'



ReactDOM.render(<LifeCycleMethods />, document.getElementById('root'));

 //this is for tym setting purpose automitacillay time gone
setTimeout(() => {
  ReactDOM.unmountComponentAtNode(document.getElementById('root'))},10000);