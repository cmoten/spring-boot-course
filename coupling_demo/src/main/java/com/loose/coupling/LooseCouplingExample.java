package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args) {
        ApplicationContext context = 
        new ClassPathXmlApplicationContext("applicationLooseCouplingContext.xml");
        //UserDataProvider databaseProvider = new UserDatabaseProvider();
        //UserManager userManagerWithDB = new UserManager(databaseProvider);
        UserManager userManagerWithDB = (UserManager) context.getBean("userManagerWithUserDatabaseProvider");
        System.out.println(userManagerWithDB.getUserInfo());

        //UserDataProvider webserviceProvider = new WebServiceProvider();
        //UserManager userManagerWithWS = new UserManager(webserviceProvider);
        UserManager userManagerWithWS = (UserManager) context.getBean("userManagerWithWebServiceProvider");
        System.out.println(userManagerWithWS.getUserInfo());

        //UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
        //UserManager userManagerWithNewDB = new UserManager(newDatabaseProvider);
        UserManager userManagerWithNewDB = (UserManager)context.getBean("userManagerWithNewUserDatabaseProvider");
        System.out.println(userManagerWithNewDB.getUserInfo());
    }

}
