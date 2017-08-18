/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     com.smartparking.project
 *
 *    Filename:    MyBeanUtils.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *    Copyright:   Copyright (c) 2001-2014
 *
 *    Company:     Digital Telemedia Co.,Ltd
 *
 *    @author:     FeicusSmith
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年7月21日 下午4:01:45
 *
 *    Revision:
 *
 *    2017年7月21日 下午4:01:45
 *        - first revision
 *
 *****************************************************************/
package com.smartparking.project;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

/**
 * @ClassName MyBeanUtils
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author FeicusSmith
 * @Date 2017年7月21日 下午4:01:45
 * @version 1.0.0
 */
public class MyBeanUtils {
    
    public static <T> T  transMap2Bean(Map<String, Object> map, T t){
        try {
            BeanUtils.populate(t, map);
            return t;
        }catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("transMap2BeanError---->"+e.getMessage());
        }
        return null;
      
  
    }

}
