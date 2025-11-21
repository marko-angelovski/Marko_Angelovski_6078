import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Main{
    public static void main(String[] args){
        try {
            Dog dog = new Dog(5);
            Class obj = dog.getClass();
            System.out.println("Class Name: " + obj.getName());
            System.out.println("Class Modifier: " + Modifier.toString(obj.getModifiers()));
            System.out.println("Parent Class " + obj.getSuperclass().getName());
            Constructor[] constructors = obj.getConstructors();
            for (Constructor constructor : constructors) {
                System.out.println("Constructor name: " + constructor.getName());
                System.out.println("Constructor Modifier: " + Modifier.toString(constructor.getModifiers()));
                System.out.println("Number of params: " + constructor.getParameterCount());
            }

            Method[] methods = obj.getMethods();

            for (Method method : methods) {
                System.out.println("Method name: " + method.getName());
                System.out.println("Method modifier: " + Modifier.toString(method.getModifiers()));
                System.out.println("Method return type: " + method.getReturnType());
            }


            Field typeField = obj.getDeclaredField("typeOfDog");
            System.out.println("Field Name: " + typeField.getName());
            System.out.println("Field Type: "+ Modifier.toString(typeField.getModifiers()));
            typeField.setAccessible(true);
            typeField.set(dog,"labrador");
            System.out.println("Field Value: " + typeField.get(dog));

            Field colorField = obj.getDeclaredField("color");
            System.out.println("Field Name: " + colorField.getName());
            System.out.println("Field Type: "+ Modifier.toString(colorField.getModifiers()));
            colorField.set(dog,"brown");
            System.out.println("Field Value: " + colorField.get(dog));


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
