package reflections;

import java.lang.reflect.*;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // Get the class object for a specific class (in this case, the String class)
        Class<?> stringClass = String.class;

        // Get the list of methods in the String class
        Method[] methods = stringClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        // Get the value of a private field in the String class
        Field valueField = stringClass.getDeclaredField("value");
        valueField.setAccessible(true);
        String str = "Hello, Reflection!";
        char[] value = (char[]) valueField.get(str);
        System.out.println(value);

        // Invoke a method dynamically
        Method substringMethod = stringClass.getMethod("substring", int.class, int.class);
        Object result = substringMethod.invoke(str, 7, 17);
        System.out.println(result);
    }
}

