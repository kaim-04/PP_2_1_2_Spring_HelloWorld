import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        System.out.println("Равны ли ссылки bean и bean2? ответ: " + (bean == bean2));

        Cat catBean = (Cat) applicationContext.getBean("caty");
        System.out.println(catBean.getMessage());

        Cat catBean2 = (Cat) applicationContext.getBean("caty");
        System.out.println(catBean2.getMessage());

        System.out.println("Равны ли ссылки catBean и catBean2? ответ: " + (catBean == catBean2));
    }
}