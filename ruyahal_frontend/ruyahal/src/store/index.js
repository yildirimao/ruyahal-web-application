import Vue from 'vue'
import Vuex from 'vuex'
import InterpreterListService from '@/services/InterpreterService.js'
Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    interpreters: [],
    users: [],
  },
  getters: {
  },
  mutations: {
    LIST_INTERPRETERS(state){
      InterpreterListService.listInterpreters().then(response => {
        if (response.status === 200) {
          state.interpreters = response.data;
        }
      })
        .catch(error => {
          if (error.response) {
            console.log("response error");
          } else if (error.request) {
            console.log("request error");
          } else {
            console.log("other error");
          }
      })
    }
  },
  actions: {
  },
  modules: {
  }
})
