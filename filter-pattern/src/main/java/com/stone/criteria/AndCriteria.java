package com.stone.criteria;

import com.stone.entity.Person;

import java.util.List;

/**
 * @author Jeff
 * <p>
 * 合并标准，同时满足
 */
public class AndCriteria implements Criteria {

    /**
     * 首标准
     */
    private Criteria criteria;

    /**
     * 次标准
     */
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}