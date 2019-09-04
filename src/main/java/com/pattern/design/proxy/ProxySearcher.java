package com.pattern.design.proxy;

/**
 * @Description 代理类，作用类似AOP
 * @Author yuki
 * @Date 2019/4/18 11:12
 * @Version 1.0
 **/
public class ProxySearcher implements ISearcher {
    private RealSearcher realSearcher=new RealSearcher();
    private AccessValidator accessValidator=new AccessValidator();
    private Logger logger=new Logger();
    @Override
    public String doSearch(String userId) {
        if (accessValidator.validate(userId)){
            realSearcher.doSearch(userId);
            logger.log(userId);
            return userId;
        }
        return null;
    }
}
