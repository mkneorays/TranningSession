import React from 'react';
class DefaultProps extends React.Component{
  render(){
    return(
      <div>
        <h1>{this.props.headerProp}</h1>
        <h2>{this.props.contentProp}</h2>
      </div>
    );
  }
}
DefaultProps.defaultProps={
  headerProp:'Header from DefaultProps',
  contentProp:'Content from DefaultProps'
}
export default DefaultProps;