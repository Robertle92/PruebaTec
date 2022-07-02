import { useState, useEffect } from 'react';
import React from'react';

/*function Picture(){
  return(
    <div className="App">
      <img src="https://i.picsum.photos/id/113/200/200.jpg?hmac=lMncqLZmsXtr3D92sy1GU_2v-kwHOS-UW2iS5p98WMU" />                                                                        
    </div>*/

function Clock(){
  const [date, setDate] = useState(new Date());
  
  function refreshClock() {
    setDate(new Date());
  }
  useEffect(() => {
    const timerId = setInterval(refreshClock, 1000);
    return function cleanup() {
      clearInterval(timerId);
    };
  }, []);
  return (
    <span>
      {date.toLocaleTimeString()}
    </span>
  );
}
export default Clock;


