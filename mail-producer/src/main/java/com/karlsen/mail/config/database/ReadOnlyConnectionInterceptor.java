package com.karlsen.mail.config.database;

import com.karlsen.mail.utils.LogUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @author sauyer
 * @date 2019/7/8 20:20
 */
@Aspect
@Component
public class ReadOnlyConnectionInterceptor implements Ordered {
    @Around("@annotation(ReadOnlyConnection)")
    public Object proceed(ProceedingJoinPoint proceedingJoinPoint, ReadOnlyConnection ReadOnlyConnection) throws Throwable {
        try {
            LogUtil.info("---------------set database connection 2 read only---------------");
            DataBaseContextHolder.setDataBaseType(DataBaseContextHolder.DataBaseType.SLAVE);
            return proceedingJoinPoint.proceed();
        } finally {
            DataBaseContextHolder.clearDataBaseType();
            LogUtil.info("---------------clear database connection---------------");
        }
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
