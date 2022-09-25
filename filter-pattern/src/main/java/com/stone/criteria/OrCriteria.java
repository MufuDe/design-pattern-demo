package com.stone.criteria;

import com.stone.entity.Person;

import java.util.List;

/**
 * @author Jeff
 * <p>
 * 或标准
 */
public class OrCriteria implements Criteria {

    /**
     * 一个标准
     */
    private Criteria criteria;

    /**
     * 另一个标准
     */
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for (Person person : otherCriteriaItems) {
            if (!firstCriteriaItems.contains(person)) {
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}