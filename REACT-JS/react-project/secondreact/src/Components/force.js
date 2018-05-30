import React from 'react';

class ForceUpdate extends React.Component{
  constructor(){
    super();
    this.forceUpdateHandler=this.forceUpdateHandler.bind(this);
  };
  forceUpdateHandler(){
    this.forceUpdate();
  };
  render(){
    return(
      <div>
        <button onClick={this.forceUpdateHandler}>Force Update</button>
        <h3>Random number:{Math.random()}</h3>
      </div>
    );
  }
}
export default ForceUpdate;