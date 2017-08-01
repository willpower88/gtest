# gtest
一、执行本项目：
===================================  
    1、创建mysql数据库gtest
    2、执行src/main/resources/gtest.sql
    3、idea->view->tool windows->Gradle 刷新gradle,下载jar包
    4、idea->run->Edit configurations 点+配置tomcat(先安装好），再点tomcat配置下的Deployment + Artifact,选择 com.powersoft.gtest : gtest-1.0-SNAPSHOT.war,执行tomcat即可
    5、执行UT，src/test/java/com/powersoft/gtest/service/UserServiceTest

二、项目计划
===================================  
    1、本项目基于idea+gradle整合spring+mybatis
    2、一期实现mybatis自动生成model及mapper、实现UserService并实现UT
    3、二期实现Controller及页面展示


