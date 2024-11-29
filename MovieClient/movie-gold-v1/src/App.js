import './App.css';
import api from './api/axiosConfig';
import { useState, useEffect } from 'react';
import Layout from './components/Layout';
import { Routes, Route } from 'react-router-dom';

function App() {

  const [movies, setMovies] = useState();

  const getMovies = async() => {

    try {

      const response = await api.get("/api/v1/movies");
      
      setMovies(response.data);

    } catch (err) {
      console.log(err);
    }

  }

  useEffect(() => {
    getMovies();
  }, [])

  return (
    <div className="App">
      
      <Route>
        <Route path='/' element={Layout}>

        </Route>
      </Route>

    </div>
  );
}

export default App;
