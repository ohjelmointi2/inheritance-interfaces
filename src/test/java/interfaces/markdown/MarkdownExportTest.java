package interfaces.markdown;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ReflectionUtils;

public class MarkdownExportTest {

    private final Pizza margherita = new Pizza("Margherita", 8.99, List.of("tomato sauce", "mozzarella", "basil"));

    @Test
    public void markdownExportInterfaceMustHaveExportMarkdownMethod() {
        assertTrue(MarkdownExport.class.isInterface(), "MarkdownExport must be an interface.");

        try {
            Method method = MarkdownExport.class.getMethod("exportMarkdown");
            Class<?> returnType = method.getReturnType();
            assertEquals(String.class, returnType, "The exportMarkdown() method must return a String.");

        } catch (NoSuchMethodException | SecurityException ex) {
            throw new AssertionError("MarkdownExport interface must declare an exportMarkdown() method.");
        }
    }

    @Test
    public void pizzaClassMustImplementMarkdownExportInterface() {
        assertTrue(margherita instanceof MarkdownExport, "Pizza class must implement MarkdownExport interface.");
    }

    @Test
    public void testExportingApizzaObjectAsMarkdown() {
        markdownExportInterfaceMustHaveExportMarkdownMethod(); // First test that the interface is correct

        Optional<Method> method = ReflectionUtils.findMethod(Pizza.class, "exportMarkdown");

        try {
            String markdown = (String) method.get().invoke(margherita);

            assertTrue(markdown.contains("# Margherita"), "The markdown representation must contain the pizza name.");
            assertTrue(markdown.contains("mozzarella"), "The markdown representation must contain the pizza toppings.");

        } catch (IllegalAccessException | InvocationTargetException | IllegalArgumentException ex) {
            throw new RuntimeException(ex);
        }
    }
}
