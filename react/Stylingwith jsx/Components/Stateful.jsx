import React from 'react';
class Statefull extends React.Component{
  constructor(){
    super();
    this.state={
      data:[
        {
          'name':'Mithilesh',
          'phone':'123456789',
          'email':'mk@gmail.com'
        },
        {
          'name':'Naveen',
          'phone':'1234789',
          'email':'nav@gmail.com'
        },
        {
          'name':'Swathi',
          'phone':'1234',
          'email':'swa@gmail.com'
        },
        {
          'name':'Chandan',
          'phone':'123456',
          'email':'chan@gmail.com'
        },
        {
          'name':'Nayana',
          'phone':'3456789',
          'email':'naya@gmail.com'
        }
      ]
    }
  }
  render(){
    return(
      <div>
        <Header/>
        <table>
          <tbody>
            {this.state.data.map((family,i)=>
            <TableRow key={i} data={family}/>)}
          </tbody>
        </table>
      </div>
    );
  }
}
class Header extends React.Component{
  render(){
    return(
      <div>
        <h1>This is Header class</h1>
      </div>
    );
  }
}
class TableRow extends React.Component{
  render(){
    return(
      <tr>
        <td>{this.props.data.name}</td>
        <td>{this.props.data.phone}</td>
        <td>{this.props.data.email}</td>
      </tr>
    );
  }
}
export default Statefull;   //this is mandetory for exporting another fiel