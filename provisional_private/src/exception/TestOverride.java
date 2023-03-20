package exception;

import java.io.IOException;

public class TestOverride {
}

class Father{
    public void method() throws Exception{
        System.out.println("Father.method");
    }

}

class Son extends Father{
    @Override
    public void method() throws IOException,ClassCastException {
        System.out.println("Son.method");
    }
}