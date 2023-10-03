// import React, { useEffect, useState } from 'react';
// import logo from './logo.svg';
// import './App.css';

// function App() {
//   const [message, setMessage]=useState([]);
//   useEffect(()=>{
//     fetch("/article/hello")
//         .then((response)=>{
//           console.log("response : ", response);
//           return response.json();
//         })
//         .then((data)=>{
//             setMessage(data);
//         });
//   },[]);

//   return (
//     <div className="App">
//       <header className="App-header">
//         <img src={logo} className="App-logo" alt="logo" />
//         <p>
//           Data from Spring Boot Server: {message}
//         </p>
//       </header>
//     </div>
//   );
// }

// export default App;

import React, { useState, useEffect } from 'react';

function App() {
  const [message, setMessage] = useState("");


  useEffect(() => {
    fetch("/article/hello")
      .then((response) => {
        return response.json();
      })
      .then((data) => {
        console.log("/article/hello : ", data);
        setMessage(data.message);
      });
  }, []);


  return (
    <div>
      {message}
    </div>
  );
}

export default App;



