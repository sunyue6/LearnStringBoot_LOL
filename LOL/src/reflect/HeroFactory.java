package reflect;

import reflect.hero.Camille;
import reflect.hero.Diana;
import reflect.hero.Irelia;

public class HeroFactory {
    public static ISkill getHero(String name) throws Exception {
        ISkill iSkill;
        // 改动配置文件， 不违反OCP
        // 抽象工厂
        // 反射 元类
        // 类 是对象的抽象
        // 对象 类 元类
        // 类是对象的抽象，元类是类的描述
        // 工厂模式 + 反射 并不等同于 IOC

        String classStr = "reflect.hero."+name;
        Class<?> cla = Class.forName(classStr);
        Object obj = cla.newInstance();
//        clazz.getDeclaredConstructor().newInstance();
        return (ISkill)obj;

        // 反射需要每次反射， SpringBoot第一次创建反射，任何存在缓存中
    }
}
