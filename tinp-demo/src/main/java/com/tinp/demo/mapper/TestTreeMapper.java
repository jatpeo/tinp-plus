package com.tinp.demo.mapper;

import com.tinp.common.annotation.DataColumn;
import com.tinp.common.annotation.DataPermission;
import com.tinp.common.core.mapper.BaseMapperPlus;
import com.tinp.demo.domain.TestTree;
import com.tinp.demo.domain.vo.TestTreeVo;

/**
 * 测试树表Mapper接口
 *
 * @author Lion Li
 * @date 2021-07-26
 */
@DataPermission({
    @DataColumn(key = "deptName", value = "dept_id"),
    @DataColumn(key = "userName", value = "user_id")
})
public interface TestTreeMapper extends BaseMapperPlus<TestTreeMapper, TestTree, TestTreeVo> {

}
