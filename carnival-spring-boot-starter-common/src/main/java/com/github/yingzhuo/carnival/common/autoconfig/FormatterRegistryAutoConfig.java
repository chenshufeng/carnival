/*
 *  ____    _    ____  _   _ _____     ___    _
 * / ___|  / \  |  _ \| \ | |_ _\ \   / / \  | |
 * | |    / _ \ | |_) |  \| || | \ \ / / _ \ | |
 * | |___/ ___ \|  _ <| |\  || |  \ V / ___ \| |___
 * \____/_/   \_\_| \_\_| \_|___|  \_/_/   \_\_____|
 *
 * https://github.com/yingzhuo/carnival
 */
package com.github.yingzhuo.carnival.common.autoconfig;

import com.github.yingzhuo.carnival.common.datamodel.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 应卓
 */
@ConditionalOnWebApplication
public class FormatterRegistryAutoConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new BooleanFormat());
        registry.addFormatter(new Gender.GenderFormatter());
        registry.addFormatter(new Color.ColorFormatter());
        registry.addFormatterForFieldAnnotation(new IntCurrencyFormat.FormatterFactory());
        registry.addFormatterForFieldAnnotation(new LongCurrencyFormat.FormatterFactory());
        registry.addFormatterForFieldAnnotation(new PhoneNumberFormat.FormatterFactory());
        registry.addFormatterForFieldAnnotation(new TrimFormat.FormatterFactory());
    }

}
