import axios from "axios";

axios.defaults.baseURL = 'http://localhost:8000/api'
axios.defaults.timeout = 50000

// 封装请求方法
function doGet (url, params) {
    return axios ({
        url: url,
        method: 'GET',
        params: params
    })
}


function doPostJson (url, params) {
    return axios ({
        url: url,
        method: 'POST',
        data: params
    })
}

export { doGet, doPostJson }