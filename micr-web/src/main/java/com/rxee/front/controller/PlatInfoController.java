package com.rxee.front.controller;

import com.rxee.api.dto.BaseInfoDto;
import com.rxee.front.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "平台信息功能")
@RestController
@RequestMapping("/v1/plat")
public class PlatInfoController extends BaseController {

    @ApiOperation(value = "平台三项基本信息", notes = "注册人数、平均利率、总投资金额")
    @GetMapping("/info")
    public ResultVo queryPlatBaseInfo() {
        BaseInfoDto baseInfo = platBaseInfoService.queryPlatBaseInfo();

        ResultVo resultVo = new ResultVo();
        resultVo.setCode(200);
        resultVo.setData(baseInfo);
        resultVo.setMsg("查询成功！");
        return resultVo;
    }
}
