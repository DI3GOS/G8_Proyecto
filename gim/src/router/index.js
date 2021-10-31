import Vue from 'vue'
import VueRouter from 'vue-router'
import Cliente from '../views/Cliente.vue'
Vue.use(VueRouter)

const routes = [
  {
    path: '/cliente',
    name: 'Cliente',
    component: Cliente
  }
]

const router = new VueRouter({
  routes
})

export default router
