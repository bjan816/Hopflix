import axios from 'axios';

export default axios.create({
    baseURL: "https://hopflix.onrender.com", // Replace ngrok URL with localhost
    // timeout: 20000,
    headers: { "Content-Type": "application/json" } // Define the content type for requests
});

/*
baseURL:'https://9c96-103-106-239-104.ap.ngrok.io',
headers: {"ngrok-skip-browser-warning": "true"}
 */