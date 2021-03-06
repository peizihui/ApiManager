package cn.crap.dao.mybatis;

import cn.crap.model.Comment;
import cn.crap.model.CommentCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentDao extends BaseDao<Comment>{
    int countByExample(CommentCriteria example);

    int deleteByExample(CommentCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExample(CommentCriteria example);

    Comment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentCriteria example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentCriteria example);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}