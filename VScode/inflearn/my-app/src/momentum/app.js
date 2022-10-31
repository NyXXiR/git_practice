const h1 = document.querySelector(".hello h1"); // css 셀렉터를 가져오는 방법

console.log(h1);

function handleTitleClick() {
  const currentColor = h1.style.color;
  let newColor;

  if (currentColor === "blue") {
    newColor = "tomato";
    count = 0;
    console.log(count);
  } else {
    newColor = "blue";
  }
  h1.style.color = newColor;
}
h1.addEventListener("click", handleTitleClick);
