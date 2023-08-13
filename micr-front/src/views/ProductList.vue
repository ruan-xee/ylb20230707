<template>
  <div>
    <Header/>
    <div class="content clearfix">
      <!--排行榜-->
      <ul class="rank-list">
        <li v-for="(item, index) in rank" :key="item.phone">
          <img src="@/assets/image/list-rank1.png" v-if="index === 0">
          <img src="@/assets/image/list-rank2.png" v-else-if="index === 1">
          <img src="@/assets/image/list-rank3.png" v-else>
          <p class="rank-list-phone">{{ item.phone }}</p>
          <span>{{ item.money }}元</span>
        </li>
      </ul>
      <!--产品列表-->
      <ul class="preferred-select clearfix">
        <li v-for="(item,index) in productInfo">
          <h3 class="preferred-select-title">
            <span>{{ item.productName }}</span>
            <img src="@/assets/image/1-bg1.jpg" v-if="index%3 === 0">
            <img src="@/assets/image/1-bg2.jpg" v-else-if="index%3 === 1">
            <img src="@/assets/image/1-bg3.jpg" v-else>
          </h3>
          <div class="preferred-select-number">
            <p><b>{{ item.rate }}</b>%</p>
            <span>历史年化收益率</span>
          </div>
          <div class="preferred-select-date">
            <div>
              <span>投资周期</span>
              <p><b>{{ item.cycle }}</b>个月</p>
            </div>
            <div>
              <span>余利可投资金额</span>
              <p><b>{{ item.leftProductMoney }}</b>元</p>
            </div>
          </div>
          <p class="preferred-select-txt">
            {{ item.productDesc }}
          </p>
          <a href="javascript:;" target="_blank" class="preferred-select-btn">立即投资</a>
        </li>
      </ul>

      <!--分页-->
      <div class="page_box">
        <ul class="pagination">
          <li><a href="javascript:void(0)" @click="getPage(1, 9)">首页</a></li>
          <li v-if="page.pageNum !== 1"><a href="javascript:void(0)" @click="getPage(page.pageNum-1, 9)">上一页</a></li>
          <li class="active"><span>{{ page.pageNum }}</span></li>
          <li v-if="page.pageNum !== page.totalPage"><a href="javascript:void(0)" @click="getPage(page.pageNum+1, 9)">下一页</a></li>
          <li><a href="javascript:void(0)" @click="getPage(page.totalPage, 9)">尾页</a></li>
          <li class="totalPages"><span>共{{ page.totalPage }}页</span></li>
        </ul>
      </div>

    </div>
    <Footer/>
  </div>
</template>

<script>
import Header from "@/components/common/Header";
import Footer from "@/components/common/Footer";
import {doGet} from "@/api/httpRequest";
export default {
  name: "ProductList",
  components: {
    Header, Footer,
  },
  data () {
    return {
      rank: [{
        phone: '',
        money: 0.00,
      }],
      productInfo: [{
        id: 0,
        productName: '',
        rate: 0,
        cycle: 0,
        releaseTime: 0,
        productType: 0,
        productNo: '',
        productMoney: 0.00,
        leftProductMoney: 0.00,
        bidMinLimit: 0,
        bidMaxLimit: 0,
        productStatus: 0,
        productFullTime: 0,
        productDesc: ''
      }],
      page: {
        pageNum: 0,
        pageSize:0,
        totalPage:0,
        totalRecord:0
      },
    }
  },
  mounted () {
    this.initPage()
  },
  methods: {
    initPage () {
      this.getRank()
      this.getPage(1, 9)
    },
    getRank () {
      doGet('/v1/invest/rank').then(data => {
        if (data.data.code === 200) {
          this.rank = data.data.list
        }
      })
    },
    getPage (pageNum, pageSize) {
      if (pageNum === this.page.pageNum) {
        return
      }
      doGet('/v1/product/list', {pType: this.$route.query.pType, pageNum, pageSize}).then(data => {
        if (data.data.code === 200) {
          this.productInfo = data.data.list
          this.page = data.data.page
        }
      })
    }
  }
}
</script>

<style scoped>

</style>
