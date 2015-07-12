package lesson1.task3;

import java.lang.annotation.*;

/**
 * Ќаписать код, который сериализирует и десериализирует в/из файла все значени€ полей класса, которые
 * отмечены аннотацией @Save.
 */

@Inherited
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Save {
}
