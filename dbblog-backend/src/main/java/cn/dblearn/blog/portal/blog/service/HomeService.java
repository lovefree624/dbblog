package cn.dblearn.blog.portal.blog.service;

import cn.dblearn.blog.common.pojo.Result;

/**
 * HomeService
 *
 * @author bobbi
 * @date 2018/11/07 20:37
 * @email 571002217@qq.com
 * @description
 */
public interface HomeService {
    /**
     * 获取首页数据
     * @return
     */
    Result listHomeData();
}