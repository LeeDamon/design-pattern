package com.lg.pattern.Template.dao;

import com.lg.pattern.Template.JdbcTemplate;
import com.lg.pattern.Template.RowMapper;
import com.lg.pattern.Template.entity.Member;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MemberDao{
    //为什么不继承，主要是为了解耦
    private JdbcTemplate JdbcTemplate = new JdbcTemplate(null);

    public List<?> query() throws Exception {
        String sql="select * from t_member ";
        return JdbcTemplate.executeQuery(sql,new RowMapper<Member>(){
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));
                return member;
            }
        },null);
    }

}
