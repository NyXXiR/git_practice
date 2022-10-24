import React, { useState } from "react";
import { useEffect } from "react";

function Counter(props) {
  const [count, setCount] = useState(0);

  useEffect(() => {
    if (count == 0) {
      document.title = `아직 클릭하지 않았습니다.`;
    } else {
      document.title = `You clicked ${count} times`;
    }
  });

  return (
    <div>
      <p>총 {count}번 클릭했습니다.</p>
      <button onClick={() => setCount(count + 1)}>클릭</button>
    </div>
  );
}

export default Counter;

// useState는 함수, 셋함수, 초기값
// useEffect는 useEffect(함수, 의존성 배열), 배열 내부의 원소가 바뀌면 실행됨
// 빈 배열을 넣으면 한 번만 실행된다(바뀔 원소가 없으므로), 아예 배열을 넣지 않으면 매번 호출된다.
