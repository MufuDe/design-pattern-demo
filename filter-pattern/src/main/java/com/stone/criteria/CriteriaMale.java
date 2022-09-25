package com.stone.criteria;

import com.stone.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jeff
 * <p>
 * 标准男性
 */
public class CriteriaMale implements Criteria {

    /**
     * 校验是否为男性
     *
     * @param persons 待校验的人
     * @return 返回男性
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            // 添加性别为 "MALE" 的人
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}