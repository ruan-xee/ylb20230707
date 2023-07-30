package com.rxee.front.controller;

import com.rxee.common.constant.RedisKey;
import com.rxee.common.util.CommonUtil;
import com.rxee.front.vo.RankVo;
import com.rxee.front.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@CrossOrigin
@Api(tags = "投资功能")
@RestController
@RequestMapping("/v1/invest")
public class InvestController extends BaseController {

    @ApiOperation(value = "获取投资排行榜", notes = "根据投资总金额，获取前三名投资者手机号及金额")
    @GetMapping("/rank")
    public ResultVo showInvestRank() {
        // 从redis查询数据
        Set<ZSetOperations.TypedTuple<String>> sets =
                stringRedisTemplate.boundZSetOps(RedisKey.KEY_INVEST_RANK).reverseRangeWithScores(0, 2);
        List<RankVo> list = new ArrayList<>();
        sets.forEach(tuple -> {
            RankVo rankVo = new RankVo();
            rankVo.setPhone(CommonUtil.phoneNumDesensitization(tuple.getValue()));
            rankVo.setMoney(BigDecimal.valueOf(tuple.getScore()));
            list.add(rankVo);
        });
        ResultVo resultVo = ResultVo.success();
        resultVo.setList(list);
        return resultVo;
    }
}
