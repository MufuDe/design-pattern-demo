package com.stone.criteria;

import com.stone.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jeff
 * <p>
 * 单身标准
 */
public class CriteriaSingle implements Criteria {

    /**
     * 单身标准
     *
     * @param persons 待校验的人
     * @return 单身的人
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            // 筛选为 "SINGLE" 的人
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}