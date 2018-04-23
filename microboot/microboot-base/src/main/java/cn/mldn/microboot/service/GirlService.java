package cn.mldn.microboot.service;

import cn.mldn.microboot.entity.GirlTable;
import cn.mldn.microboot.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2018\4\19 0019.
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void addTwo() {
        GirlTable girlA = new GirlTable();
        girlA.setAge(18);
        girlA.setCupSize("A");
        girlRepository.save(girlA);

        GirlTable girlB = new GirlTable();
        girlB.setAge(19);
        girlB.setCupSize("B");
        girlRepository.save(girlB);
    }
}
