/*
 *  ____    _    ____  _   _ _____     ___    _
 * / ___|  / \  |  _ \| \ | |_ _\ \   / / \  | |
 * | |    / _ \ | |_) |  \| || | \ \ / / _ \ | |
 * | |___/ ___ \|  _ <| |\  || |  \ V / ___ \| |___
 * \____/_/   \_\_| \_\_| \_|___|  \_/_/   \_\_____|
 *
 * https://github.com/yingzhuo/carnival
 */
package com.github.yingzhuo.carnival.spring;

import com.github.yingzhuo.carnival.spring.tool.WebApplicationAnchor;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.ApplicationContext;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.env.Environment;

import java.util.List;

/**
 * Spring通用工具
 *
 * @author 应卓
 */
public final class SpringUtils {

    static ApplicationContext AC = null;
    static Environment ENV = null;
    static ApplicationArguments APP_ARGS = null;
    static List<String> CMD_ARGS = null;

    private SpringUtils() {
        super();
    }

    /* -------------------------------------------------------------------------------------------------------------- */

    public static ApplicationContext getApplicationContext() {
        return AC;
    }

    public static Environment getEnvironment() {
        return ENV;
    }

    /* -------------------------------------------------------------------------------------------------------------- */

    public static String getSpringId() {
        return getBean("springId", String.class);
    }

    /* -------------------------------------------------------------------------------------------------------------- */

    public static <B> B getBean(Class<B> beanType) {
        return getApplicationContext().getBean(beanType);
    }

    @SuppressWarnings("unchecked")
    public static <B> B getBean(String beanName) {
        return (B) getApplicationContext().getBean(beanName);
    }

    public static <B> B getBean(String beanName, Class<B> beanType) {
        return getApplicationContext().getBean(beanName, beanType);
    }

    /* -------------------------------------------------------------------------------------------------------------- */

    public static boolean isWebApplication() {
        try {
            getBean(WebApplicationAnchor.class);
            return true;
        } catch (NoSuchBeanDefinitionException e) {
            return false;
        }
    }

    public static boolean isNotWebApplication() {
        return !isWebApplication();
    }

    /* -------------------------------------------------------------------------------------------------------------- */

    public static ConversionService getConversionService() {
        return getBean(ConversionService.class);
    }

}
