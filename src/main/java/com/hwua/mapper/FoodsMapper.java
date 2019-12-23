package com.hwua.mapper;



import com.hwua.domain.Foods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface FoodsMapper {
    @Select("select * from foods where id=#{id}")
    Foods getFoodsById(Integer id);
}
