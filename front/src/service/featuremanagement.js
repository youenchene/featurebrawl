import axios from 'axios';


export default {
  getAllFeatures() {
    return new Promise((resolve, reject) => {
      axios.get('/api/feature')
        .then((response) => {
          console.log(response);
          resolve(response.data);
        })
        .catch((error) => {
          console.log(error);
          reject(error);
        });
    });
  },
  addFeature(feature) {
    return new Promise((resolve, reject) => {
      axios.post('/api/feature', feature)
        .then((response) => {
          resolve(response.data);
        })
        .catch((error) => {
          console.log(error);
          reject(error);
        });
    });
  },
};
