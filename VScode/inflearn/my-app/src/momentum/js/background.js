const images = ["0.jpg", "1.jpg", "2.jpg"];

const chosenImage = images[Math.floor(Math.random() * images.length)];
const bgImage = document.createElement("img");
//img 외에도 div 등 다양한 html 태그 엘리먼트를 생성할 수 있음.

bgImage.src = `img/${chosenImage}`;

document.body.appendChild(bgImage);
