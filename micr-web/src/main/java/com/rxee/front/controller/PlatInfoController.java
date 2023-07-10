package com.rxee.front.controller;

import com.rxee.api.dto.BaseInfo;
import com.rxee.front.vo.ResultVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class PlatInfoController extends BaseController {

    @GetMapping("/plat/info")
    public ResultVo queryPlatBaseInfo(){
        BaseInfo baseInfo = platBaseInfoService.queryPlatBaseInfo();

        ResultVo resultVo = new ResultVo();
        resultVo.setCode(200);
        resultVo.setData(baseInfo);
        resultVo.setMsg("查询成功！");
        return resultVo;
    }
}
