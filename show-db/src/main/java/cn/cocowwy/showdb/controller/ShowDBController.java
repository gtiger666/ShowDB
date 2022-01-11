package cn.cocowwy.showdb.controller;

import cn.cocowwy.showdb.entities.vo.InitDataVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DB结构查询相关
 *
 * @author cocowwy.cn
 * @create 2022-01-01-14:49
 */
@RestController
@Slf4j
public class ShowDBController {

    /**
     * 获取首页初始化数据信息
     */
    @GetMapping("/initData")
    public InitDataVO inintData() {
        return null;
    }

}
