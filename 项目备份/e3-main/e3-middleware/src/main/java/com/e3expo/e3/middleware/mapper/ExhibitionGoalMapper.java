package com.e3expo.e3.middleware.mapper;

import com.e3expo.e3.model.ExhibitionGoal;

public interface ExhibitionGoalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic_exhibition_goal
     *
     * @mbggenerated Fri Nov 17 11:34:27 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic_exhibition_goal
     *
     * @mbggenerated Fri Nov 17 11:34:27 CST 2017
     */
    int insert(ExhibitionGoal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic_exhibition_goal
     *
     * @mbggenerated Fri Nov 17 11:34:27 CST 2017
     */
    int insertSelective(ExhibitionGoal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic_exhibition_goal
     *
     * @mbggenerated Fri Nov 17 11:34:27 CST 2017
     */
    ExhibitionGoal selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic_exhibition_goal
     *
     * @mbggenerated Fri Nov 17 11:34:27 CST 2017
     */
    int updateByPrimaryKeySelective(ExhibitionGoal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic_exhibition_goal
     *
     * @mbggenerated Fri Nov 17 11:34:27 CST 2017
     */
    int updateByPrimaryKey(ExhibitionGoal record);
}