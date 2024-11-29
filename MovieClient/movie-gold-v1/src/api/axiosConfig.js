import axios from 'axios';

export default axios.create({
    baseURL: "http://localhost:8080", // Replace ngrok URL with localhost
    timeout: 20000, // Optional: set a timeout for requests
    headers: { "Content-Type": "application/json" } // Define the content type for requests
});

/*
baseURL:'https://9c96-103-106-239-104.ap.ngrok.io',
headers: {"ngrok-skip-browser-warning": "true"}
 */