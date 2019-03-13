package innerclass.ex16;

class TestNested {
    public static class Nest {}
}

public class ex16 {
    TestNested.Nest n = new TestNested.Nest();
}
