package com.stone.criteria;

import com.stone.entity.Person;

import java.util.List;

/**
 * @author Jeff
 * <p>
 * 标准
 */
public interface Criteria {

    /**
     * 校验标准
     *
     * @param persons 待校验的人
     * @return 返回符合的人
     */
    public List<Person> meetCriteria(List<Person> persons);
}
