import React from 'react';
class State extends React.Component{
  constructor(props){
    super(props);
    this.state={
      header:"Header from State.....",
      content:'Content from State....'
    }
  }
  render(){
    return(
      <div>
        <h1>{this.state.header}</h1>
        <h2>{this.state.content}</h2>
      </div>
    );
  }
}
export default State;