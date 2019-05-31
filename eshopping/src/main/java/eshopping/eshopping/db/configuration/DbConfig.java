package eshopping.eshopping.db.configuration;

import java.util.Properties;


import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import org.springframework.transaction.annotation.EnableTransactionManagement;

import eshopping.eshopping.dao.entity.Product;

@Configuration
@EnableTransactionManagement
public class DbConfig {
	@Value("${spring.datasource.driver-class-name}")
    private String DRIVER;

    @Value("${spring.datasource.username}")
    private String USERNAME;

    @Value("${spring.datasource.url}")
    private String URL;

    

   

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(DRIVER);
        dataSource.setUrl(URL);
        dataSource.setUsername(USERNAME);
       
        return dataSource;
    }
    
    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
      
        Properties hibernateProperties = new Properties();
       
     sessionFactory.setPackagesToScan("eshopping.eshopping.dao.entity");
        
        sessionFactory.setHibernateProperties(hibernateProperties);

        return sessionFactory;
    }

    @Bean
    public HibernateTransactionManager transactionManager() {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory().getObject());
        return transactionManager;
    }

}
