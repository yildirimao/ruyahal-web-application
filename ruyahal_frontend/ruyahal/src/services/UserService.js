import axios from 'axios'

const http = axios.create({
    baseURL: "http://localhost:8080"
});

export default {

    createUser(user) {
        return http.post('/users', user)
    }

}
