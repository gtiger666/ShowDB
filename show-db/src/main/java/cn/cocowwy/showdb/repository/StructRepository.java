package cn.cocowwy.showdb.repository;

import cn.cocowwy.showdb.entities.po.TemplatePO;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 结构 Repository
 *
 * @author cocowwy.cn
 * @create 2022-01-01-15:02
 */
public interface StructRepository extends CrudRepository<TemplatePO, Void> {
    /**
     * 查询所有表名
     * @return
     */
    @Query("show tables")
    List<String> showAllTables();
}
