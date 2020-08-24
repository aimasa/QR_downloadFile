/*
 * This file is generated by jOOQ.
 */
package cn.aimasa.hetongfenglei.pojo.po.tables.daos;


import cn.aimasa.hetongfenglei.pojo.po.tables.User;
import cn.aimasa.hetongfenglei.pojo.po.tables.records.UserRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserDao extends DAOImpl<UserRecord, cn.aimasa.hetongfenglei.pojo.po.tables.pojos.User, Integer> {

    /**
     * Create a new UserDao without any configuration
     */
    public UserDao() {
        super(User.USER, cn.aimasa.hetongfenglei.pojo.po.tables.pojos.User.class);
    }

    /**
     * Create a new UserDao with an attached configuration
     */
    public UserDao(Configuration configuration) {
        super(User.USER, cn.aimasa.hetongfenglei.pojo.po.tables.pojos.User.class, configuration);
    }

    @Override
    public Integer getId(cn.aimasa.hetongfenglei.pojo.po.tables.pojos.User object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<cn.aimasa.hetongfenglei.pojo.po.tables.pojos.User> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(User.USER.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.aimasa.hetongfenglei.pojo.po.tables.pojos.User> fetchById(Integer... values) {
        return fetch(User.USER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.aimasa.hetongfenglei.pojo.po.tables.pojos.User fetchOneById(Integer value) {
        return fetchOne(User.USER.ID, value);
    }

    /**
     * Fetch records that have <code>user_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<cn.aimasa.hetongfenglei.pojo.po.tables.pojos.User> fetchRangeOfUserName(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(User.USER.USER_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>user_name IN (values)</code>
     */
    public List<cn.aimasa.hetongfenglei.pojo.po.tables.pojos.User> fetchByUserName(Integer... values) {
        return fetch(User.USER.USER_NAME, values);
    }
}