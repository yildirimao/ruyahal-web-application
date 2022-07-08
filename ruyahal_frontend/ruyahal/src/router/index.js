import Vue from 'vue'
import VueRouter from 'vue-router'
import InterpreterListView from '@/views/InterpreterListView.vue'
import UserListView from '@/views/UserListView.vue'
Vue.use(VueRouter)

const routes = [
 
  // {
  //   path: '/about',
  //   name: 'about',
  //   // route level code-splitting
  //   // this generates a separate chunk (about.[hash].js) for this route
  //   // which is lazy-loaded when the route is visited.
  //   component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  // },
  {
    path: '/interpreters',
    name: 'interpreter-list',
    component: InterpreterListView,
  },
  {
    path: '/users',
    name: 'user-list',
    component: UserListView
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
