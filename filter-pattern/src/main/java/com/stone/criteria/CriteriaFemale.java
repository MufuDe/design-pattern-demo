package com.stone.criteria;

import com.stone.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jeff
 * <p>
 * 女性标准
 */
public class CriteriaFemale implements Criteria {

    /**
     * 校验女性方法
     *
     * @param persons 待校验的人
     * @return 返回女性
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            // 校验为 "FEMALE" 的人
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}