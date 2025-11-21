import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    try {


        Test test = new Test();
        Class<?> c = test.getClass();
        System.out.println("Class Name: " + c.getName());
        Constructor[] constructors = c.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("Name: " + constructor.getName());
        }
        Method method1 = c.getMethod("method1");
        method1.invoke(test);
        Method method2 = c.getMethod("method2",int.class);
        method2.invoke(test,5);

        Method method3 = c.getDeclaredMethod("method3");
        method3.setAccessible(true);
        method3.invoke(test);



    }catch (Exception e){
        e.printStackTrace();
    }
}
