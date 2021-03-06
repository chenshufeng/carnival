/*
 *  ____    _    ____  _   _ _____     ___    _
 * / ___|  / \  |  _ \| \ | |_ _\ \   / / \  | |
 * | |    / _ \ | |_) |  \| || | \ \ / / _ \ | |
 * | |___/ ___ \|  _ <| |\  || |  \ V / ___ \| |___
 * \____/_/   \_\_| \_\_| \_|___|  \_/_/   \_\_____|
 *
 * https://github.com/yingzhuo/carnival
 */
package com.github.yingzhuo.carnival.exception.autoconfig;

import com.github.yingzhuo.carnival.exception.BusinessExceptionFactory;
import com.github.yingzhuo.carnival.exception.EnableBusinessExceptionFactory;
import com.github.yingzhuo.carnival.exception.IniBusinessExceptionFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

/**
 * @author 应卓
 */
public class BusinessExceptionFactoryAutoConfig {

    @Bean
    @ConditionalOnMissingBean
    public BusinessExceptionFactory businessExceptionFactory() {
        return new IniBusinessExceptionFactory(EnableBusinessExceptionFactory.ImportSelector.getConfig("location", String.class));
    }

}
