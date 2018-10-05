# Checkstyle custom rules

### To add new rule to checkstyle plugin you need:

1. Add Checkstyle plugin in gradle.build by adding following command:                    
     *apply plugin: 'checkstyle'*     
   or add in block *plugins* next line: *id 'checkstyle'*  
   
2. Create file **checkstyle.xml** in the config/checkstyle folder of your project (if it doesn't exist)
3. Add next dtd to **checkstyle.xml**                                      
       !DOCTYPE module PUBLIC
        "-//Checkstyle//DTD Checkstyle Configuration 1.3//EN"
        "https://checkstyle.org/dtds/configuration_1_3.dtd" 
3. Add root module in **checkstyle.xml**, using tag **module** and attribute name with value **Checker** and module with name **TreeWalker** inside **Checker**
4. Find in the list of stylecheck predefined [modules](http://checkstyle.sourceforge.net/checks.html) the one, that correspond to the rule, you want to apply
5. Insert it in **TreeWalker** module of your **checkstyle.xml** (use module properties if you need to customize your rule)
6. To do check you need to run **checkstyleMain or checkStyleTest** gradle task and the result of check will be  in **main.html or test.html** file in the folder **build/reports/checkstyle**    
