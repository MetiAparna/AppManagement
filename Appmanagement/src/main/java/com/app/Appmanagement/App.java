package com.app.Appmanagement;

import java.util.List;

import com.app.Appmanagement.appRepository.AppHqlRepository;
import com.app.Appmanagement.appRepository.AppRepository;
import com.app.Appmanagement.dto.Appdto;
import com.app.Appmanagement.entity.AppEntity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        AppEntity entity = new AppEntity();
       // entity.setAlt_key(111);
        entity.setService_name("Instagram");
        entity.setStatus("up");
        entity.setUrl("www.instagram.com");
        entity.setCreated_date("2010-10-06");
        entity.setCreated_by("Wall Street Journal");
        entity.setModify_date("2005-03-05");
        entity.setModify_by("Wall Street Journal");
      
        AppRepository repository = new AppRepository();
      // repository.saveOrUpdate(entity);
      //  AppEntity findById = repository.findById(3);
      //  System.out.println(findById);
        
        Appdto appdto1 = new Appdto();
        //appdto1.setAlt_key(2);
     //   appdto1.setService_name("Chrome");
    //  appdto1.setUrl("www.chrome.com");
    // appdto1.setCreated_date("1998-09-04");
     // appdto1.setModify_date("2021-09-12");
     //  repository.update(appdto1); 
      //repository.delete(appdto1);
        
        AppHqlRepository hqlRepository = new AppHqlRepository();
      /*  List<AppEntity> findAll = hqlRepository.findAll();
        findAll.forEach(each->{
        	System.out.println(each);
        });
        */
        List<AppEntity> findByName = hqlRepository.findByName("Chrome");
        findByName.forEach(each->{
        	System.out.println(each);
        });
        
        
    }
}
