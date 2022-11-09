import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacadeTest {

    @Test
    void func() throws Exception {
        Facade facade = new Facade("Get Number", 1);
        assertEquals("Number got", Facade.Func());
        facade.str = "Get Array";
        assertEquals("Array got", Facade.Func());
    }
}