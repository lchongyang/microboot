package cn.mldn.microboot.repository;

import cn.mldn.microboot.entity.GirlTable;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * Created by Administrator on 2018\4\19 0019.
 */
public interface GirlRepository extends JpaRepository<GirlTable, Integer>{

    List<GirlTable> findGirlsByAge(Integer age);

}
