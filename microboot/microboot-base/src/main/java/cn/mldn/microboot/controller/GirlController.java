package cn.mldn.microboot.controller;

import cn.mldn.microboot.entity.GirlTable;
import cn.mldn.microboot.repository.GirlRepository;
import cn.mldn.microboot.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Created by Administrator on 2018\4\19 0019.
 */
@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;

    @GetMapping(value = "/girls")
    public List<GirlTable> girlTableList() {
        return girlRepository.findAll();
    }

    @PostMapping(value = "/girls")
    public GirlTable addGirl(@RequestParam("cupSize") String cupSize,
                             @RequestParam("age") Integer age) {
        GirlTable girlTable = new GirlTable();
        girlTable.setCupSize(cupSize);
        girlTable.setAge(age);
        return girlRepository.save(girlTable);
    }

    @GetMapping(value = "/girls/{id}")
    public GirlTable findOneGirl(@PathVariable("id") Integer id) {
        return girlRepository.findOne(id);
    }

    @PutMapping(value = "/girls/{id}")
    public GirlTable upGirl(@PathVariable("id") Integer id,
                            @RequestParam("cupSize") String cupSize,
                            @RequestParam("age") Integer age) {
        GirlTable girlTable = new GirlTable();
        girlTable.setId(id);
        girlTable.setCupSize(cupSize);
        girlTable.setAge(age);
        return girlRepository.save(girlTable);
    }

    @DeleteMapping(value = "/girls/{id}")
    public void delGirl(@PathVariable("id") Integer id) {
        girlRepository.delete(id);
    }

    @GetMapping(value = "/girls/age/{age}")
    public List<GirlTable> findGirlsByAge(@PathVariable("age") Integer age) {
        return girlRepository.findGirlsByAge(age);
    }

    @GetMapping(value = "/girls/two")
    public void girlsTwo() {
        girlService.addTwo();
    }
}
