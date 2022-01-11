package cn.cocowwy.showdb.entities.vo;

import lombok.Data;

import java.util.List;

/**
 * {@lingk cn.cocowwy.showdb.controller.ShowDBController#inintData}
 *
 * @author cocowwy.cn
 * @create 2022-01-01-16:02
 */
@Data
public class InitDataVO {
    /**
     * 数据库连接池
     */
    private String datasourceType;

    /**
     * 数据库连接用户
     */
    private String username;

    /**
     * 数据表
     */
    List<String> tables;
}
