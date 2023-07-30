import {createRouter, createWebHistory} from 'vue-router'
import IndexView from "@/views/IndexView"

const routes = [
  {
    path: '/',
    name: 'IndexView',
    component: IndexView
  },
  {
    path: '/page/product/list',
    name: 'productList',
    component: () => import('../views/ProductList')
  },
  {
    path: '/page/product/detail',
    name: 'productDetail',
    component: () => import('../views/ProductDetail')
  },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
