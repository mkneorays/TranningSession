import React from 'react';

class Stateless extends React.Component{
  render(){
    return(
      <div>
        <Header/>
        <Content/>
      </div>
    );
  }
}
class Header extends React.Component{
  render(){
    return(
      <div>
        <h1>This is the Header class</h1>
      </div>
    );
  }
}
class Content extends React.Component{
  render(){
    return(
      <div>
        <h2>This is Content!!!</h2>
      </div>
    );
  }
}
export default Stateless;  //this is mandwetory