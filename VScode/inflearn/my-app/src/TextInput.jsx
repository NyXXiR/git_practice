import { useRef } from "react";

function TextInput(props) {
  const inputElem = useRef(null);

  const onButtonClick = () => {
    inputElem.current.focus();
  };

  return (
    <div>
      <input ref={inputElem} type="text" />
      <button onClick={onButtonClick}>Focus the input</button>
    </div>
  );
}

export default TextInput;
