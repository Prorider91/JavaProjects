package interfaces.interfaceprocessor;
import java.util.*;

public abstract class StringProcessor implements Processor {
    public String name() {
        return getClass().getSimpleName();
    }
    public abstract String process(Object input);
    public static String s =
            "If she weighs the same as a duck, she`s made of wood";
    public static void main(String[] args) {
        Apply.process(new Remove(), s);
        Apply.process(new Upcase(), s);
        Apply.process(new Downcase(), s);
        Apply.process(new Splitter(), s);
        Apply.process(new Remove(), s);
    }
}

class Upcase extends StringProcessor {
    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}

class Downcase extends StringProcessor {
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter extends StringProcessor {
    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}

class Remove extends StringProcessor {
    private char   tmp;
    private char[] str;
    public String process(Object input) {
        str = ((String)input).toCharArray();
        for (int i = 0; i < str.length - 1; i += 2) {
            tmp = str[i];
            str[i] = str[i + 1];
            str[i + 1] = tmp;
        }
        input = new String(str);
        return ((String)input);
    }
}
