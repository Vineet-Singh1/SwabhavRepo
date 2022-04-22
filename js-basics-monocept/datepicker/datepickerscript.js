
const button = document.querySelector('#btn');

button.addEventListener('click', () => {
    const info = document.querySelector('#date').value;
    alert("Date selected: " + info);
});