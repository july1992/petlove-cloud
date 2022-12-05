package com.petlove.account;

import com.alibaba.fastjson.JSON;
import com.petlove.account.entity.PPetDO;
import com.petlove.account.entity.PUserDO;
import org.apache.commons.compress.utils.Lists;
import top.tangyh.lamp.model.enumeration.Sex;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Description:
 * Author:vily
 * Date: 2022/12/3
 */
public class VilyTest {

    public static void main(String[] args) {
        PUserDO pUserDO=new PUserDO();
        pUserDO.setId(1L);
        pUserDO.setName("韩晓");
        pUserDO.setSex(Sex.M);

        PUserDO pUserDO2=new PUserDO();
        pUserDO2.setId(2L);
        pUserDO2.setName("胜楠");
        pUserDO2.setSex(Sex.W);

        List<PUserDO> list= Lists.newArrayList();
        list.add(pUserDO2);
        list.add(pUserDO);
        List<Object> collect = list.stream().
                flatMap(new Function<PUserDO, Stream<?>>() {
                    @Override
                    public Stream<?> apply(PUserDO routeDefinition) {
                        return swiger(routeDefinition);
                    }
                }).filter(new Predicate<Object>() {
                    @Override
                    public boolean test(Object o) {
                        return Objects.nonNull(o);
                    }
                }).collect(Collectors.toList());

        System.out.println(collect.toString());
    }

    private static Stream<PPetDO> swiger(PUserDO pUserDO) {
        PPetDO pPetDO=new PPetDO();
        pPetDO.setCustomId(pUserDO.getId());
        int v = (int) (Math.random() * 100);
        pPetDO.setName("兔宝宝"+v);

        List<PPetDO> list=Lists.newArrayList();
        list.add(pPetDO);


        return list.stream();
    }
}
