package cn.cocowwy.showdb;

import cn.cocowwy.showdb.repository.StructRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

/**
 * @author cocowwy.cn
 * @create 2022-01-01-15:09
 */
@Component
public class Runnnner implements ApplicationRunner {
    @Autowired
    StructRepository structRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
    }
}
