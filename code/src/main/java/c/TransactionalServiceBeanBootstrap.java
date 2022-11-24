package c;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.support.SimpleTransactionStatus;

import java.util.Map;

@Configuration
@ComponentScan(basePackageClasses = TestTransactionalService.class)
@EnableTransactionManagement
public class TransactionalServiceBeanBootstrap {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TransactionalServiceBeanBootstrap.class);
        Map<String, TestTransactionalService> beansMap = context.getBeansOfType(TestTransactionalService.class);
        beansMap.forEach((beanName,bean)->{
            System.out.println("beanName:"+beanName+";对象："+bean);
            bean.save();
        });
        context.close();
    }

    @Bean("txManager")
    public PlatformTransactionManager txManager(){
        return new PlatformTransactionManager() {
            @Override
            public TransactionStatus getTransaction(TransactionDefinition definition) throws TransactionException {
                return new SimpleTransactionStatus();
            }

            @Override
            public void commit(TransactionStatus status) throws TransactionException {
                System.out.println("txManager:事务提交...");
            }

            @Override
            public void rollback(TransactionStatus status) throws TransactionException {

            }
        };
    }
    @Bean("txManager2")
    public PlatformTransactionManager txManager2(){
        return new PlatformTransactionManager() {
            @Override
            public TransactionStatus getTransaction(TransactionDefinition definition) throws TransactionException {
                return new SimpleTransactionStatus();
            }

            @Override
            public void commit(TransactionStatus status) throws TransactionException {
                System.out.println("txManager2:事务提交...");
            }

            @Override
            public void rollback(TransactionStatus status) throws TransactionException {

            }
        };
    }
    @Bean("txManager3")
    public PlatformTransactionManager txManager3(){
        return new PlatformTransactionManager() {
            @Override
            public TransactionStatus getTransaction(TransactionDefinition definition) throws TransactionException {
                return new SimpleTransactionStatus();
            }

            @Override
            public void commit(TransactionStatus status) throws TransactionException {
                System.out.println("txManager3:事务提交...");
            }

            @Override
            public void rollback(TransactionStatus status) throws TransactionException {

            }
        };
    }
}
